package com.tencent.tavkit.composition.builder;

/* loaded from: classes16.dex */
class AudioTransitionInfo {
    com.tencent.tavkit.composition.audio.TAVAudioTransition next;
    com.tencent.tavkit.composition.audio.TAVAudioTransition prev;

    public AudioTransitionInfo(com.tencent.tavkit.composition.audio.TAVAudioTransition tAVAudioTransition, com.tencent.tavkit.composition.audio.TAVAudioTransition tAVAudioTransition2) {
        this.prev = tAVAudioTransition;
        this.next = tAVAudioTransition2;
    }
}
