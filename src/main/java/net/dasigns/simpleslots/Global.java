package net.dasigns.simpleslots;

import java.io.File;
import java.util.logging.Logger;

import org.bukkit.configuration.file.FileConfiguration;

public class Global {
	public static Logger log;
	public static SimpleSlots plugin;
	public static VaultManager vault;
	public static File dataFolder;
	public static ConfigAccessor configa;
	public static FileConfiguration config() {
		if(configa == null) return null;
		return configa.getConfig();
	}
}
