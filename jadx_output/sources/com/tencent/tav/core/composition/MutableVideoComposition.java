package com.tencent.tav.core.composition;

/* loaded from: classes16.dex */
public class MutableVideoComposition extends com.tencent.tav.core.composition.VideoComposition {
    private static final java.lang.String TAG = "VideoComposition";
    private com.tencent.tav.asset.Asset asset;
    private java.lang.Class<? extends com.tencent.tav.core.compositing.VideoCompositing> customVideoCompositorClass;
    private com.tencent.tav.coremedia.CMTime frameDuration;
    private java.util.List<? extends com.tencent.tav.core.composition.VideoCompositionInstruction> instructions;
    private com.tencent.tav.core.composition.VideoComposition.RenderLayoutMode renderLayoutMode;
    private float renderScale;
    private com.tencent.tav.coremedia.CGSize renderSize;
    private int sourceTrackIDForFrameTiming;

    public MutableVideoComposition(com.tencent.tav.asset.Asset asset) {
        this.asset = asset;
        this.instructions = new java.util.ArrayList();
        fillSourceProperty();
    }

    private void fillSourceProperty() {
        java.util.List<com.tencent.tav.asset.AssetTrack> tracksWithMediaType = this.asset.tracksWithMediaType(1);
        this.frameDuration = null;
        this.renderSize = null;
        if (tracksWithMediaType != null) {
            for (com.tencent.tav.asset.AssetTrack assetTrack : tracksWithMediaType) {
                com.tencent.tav.coremedia.CMTime cMTime = this.frameDuration;
                if (cMTime == null) {
                    this.frameDuration = new com.tencent.tav.coremedia.CMTime(1L, (int) assetTrack.getNominalFrameRate());
                } else {
                    this.frameDuration = ((float) cMTime.timeScale) > assetTrack.getNominalFrameRate() ? this.frameDuration : new com.tencent.tav.coremedia.CMTime(1L, (int) assetTrack.getNominalFrameRate());
                }
            }
        }
        com.tencent.tav.coremedia.CMTime cMTime2 = this.frameDuration;
        if (cMTime2 == null || cMTime2.timeScale == 0) {
            this.frameDuration = new com.tencent.tav.coremedia.CMTime(1L, 30);
        }
        com.tencent.tav.asset.Asset asset = this.asset;
        if (asset instanceof com.tencent.tav.asset.Composition) {
            this.renderSize = asset.getNaturalSize();
        } else if (tracksWithMediaType != null) {
            for (com.tencent.tav.asset.AssetTrack assetTrack2 : tracksWithMediaType) {
                if (this.renderSize == null) {
                    this.renderSize = assetTrack2.getNaturalSize();
                } else if (assetTrack2.getNaturalSize() != null) {
                    this.renderSize = new com.tencent.tav.coremedia.CGSize(java.lang.Math.max(this.renderSize.width, assetTrack2.getNaturalSize().width), java.lang.Math.max(this.renderSize.height, assetTrack2.getNaturalSize().height));
                }
            }
        }
        this.renderScale = 1.0f;
    }

    @Override // com.tencent.tav.core.composition.VideoComposition
    public com.tencent.tav.core.compositing.VideoCompositing getCustomVideoCompositor() {
        java.lang.Class<? extends com.tencent.tav.core.compositing.VideoCompositing> cls = this.customVideoCompositorClass;
        if (cls == null) {
            return new com.tencent.tav.core.VideoCompositor();
        }
        try {
            return cls.newInstance();
        } catch (java.lang.IllegalAccessException | java.lang.InstantiationException unused) {
            return new com.tencent.tav.core.VideoCompositor();
        }
    }

    @Override // com.tencent.tav.core.composition.VideoComposition
    public java.lang.Class<? extends com.tencent.tav.core.compositing.VideoCompositing> getCustomVideoCompositorClass() {
        return this.customVideoCompositorClass;
    }

    @Override // com.tencent.tav.core.composition.VideoComposition
    public com.tencent.tav.coremedia.CMTime getFrameDuration() {
        return this.frameDuration;
    }

    @Override // com.tencent.tav.core.composition.VideoComposition
    public java.util.List<? extends com.tencent.tav.core.composition.VideoCompositionInstruction> getInstructions() {
        return this.instructions;
    }

    @Override // com.tencent.tav.core.composition.VideoComposition
    public com.tencent.tav.core.composition.VideoComposition.RenderLayoutMode getRenderLayoutMode() {
        return this.renderLayoutMode;
    }

    @Override // com.tencent.tav.core.composition.VideoComposition
    public float getRenderScale() {
        return this.renderScale;
    }

    @Override // com.tencent.tav.core.composition.VideoComposition
    public com.tencent.tav.coremedia.CGSize getRenderSize() {
        return this.renderSize;
    }

    @Override // com.tencent.tav.core.composition.VideoComposition
    public int getSourceTrackIDForFrameTiming() {
        return this.sourceTrackIDForFrameTiming;
    }

    public void setCustomVideoCompositorClass(java.lang.Class<? extends com.tencent.tav.core.compositing.VideoCompositing> cls) {
        this.customVideoCompositorClass = cls;
    }

    public void setFrameDuration(com.tencent.tav.coremedia.CMTime cMTime) {
        this.frameDuration = cMTime;
    }

    public void setInstructions(java.util.List<? extends com.tencent.tav.core.composition.VideoCompositionInstruction> list) {
        this.instructions = list;
    }

    public void setRenderLayoutMode(com.tencent.tav.core.composition.VideoComposition.RenderLayoutMode renderLayoutMode) {
        this.renderLayoutMode = renderLayoutMode;
    }

    public void setRenderScale(float f17) {
        this.renderScale = f17;
    }

    public void setRenderSize(com.tencent.tav.coremedia.CGSize cGSize) {
        this.renderSize = cGSize;
    }

    public void setSourceTrackIDForFrameTiming(int i17) {
        this.sourceTrackIDForFrameTiming = i17;
    }

    @Override // com.tencent.tav.core.composition.VideoComposition
    public java.lang.String toString() {
        return "MutableVideoComposition{, frameDuration=" + this.frameDuration + ", renderSize=" + this.renderSize + ", renderLayoutMode=" + this.renderLayoutMode + ", instructions=" + this.instructions + '}';
    }

    public MutableVideoComposition() {
    }
}
