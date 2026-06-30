package com.tencent.tav.core.composition;

/* loaded from: classes16.dex */
public class VideoComposition {
    private static final java.lang.String TAG = "VideoComposition";
    private com.tencent.tav.asset.Asset asset;
    private java.lang.Class<? extends com.tencent.tav.core.compositing.VideoCompositing> customVideoCompositorClass;
    private com.tencent.tav.coremedia.CMTime frameDuration;
    private java.util.List<? extends com.tencent.tav.core.composition.VideoCompositionInstruction> instructions;
    private android.graphics.Bitmap lutBitmap;
    private com.tencent.tav.core.composition.VideoComposition.RenderLayoutMode renderLayoutMode;
    private float renderScale;
    private com.tencent.tav.coremedia.CGSize renderSize;
    private int sourceTrackIDForFrameTiming;
    private boolean useSystemHdrTranscode;

    /* loaded from: classes16.dex */
    public enum RenderLayoutMode {
        aspectFit,
        aspectFill
    }

    public VideoComposition(com.tencent.tav.asset.Asset asset) {
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
        this.instructions = new java.util.ArrayList();
        if (tracksWithMediaType != null && !(this.asset instanceof com.tencent.tav.asset.Composition)) {
            for (com.tencent.tav.asset.AssetTrack assetTrack3 : tracksWithMediaType) {
                com.tencent.tav.core.composition.VideoCompositionInstruction videoCompositionInstruction = new com.tencent.tav.core.composition.VideoCompositionInstruction();
                videoCompositionInstruction.backgroundColor = -16777216;
                videoCompositionInstruction.enablePostProcessing = true;
                videoCompositionInstruction.passthroughTrackID = assetTrack3.getTrackID();
                videoCompositionInstruction.timeRange = new com.tencent.tav.coremedia.CMTimeRange(com.tencent.tav.coremedia.CMTime.CMTimeZero, assetTrack3.getDuration());
                videoCompositionInstruction.requiredSourceTrackIDs = java.util.Arrays.asList(java.lang.Integer.valueOf(assetTrack3.getTrackID()));
                com.tencent.tav.core.composition.MutableVideoCompositionLayerInstruction mutableVideoCompositionLayerInstruction = new com.tencent.tav.core.composition.MutableVideoCompositionLayerInstruction();
                mutableVideoCompositionLayerInstruction.setTrackID(assetTrack3.getTrackID());
                mutableVideoCompositionLayerInstruction.setTransformRampFromStartTransform(null, null, videoCompositionInstruction.timeRange);
                mutableVideoCompositionLayerInstruction.setCropRectangleRampFromStartCropRectangle(null, null, videoCompositionInstruction.timeRange);
                mutableVideoCompositionLayerInstruction.setOpacityRampFromStartOpacity(1.0f, 1.0f, videoCompositionInstruction.timeRange);
                videoCompositionInstruction.layerInstructions.add(mutableVideoCompositionLayerInstruction);
            }
        }
        this.renderScale = 1.0f;
    }

    public static com.tencent.tav.core.composition.VideoCompositionInstruction findInstruction(com.tencent.tav.core.composition.VideoComposition videoComposition, com.tencent.tav.coremedia.CMTime cMTime) {
        com.tencent.tav.core.composition.VideoCompositionInstruction videoCompositionInstruction = null;
        if (videoComposition.getInstructions() == null) {
            return null;
        }
        for (com.tencent.tav.core.composition.VideoCompositionInstruction videoCompositionInstruction2 : videoComposition.getInstructions()) {
            if (videoCompositionInstruction2.getTimeRange() != null && (videoCompositionInstruction == null || videoCompositionInstruction.getTimeRange().getEnd().smallThan(videoCompositionInstruction2.getTimeRange().getEnd()))) {
                videoCompositionInstruction = videoCompositionInstruction2;
            }
            com.tencent.tav.coremedia.CMTimeRange timeRange = videoCompositionInstruction2.getTimeRange();
            if (timeRange != null && timeRange.getStartUs() <= cMTime.getTimeUs() && timeRange.getEndUs() > cMTime.getTimeUs()) {
                return videoCompositionInstruction2;
            }
        }
        return videoCompositionInstruction;
    }

    public void enableLut(android.graphics.Bitmap bitmap) {
        this.lutBitmap = bitmap;
    }

    public com.tencent.tav.core.compositing.VideoCompositing getCustomVideoCompositor() {
        java.lang.Class<? extends com.tencent.tav.core.compositing.VideoCompositing> cls = this.customVideoCompositorClass;
        if (cls == null) {
            return new com.tencent.tav.core.VideoCompositor();
        }
        try {
            return cls.newInstance();
        } catch (java.lang.IllegalAccessException unused) {
            return new com.tencent.tav.core.VideoCompositor();
        } catch (java.lang.InstantiationException unused2) {
            return new com.tencent.tav.core.VideoCompositor();
        }
    }

    public java.lang.Class<? extends com.tencent.tav.core.compositing.VideoCompositing> getCustomVideoCompositorClass() {
        return this.customVideoCompositorClass;
    }

    public com.tencent.tav.coremedia.CMTime getFrameDuration() {
        return this.frameDuration;
    }

    public <T extends com.tencent.tav.core.composition.VideoCompositionInstruction> java.util.List<T> getInstructions() {
        return (java.util.List<T>) this.instructions;
    }

    public android.graphics.Bitmap getLutBitmap() {
        return this.lutBitmap;
    }

    public com.tencent.tav.core.composition.VideoComposition.RenderLayoutMode getRenderLayoutMode() {
        return this.renderLayoutMode;
    }

    public float getRenderScale() {
        return this.renderScale;
    }

    public com.tencent.tav.coremedia.CGSize getRenderSize() {
        return this.renderSize;
    }

    public int getSourceTrackIDForFrameTiming() {
        return this.sourceTrackIDForFrameTiming;
    }

    public boolean getUseSystemHdrTranscode() {
        return this.useSystemHdrTranscode;
    }

    public void setUseSystemHdrTranscode(boolean z17) {
        this.useSystemHdrTranscode = z17;
    }

    public java.lang.String toString() {
        return "MutableVideoComposition{, frameDuration=" + this.frameDuration + ", renderSize=" + this.renderSize + ", renderLayoutMode=" + this.renderLayoutMode + ", instructions=" + this.instructions + '}';
    }

    public VideoComposition() {
    }
}
