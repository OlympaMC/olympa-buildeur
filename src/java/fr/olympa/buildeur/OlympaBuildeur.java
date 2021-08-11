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
		OlympaGroup buildeurGroup = OlympaGroup.BUILDER;
		OlympaAPIPermissionsSpigot.GOD_COMMAND.setMinGroup(OlympaGroup.PLAYER);
		OlympaAPIPermissionsSpigot.TP_COMMAND.setMinGroup(OlympaGroup.PLAYER);
		OlympaAPIPermissionsSpigot.TP_COMMAND_NOT_VANISH.setMinGroup(OlympaGroup.PLAYER);
		OlympaAPIPermissionsSpigot.INVSEE_COMMAND.setMinGroup(buildeurGroup);
		OlympaAPIPermissionsSpigot.INVSEE_COMMAND_INTERACT.setMinGroup(buildeurGroup);
		OlympaAPIPermissionsSpigot.ECSEE_COMMAND.setMinGroup(buildeurGroup);
		OlympaAPIPermissionsSpigot.ECSEE_COMMAND_INTERACT.setMinGroup(buildeurGroup);
		OlympaAPIPermissionsSpigot.GAMEMODE_COMMAND.setMinGroup(buildeurGroup);
		OlympaAPIPermissionsSpigot.GAMEMODE_COMMAND_CREATIVE.setMinGroup(buildeurGroup);
		OlympaAPIPermissionsSpigot.GAMEMODE_COMMAND_OTHER.setMinGroup(buildeurGroup);
		buildeurGroup.setRuntimePermission("-essentials.nick", true);
		buildeurGroup.setRuntimePermission("-multiverse.core.remove", true);
		buildeurGroup.setRuntimePermission("-multiverse.core.purge", true);
		buildeurGroup.setRuntimePermission("-multiverse.core.regen", true);
		buildeurGroup.setRuntimePermission("-multiverse.core.remove", true);
		buildeurGroup.setRuntimePermission("essentials.*", true);
		buildeurGroup.setRuntimePermission("headdb.*", true);
		buildeurGroup.setRuntimePermission("awe.*", true);
		buildeurGroup.setRuntimePermission("fawe.*", true);
		buildeurGroup.setRuntimePermission("worldedit.*", true);
		buildeurGroup.setRuntimePermission("minecraft.command.difficulty", true);
		buildeurGroup.setRuntimePermission("minecraft.command.gamemode", true);
		buildeurGroup.setRuntimePermission("multiverse.*", true);
		buildeurGroup.setRuntimePermission("gobrush.*", true);
		OlympaGroup respBuildeurGroup = OlympaGroup.RESP_BUILDER;
		respBuildeurGroup.setRuntimePermission("worldguard.*", true);
		respBuildeurGroup.setRuntimePermission("-multiverse.core.remove", false);
		respBuildeurGroup.setRuntimePermission("-multiverse.core.purge", false);
		respBuildeurGroup.setRuntimePermission("-multiverse.core.regen", false);
		respBuildeurGroup.setRuntimePermission("-multiverse.core.remove", false);
		OlympaGroup respTechGroup = OlympaGroup.RESP_TECH;
		respTechGroup.setRuntimePermission("logblock.*", true);
		OlympaGroup admin = OlympaGroup.ADMIN;
		admin.setRuntimePermission("*", true);
		sendMessage("&2%s&a (%s) est activé.", getDescription().getName(), getDescription().getVersion());
	}

	@Override
	public void onDisable() {
		sendMessage("&4%s&c (%s) est désactivé.", getDescription().getName(), getDescription().getVersion());
	}
}
