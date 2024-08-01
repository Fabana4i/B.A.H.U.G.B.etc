// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class cougar_he<T extends Cougar > extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "cougar_he"), "main");
	private final ModelPart bone;
	private final ModelPart bb_main;

	public cougar_he(ModelPart root) {
		this.bone = root.getChild("bone");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(-10, 0).addBox(-15.325F, 17.725F, 1.0F, 17.0F, 9.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(-4, 4).addBox(1.7F, 5.15F, -3.925F, 1.0F, 17.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(-6, 4).addBox(2.675F, 21.175F, -3.925F, 23.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(-6, 4).addBox(2.675F, 5.175F, -3.925F, 23.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(-5, 5).addBox(2.675F, 8.175F, -2.925F, 23.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(-5, 5).addBox(2.675F, 9.475F, -2.925F, 23.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(-5, 5).addBox(2.675F, 10.775F, -2.925F, 23.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(-5, 5).addBox(2.675F, 12.075F, -2.925F, 23.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(-5, 5).addBox(2.675F, 13.375F, -2.925F, 23.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(-5, 5).addBox(2.675F, 14.675F, -2.925F, 23.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(-5, 5).addBox(2.675F, 15.975F, -2.925F, 23.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(-5, 5).addBox(2.675F, 17.275F, -2.925F, 23.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(-5, 5).addBox(2.675F, 18.575F, -2.925F, 23.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(-5, 5).addBox(2.675F, 19.875F, -2.925F, 23.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(-6, 4).mirror().addBox(25.225F, 5.15F, -3.925F, 1.0F, 17.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(-10, 0).mirror().addBox(26.05F, 17.725F, 1.0F, 17.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(0, 0).addBox(9.905F, 21.515F, -1.0F, 8.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(-7, 0).addBox(3.905F, 18.515F, -1.0F, 21.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(24.15F, 6.4F, -1.0F, 10.0F, 14.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-6.375F, 6.4F, -1.0F, 31.0F, 14.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(-6.375F, 6.4F, -2.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(4, 0).addBox(-2.125F, 2.125F, -1.0F, 32.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(5, 1).addBox(-2.125F, 2.125F, -2.0F, 32.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).mirror().addBox(32.15F, 6.4F, -2.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-11.675F, -15.075F, -2.0F));

		PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(0.0F, 3.0F, 0.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(0.0F, 3.0F, 0.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(0.0F, 3.0F, 1.0F, 6.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition cube_r2 = bone.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 1).addBox(0.0F, 3.0F, 0.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.6981F));

		PartDefinition cube_r3 = bone.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(1, 1).mirror().addBox(-1.0F, 3.0F, 0.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(27.775F, 0.0F, -2.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition cube_r4 = bone.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(1, 1).mirror().addBox(-1.0F, 3.0F, 0.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(27.775F, 0.0F, -2.0F, 0.0F, 0.0F, -0.6981F));

		PartDefinition cube_r5 = bone.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -5.0F, -31.0F, 2.0F, 14.0F, 31.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-1.0F, -5.0F, -31.0F, 2.0F, 14.0F, 31.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-9.35F, 11.4F, 30.35F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r6 = bone.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(1.0F, -5.0F, -31.0F, 2.0F, 14.0F, 31.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(35.225F, 11.4F, 30.35F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r7 = bone.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-7.0F, -6.0F, -1.0F, 8.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(24.75F, 26.0F, 0.0F, 0.0F, 0.0F, -0.2182F));

		PartDefinition cube_r8 = bone.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-9.0F, -6.0F, -1.0F, 10.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(33.325F, 20.95F, 0.0F, 0.0F, 0.0F, -0.5672F));

		PartDefinition cube_r9 = bone.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -6.0F, -1.0F, 8.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.075F, 26.0F, 0.0F, 0.0F, 0.0F, 0.2182F));

		PartDefinition cube_r10 = bone.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -6.0F, -1.0F, 10.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.5F, 20.95F, 0.0F, 0.0F, 0.0F, 0.5672F));

		PartDefinition cube_r11 = bone.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(-10, 0).mirror().addBox(-6.375F, -23.94F, -0.925F, 9.0F, 26.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(-2, 0).mirror().addBox(43.0F, -23.94F, -0.925F, 9.0F, 26.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-8.95F, 18.475F, 3.125F, -1.4835F, 0.0F, 0.0F));

		PartDefinition cube_r12 = bone.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 3.0F, -1.0F, 6.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(32.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(0, 0).addBox(12.0F, -32.0F, -15.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(40, 16).addBox(8.0F, -24.0F, -13.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(16, 16).addBox(12.0F, -24.0F, -13.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(32, 48).addBox(20.0F, -24.0F, -13.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(16, 48).addBox(15.9F, -12.0F, -13.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 16).addBox(12.1F, -12.0F, -13.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 16, 16);
	}

	@Override
	public void setupAnim(Cougar  entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}