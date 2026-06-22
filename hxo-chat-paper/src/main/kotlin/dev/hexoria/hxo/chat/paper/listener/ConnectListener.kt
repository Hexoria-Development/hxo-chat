package dev.hexoria.hxo.chat.paper.listener

import dev.hexoria.hxo.chat.paper.hook.LuckPermsHook
import dev.slne.surf.api.core.messages.adventure.buildText
import dev.slne.surf.api.core.minimessage.miniMessage
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent


object ConnectListener : Listener {

    @EventHandler
    fun onPlayerJoin(event: PlayerJoinEvent) {
            event.joinMessage(
                buildText {
                    darkSpacer("[")
                    success("+")
                    darkSpacer("] ")
                    append(miniMessage.deserialize(LuckPermsHook.getPrefix(event.player) + event.player.name))
                }
            )
        }
    }
