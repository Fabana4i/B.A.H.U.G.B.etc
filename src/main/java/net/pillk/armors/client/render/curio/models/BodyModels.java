package net.pillk.armors.client.render.curio.models;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.ResourceLocation;

public class BodyModels {
    private static BipedModel<LivingEntity> createBodyModel(Function<ResourceLocation, RenderType> renderType, int textureWidth, int textureHeight) {
        BipedModel<LivingEntity> model = new BipedModel<>(renderType, 0, 0, textureWidth, textureHeight);
        model.hat.visible = false;
        model.head.visible = false;
        model.leftArm.visible = false;
        model.rightArm.visible = false;
        model.leftLeg.visible = false;
        model.rightLeg.visible = false;

        model.body = new ModelRenderer(model);
        model.body.setTexSize(textureWidth, textureHeight);

        // torso
        model.body.texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F);

        return model;
    }

    public static BipedModel<LivingEntity> armoredBody() {
        BipedModel<LivingEntity> model = createBodyModel(RenderType::entityCutoutNoCull, 64, 32);

        // armor
        model.body.texOffs(32, 0).addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.25F);

        return model;
    }

    public static BipedModel<LivingEntity> wings() {
        BipedModel<LivingEntity> model = createBodyModel(RenderType::entityCutoutNoCull, 64, 32);

        // wings
        model.body.texOffs(0, 32).addBox(-4.0F, 0.0F, 2.0F, 8, 12, 0, 0.0F);

        return model;
    }

    public static BipedModel<LivingEntity> capedBody() {
        BipedModel<LivingEntity> model = armoredBody();

        // cape
        model.body.texOffs(0, 48).addBox(-4.0F, 0.0F, 2.0F, 8, 20, 0, 0.5F);

        return model;
    }

    public static BipedModel<LivingEntity> spikedBody() {
        BipedModel<LivingEntity> model = armoredBody();

        // spikes
        model.body.texOffs(32, 32).addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.5F);

        return model;
    }

    public static BipedModel<LivingEntity> specialBody() {
        BipedModel<LivingEntity> model = createBodyModel(RenderType::entityCutoutNoCull, 64, 32);

        // special feature
        model.body.texOffs(0, 64).addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.5F);

        return model;
    }
}
