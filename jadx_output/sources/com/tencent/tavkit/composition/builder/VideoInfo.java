package com.tencent.tavkit.composition.builder;

/* loaded from: classes16.dex */
class VideoInfo {
    com.tencent.tavkit.composition.model.TAVTransitionableVideo clip;
    com.tencent.tav.asset.CompositionTrack compositionTrack;

    public VideoInfo(com.tencent.tav.asset.CompositionTrack compositionTrack, com.tencent.tavkit.composition.model.TAVTransitionableVideo tAVTransitionableVideo) {
        this.compositionTrack = compositionTrack;
        this.clip = tAVTransitionableVideo;
    }
}
