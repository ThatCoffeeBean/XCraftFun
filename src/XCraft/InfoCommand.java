package XCraft;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class InfoCommand implements CommandExecutor	{
	
public Main plugin;
	
	public InfoCommand(Main instance) {
		plugin = instance;
	}

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("xinfo")) {
			if(sender.hasPermission("xcraft.info")) {
				sender.sendMessage(ChatColor.RED + "[XCraft] " + ChatColor.GRAY + " The XCraft plugin adds lots of random features to the XCraft server"
						+ " Examples of these features are:");
			}
		}

		return true;
	}

}
