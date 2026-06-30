package com.tencent.tavkit.composition.builder;

/* loaded from: classes16.dex */
class AudioMixInfo {
    com.tencent.tavkit.composition.model.TAVAudio audio;
    com.tencent.tav.asset.CompositionTrack track;

    public AudioMixInfo(com.tencent.tav.asset.CompositionTrack compositionTrack, com.tencent.tavkit.composition.model.TAVAudio tAVAudio) {
        this.track = compositionTrack;
        this.audio = tAVAudio;
    }
}
