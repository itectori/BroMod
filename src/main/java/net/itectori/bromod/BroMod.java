package net.itectori.bromod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.enums.StairShape;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BroMod implements ModInitializer {

    public static final Block Concrete = new Block(FabricBlockSettings.of(Material.METAL));
    public static final ConcreteStairs red_concrete_stairs = new ConcreteStairs(Concrete.getDefaultState(), FabricBlockSettings.of(Material.METAL));


    @Override
    public void onInitialize()
    {
        System.out.println("Loading BroMod ...");
        Registry.register(Registry.BLOCK, new Identifier("bromod", "red_concrete_stairs"), red_concrete_stairs);
        Registry.register(Registry.ITEM, new Identifier("bromod", "red_concrete_stairs"), new BlockItem(red_concrete_stairs, new Item.Settings().group(ItemGroup.MISC)));
    }
}
