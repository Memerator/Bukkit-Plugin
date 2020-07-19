package me.memerator.memeratorspigot;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HelpCommand implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {

            if(args.length == 0) {
                sender.sendMessage("Welcome to §cMemerator§6 Spigot§r.\nHave you linked your account? Be sure to with /memerator link [Memerator Account]");
            }

        } else {
            sender.sendMessage("[Memerator] Only players may run this command.");
        }

        return true;
    }
}
