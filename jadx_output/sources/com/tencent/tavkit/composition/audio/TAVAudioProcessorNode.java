package com.tencent.tavkit.composition.audio;

/* loaded from: classes10.dex */
public interface TAVAudioProcessorNode {

    /* loaded from: classes10.dex */
    public interface TAVAudioProcessorEffect extends com.tencent.tav.core.AudioTapProcessor {
    }

    com.tencent.tavkit.composition.audio.TAVAudioProcessorNode.TAVAudioProcessorEffect createAudioProcessor();

    java.lang.String getIdentifier();
}
