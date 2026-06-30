package com.tencent.tav.core.composition;

/* loaded from: classes16.dex */
public interface VideoCompositionLayerInstruction {

    /* loaded from: classes16.dex */
    public static class CropRectangleRamp {
        public boolean available = true;
        public com.tencent.tav.coremedia.CGRect endCropRectangle;
        public com.tencent.tav.coremedia.CGRect startCropRectangle;
        public com.tencent.tav.coremedia.CMTimeRange timeRange;

        public CropRectangleRamp(com.tencent.tav.coremedia.CMTimeRange cMTimeRange) {
            this.timeRange = cMTimeRange;
        }
    }

    /* loaded from: classes16.dex */
    public static class OpacityRamp {
        public com.tencent.tav.coremedia.CMTimeRange timeRange;
        public float startOpacity = 1.0f;
        public float endOpacity = 1.0f;
        public boolean available = true;

        public OpacityRamp(com.tencent.tav.coremedia.CMTimeRange cMTimeRange) {
            this.timeRange = cMTimeRange;
        }
    }

    /* loaded from: classes16.dex */
    public static class TransformRamp {
        public boolean available = true;
        public com.tencent.tav.coremedia.Transform endTransform;
        public com.tencent.tav.coremedia.Transform startTransform;
        public com.tencent.tav.coremedia.CMTimeRange timeRange;

        public TransformRamp(com.tencent.tav.coremedia.CMTimeRange cMTimeRange) {
            this.timeRange = cMTimeRange;
        }
    }

    com.tencent.tav.core.composition.VideoCompositionLayerInstruction.CropRectangleRamp getCropRectangleRampForTime(com.tencent.tav.coremedia.CMTime cMTime);

    com.tencent.tav.core.composition.VideoCompositionLayerInstruction.OpacityRamp getOpacityRampForTime(com.tencent.tav.coremedia.CMTime cMTime);

    int getTrackID();

    com.tencent.tav.core.composition.VideoCompositionLayerInstruction.TransformRamp getTransformRampForTime(com.tencent.tav.coremedia.CMTime cMTime);
}
