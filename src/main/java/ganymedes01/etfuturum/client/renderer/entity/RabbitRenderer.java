package ganymedes01.etfuturum.client.renderer.entity;

import ganymedes01.etfuturum.client.model.ModelRabbit;
import ganymedes01.etfuturum.entities.EntityRabbit;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.ResourceLocation;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RabbitRenderer extends RenderLiving {

	private static final ResourceLocation BROWN = new ResourceLocation("textures/entity/rabbit/brown.png");
	private static final ResourceLocation WHITE = new ResourceLocation("textures/entity/rabbit/white.png");
	private static final ResourceLocation BLACK = new ResourceLocation("textures/entity/rabbit/black.png");
	private static final ResourceLocation GOLD = new ResourceLocation("textures/entity/rabbit/gold.png");
	private static final ResourceLocation SALT = new ResourceLocation("textures/entity/rabbit/salt.png");
	private static final ResourceLocation WHITE_SPLOTCHED = new ResourceLocation("textures/entity/rabbit/white_splotched.png");
	private static final ResourceLocation TOAST = new ResourceLocation("textures/entity/rabbit/toast.png");
	private static final ResourceLocation CAERBANNOG = new ResourceLocation("textures/entity/rabbit/caerbannog.png");

	public RabbitRenderer() {
		super(new ModelRabbit(), 0.3F);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		EntityRabbit rabbit = (EntityRabbit) entity;
		String s = EnumChatFormatting.getTextWithoutFormattingCodes(rabbit.getCommandSenderName());

		if (s != null && s.equals("Toast"))
			return TOAST;
		else
			switch (rabbit.getRabbitType()) {
				case 0:
				default:
					return BROWN;
				case 1:
					return WHITE;
				case 2:
					return BLACK;
				case 3:
					return WHITE_SPLOTCHED;
				case 4:
					return GOLD;
				case 5:
					return SALT;
				case 99:
					return CAERBANNOG;
			}
	}
}