package net.pillk.etc.config;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.config.ModConfigEvent;
import net.minecraftforge.registries.ForgeRegistries;
import net.pillk.etc.etc;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

// An example config class. This is not required, but it's a good idea to have one to keep your config organized.
// Demonstrates how to use Forge's config APIs
@Mod.EventBusSubscriber(modid = etc.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class etcCommonConfig
{
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC = null;
    
    public static final ForgeConfigSpec.ConfigValue<Boolean> COSMETIC_ONLY = null;
    public static final ForgeConfigSpec.ConfigValue<Integer> SKILL_CLOAK_ARMOR = null;

    static {

    }
}
