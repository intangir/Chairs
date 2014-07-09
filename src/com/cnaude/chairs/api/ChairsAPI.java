package com.cnaude.chairs.api;

import org.bukkit.entity.Player;

import com.cnaude.chairs.core.PlayerSitData;

public class ChairsAPI {

	private static PlayerSitData pdata;
	protected static void init(PlayerSitData pdata) {
		ChairsAPI.pdata = pdata;
	}

	public static boolean isSitting(Player player) {
		return pdata.isSitting(player);
	}

}
