package com.tencent.tavkit.composition.builder;

/* loaded from: classes16.dex */
class VideoOverlayInfo {
    com.tencent.tav.asset.CompositionTrack track;
    com.tencent.tavkit.composition.model.TAVVideo video;

    public VideoOverlayInfo(com.tencent.tav.asset.CompositionTrack compositionTrack, com.tencent.tavkit.composition.model.TAVVideo tAVVideo) {
        this.track = compositionTrack;
        this.video = tAVVideo;
    }

    public com.tencent.tavkit.composition.video.TAVVideoCompositionLayerInstruction convertToLayerInstruction() {
        com.tencent.tavkit.composition.video.TAVVideoCompositionLayerInstruction tAVVideoCompositionLayerInstruction = new com.tencent.tavkit.composition.video.TAVVideoCompositionLayerInstruction(this.track.getTrackID(), this.video.getVideoConfiguration(), this.video);
        tAVVideoCompositionLayerInstruction.setPreferredTransform(this.track.getPreferredTransform());
        tAVVideoCompositionLayerInstruction.setTimeRange(this.video.getTimeRange());
        return tAVVideoCompositionLayerInstruction;
    }
}
