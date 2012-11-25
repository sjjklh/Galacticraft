package micdoodle8.mods.galacticraft.core.client.model;

import net.minecraft.src.Entity;
import net.minecraft.src.ModelBase;
import net.minecraft.src.ModelRenderer;

public class GCCoreModelBuggy extends ModelBase
{
	public ModelRenderer wheel1e;
	public ModelRenderer body;
	public ModelRenderer wheel1a;
	public ModelRenderer wheel1d;
	public ModelRenderer wheel1c;
	public ModelRenderer wheel1b;
	public ModelRenderer wheel2d;
	public ModelRenderer wheel2a;
	public ModelRenderer wheel2c;
	public ModelRenderer wheel2b;
	public ModelRenderer wheel2e;
	public ModelRenderer wheel4d;
	public ModelRenderer wheel4a;
	public ModelRenderer wheel4e;
	public ModelRenderer wheel4b;
	public ModelRenderer wheel4c;
	public ModelRenderer wheel3c;
	public ModelRenderer wheel3d;
	public ModelRenderer wheel3a;
	public ModelRenderer wheel3e;
	public ModelRenderer wheel3b;
	public ModelRenderer frontFlap;
	public ModelRenderer radarPole;
	public ModelRenderer radarCenter;
	public ModelRenderer back3;
	public ModelRenderer back1;
	public ModelRenderer back2;
	public ModelRenderer seatBack;
	public ModelRenderer seatBottom;
	public ModelRenderer seatArmRight1;
	public ModelRenderer seatArmLeft1;
	public ModelRenderer seatArmRight2;
	public ModelRenderer seatArmLeft2;
	public ModelRenderer backBottom;
	
	public GCCoreModelBuggy()
	{
		textureWidth = 512;
		textureHeight = 256;
		
		wheel1e = new ModelRenderer(this, 328, 0);
		wheel1e.addBox(-3F, -5F, 5F, 3, 8, 1);
		wheel1e.setRotationPoint(-16F, 19F, -21F);
		wheel1e.setTextureSize(512, 256);
		wheel1e.mirror = true;
		setRotation(wheel1e, 0F, 0F, 0F);
		body = new ModelRenderer(this, 336, 0);
		body.addBox(-16F, -1.5F, -28F, 32, 3, 56);
		body.setRotationPoint(0F, 18F, 0F);
		body.setTextureSize(512, 256);
		body.mirror = true;
		setRotation(body, 0F, 0F, 0F);
		wheel1a = new ModelRenderer(this, 310, 9);
		wheel1a.addBox(-3F, -6F, -5F, 3, 10, 10);
		wheel1a.setRotationPoint(-16F, 19F, -21F);
		wheel1a.setTextureSize(512, 256);
		wheel1a.mirror = true;
		setRotation(wheel1a, 0F, 0F, 0F);
		wheel1d = new ModelRenderer(this, 306, 0);
		wheel1d.addBox(-3F, 4F, -4F, 3, 1, 8);
		wheel1d.setRotationPoint(-16F, 19F, -21F);
		wheel1d.setTextureSize(512, 256);
		wheel1d.mirror = true;
		setRotation(wheel1d, 0F, 0F, 0F);
		wheel1c = new ModelRenderer(this, 328, 0);
		wheel1c.addBox(-3F, -5F, -6F, 3, 8, 1);
		wheel1c.setRotationPoint(-16F, 19F, -21F);
		wheel1c.setTextureSize(512, 256);
		wheel1c.mirror = true;
		setRotation(wheel1c, 0F, 0F, 0F);
		wheel1b = new ModelRenderer(this, 306, 0);
		wheel1b.addBox(-3F, -7F, -4F, 3, 1, 8);
		wheel1b.setRotationPoint(-16F, 19F, -21F);
		wheel1b.setTextureSize(512, 256);
		wheel1b.mirror = true;
		setRotation(wheel1b, 0F, 0F, 0F);
		wheel2d = new ModelRenderer(this, 306, 0);
		wheel2d.addBox(-3F, 4F, -4F, 3, 1, 8);
		wheel2d.setRotationPoint(-16F, 19F, 21F);
		wheel2d.setTextureSize(512, 256);
		wheel2d.mirror = true;
		setRotation(wheel2d, 0F, 0F, 0F);
		wheel2a = new ModelRenderer(this, 310, 9);
		wheel2a.addBox(-3F, -6F, -5F, 3, 10, 10);
		wheel2a.setRotationPoint(-16F, 19F, 21F);
		wheel2a.setTextureSize(512, 256);
		wheel2a.mirror = true;
		setRotation(wheel2a, 0F, 0F, 0F);
		wheel2c = new ModelRenderer(this, 328, 0);
		wheel2c.addBox(-3F, -5F, -6F, 3, 8, 1);
		wheel2c.setRotationPoint(-16F, 19F, 21F);
		wheel2c.setTextureSize(512, 256);
		wheel2c.mirror = true;
		setRotation(wheel2c, 0F, 0F, 0F);
		wheel2b = new ModelRenderer(this, 306, 0);
		wheel2b.addBox(-3F, -7F, -4F, 3, 1, 8);
		wheel2b.setRotationPoint(-16F, 19F, 21F);
		wheel2b.setTextureSize(512, 256);
		wheel2b.mirror = true;
		setRotation(wheel2b, 0F, 0F, 0F);
		wheel2e = new ModelRenderer(this, 328, 0);
		wheel2e.addBox(-3F, -5F, 5F, 3, 8, 1);
		wheel2e.setRotationPoint(-16F, 19F, 21F);
		wheel2e.setTextureSize(512, 256);
		wheel2e.mirror = true;
		setRotation(wheel2e, 0F, 0F, 0F);
		wheel4d = new ModelRenderer(this, 306, 0);
		wheel4d.addBox(0F, 4F, -4F, 3, 1, 8);
		wheel4d.setRotationPoint(16F, 19F, -21F);
		wheel4d.setTextureSize(512, 256);
		wheel4d.mirror = true;
		setRotation(wheel4d, 0F, 0F, 0F);
		wheel4a = new ModelRenderer(this, 310, 9);
		wheel4a.addBox(0F, -6F, -5F, 3, 10, 10);
		wheel4a.setRotationPoint(16F, 19F, -21F);
		wheel4a.setTextureSize(512, 256);
		wheel4a.mirror = true;
		setRotation(wheel4a, 0F, 0F, 0F);
		wheel4e = new ModelRenderer(this, 328, 0);
		wheel4e.addBox(0F, -5F, -6F, 3, 8, 1);
		wheel4e.setRotationPoint(16F, 19F, -21F);
		wheel4e.setTextureSize(512, 256);
		wheel4e.mirror = true;
		setRotation(wheel4e, 0F, 0F, 0F);
		wheel4b = new ModelRenderer(this, 306, 0);
		wheel4b.addBox(0F, -7F, -4F, 3, 1, 8);
		wheel4b.setRotationPoint(16F, 19F, -21F);
		wheel4b.setTextureSize(512, 256);
		wheel4b.mirror = true;
		setRotation(wheel4b, 0F, 0F, 0F);
		wheel4c = new ModelRenderer(this, 328, 0);
		wheel4c.addBox(0F, -5F, 5F, 3, 8, 1);
		wheel4c.setRotationPoint(16F, 19F, -21F);
		wheel4c.setTextureSize(512, 256);
		wheel4c.mirror = true;
		setRotation(wheel4c, 0F, 0F, 0F);
		wheel3c = new ModelRenderer(this, 328, 0);
		wheel3c.addBox(0F, -5F, 5F, 3, 8, 1);
		wheel3c.setRotationPoint(16F, 19F, 21F);
		wheel3c.setTextureSize(512, 256);
		wheel3c.mirror = true;
		setRotation(wheel3c, 0F, 0F, 0F);
		wheel3d = new ModelRenderer(this, 306, 0);
		wheel3d.addBox(0F, 4F, -4F, 3, 1, 8);
		wheel3d.setRotationPoint(16F, 19F, 21F);
		wheel3d.setTextureSize(512, 256);
		wheel3d.mirror = true;
		setRotation(wheel3d, 0F, 0F, 0F);
		wheel3a = new ModelRenderer(this, 310, 9);
		wheel3a.addBox(0F, -6F, -5F, 3, 10, 10);
		wheel3a.setRotationPoint(16F, 19F, 21F);
		wheel3a.setTextureSize(512, 256);
		wheel3a.mirror = true;
		setRotation(wheel3a, 0F, 0F, 0F);
		wheel3e = new ModelRenderer(this, 328, 0);
		wheel3e.addBox(0F, -5F, -6F, 3, 8, 1);
		wheel3e.setRotationPoint(16F, 19F, 21F);
		wheel3e.setTextureSize(512, 256);
		wheel3e.mirror = true;
		setRotation(wheel3e, 0F, 0F, 0F);
		wheel3b = new ModelRenderer(this, 306, 0);
		wheel3b.addBox(0F, -7F, -4F, 3, 1, 8);
		wheel3b.setRotationPoint(16F, 19F, 21F);
		wheel3b.setTextureSize(512, 256);
		wheel3b.mirror = true;
		setRotation(wheel3b, 0F, 0F, 0F);
		frontFlap = new ModelRenderer(this, 94, 0);
		frontFlap.addBox(-5F, -0.5F, -3F, 10, 1, 6);
		frontFlap.setRotationPoint(0F, 16F, -26F);
		frontFlap.setTextureSize(512, 256);
		frontFlap.mirror = true;
		setRotation(frontFlap, 0F, 0F, 0F);
		radarPole = new ModelRenderer(this, 302, 0);
		radarPole.addBox(-0.5F, -21F, -0.5F, 1, 21, 1);
		radarPole.setRotationPoint(-9F, 17F, -19F);
		radarPole.setTextureSize(512, 256);
		radarPole.mirror = true;
		setRotation(radarPole, 0F, 0F, 0F);
		radarCenter = new ModelRenderer(this, 266, 0);
		radarCenter.addBox(-4.5F, -0.5F, -4.5F, 9, 1, 9);
		radarCenter.setRotationPoint(-9F, -4F, -19F);
		radarCenter.setTextureSize(512, 256);
		radarCenter.mirror = true;
		setRotation(radarCenter, 0.3717861F, 0F, 0F);
		back3 = new ModelRenderer(this, 240, 0);
		back3.addBox(-4F, -14F, -2.5F, 8, 14, 5);
		back3.setRotationPoint(-10F, 16.5F, 21F);
		back3.setTextureSize(512, 256);
		back3.mirror = true;
		setRotation(back3, 0F, 0F, 0F);
		back1 = new ModelRenderer(this, 240, 0);
		back1.addBox(-4F, -14F, -2.5F, 8, 14, 5);
		back1.setRotationPoint(10F, 16.5F, 21F);
		back1.setTextureSize(512, 256);
		back1.mirror = true;
		setRotation(back1, 0F, 0F, 0F);
		back2 = new ModelRenderer(this, 240, 0);
		back2.addBox(-4F, -14F, -2.5F, 8, 14, 5);
		back2.setRotationPoint(0F, 16.5F, 20F);
		back2.setTextureSize(512, 256);
		back2.mirror = true;
		setRotation(back2, 0F, 0F, 0F);
		seatBack = new ModelRenderer(this, 126, 0);
		seatBack.addBox(-7.5F, -12F, -1F, 15, 12, 2);
		seatBack.setRotationPoint(0F, 16.5F, 12F);
		seatBack.setTextureSize(512, 256);
		seatBack.mirror = true;
		setRotation(seatBack, -0.1858931F, 0F, 0F);
		seatBottom = new ModelRenderer(this, 126, 14);
		seatBottom.addBox(-8.5F, -6F, -1F, 17, 12, 2);
		seatBottom.setRotationPoint(0F, 16F, 6F);
		seatBottom.setTextureSize(512, 256);
		seatBottom.mirror = true;
		setRotation(seatBottom, 1.570796F, 0F, 0F);
		seatArmRight1 = new ModelRenderer(this, 152, 33);
		seatArmRight1.addBox(-0.5F, -7F, -0.5F, 1, 7, 1);
		seatArmRight1.setRotationPoint(-7.5F, 15F, 2F);
		seatArmRight1.setTextureSize(512, 256);
		seatArmRight1.mirror = true;
		setRotation(seatArmRight1, 0F, 0F, 0F);
		seatArmLeft1 = new ModelRenderer(this, 152, 33);
		seatArmLeft1.addBox(-0.5F, -7F, -0.5F, 1, 7, 1);
		seatArmLeft1.setRotationPoint(7.5F, 15F, 2F);
		seatArmLeft1.setTextureSize(512, 256);
		seatArmLeft1.mirror = true;
		setRotation(seatArmLeft1, 0F, 0F, 0F);
		seatArmRight2 = new ModelRenderer(this, 126, 28);
		seatArmRight2.addBox(-0.5F, -0.5F, 0F, 1, 1, 12);
		seatArmRight2.setRotationPoint(-7.5F, 8F, 1F);
		seatArmRight2.setTextureSize(512, 256);
		seatArmRight2.mirror = true;
		setRotation(seatArmRight2, 0F, 0.0523599F, 0F);
		seatArmLeft2 = new ModelRenderer(this, 126, 28);
		seatArmLeft2.addBox(-0.5F, -0.5F, 0F, 1, 1, 12);
		seatArmLeft2.setRotationPoint(7.5F, 8F, 1F);
		seatArmLeft2.setTextureSize(512, 256);
		seatArmLeft2.mirror = true;
		setRotation(seatArmLeft2, 0F, -0.0523599F, 0F);
		backBottom = new ModelRenderer(this, 160, 0);
		backBottom.addBox(-15F, -0.5F, -5F, 30, 1, 10);
		backBottom.setRotationPoint(0F, 16F, 20F);
		backBottom.setTextureSize(512, 256);
		backBottom.mirror = true;
		setRotation(backBottom, 0F, 0F, 0F);
	}
	
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(entity, f, f1, f2, f3, f4, f5);
		wheel1e.render(f5);
		body.render(f5);
		wheel1a.render(f5);
		wheel1d.render(f5);
		wheel1c.render(f5);
		wheel1b.render(f5);
		wheel2d.render(f5);
		wheel2a.render(f5);
		wheel2c.render(f5);
		wheel2b.render(f5);
		wheel2e.render(f5);
		wheel4d.render(f5);
		wheel4a.render(f5);
		wheel4e.render(f5);
		wheel4b.render(f5);
		wheel4c.render(f5);
		wheel3c.render(f5);
		wheel3d.render(f5);
		wheel3a.render(f5);
		wheel3e.render(f5);
		wheel3b.render(f5);
		frontFlap.render(f5);
		radarPole.render(f5);
		radarCenter.render(f5);
		back3.render(f5);
		back1.render(f5);
		back2.render(f5);
		seatBack.render(f5);
		seatBottom.render(f5);
		seatArmRight1.render(f5);
		seatArmLeft1.render(f5);
		seatArmRight2.render(f5);
		seatArmLeft2.render(f5);
		backBottom.render(f5);
	}
	
	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}
	
	public void setRotationAngles(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);	
		this.wheel1a.rotateAngleY = 0F;
		this.wheel1a.rotateAngleZ = 0F;
		this.wheel1b.rotateAngleY = 0F;
		this.wheel1b.rotateAngleZ = 0F;
		this.wheel1c.rotateAngleY = 0F;
		this.wheel1c.rotateAngleZ = 0F;
		this.wheel1d.rotateAngleY = 0F;
		this.wheel1d.rotateAngleZ = 0F;
		this.wheel1e.rotateAngleY = 0F;
		this.wheel1e.rotateAngleZ = 0F;
		this.wheel2a.rotateAngleY = 0F;
		this.wheel2a.rotateAngleZ = 0F;
		this.wheel2b.rotateAngleY = 0F;
		this.wheel2b.rotateAngleZ = 0F;
		this.wheel2c.rotateAngleY = 0F;
		this.wheel2c.rotateAngleZ = 0F;
		this.wheel2d.rotateAngleY = 0F;
		this.wheel2d.rotateAngleZ = 0F;
		this.wheel2e.rotateAngleY = 0F;
		this.wheel2e.rotateAngleZ = 0F;
		this.wheel3a.rotateAngleY = 0F;
		this.wheel3a.rotateAngleZ = 0F;
		this.wheel3b.rotateAngleY = 0F;
		this.wheel3b.rotateAngleZ = 0F;
		this.wheel3c.rotateAngleY = 0F;
		this.wheel3c.rotateAngleZ = 0F;
		this.wheel3d.rotateAngleY = 0F;
		this.wheel3d.rotateAngleZ = 0F;
		this.wheel3e.rotateAngleY = 0F;
		this.wheel3e.rotateAngleZ = 0F;
		this.wheel4a.rotateAngleY = 0F;
		this.wheel4a.rotateAngleZ = 0F;
		this.wheel4b.rotateAngleY = 0F;
		this.wheel4b.rotateAngleZ = 0F;
		this.wheel4c.rotateAngleY = 0F;
		this.wheel4c.rotateAngleZ = 0F;
		this.wheel4d.rotateAngleY = 0F;
		this.wheel4d.rotateAngleZ = 0F;
		this.wheel4e.rotateAngleY = 0F;
		this.wheel4e.rotateAngleZ = 0F;
	}
}
