package fr.olympa.buildeur;

import fr.olympa.api.common.groups.OlympaGroup;
import fr.olympa.api.common.permission.list.OlympaAPIPermissionsSpigot;
import fr.olympa.api.common.plugin.OlympaAPIPlugin;
import fr.olympa.api.common.server.OlympaServer;
import fr.olympa.core.spigot.OlympaCore;

public class OlympaBuildeur extends OlympaAPIPlugin {

	private static OlympaBuildeur instance;

	public static OlympaBuildeur getInstance() {
		return instance;
	}

	@Override
	public void onEnable() {
		instance = this;
		super.onEnable();
		OlympaCore.getInstance().setOlympaServer(OlympaServer.BUILDEUR);
		OlympaAPIPermissionsSpigot.GAMEMODE_COMMAND.setMinGroup(OlympaGroup.BUILDER);
		sendMessage("&2%s&a (%s) est activé.", getDescription().getName(), getDescription().getVersion());
	}

	@Override
	public void onDisable() {
		sendMessage("&4%s&c (%s) est désactivé.", getDescription().getName(), getDescription().getVersion());
	}
}
