// Date: 4/27/2013 2:08:26 AM
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
import pixelmon.client.models.animations.biped.SkeletonBiped;

public class ModelExeggutor extends PixelmonModelBase {
	// fields

	PixelmonModelRenderer Body;

	public ModelExeggutor() {
		textureWidth = 128;
		textureHeight = 64;

		Body = new PixelmonModelRenderer(this, "Body");
		Body.setRotationPoint(0, 0, 0);
		PixelmonModelRenderer Body_Bottom = new PixelmonModelRenderer(this, 56, 49);
		Body_Bottom.addBox(0F, 0F, 0F, 13, 2, 13);
		Body_Bottom.setRotationPoint(-6.5F, 13F, -2.5F);
		Body_Bottom.setTextureSize(128, 64);
		Body_Bottom.mirror = true;
		setRotation(Body_Bottom, 0F, 0F, 0F);
		PixelmonModelRenderer Body_Middle = new PixelmonModelRenderer(this, 0, 42);
		Body_Middle.addBox(0F, 0F, 0F, 14, 8, 14);
		Body_Middle.setRotationPoint(-7F, 5F, -3F);
		Body_Middle.setTextureSize(128, 64);
		Body_Middle.mirror = true;
		setRotation(Body_Middle, 0F, 0F, 0F);
		PixelmonModelRenderer Body_Upper = new PixelmonModelRenderer(this, 64, 31);
		Body_Upper.addBox(0F, 0F, 0F, 12, 6, 12);
		Body_Upper.setRotationPoint(-6F, -1F, -2F);
		Body_Upper.setTextureSize(128, 64);
		Body_Upper.mirror = true;
		setRotation(Body_Upper, 0F, 0F, 0F);
		PixelmonModelRenderer Body_Top = new PixelmonModelRenderer(this, 0, 26);
		Body_Top.addBox(0F, 0F, 0F, 10, 6, 10);
		Body_Top.setRotationPoint(-5F, -7F, -1F);
		Body_Top.setTextureSize(128, 64);
		Body_Top.mirror = true;
		setRotation(Body_Top, 0F, 0F, 0F);
		PixelmonModelRenderer Head_Middle = new PixelmonModelRenderer(this, 84, 16);
		Head_Middle.addBox(0F, 0F, 0F, 6, 6, 5);
		Head_Middle.setRotationPoint(-3F, -7F, -5F);
		Head_Middle.setTextureSize(128, 64);
		Head_Middle.mirror = true;
		setRotation(Head_Middle, -0.2617994F, 0F, 0F);
		PixelmonModelRenderer Head_Left = new PixelmonModelRenderer(this, 106, 16);
		Head_Left.addBox(0F, 0F, 0F, 6, 6, 5);
		Head_Left.setRotationPoint(4F, -7F, -4F);
		Head_Left.setTextureSize(128, 64);
		Head_Left.mirror = true;
		setRotation(Head_Left, -0.2617994F, -0.7853982F, 0F);
		PixelmonModelRenderer Head_Right = new PixelmonModelRenderer(this, 62, 16);
		Head_Right.addBox(0F, 0F, 0F, 6, 6, 5);
		Head_Right.setRotationPoint(-8F, -7F, 0F);
		Head_Right.setTextureSize(128, 64);
		Head_Right.mirror = true;
		setRotation(Head_Right, -0.2617994F, 0.7853982F, 0F);

		PixelmonModelRenderer Head_Middle_Front = new PixelmonModelRenderer(this, 50, 16);
		Head_Middle_Front.addBox(0F, 0F, 0F, 5, 6, 1);
		Head_Middle_Front.setRotationPoint(-2.5F, -7.3F, -5.9F);
		Head_Middle_Front.setTextureSize(128, 64);
		Head_Middle_Front.mirror = true;
		setRotation(Head_Middle_Front, -0.2617994F, 0F, 0F);
		PixelmonModelRenderer Head_Middle_Bottom = new PixelmonModelRenderer(this, 32, 16);
		Head_Middle_Bottom.addBox(0F, 0F, 0F, 5, 1, 4);
		Head_Middle_Bottom.setRotationPoint(-2.5F, -1.5F, -6.5F);
		Head_Middle_Bottom.setTextureSize(128, 64);
		Head_Middle_Bottom.mirror = true;
		setRotation(Head_Middle_Bottom, -0.2617994F, 0F, 0F);
		PixelmonModelRenderer Head_Left_Front = new PixelmonModelRenderer(this, 52, 30);
		Head_Left_Front.addBox(0F, 0F, 0F, 5, 6, 1);
		Head_Left_Front.setRotationPoint(5F, -7.3F, -4.3F);
		Head_Left_Front.setTextureSize(128, 64);
		Head_Left_Front.mirror = true;
		setRotation(Head_Left_Front, -0.2617994F, -0.7853982F, 0F);
		PixelmonModelRenderer Head_Right_Front = new PixelmonModelRenderer(this, 50, 23);
		Head_Right_Front.addBox(0F, 0F, 0F, 5, 6, 1);
		Head_Right_Front.setRotationPoint(-8.2F, -7.3F, -0.9F);
		Head_Right_Front.setTextureSize(128, 64);
		Head_Right_Front.mirror = true;
		setRotation(Head_Right_Front, -0.2617994F, 0.7853982F, 0F);
		PixelmonModelRenderer Head_Left_Top = new PixelmonModelRenderer(this, 32, 16);
		Head_Left_Top.addBox(0F, 0F, 0F, 5, 1, 4);
		Head_Left_Top.setRotationPoint(4.5F, -8F, -3.7F);
		Head_Left_Top.setTextureSize(128, 64);
		Head_Left_Top.mirror = true;
		setRotation(Head_Left_Top, -0.2617994F, -0.7853982F, 0F);
		PixelmonModelRenderer Head_Middle_Top = new PixelmonModelRenderer(this, 32, 16);
		Head_Middle_Top.addBox(0F, 0F, 0F, 5, 1, 4);
		Head_Middle_Top.setRotationPoint(-2.5F, -8F, -4.7F);
		Head_Middle_Top.setTextureSize(128, 64);
		Head_Middle_Top.mirror = true;
		setRotation(Head_Middle_Top, -0.2617994F, 0F, 0F);
		PixelmonModelRenderer Head_Right_Top = new PixelmonModelRenderer(this, 32, 16);
		Head_Right_Top.addBox(0F, 0F, 0F, 5, 1, 4);
		Head_Right_Top.setRotationPoint(-7.5F, -8F, 0F);
		Head_Right_Top.setTextureSize(128, 64);
		Head_Right_Top.mirror = true;
		setRotation(Head_Right_Top, -0.2617994F, 0.7853982F, 0F);
		PixelmonModelRenderer Head_Left_Bottom = new PixelmonModelRenderer(this, 32, 16);
		Head_Left_Bottom.addBox(0F, 0F, 0F, 5, 1, 4);
		Head_Left_Bottom.setRotationPoint(5.5F, -1.5F, -4.8F);
		Head_Left_Bottom.setTextureSize(128, 64);
		Head_Left_Bottom.mirror = true;
		setRotation(Head_Left_Bottom, -0.2617994F, -0.7853982F, 0F);
		PixelmonModelRenderer Head_Right_Bottom = new PixelmonModelRenderer(this, 32, 16);
		Head_Right_Bottom.addBox(0F, 0F, 0F, 5, 1, 4);
		Head_Right_Bottom.setRotationPoint(-8.6F, -1.5F, -1.4F);
		Head_Right_Bottom.setTextureSize(128, 64);
		Head_Right_Bottom.mirror = true;
		setRotation(Head_Right_Bottom, -0.2617994F, 0.7853982F, 0F);
		PixelmonModelRenderer Leaf_1_Base = new PixelmonModelRenderer(this, 22, 12);
		Leaf_1_Base.addBox(0F, 0F, 0F, 1, 10, 4);
		Leaf_1_Base.setRotationPoint(2F, -14F, -6F);
		Leaf_1_Base.setTextureSize(128, 64);
		Leaf_1_Base.mirror = true;
		setRotation(Leaf_1_Base, 0F, -1.570796F, -0.7853982F);
		PixelmonModelRenderer Leaf_2_Base = new PixelmonModelRenderer(this, 22, 12);
		Leaf_2_Base.addBox(0F, 0F, 0F, 1, 10, 4);
		Leaf_2_Base.setRotationPoint(-6F, -14F, -4F);
		Leaf_2_Base.setTextureSize(128, 64);
		Leaf_2_Base.mirror = true;
		setRotation(Leaf_2_Base, 0F, -0.7853982F, -0.7853982F);
		PixelmonModelRenderer Leaf_3_Base = new PixelmonModelRenderer(this, 22, 12);
		Leaf_3_Base.addBox(0F, 0F, 0F, 1, 10, 4);
		Leaf_3_Base.setRotationPoint(9F, -14F, -1.3F);
		Leaf_3_Base.setTextureSize(128, 64);
		Leaf_3_Base.mirror = true;
		setRotation(Leaf_3_Base, 0F, -2.356194F, -0.7853982F);
		PixelmonModelRenderer Leaf_4_Base = new PixelmonModelRenderer(this, 22, 12);
		Leaf_4_Base.addBox(0F, 0F, 0F, 1, 10, 4);
		Leaf_4_Base.setRotationPoint(10F, -14F, 6F);
		Leaf_4_Base.setTextureSize(128, 64);
		Leaf_4_Base.mirror = true;
		setRotation(Leaf_4_Base, 0F, -3.141593F, -0.7853982F);
		PixelmonModelRenderer Leaf_5_Base = new PixelmonModelRenderer(this, 22, 12);
		Leaf_5_Base.addBox(0F, 0F, 0F, 1, 10, 4);
		Leaf_5_Base.setRotationPoint(-10F, -14F, 2F);
		Leaf_5_Base.setTextureSize(128, 64);
		Leaf_5_Base.mirror = true;
		setRotation(Leaf_5_Base, 0F, 0F, -0.7853982F);
		PixelmonModelRenderer Leaf_6_Base = new PixelmonModelRenderer(this, 22, 12);
		Leaf_6_Base.addBox(0F, 0F, 0F, 1, 10, 4);
		Leaf_6_Base.setRotationPoint(6F, -14F, 13F);
		Leaf_6_Base.setTextureSize(128, 64);
		Leaf_6_Base.mirror = true;
		setRotation(Leaf_6_Base, 0F, 2.356194F, -0.7853982F);
		PixelmonModelRenderer Leaf_7_Base = new PixelmonModelRenderer(this, 22, 12);
		Leaf_7_Base.addBox(0F, 0F, 0F, 1, 10, 4);
		Leaf_7_Base.setRotationPoint(-9F, -14F, 10.1F);
		Leaf_7_Base.setTextureSize(128, 64);
		Leaf_7_Base.mirror = true;
		setRotation(Leaf_7_Base, 0F, 0.7853982F, -0.7853982F);
		PixelmonModelRenderer Leaf_8_Base = new PixelmonModelRenderer(this, 22, 12);
		Leaf_8_Base.addBox(0F, 0F, 0F, 1, 10, 4);
		Leaf_8_Base.setRotationPoint(-2F, -14F, 14F);
		Leaf_8_Base.setTextureSize(128, 64);
		Leaf_8_Base.mirror = true;
		setRotation(Leaf_8_Base, 0F, 1.570796F, -0.7853982F);
		PixelmonModelRenderer Leaf_1_Tip = new PixelmonModelRenderer(this, 112, 45);
		Leaf_1_Tip.addBox(0F, 0F, 0F, 1, 10, 4);
		Leaf_1_Tip.setRotationPoint(2F, -14F, -6F);
		Leaf_1_Tip.setTextureSize(128, 64);
		Leaf_1_Tip.mirror = true;
		setRotation(Leaf_1_Tip, 0F, -1.570796F, 1.047198F);
		PixelmonModelRenderer Leaf_2_Tip = new PixelmonModelRenderer(this, 112, 45);
		Leaf_2_Tip.addBox(0F, 0F, 0F, 1, 10, 4);
		Leaf_2_Tip.setRotationPoint(-6F, -14F, -4F);
		Leaf_2_Tip.setTextureSize(128, 64);
		Leaf_2_Tip.mirror = true;
		setRotation(Leaf_2_Tip, 0F, -0.7853982F, 1.047198F);
		PixelmonModelRenderer Leaf_3_Tip = new PixelmonModelRenderer(this, 112, 45);
		Leaf_3_Tip.addBox(0F, 0F, 0F, 1, 10, 4);
		Leaf_3_Tip.setRotationPoint(9F, -14F, -1.3F);
		Leaf_3_Tip.setTextureSize(128, 64);
		Leaf_3_Tip.mirror = true;
		setRotation(Leaf_3_Tip, 0F, -2.356194F, 1.047198F);
		PixelmonModelRenderer Leaf_4_Tip = new PixelmonModelRenderer(this, 112, 45);
		Leaf_4_Tip.addBox(0F, 0F, 0F, 1, 10, 4);
		Leaf_4_Tip.setRotationPoint(10F, -14F, 6F);
		Leaf_4_Tip.setTextureSize(128, 64);
		Leaf_4_Tip.mirror = true;
		setRotation(Leaf_4_Tip, 0F, -3.141593F, 1.047198F);
		PixelmonModelRenderer Leaf_5_Tip = new PixelmonModelRenderer(this, 112, 45);
		Leaf_5_Tip.addBox(0F, 0F, 0F, 1, 10, 4);
		Leaf_5_Tip.setRotationPoint(-10F, -14F, 2F);
		Leaf_5_Tip.setTextureSize(128, 64);
		Leaf_5_Tip.mirror = true;
		setRotation(Leaf_5_Tip, 0F, 0F, 1.047198F);
		PixelmonModelRenderer Leaf_6_Tip = new PixelmonModelRenderer(this, 112, 45);
		Leaf_6_Tip.addBox(0F, 0F, 0F, 1, 10, 4);
		Leaf_6_Tip.setRotationPoint(6F, -14F, 13F);
		Leaf_6_Tip.setTextureSize(128, 64);
		Leaf_6_Tip.mirror = true;
		setRotation(Leaf_6_Tip, 0F, 2.356194F, 1.047198F);
		PixelmonModelRenderer Leaf_7_Tip = new PixelmonModelRenderer(this, 112, 45);
		Leaf_7_Tip.addBox(0F, 0F, 0F, 1, 10, 4);
		Leaf_7_Tip.setRotationPoint(-9F, -14F, 10.1F);
		Leaf_7_Tip.setTextureSize(128, 64);
		Leaf_7_Tip.mirror = true;
		setRotation(Leaf_7_Tip, 0F, 0.7853982F, 1.047198F);
		PixelmonModelRenderer Leaf_8_Tip = new PixelmonModelRenderer(this, 112, 45);
		Leaf_8_Tip.addBox(0F, 0F, 0F, 1, 10, 4);
		Leaf_8_Tip.setRotationPoint(-2F, -14F, 14F);
		Leaf_8_Tip.setTextureSize(128, 64);
		Leaf_8_Tip.mirror = true;
		setRotation(Leaf_8_Tip, 0F, 1.570796F, 1.047198F);
		PixelmonModelRenderer Leaf_9_Base = new PixelmonModelRenderer(this, 22, 12);
		Leaf_9_Base.addBox(0F, 0F, 0F, 1, 10, 4);
		Leaf_9_Base.setRotationPoint(-2F, -16F, -3F);
		Leaf_9_Base.setTextureSize(128, 64);
		Leaf_9_Base.mirror = true;
		setRotation(Leaf_9_Base, 0F, -1.047198F, -0.5235988F);
		PixelmonModelRenderer Leaf_10_Base = new PixelmonModelRenderer(this, 22, 12);
		Leaf_10_Base.addBox(0F, 0F, 0F, 1, 10, 4);
		Leaf_10_Base.setRotationPoint(5F, -16F, -1.5F);
		Leaf_10_Base.setTextureSize(128, 64);
		Leaf_10_Base.mirror = true;
		setRotation(Leaf_10_Base, 0F, -2.094395F, -0.5235988F);
		PixelmonModelRenderer Leaf_11_Base = new PixelmonModelRenderer(this, 22, 12);
		Leaf_11_Base.addBox(0F, 0F, 0F, 1, 10, 4);
		Leaf_11_Base.setRotationPoint(-7F, -16F, 2F);
		Leaf_11_Base.setTextureSize(128, 64);
		Leaf_11_Base.mirror = true;
		setRotation(Leaf_11_Base, 0F, 0F, -0.5235988F);
		PixelmonModelRenderer Leaf_12_Base = new PixelmonModelRenderer(this, 22, 12);
		Leaf_12_Base.addBox(0F, 0F, 0F, 1, 10, 4);
		Leaf_12_Base.setRotationPoint(7F, -16F, 6F);
		Leaf_12_Base.setTextureSize(128, 64);
		Leaf_12_Base.mirror = true;
		setRotation(Leaf_12_Base, 0F, 3.141593F, -0.5235988F);
		PixelmonModelRenderer Leaf_13_Base = new PixelmonModelRenderer(this, 22, 12);
		Leaf_13_Base.addBox(0F, 0F, 0F, 1, 10, 4);
		Leaf_13_Base.setRotationPoint(-5F, -16F, 9F);
		Leaf_13_Base.setTextureSize(128, 64);
		Leaf_13_Base.mirror = true;
		setRotation(Leaf_13_Base, 0F, 1.047198F, -0.5235988F);
		PixelmonModelRenderer Leaf_14_Base = new PixelmonModelRenderer(this, 22, 12);
		Leaf_14_Base.addBox(0F, 0F, 0F, 1, 10, 4);
		Leaf_14_Base.setRotationPoint(1F, -16F, 11F);
		Leaf_14_Base.setTextureSize(128, 64);
		Leaf_14_Base.mirror = true;
		setRotation(Leaf_14_Base, 0F, 2.094395F, -0.5235988F);
		PixelmonModelRenderer Leaf_9_Tip = new PixelmonModelRenderer(this, 112, 45);
		Leaf_9_Tip.addBox(0F, 0F, 0F, 1, 10, 4);
		Leaf_9_Tip.setRotationPoint(-2F, -16F, -3F);
		Leaf_9_Tip.setTextureSize(128, 64);
		Leaf_9_Tip.mirror = true;
		setRotation(Leaf_9_Tip, 0F, -1.047198F, 1.308997F);
		PixelmonModelRenderer Leaf_10_Tip = new PixelmonModelRenderer(this, 112, 45);
		Leaf_10_Tip.addBox(0F, 0F, 0F, 1, 10, 4);
		Leaf_10_Tip.setRotationPoint(5F, -16F, -1.5F);
		Leaf_10_Tip.setTextureSize(128, 64);
		Leaf_10_Tip.mirror = true;
		setRotation(Leaf_10_Tip, 0F, -2.094395F, 1.308997F);
		PixelmonModelRenderer Leaf_11_Tip = new PixelmonModelRenderer(this, 112, 45);
		Leaf_11_Tip.addBox(0F, 0F, 0F, 1, 10, 4);
		Leaf_11_Tip.setRotationPoint(-7F, -16F, 2F);
		Leaf_11_Tip.setTextureSize(128, 64);
		Leaf_11_Tip.mirror = true;
		setRotation(Leaf_11_Tip, 0F, 0F, 1.308997F);
		PixelmonModelRenderer Leaf_12_Tip = new PixelmonModelRenderer(this, 112, 45);
		Leaf_12_Tip.addBox(0F, 0F, 0F, 1, 10, 4);
		Leaf_12_Tip.setRotationPoint(7F, -16F, 6F);
		Leaf_12_Tip.setTextureSize(128, 64);
		Leaf_12_Tip.mirror = true;
		setRotation(Leaf_12_Tip, 0F, 3.141593F, 1.308997F);
		PixelmonModelRenderer Leaf_13_Tip = new PixelmonModelRenderer(this, 112, 45);
		Leaf_13_Tip.addBox(0F, 0F, 0F, 1, 10, 4);
		Leaf_13_Tip.setRotationPoint(-5F, -16F, 9F);
		Leaf_13_Tip.setTextureSize(128, 64);
		Leaf_13_Tip.mirror = true;
		setRotation(Leaf_13_Tip, 0F, 1.047198F, 1.308997F);
		PixelmonModelRenderer Leaf_14_Tip = new PixelmonModelRenderer(this, 112, 45);
		Leaf_14_Tip.addBox(0F, 0F, 0F, 1, 10, 4);
		Leaf_14_Tip.setRotationPoint(1F, -16F, 11F);
		Leaf_14_Tip.setTextureSize(128, 64);
		Leaf_14_Tip.mirror = true;
		setRotation(Leaf_14_Tip, 0F, 2.094395F, 1.308997F);
		PixelmonModelRenderer Leaf_15_Base = new PixelmonModelRenderer(this, 22, 12);
		Leaf_15_Base.addBox(0F, 0F, 0F, 1, 10, 4);
		Leaf_15_Base.setRotationPoint(2F, -17F, 0F);
		Leaf_15_Base.setTextureSize(128, 64);
		Leaf_15_Base.mirror = true;
		setRotation(Leaf_15_Base, 0F, -1.570796F, -0.2617994F);
		PixelmonModelRenderer Leaf_16_Base = new PixelmonModelRenderer(this, 22, 12);
		Leaf_16_Base.addBox(0F, 0F, 0F, 1, 10, 4);
		Leaf_16_Base.setRotationPoint(-4F, -17F, 2F);
		Leaf_16_Base.setTextureSize(128, 64);
		Leaf_16_Base.mirror = true;
		setRotation(Leaf_16_Base, 0F, 0F, -0.2617994F);
		PixelmonModelRenderer Leaf_17_Tip = new PixelmonModelRenderer(this, 112, 45);
		Leaf_17_Tip.addBox(0F, 0F, 0F, 1, 10, 4);
		Leaf_17_Tip.setRotationPoint(4F, -17F, 6F);
		Leaf_17_Tip.setTextureSize(128, 64);
		Leaf_17_Tip.mirror = true;
		setRotation(Leaf_17_Tip, 0F, 3.141593F, 1.570796F);
		PixelmonModelRenderer Leaf_18_Base = new PixelmonModelRenderer(this, 22, 12);
		Leaf_18_Base.addBox(0F, 0F, 0F, 1, 10, 4);
		Leaf_18_Base.setRotationPoint(-2F, -17F, 8F);
		Leaf_18_Base.setTextureSize(128, 64);
		Leaf_18_Base.mirror = true;
		setRotation(Leaf_18_Base, 0F, 1.570796F, -0.2617994F);
		PixelmonModelRenderer Leaf_15_Tip = new PixelmonModelRenderer(this, 112, 45);
		Leaf_15_Tip.addBox(0F, 0F, 0F, 1, 10, 4);
		Leaf_15_Tip.setRotationPoint(2F, -17F, 0F);
		Leaf_15_Tip.setTextureSize(128, 64);
		Leaf_15_Tip.mirror = true;
		setRotation(Leaf_15_Tip, 0F, -1.570796F, 1.570796F);
		PixelmonModelRenderer Leaf_16_Tip = new PixelmonModelRenderer(this, 112, 45);
		Leaf_16_Tip.addBox(0F, 0F, 0F, 1, 10, 4);
		Leaf_16_Tip.setRotationPoint(-4F, -17F, 2F);
		Leaf_16_Tip.setTextureSize(128, 64);
		Leaf_16_Tip.mirror = true;
		setRotation(Leaf_16_Tip, 0F, 0F, 1.570796F);
		PixelmonModelRenderer Leaf_18_Tip = new PixelmonModelRenderer(this, 112, 45);
		Leaf_18_Tip.addBox(0F, 0F, 0F, 1, 10, 4);
		Leaf_18_Tip.setRotationPoint(-2F, -17F, 8F);
		Leaf_18_Tip.setTextureSize(128, 64);
		Leaf_18_Tip.mirror = true;
		setRotation(Leaf_18_Tip, 0F, 1.570796F, 1.570796F);
		PixelmonModelRenderer Leaf_17_Base = new PixelmonModelRenderer(this, 22, 12);
		Leaf_17_Base.addBox(0F, 0F, 0F, 1, 10, 4);
		Leaf_17_Base.setRotationPoint(4F, -17F, 6F);
		Leaf_17_Base.setTextureSize(128, 64);
		Leaf_17_Base.mirror = true;
		setRotation(Leaf_17_Base, 0F, 3.141593F, -0.2617994F);

		Body.addChild(Body_Bottom);
		Body.addChild(Body_Middle);
		Body.addChild(Body_Upper);
		Body.addChild(Body_Top);
		Body.addChild(Head_Middle);
		Body.addChild(Head_Left);
		Body.addChild(Head_Right);
		Body.addChild(Head_Middle_Front);
		Body.addChild(Head_Middle_Bottom);
		Body.addChild(Head_Left_Front);
		Body.addChild(Head_Right_Front);
		Body.addChild(Head_Left_Top);
		Body.addChild(Head_Middle_Top);
		Body.addChild(Head_Right_Top);
		Body.addChild(Head_Left_Bottom);
		Body.addChild(Head_Right_Bottom);
		Body.addChild(Leaf_1_Base);
		Body.addChild(Leaf_2_Base);
		Body.addChild(Leaf_3_Base);
		Body.addChild(Leaf_4_Base);
		Body.addChild(Leaf_5_Base);
		Body.addChild(Leaf_6_Base);
		Body.addChild(Leaf_7_Base);
		Body.addChild(Leaf_8_Base);
		Body.addChild(Leaf_1_Tip);
		Body.addChild(Leaf_2_Tip);
		Body.addChild(Leaf_3_Tip);
		Body.addChild(Leaf_4_Tip);
		Body.addChild(Leaf_5_Tip);
		Body.addChild(Leaf_6_Tip);
		Body.addChild(Leaf_7_Tip);
		Body.addChild(Leaf_8_Tip);
		Body.addChild(Leaf_9_Base);
		Body.addChild(Leaf_10_Base);
		Body.addChild(Leaf_11_Base);
		Body.addChild(Leaf_12_Base);
		Body.addChild(Leaf_13_Base);
		Body.addChild(Leaf_14_Base);
		Body.addChild(Leaf_9_Tip);
		Body.addChild(Leaf_10_Tip);
		Body.addChild(Leaf_11_Tip);
		Body.addChild(Leaf_12_Tip);
		Body.addChild(Leaf_13_Tip);
		Body.addChild(Leaf_14_Tip);
		Body.addChild(Leaf_15_Base);
		Body.addChild(Leaf_16_Base);
		Body.addChild(Leaf_17_Tip);
		Body.addChild(Leaf_18_Base);
		Body.addChild(Leaf_15_Tip);
		Body.addChild(Leaf_16_Tip);
		Body.addChild(Leaf_18_Tip);
		Body.addChild(Leaf_17_Base);

		PixelmonModelRenderer RightLeg = new PixelmonModelRenderer(this, "Body");
		RightLeg.setRotationPoint(-4.7F, 11, 1.5F);
		PixelmonModelRenderer Leg_Top_Right = new PixelmonModelRenderer(this, 42, 45);
		Leg_Top_Right.addBox(-5F, 0F, 0F, 5, 6, 5);
		Leg_Top_Right.setTextureSize(128, 64);
		Leg_Top_Right.mirror = true;
		setRotation(Leg_Top_Right, -0.5235988F, 0.5235988F, 0F);
		PixelmonModelRenderer Leg_Middle_Right = new PixelmonModelRenderer(this, 30, 27);
		Leg_Middle_Right.addBox(0F, 0F, 0F, 5, 4, 5);
		Leg_Middle_Right.setRotationPoint(-6.3F, 5F, -1F);
		Leg_Middle_Right.setTextureSize(128, 64);
		Leg_Middle_Right.mirror = true;
		setRotation(Leg_Middle_Right, 0F, 0.5235988F, 0F);
		PixelmonModelRenderer Leg_Bottom_Right = new PixelmonModelRenderer(this, 108, 59);
		Leg_Bottom_Right.addBox(0F, 0F, 0F, 4, 1, 4);
		Leg_Bottom_Right.setRotationPoint(-5.4F, 9F, -0.5F);
		Leg_Bottom_Right.setTextureSize(128, 64);
		Leg_Bottom_Right.mirror = true;
		setRotation(Leg_Bottom_Right, 0F, 0.5235988F, 0F);
		PixelmonModelRenderer Feet_Right = new PixelmonModelRenderer(this, 100, 32);
		Feet_Right.addBox(0F, 0F, 0F, 5, 3, 8);
		Feet_Right.setRotationPoint(-7.8F, 10F, -3F);
		Feet_Right.setTextureSize(128, 64);
		Feet_Right.mirror = true;
		setRotation(Feet_Right, 0F, 0.5235988F, 0F);
		PixelmonModelRenderer Feet_Claw_First_Right = new PixelmonModelRenderer(this, 26, 0);
		Feet_Claw_First_Right.addBox(0F, 0F, 0F, 1, 1, 3);
		Feet_Claw_First_Right.setRotationPoint(-5.3F, 12F, -6.5F);
		Feet_Claw_First_Right.setTextureSize(128, 64);
		Feet_Claw_First_Right.mirror = true;
		setRotation(Feet_Claw_First_Right, 0F, 0.5235988F, 0F);
		PixelmonModelRenderer Feet_Claw_Second_Right = new PixelmonModelRenderer(this, 26, 0);
		Feet_Claw_Second_Right.addBox(0F, 0F, 0F, 1, 1, 3);
		Feet_Claw_Second_Right.setRotationPoint(-8.3F, 12F, -4.8F);
		Feet_Claw_Second_Right.setTextureSize(128, 64);
		Feet_Claw_Second_Right.mirror = true;
		setRotation(Feet_Claw_Second_Right, 0F, 0.5235988F, 0F);

		RightLeg.addChild(Leg_Top_Right);
		RightLeg.addChild(Leg_Middle_Right);
		RightLeg.addChild(Leg_Bottom_Right);
		RightLeg.addChild(Feet_Right);
		RightLeg.addChild(Feet_Claw_First_Right);
		RightLeg.addChild(Feet_Claw_Second_Right);
		Body.addChild(RightLeg);

		PixelmonModelRenderer LeftLeg = new PixelmonModelRenderer(this, "Body");
		LeftLeg.setRotationPoint(4.7F, 11, 1F);
		PixelmonModelRenderer Feet_Left = new PixelmonModelRenderer(this, 0, 0);
		Feet_Left.addBox(0F, 0F, 0F, 5, 3, 8);
		Feet_Left.setRotationPoint(3.3F, 10F, -5F);
		Feet_Left.setTextureSize(128, 64);
		Feet_Left.mirror = true;
		setRotation(Feet_Left, 0F, -0.5235988F, 0F);
		PixelmonModelRenderer Feet_Claw_First_Left = new PixelmonModelRenderer(this, 26, 0);
		Feet_Claw_First_Left.addBox(0F, 0F, 0F, 1, 1, 3);
		Feet_Claw_First_Left.setRotationPoint(4.3F, 12F, -6.5F);
		Feet_Claw_First_Left.setTextureSize(128, 64);
		Feet_Claw_First_Left.mirror = true;
		setRotation(Feet_Claw_First_Left, 0F, -0.5235988F, 0F);
		PixelmonModelRenderer Feet_Claw_Second_Left = new PixelmonModelRenderer(this, 26, 0);
		Feet_Claw_Second_Left.addBox(0F, 0F, 0F, 1, 1, 3);
		Feet_Claw_Second_Left.setRotationPoint(7.3F, 12F, -4.7F);
		Feet_Claw_Second_Left.setTextureSize(128, 64);
		Feet_Claw_Second_Left.mirror = true;
		setRotation(Feet_Claw_Second_Left, 0F, -0.5235988F, 0F);
		PixelmonModelRenderer Leg_Bottom_Left = new PixelmonModelRenderer(this, 0, 11);
		Leg_Bottom_Left.addBox(0F, 0F, 0F, 4, 1, 4);
		Leg_Bottom_Left.setRotationPoint(1.8F, 9F, -2F);
		Leg_Bottom_Left.setTextureSize(128, 64);
		Leg_Bottom_Left.mirror = true;
		setRotation(Leg_Bottom_Left, 0F, -0.5235988F, 0F);
		PixelmonModelRenderer Leg_Middle_Left = new PixelmonModelRenderer(this, 34, 0);
		Leg_Middle_Left.addBox(0F, 0F, 0F, 5, 4, 5);
		Leg_Middle_Left.setRotationPoint(1.7F, 5F, -3F);
		Leg_Middle_Left.setTextureSize(128, 64);
		Leg_Middle_Left.mirror = true;
		setRotation(Leg_Middle_Left, 0F, -0.5235988F, 0F);
		PixelmonModelRenderer Leg_Top_Left = new PixelmonModelRenderer(this, 54, 0);
		Leg_Top_Left.addBox(0F, 0F, 0F, 5, 6, 5);
		Leg_Top_Left.setTextureSize(128, 64);
		Leg_Top_Left.mirror = true;
		setRotation(Leg_Top_Left, -0.5235988F, -0.5235988F, 0F);

		LeftLeg.addChild(Feet_Left);
		LeftLeg.addChild(Feet_Claw_First_Left);
		LeftLeg.addChild(Feet_Claw_Second_Left);
		LeftLeg.addChild(Leg_Bottom_Left);
		LeftLeg.addChild(Leg_Middle_Left);
		LeftLeg.addChild(Leg_Top_Left);
		Body.addChild(LeftLeg);

		float legspeed = 0.35F;
		float legRotationLimit = 0.7F;

		ModuleLeg leftLegModule = new ModuleLeg(LeftLeg, EnumLeg.FrontLeft, EnumPhase.InPhase, legRotationLimit, legspeed);
		ModuleLeg rightLegModule = new ModuleLeg(RightLeg, EnumLeg.FrontRight, EnumPhase.InPhase, legRotationLimit, legspeed);

		skeleton = new SkeletonBiped(Body, null, null, null, leftLegModule, rightLegModule, null);

	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5);
		Body.render(f5);

	}

	private void setRotation(PixelmonModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5) {
	}

}
