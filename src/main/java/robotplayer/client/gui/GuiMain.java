/**
 * This class was created by BrassGoggledCoders modding team.
 * This class is available as part of the Steamcraft 2 Mod for Minecraft.
 *
 * Steamcraft 2 is open-source and is distributed under the MMPL v1.0 License.
 * (http://www.mod-buildcraft.com/MMPL-1.0.txt)
 *
 * Steamcraft 2 is based on the original Steamcraft Mod created by Proloe.
 * Steamcraft (c) Proloe 2011
 * (http://www.minecraftforum.net/topic/251532-181-steamcraft-source-code-releasedmlv054wip/)
 *
 */
package robotplayer.client.gui;

import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;
import boilerplate.client.BaseContainerGui;

/**
 * @author decebaldecebal
 *
 */
public class GuiMain extends BaseContainerGui
{
	private static ResourceLocation guitexture = new ResourceLocation("robotplayer"/* TODO */+ "textures/gui/steamboiler.png");

	public GuiMain(InventoryPlayer player)// , TileSteamBoiler tile)
	{
		super(null);// new ContainerSteamBoiler(player, tile));

		// this.boiler = tile;
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float par1, int par2, int par3)
	{
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);

		this.mc.renderEngine.bindTexture(guitexture);
		this.drawTexturedModalRect(this.guiLeft, this.guiTop, 0, 0, this.xSize, this.ySize);

		// if(this.boiler.isBurning())
		// {
		// int burnTime = this.boiler.getBurnTimeRemainingScaled(12);
		// this.drawTexturedModalRect(this.guiLeft + 43, (this.guiTop + 48) -
		// burnTime, 176, 12 - burnTime, 14, burnTime + 2);
		// }

		// this.drawFluid(new FluidStack(FluidRegistry.getFluid("water"), 0),
		// this.boiler.getScaledWaterLevel(60), this.guiLeft + 8, this.guiTop +
		// 18, 20, 60);
		// this.drawFluid(new FluidStack(FluidRegistry.getFluid("steam"), 0),
		// this.boiler.getScaledSteamLevel(60), this.guiLeft + 74, this.guiTop +
		// 18, 32, 60);

		this.mc.renderEngine.bindTexture(guitexture);
		this.drawTexturedModalRect(this.guiLeft + 8, this.guiTop + 24, 176, 14, 20, 49);
		this.drawTexturedModalRect(this.guiLeft + 74, this.guiTop + 24, 176, 14, 20, 49);
	}

	@Override
	protected void drawGuiContainerForegroundLayer(int x, int y)
	{
		// if(((y - this.guiTop) >= 18) && ((y - this.guiTop) <= 78))
		// if(((x - this.guiLeft) >= 8) && ((x - this.guiLeft) <= 28))
		// this.drawFluidInfo(this.boiler.waterTank, x, y);
		// else if(((x - this.guiLeft) >= 74) && ((x - this.guiLeft) <= 106))
		// this.drawFluidInfo(this.boiler.steamTank, x, y);
	}
}
