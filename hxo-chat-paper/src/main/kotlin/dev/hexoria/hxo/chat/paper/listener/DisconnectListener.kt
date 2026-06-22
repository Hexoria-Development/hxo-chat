package dev.hexoria.hxo.chat.paper.listener

import dev.hexoria.hxo.chat.paper.hook.LuckPermsHook
import dev.slne.surf.api.core.messages.adventure.buildText
import dev.slne.surf.api.core.minimessage.miniMessage
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerQuitEvent

object DisconnectListener : Listener {
    @EventHandler
    fun onDisconnect(event: PlayerQuitEvent) {
        event.quitMessage(
            buildText {
                darkSpacer("[")
                error("-")
                darkSpacer("] ")
                append(miniMessage.deserialize(LuckPermsHook.getPrefix(event.player) + event.player.name))
            }
        )
    }
}