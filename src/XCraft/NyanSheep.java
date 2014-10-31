package XCraft;

import org.bukkit.Bukkit;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Sheep;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitScheduler;

public class NyanSheep implements Listener {

	DyeColor randColor = DyeColor.values()[ rand(0, DyeColor.values().length-1) ];
	public int rand(int min, int max) { return min + (int)(Math.random() * ((max - min) + 1)); }
	
	@EventHandler
	public void onPlayerInteract(final PlayerInteractEvent evt) {
		if (evt.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
			if (evt.getClickedBlock().getType() == Material.BOOKSHELF) {

	BukkitScheduler scheduler = Bukkit.getServer().getScheduler(); {
		scheduler.scheduleSyncDelayedTask((Plugin) this, new Runnable() {
        public void run() {
        	LivingEntity entity = (LivingEntity) Bukkit.getWorld("world").spawnEntity(evt.getPlayer().getLocation(), EntityType.SHEEP);
        	entity.setCustomName("jeb_");
        	 
        	Sheep sheep = (Sheep) Bukkit.getWorld("world").spawnEntity(evt.getPlayer().getLocation(), EntityType.SHEEP);
        	sheep.setCustomName("jeb_");
        	sheep.setColor(DyeColor.BLACK);
        }
    }, 20L);
}
}

		}
	}
}

