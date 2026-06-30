package com.tencent.tav.core.composition;

/* loaded from: classes16.dex */
public class VideoCompositionInstruction implements com.tencent.tav.core.compositing.IVideoCompositionInstruction {
    protected int backgroundColor;
    protected boolean enablePostProcessing;
    protected com.tencent.tav.coremedia.CMTimeRange timeRange;
    protected java.util.List<com.tencent.tav.core.composition.VideoCompositionLayerInstruction> layerInstructions = new java.util.ArrayList();
    protected java.util.List<java.lang.Integer> requiredSourceTrackIDs = new java.util.ArrayList();
    protected int passthroughTrackID = -1;

    @Override // com.tencent.tav.core.compositing.IVideoCompositionInstruction
    public int getBackgroundColor() {
        return this.backgroundColor;
    }

    @Override // com.tencent.tav.core.compositing.IVideoCompositionInstruction
    public java.util.List<? extends com.tencent.tav.core.composition.VideoCompositionLayerInstruction> getLayerInstructions() {
        return this.layerInstructions;
    }

    @Override // com.tencent.tav.core.compositing.IVideoCompositionInstruction
    public int getPassthroughTrackID() {
        return this.passthroughTrackID;
    }

    @Override // com.tencent.tav.core.compositing.IVideoCompositionInstruction
    public java.util.List<java.lang.Integer> getRequiredSourceTrackIDs() {
        return this.requiredSourceTrackIDs;
    }

    @Override // com.tencent.tav.core.compositing.IVideoCompositionInstruction
    public com.tencent.tav.coremedia.CMTimeRange getTimeRange() {
        return this.timeRange;
    }

    @Override // com.tencent.tav.core.compositing.IVideoCompositionInstruction
    public boolean isEnablePostProcessing() {
        return this.enablePostProcessing;
    }
}
