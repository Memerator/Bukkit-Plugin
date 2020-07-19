package me.memerator.mc;
import org.bukkit.plugin.java.JavaPlugin;

public class MemeratorPlugin extends JavaPlugin {
    // Fired when plugin is first enabled
    public void onEnable() {
        if (getServer().getOnlineMode()) {
            System.out.println("[Memerator] Memerator Plugin ready to go!");
            this.getCommand("memerator").setExecutor(new HelpCommand());
        } else {
            System.out.println("[Memerator] This plugin cannot work in Offline mode! Try again!");
            getServer().getPluginManager().disablePlugin(this);
        }
    }
    // Fired when plugin is disabled
    public void onDisable() {

    }
}
