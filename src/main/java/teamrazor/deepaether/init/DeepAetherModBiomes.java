package teamrazor.deepaether.init;


import com.gildedgames.aether.Aether;
import com.gildedgames.aether.data.resources.AetherBiomes;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.biome.Biome;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.RegistryObject;
import org.checkerframework.checker.units.qual.A;
import teamrazor.deepaether.DeepAetherMod;
import teamrazor.deepaether.world.DeepAetherModBiomeBuilders;


import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DeepAetherModBiomes {
    public static final DeferredRegister REGISTRY = DeferredRegister.create(ForgeRegistries.BIOMES, DeepAetherMod.MODID);


    public static final ResourceKey<Biome> AERGLOW_GROVE = registerKey("aerglow_grove");
    public static final ResourceKey<Biome> VIRULENT_FOREST = registerKey("virulent_forest");

    private static ResourceKey<Biome> registerKey(String name)
    {
        return ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation(DeepAetherMod.MODID, name));
    }

    public static void registerBiomes()
    {
        registerObj(AERGLOW_GROVE, DeepAetherModBiomeBuilders::aerglowGroveBiome);
        registerObj(VIRULENT_FOREST, DeepAetherModBiomeBuilders::virulentForestBiome);
    }

    public static RegistryObject<Biome> registerObj(ResourceKey<Biome> key, Supplier<Biome> biomeSupplier)
    {
        return REGISTRY.register(key.location().getPath(), biomeSupplier);
    }
}