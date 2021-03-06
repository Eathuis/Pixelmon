// Date: 4/02/2013 7:22:21 p.m.
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX
package pixelmon.client.models.pokemon;

import net.minecraft.entity.Entity;
import pixelmon.client.models.PixelmonModelBase;
import pixelmon.client.models.PixelmonModelRenderer;
import pixelmon.client.models.animations.EnumArm;
import pixelmon.client.models.animations.EnumLeg;
import pixelmon.client.models.animations.EnumPhase;
import pixelmon.client.models.animations.ModuleArm;
import pixelmon.client.models.animations.ModuleHead;
import pixelmon.client.models.animations.ModuleLeg;
import pixelmon.client.models.animations.ModuleTailBasic;
import pixelmon.client.models.animations.biped.SkeletonBiped;

public class ModelSandshrew extends PixelmonModelBase {
	// fields
	PixelmonModelRenderer Body;

	public ModelSandshrew() {
		textureWidth = 128;
		textureHeight = 64;
		Body = new PixelmonModelRenderer(this, "Body");
		Body.setRotationPoint(0, 18.46667F, 0);
		PixelmonModelRenderer body = new PixelmonModelRenderer(this, 100, 0);
		body.addBox(-4F, -0.7333333F, -0.1333333F, 8, 6, 6);
		body.setTextureSize(128, 64);
		body.mirror = true;
		setRotation(body, -0.122173F, 0F, 0F);
		Body.addChild(body);
		PixelmonModelRenderer body_2 = new PixelmonModelRenderer(this, 102, 14);
		body_2.addBox(-3.5F, -2F, -0.06666667F, 7, 3, 6);
		body_2.setTextureSize(128, 64);
		body_2.mirror = true;
		setRotation(body_2, 0.1570796F, 0F, 0F);
		Body.addChild(body_2);
		PixelmonModelRenderer body_3 = new PixelmonModelRenderer(this, 104, 25);
		body_3.addBox(-3F, -3F, 3F, 6, 3, 3);
		body_3.setTextureSize(128, 64);
		body_3.mirror = true;
		setRotation(body_3, 0.4014257F, 0F, 0F);
		Body.addChild(body_3);
		PixelmonModelRenderer body_4 = new PixelmonModelRenderer(this, 106, 36);
		body_4.addBox(-2.5F, -3F, 0.4333333F, 5, 4, 6);
		body_4.setTextureSize(128, 64);
		body_4.mirror = true;
		setRotation(body_4, 0.9948377F, 0F, 0F);
		Body.addChild(body_4);
		PixelmonModelRenderer stomach = new PixelmonModelRenderer(this, 31, 54);
		stomach.addBox(-3F, -1.666667F, -2F, 6, 7, 3);
		stomach.setTextureSize(128, 64);
		stomach.mirror = true;
		setRotation(stomach, 0F, 0F, 0F);
		Body.addChild(stomach);

		PixelmonModelRenderer Head = new PixelmonModelRenderer(this, "Head");
		Head.setRotationPoint(0, -4, 0);
		PixelmonModelRenderer head = new PixelmonModelRenderer(this, 64, 8);
		head.addBox(-3F, -3.3F, -3.566667F, 6, 5, 5);
		head.setTextureSize(128, 64);
		head.mirror = true;
		setRotation(head, 0.2443461F, 0F, 0F);
		Head.addChild(head);
		PixelmonModelRenderer snout = new PixelmonModelRenderer(this, 69, 20);
		snout.addBox(-1.5F, -3.066667F, -4.5F, 3, 3, 3);
		snout.setTextureSize(128, 64);
		snout.mirror = true;
		setRotation(snout, 0.7330383F, 0F, 0F);
		Head.addChild(snout);
		PixelmonModelRenderer L_ear = new PixelmonModelRenderer(this, 57, 19);
		L_ear.addBox(2F, -5.333333F, 0.4333333F, 0, 5, 5);
		L_ear.setTextureSize(128, 64);
		L_ear.mirror = true;
		setRotation(L_ear, 0.2443461F, 0.7330383F, 0F);
		Head.addChild(L_ear);
		PixelmonModelRenderer R_ear = new PixelmonModelRenderer(this, 57, 19);
		R_ear.addBox(-2F, -5.466667F, 0.4333333F, 0, 5, 5);
		R_ear.setTextureSize(128, 64);
		R_ear.mirror = true;
		setRotation(R_ear, 0.2443461F, -0.7330383F, 0F);
		Head.addChild(R_ear);
		Body.addChild(Head);

		PixelmonModelRenderer LeftLeg = new PixelmonModelRenderer(this,
				"Left Leg");
		LeftLeg.setRotationPoint(3, 2.53333f, 0);
		PixelmonModelRenderer leg_L = new PixelmonModelRenderer(this, 12, 14);
		leg_L.addBox(-1F, -0.9333333F, -1.466667F, 3, 4, 4);
		// leg_L.setRotationPoint(3F, 21F, 0F);
		leg_L.setTextureSize(128, 64);
		leg_L.mirror = true;
		setRotation(leg_L, 0.6108652F, -0.2617994F, 0F);
		LeftLeg.addChild(leg_L);
		PixelmonModelRenderer foot_L = new PixelmonModelRenderer(this, 14, 23);
		foot_L.addBox(-0.5F, 1.933333F, -2.8F, 2, 1, 3);
		foot_L.setTextureSize(128, 64);
		foot_L.mirror = true;
		setRotation(foot_L, 0F, -0.2617994F, 0F);
		LeftLeg.addChild(foot_L);
		Body.addChild(LeftLeg);

		PixelmonModelRenderer RightLeg = new PixelmonModelRenderer(this,
				"Right Leg");
		RightLeg.setRotationPoint(-3, 2.53333f, 0);
		PixelmonModelRenderer leg_R = new PixelmonModelRenderer(this, 12, 14);
		leg_R.addBox(-2F, -0.9333333F, -1.466667F, 3, 4, 4);
		// leg_R.setRotationPoint(-3F, 21F, 0F);
		leg_R.setTextureSize(128, 64);
		leg_R.mirror = true;
		setRotation(leg_R, 0.6108652F, 0.2617994F, 0F);
		RightLeg.addChild(leg_R);
		PixelmonModelRenderer foot_R = new PixelmonModelRenderer(this, 14, 23);
		foot_R.addBox(-1.633333F, 1.933333F, -2.8F, 2, 1, 3);
		foot_R.setTextureSize(128, 64);
		foot_R.mirror = true;
		setRotation(foot_R, 0F, 0.2617994F, 0F);
		RightLeg.addChild(foot_R);
		Body.addChild(RightLeg);

		PixelmonModelRenderer Tail = new PixelmonModelRenderer(this, "Tail");
		Tail.setRotationPoint(0F, 2F, 5F);
		PixelmonModelRenderer tail_1 = new PixelmonModelRenderer(this, 0, 57);
		tail_1.addBox(-2.5F, 0F, -0.1333333F, 5, 4, 3);
		// tail_1.setRotationPoint(0F, 20.46667F, 5F);
		tail_1.setTextureSize(128, 64);
		tail_1.mirror = true;
		setRotation(tail_1, -0.0872665F, 0F, 0F);
		Tail.addChild(tail_1);
		PixelmonModelRenderer tail_2 = new PixelmonModelRenderer(this, 0, 49);
		tail_2.addBox(-1.5F, -0.7333333F, -1.2F, 3, 3, 3);
		tail_2.setRotationPoint(0F, 1F, 3F);
		tail_2.setTextureSize(128, 64);
		tail_2.mirror = true;
		setRotation(tail_2, 0.3316126F, 0F, 0F);
		Tail.addChild(tail_2);
		PixelmonModelRenderer tail_3 = new PixelmonModelRenderer(this, 0, 42);
		tail_3.addBox(-1F, -1.266667F, -1.2F, 2, 2, 3);
		tail_3.setRotationPoint(0F, 1F, 5F);
		tail_3.setTextureSize(128, 64);
		tail_3.mirror = true;
		setRotation(tail_3, 0.8203047F, 0F, 0F);
		Tail.addChild(tail_3);
		PixelmonModelRenderer tail_4 = new PixelmonModelRenderer(this, 0, 37);
		tail_4.addBox(-0.5F, -0.2666667F, -1.2F, 1, 1, 2);
		tail_4.setRotationPoint(0F, -1F, 6F);
		tail_4.setTextureSize(128, 64);
		tail_4.mirror = true;
		setRotation(tail_4, 1.012291F, 0F, 0F);
		Tail.addChild(tail_4);
		Body.addChild(Tail);

		PixelmonModelRenderer RightArm = new PixelmonModelRenderer(this,
				"Right Arm");
		RightArm.setRotationPoint(-3, -1.46667f, 0);
		PixelmonModelRenderer arm_R_1 = new PixelmonModelRenderer(this, 0, 26);
		arm_R_1.addBox(-2F, 0F, -2F, 3, 3, 3);
		// arm_R_1.setRotationPoint(-3F, 17F, 0F);
		arm_R_1.setTextureSize(128, 64);
		arm_R_1.mirror = true;
		setRotation(arm_R_1, 0.4712389F, -0.5410521F, 0F);
		RightArm.addChild(arm_R_1);
		PixelmonModelRenderer arm_R_2 = new PixelmonModelRenderer(this, 0, 20);
		arm_R_2.addBox(-2F, 0.3333333F, -4F, 2, 2, 3);
		arm_R_2.setTextureSize(128, 64);
		arm_R_2.mirror = true;
		setRotation(arm_R_2, 0.4712389F, -0.7330383F, 0F);
		RightArm.addChild(arm_R_2);
		PixelmonModelRenderer R_claw_1 = new PixelmonModelRenderer(this, 7, 17);
		R_claw_1.addBox(-2.8F, 0.8F, -4.066667F, 1, 1, 1);
		R_claw_1.setTextureSize(128, 64);
		R_claw_1.mirror = true;
		setRotation(R_claw_1, 0.4537856F, -1.082104F, 0F);
		RightArm.addChild(R_claw_1);
		PixelmonModelRenderer R_claw_2 = new PixelmonModelRenderer(this, 7, 17);
		R_claw_2.addBox(-3.733333F, 0.6F, -3.5F, 1, 1, 1);
		R_claw_2.setTextureSize(128, 64);
		R_claw_2.mirror = true;
		setRotation(R_claw_2, 0.4537856F, -1.082104F, -0.4886922F);
		RightArm.addChild(R_claw_2);
		Body.addChild(RightArm);

		PixelmonModelRenderer LeftArm = new PixelmonModelRenderer(this,
				"Left Arm");
		LeftArm.setRotationPoint(3, -1.46667f, 0);
		PixelmonModelRenderer arm_L_1 = new PixelmonModelRenderer(this, 0, 26);
		arm_L_1.addBox(-1F, 0F, -2F, 3, 3, 3);
		// arm_L_1.setRotationPoint(3F, 17F, 0F);
		arm_L_1.setTextureSize(128, 64);
		arm_L_1.mirror = true;
		setRotation(arm_L_1, 0.4712389F, 0.5410521F, 0F);
		LeftArm.addChild(arm_L_1);
		PixelmonModelRenderer arm_L_2 = new PixelmonModelRenderer(this, 0, 20);
		arm_L_2.addBox(0F, 0.3333333F, -4F, 2, 2, 3);
		arm_L_2.setTextureSize(128, 64);
		arm_L_2.mirror = true;
		setRotation(arm_L_2, 0.4712389F, 0.7330383F, 0F);
		LeftArm.addChild(arm_L_2);
		PixelmonModelRenderer L_claw_1 = new PixelmonModelRenderer(this, 7, 17);
		L_claw_1.addBox(1.8F, 0.8F, -4.066667F, 1, 1, 1);
		L_claw_1.setTextureSize(128, 64);
		L_claw_1.mirror = true;
		setRotation(L_claw_1, 0.4537856F, 1.082104F, 0F);
		LeftArm.addChild(L_claw_1);
		PixelmonModelRenderer L_claw_2 = new PixelmonModelRenderer(this, 7, 17);
		L_claw_2.addBox(2.7F, 0.6F, -3.5F, 1, 1, 1);
		L_claw_2.setTextureSize(128, 64);
		L_claw_2.mirror = true;
		setRotation(L_claw_2, 0.4537856F, 1.082104F, 0.4886922F);
		LeftArm.addChild(L_claw_2);
		Body.addChild(LeftArm);

		ModuleHead headModule = new ModuleHead(Head);

		ModuleArm leftArmModule = new ModuleArm(LeftArm, EnumArm.Left, 0, 0, 0);
		ModuleArm rightArmModule = new ModuleArm(RightArm, EnumArm.Right, 0, 0, 0);

		float legspeed = 0.65F;
		float legRotationLimit = 1.4F;

		ModuleLeg leftLegModule = new ModuleLeg(LeftLeg, EnumLeg.FrontLeft,
				EnumPhase.InPhase, legRotationLimit, legspeed);
		ModuleLeg rightLegModule = new ModuleLeg(RightLeg, EnumLeg.FrontRight,
				EnumPhase.InPhase, legRotationLimit, legspeed);
		ModuleTailBasic tailModule = new ModuleTailBasic(Tail, .1F, .05F, legspeed);

		skeleton = new SkeletonBiped(Body, headModule, leftArmModule,
				rightArmModule, leftLegModule, rightLegModule, tailModule);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3,
			float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		Body.render(f5);
	}

	private void setRotation(PixelmonModelRenderer model, float x, float y,
			float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

}
