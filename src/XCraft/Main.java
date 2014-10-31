package XCraft;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;


public class Main extends JavaPlugin implements Listener {
	/*
	 * TODO: Add features you are adding into the InforCommands sendMessage please :) Thanks.
	 * TODO: (BLACK) Finish InfoCommand
	 * TODO: (Bean) Finish NyanSheep and make it work :D
	 * 
	 * Add notes here!
	 * NOTE: Added basic plugin.yml.
	 */
	
	public static Plugin plugin;
	
	
	
	public void onEnable() {
		plugin = this;
		
		//Everything under here is reserved for me to add commands :P
		
		Bukkit.getPluginManager().registerEvents(this, this);
		Bukkit.getPluginManager().registerEvents(new PlayerJoin(), this);
		Bukkit.getPluginManager().registerEvents(new NyanSheep(), this);
	}
	
	public void onDisable() {
		plugin = null;
	}

}
