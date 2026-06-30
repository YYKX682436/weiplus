package com.tencent.tavkit.composition.model;

/* loaded from: classes14.dex */
public class TAVVideoConfiguration implements java.lang.Cloneable {
    public static com.tencent.tav.coremedia.CGRect DEFAULT_VIDEO_FRAME;
    public static final com.tencent.tav.coremedia.CGRect FIX_RENDER_SIZE = new com.tencent.tav.coremedia.CGRect();
    public static final com.tencent.tav.coremedia.CGRect SOURCE_SIZE;
    private com.tencent.tav.coremedia.CGRect frame = DEFAULT_VIDEO_FRAME;
    private int preferRotation = 0;
    private com.tencent.tavkit.composition.model.TAVVideoConfiguration.TAVVideoConfigurationContentMode contentMode = com.tencent.tavkit.composition.model.TAVVideoConfiguration.TAVVideoConfigurationContentMode.aspectFit;
    private android.graphics.Matrix transform = new android.graphics.Matrix();
    private java.util.List<com.tencent.tavkit.composition.video.TAVVideoEffect> effects = new java.util.ArrayList();

    /* loaded from: classes10.dex */
    public enum TAVVideoConfigurationContentMode {
        aspectFit,
        aspectFill,
        scaleToFit
    }

    static {
        com.tencent.tav.coremedia.CGRect cGRect = new com.tencent.tav.coremedia.CGRect();
        SOURCE_SIZE = cGRect;
        DEFAULT_VIDEO_FRAME = cGRect;
    }

    public void addEffect(com.tencent.tavkit.composition.video.TAVVideoEffect tAVVideoEffect) {
        if (this.effects == null) {
            this.effects = new java.util.ArrayList();
        }
        this.effects.add(tAVVideoEffect);
    }

    public boolean frameEnable() {
        com.tencent.tav.coremedia.CGRect cGRect = this.frame;
        return (cGRect == null || cGRect == FIX_RENDER_SIZE || cGRect == SOURCE_SIZE || !com.tencent.tavkit.utils.Utils.isRectValid(cGRect)) ? false : true;
    }

    public com.tencent.tavkit.composition.model.TAVVideoConfiguration.TAVVideoConfigurationContentMode getContentMode() {
        return this.contentMode;
    }

    public java.util.List<com.tencent.tavkit.composition.video.TAVVideoEffect> getEffects() {
        return this.effects;
    }

    public com.tencent.tav.coremedia.CGRect getFrame() {
        return this.frame;
    }

    public int getPreferRotation() {
        return this.preferRotation;
    }

    public android.graphics.Matrix getTransform() {
        return this.transform;
    }

    public void setContentMode(com.tencent.tavkit.composition.model.TAVVideoConfiguration.TAVVideoConfigurationContentMode tAVVideoConfigurationContentMode) {
        this.contentMode = tAVVideoConfigurationContentMode;
    }

    public void setEffects(java.util.List<com.tencent.tavkit.composition.video.TAVVideoEffect> list) {
        this.effects = list;
    }

    public void setFrame(com.tencent.tav.coremedia.CGRect cGRect) {
        this.frame = cGRect;
    }

    public void setPreferRotation(int i17) {
        this.preferRotation = i17;
    }

    public void setTransform(android.graphics.Matrix matrix) {
        this.transform = matrix;
    }

    public java.lang.String toString() {
        return "TAVVideoConfiguration{contentMode=" + this.contentMode + ", frame=" + this.frame + ", transform=" + this.transform + '}';
    }

    public void updateTimeRange(com.tencent.tav.coremedia.CMTimeRange cMTimeRange) {
        java.util.List<com.tencent.tavkit.composition.video.TAVVideoEffect> list = this.effects;
        if (list == null) {
            return;
        }
        for (com.tencent.tavkit.composition.video.TAVVideoEffect tAVVideoEffect : list) {
            if (tAVVideoEffect instanceof com.tencent.tavkit.composition.video.TAVAttachTimeRangeSourceEffect) {
                ((com.tencent.tavkit.composition.video.TAVAttachTimeRangeSourceEffect) tAVVideoEffect).attachTimeRange(cMTimeRange);
            }
        }
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public com.tencent.tavkit.composition.model.TAVVideoConfiguration m422clone() {
        com.tencent.tavkit.composition.model.TAVVideoConfiguration tAVVideoConfiguration = new com.tencent.tavkit.composition.model.TAVVideoConfiguration();
        tAVVideoConfiguration.contentMode = this.contentMode;
        tAVVideoConfiguration.frame = this.frame;
        tAVVideoConfiguration.transform = this.transform;
        tAVVideoConfiguration.effects = new java.util.ArrayList(this.effects);
        tAVVideoConfiguration.preferRotation = this.preferRotation;
        return tAVVideoConfiguration;
    }
}
