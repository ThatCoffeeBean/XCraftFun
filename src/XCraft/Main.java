package XCraft;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	/*
	 * TODO: Add features you are adding into the InforCommands sendMessage please :) Thanks.
	 * TODO: (BLACK) Finish InfoCommand
	 * TODO: (BEAN) Tell me what you are adding (Leave a comment!)
	 * 
	 * Add notes here!
	 * NOTE: Added basic plugin.yml.
	 */
	
	public static Plugin plugin;
	
	
	
	public void onEnable() {
		plugin = this;
		
		//Everything under here is reserved for me to add commands :P
		getCommand("xinfo").setExecutor(new InfoCommand(this));
		
	}
	
	public void onDisable() {
		plugin = null;
	}

}
