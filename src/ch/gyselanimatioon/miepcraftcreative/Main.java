package ch.gyselanimatioon.miepcraftcreative;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import ch.gyselanimatioon.miepcraftcreative.listener.CommandListener;

public class Main extends JavaPlugin {

	@Override
	public void onEnable() {
		Bukkit.getServer().getPluginManager().registerEvents(new CommandListener(), this);
	}
}
