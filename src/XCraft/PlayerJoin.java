package XCraft;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;


public class PlayerJoin implements Listener {

	@EventHandler
	public void playerJoin(PlayerJoinEvent evt) {
		evt.getPlayer()
				.sendMessage(
						ChatColor.RED + "+" + ChatColor.RED
								+ evt.getPlayer().getName());
	}

}
