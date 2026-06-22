package dev.hexoria.hxo.chat.paper.listener

import dev.hexoria.hxo.chat.paper.hook.LuckPermsHook

object ChatListener : Listener {

    @EventHandler
    fun onChat(event: AsyncChatEvent) {
        val player = event.player
        val prefix = miniMessage.deserialize(LuckPermsHook.getPrefix(player))

        event.renderer { source, _, message, _ ->
            prefix
                .append(Component.text(" ${source.name} ", NamedTextColor.WHITE))
                .append(Component.text("» ", NamedTextColor.GRAY))
                .append(message.color(NamedTextColor.WHITE))
        }
    }
}
