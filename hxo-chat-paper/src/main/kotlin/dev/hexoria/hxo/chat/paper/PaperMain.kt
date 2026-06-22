package dev.hexoria.hxo.chat.paper

import com.github.shynixn.mccoroutine.folia.SuspendingJavaPlugin
import dev.hexoria.hxo.chat.paper.listener.ChatListener
import dev.hexoria.hxo.chat.paper.listener.ConnectListener
import dev.hexoria.hxo.chat.paper.listener.DisconnectListener
import dev.hexoria.hxo.chat.paper.listener.PlayerDeathListener
import org.bukkit.plugin.java.JavaPlugin

val plugin get() = JavaPlugin.getPlugin(PaperMain::class.java)

class PaperMain : SuspendingJavaPlugin() {

    override suspend fun onEnableAsync() {
        ChatListener.register()
        ConnectListener.register()
        DisconnectListener.register()
        PlayerDeathListener.register()

    }
}
