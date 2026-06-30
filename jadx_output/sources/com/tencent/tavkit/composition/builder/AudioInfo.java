package com.tencent.tavkit.composition.builder;

/* loaded from: classes16.dex */
class AudioInfo {
    com.tencent.tavkit.composition.model.TAVTransitionableAudio audio;
    com.tencent.tav.asset.CompositionTrack compositionTrack;

    public AudioInfo(com.tencent.tav.asset.CompositionTrack compositionTrack, com.tencent.tavkit.composition.model.TAVTransitionableAudio tAVTransitionableAudio) {
        this.compositionTrack = compositionTrack;
        this.audio = tAVTransitionableAudio;
    }

    public com.tencent.tav.asset.CompositionTrackSegment getCurrentSegmentBy() {
        for (int i17 = 0; i17 < this.compositionTrack.getSegments().size(); i17++) {
            com.tencent.tav.asset.CompositionTrackSegment compositionTrackSegment = this.compositionTrack.getSegments().get(i17);
            if (compositionTrackSegment.getTimeMapping().getTarget().equals(this.audio.getTimeRange())) {
                return compositionTrackSegment;
            }
        }
        return null;
    }
}
