package me.memerator.memeratorspigot;
import org.bukkit.plugin.java.JavaPlugin;

public class MemeratorSpigot extends JavaPlugin {
  // Fired when plugin is first enabled
  public void onEnable() {
    if (getServer().getOnlineMode()) {
      System.out.println("[Memerator] Memerator Plugin ready to go!");
      this.getCommand("npns").setExecutor(new HelpCommand());
    } else {
      System.out.println("[Memerator] This plugin cannot work in Offline mode! Try again!");
      getServer().getPluginManager().disablePlugin(this);
    }
  }
  // Fired when plugin is disabled
  public void onDisable() {

  }
}
