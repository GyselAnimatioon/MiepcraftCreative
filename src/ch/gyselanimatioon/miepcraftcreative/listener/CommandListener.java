package ch.gyselanimatioon.miepcraftcreative.listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class CommandListener implements Listener {

	public CommandListener() {

	}

	@EventHandler
	public void onPlayerCommandPreprocessEvent(PlayerCommandPreprocessEvent event) {
		
		String command = event.getMessage().toLowerCase();
				
	}
}
