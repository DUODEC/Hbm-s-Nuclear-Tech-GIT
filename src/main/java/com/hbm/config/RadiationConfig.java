package com.hbm.config;

import net.minecraftforge.common.config.Configuration;

public class RadiationConfig {

	public static int fogRad = 100;
	public static int fogCh = 20;
	public static double hellRad = 0.1;
	public static int worldRad = 10;
	public static int worldRadThreshold = 20;
	public static boolean worldRadEffects = true;
	public static boolean cleanupDeadDirt = false;

	public static boolean enableContamination = true;
	public static boolean enableChunkRads = true;

	public static boolean disableAsbestos = false;
	public static boolean disableCoal = false;
	public static boolean disableHot = false;
	public static boolean disableExplosive = false;
	public static boolean disableHydro = false;
	public static boolean disableBlinding = false;
	public static boolean disableFibrosis = false;
	public static boolean disableNeutron = false;
	
	public static void loadFromConfig(Configuration config) {

		final String CATEGORY_NUKE = CommonConfig.CATEGORY_RADIATION;

		fogRad = CommonConfig.createConfigInt(config, CATEGORY_NUKE, "FOG_00_threshold", "Radiation in RADs required for fog to spawn", 100);
		fogCh = CommonConfig.createConfigInt(config, CATEGORY_NUKE, "FOG_01_threshold", "1:n chance of fog spawning every second", 20);
		hellRad = CommonConfig.createConfigDouble(config, CATEGORY_NUKE, "AMBIENT_00_nether", "RAD/s in the nether", 0.1D);
		worldRadEffects = CommonConfig.createConfigBool(config, CATEGORY_NUKE, "RADWORLD_00_toggle", "Whether high radiation levels should perform changes in the world", true);
		worldRad = CommonConfig.createConfigInt(config, CATEGORY_NUKE, "RADWORLD_01_amount", "How many block operations radiation can perform per tick", 10);
		worldRadThreshold = CommonConfig.createConfigInt(config, CATEGORY_NUKE, "RADWORLD_02_minimum", "The least amount of RADs required for block modification to happen", 20);
		cleanupDeadDirt = CommonConfig.createConfigBool(config, CATEGORY_NUKE, "RADWORLD_03_regrow", "Whether dead grass and mycelium should decay into dirt", false);

		enableContamination = CommonConfig.createConfigBool(config, CATEGORY_NUKE, "RADIATION_00_enableContamination", "Toggles player contamination (and negative effects from radiation poisoning)", true);
		enableChunkRads = CommonConfig.createConfigBool(config, CATEGORY_NUKE, "RADIATION_01_enableChunkRads", "Toggles the world radiation system (chunk radiation only, some blocks use an AoE!)", true);
		
		fogCh = CommonConfig.setDef(fogCh, 20);

		final String CATEGORY_HAZ = CommonConfig.CATEGORY_HAZARD;

		disableAsbestos = CommonConfig.createConfigBool(config, CATEGORY_HAZ, "HAZ_00_disableAsbestos", "When turned off, all asbestos hazards are disabled", false);
		disableCoal = CommonConfig.createConfigBool(config, CATEGORY_HAZ, "HAZ_01_disableCoaldust", "When turned off, all coal dust hazards are disabled", false);
		disableHot = CommonConfig.createConfigBool(config, CATEGORY_HAZ, "HAZ_02_disableHot", "When turned off, all hot hazards are disabled", false);
		disableExplosive = CommonConfig.createConfigBool(config, CATEGORY_HAZ, "HAZ_03_disableExplosive", "When turned off, all explosive hazards are disabled", false);
		disableHydro = CommonConfig.createConfigBool(config, CATEGORY_HAZ, "HAZ_04_disableHydroactive", "When turned off, all hydroactive hazards are disabled", false);
		disableBlinding = CommonConfig.createConfigBool(config, CATEGORY_HAZ, "HAZ_05_disableBlinding", "When turned off, all blinding hazards are disabled", false);
		disableFibrosis = CommonConfig.createConfigBool(config, CATEGORY_HAZ, "HAZ_06_disableFibrosis", "When turned off, all fibrosis hazards are disabled", false);
		disableNeutron = CommonConfig.createConfigBool(config, CATEGORY_HAZ, "HAZ_01_disableNeutrons", "When turned off, all neutron radiation hazards are disabled", false);
	}
}
