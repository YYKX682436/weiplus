package com.tencent.tavkit.composition.video;

/* loaded from: classes16.dex */
public class TAVVideoCompositionInstruction extends com.tencent.tav.core.composition.VideoCompositionInstruction {
    private static final java.lang.String TAG = "TAVVideoCompositionInst";
    private java.util.List<java.util.List<com.tencent.tavkit.composition.video.TAVVideoCompositionLayerInstruction>> channelLayers;
    private com.tencent.tavkit.composition.video.TAVVideoEffect globalVideoEffect;
    private java.util.List<com.tencent.tavkit.composition.video.TAVVideoCompositionLayerInstruction> overlayLayers;
    private com.tencent.tavkit.composition.video.TAVVideoEffect sourceVideoEffect;
    private final com.tencent.tav.coremedia.CMTimeRange timeRange;
    private com.tencent.tavkit.composition.video.TAVVideoMixEffect videoMixEffect;

    public TAVVideoCompositionInstruction(java.util.List<java.lang.Integer> list, com.tencent.tav.coremedia.CMTimeRange cMTimeRange) {
        this.requiredSourceTrackIDs = list;
        this.timeRange = cMTimeRange;
        this.enablePostProcessing = false;
        this.backgroundColor = -16777216;
        this.channelLayers = new java.util.ArrayList();
        this.overlayLayers = new java.util.ArrayList();
    }

    @Override // com.tencent.tav.core.composition.VideoCompositionInstruction, com.tencent.tav.core.compositing.IVideoCompositionInstruction
    public int getBackgroundColor() {
        return this.backgroundColor;
    }

    public java.util.List<java.util.List<com.tencent.tavkit.composition.video.TAVVideoCompositionLayerInstruction>> getChannelLayers() {
        return this.channelLayers;
    }

    public com.tencent.tavkit.composition.video.TAVVideoEffect getGlobalVideoEffect() {
        return this.globalVideoEffect;
    }

    @Override // com.tencent.tav.core.composition.VideoCompositionInstruction, com.tencent.tav.core.compositing.IVideoCompositionInstruction
    public java.util.List<com.tencent.tavkit.composition.video.TAVVideoCompositionLayerInstruction> getLayerInstructions() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<java.util.List<com.tencent.tavkit.composition.video.TAVVideoCompositionLayerInstruction>> it = this.channelLayers.iterator();
        while (it.hasNext()) {
            arrayList.addAll(it.next());
        }
        arrayList.addAll(this.overlayLayers);
        return arrayList;
    }

    public java.util.List<com.tencent.tavkit.composition.video.TAVVideoCompositionLayerInstruction> getOverlayLayers() {
        return this.overlayLayers;
    }

    @Override // com.tencent.tav.core.composition.VideoCompositionInstruction, com.tencent.tav.core.compositing.IVideoCompositionInstruction
    public int getPassthroughTrackID() {
        return -1;
    }

    public com.tencent.tavkit.composition.video.TAVVideoEffect getSourceVideoEffect() {
        return this.sourceVideoEffect;
    }

    @Override // com.tencent.tav.core.composition.VideoCompositionInstruction, com.tencent.tav.core.compositing.IVideoCompositionInstruction
    public com.tencent.tav.coremedia.CMTimeRange getTimeRange() {
        return this.timeRange;
    }

    public com.tencent.tavkit.composition.video.TAVVideoMixEffect getVideoMixEffect() {
        return this.videoMixEffect;
    }

    public void setBackgroundColor(int i17) {
        this.backgroundColor = i17;
    }

    public void setChannelLayers(java.util.List<java.util.List<com.tencent.tavkit.composition.video.TAVVideoCompositionLayerInstruction>> list) {
        if (list == null) {
            return;
        }
        this.channelLayers = list;
    }

    public void setEnablePostProcessing(boolean z17) {
        this.enablePostProcessing = z17;
    }

    public void setGlobalVideoEffect(com.tencent.tavkit.composition.video.TAVVideoEffect tAVVideoEffect) {
        this.globalVideoEffect = tAVVideoEffect;
    }

    public void setOverlayLayers(java.util.List<com.tencent.tavkit.composition.video.TAVVideoCompositionLayerInstruction> list) {
        if (list == null) {
            return;
        }
        this.overlayLayers = list;
        this.requiredSourceTrackIDs.clear();
        java.util.Iterator<com.tencent.tavkit.composition.video.TAVVideoCompositionLayerInstruction> it = list.iterator();
        while (it.hasNext()) {
            this.requiredSourceTrackIDs.add(java.lang.Integer.valueOf(it.next().getTrackID()));
        }
    }

    public void setSourceVideoEffect(com.tencent.tavkit.composition.video.TAVVideoEffect tAVVideoEffect) {
        this.sourceVideoEffect = tAVVideoEffect;
    }

    public void setVideoMixEffect(com.tencent.tavkit.composition.video.TAVVideoMixEffect tAVVideoMixEffect) {
        this.videoMixEffect = tAVVideoMixEffect;
    }

    public java.lang.String toString() {
        return "TAVVideoCompositionInstruction{timeRange=" + this.timeRange.toSimpleString() + ", backgroundColor=" + this.backgroundColor + ", overlayLayers=" + this.overlayLayers + '}';
    }
}
