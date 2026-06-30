package com.tencent.tavkit.composition.audio;

/* loaded from: classes16.dex */
public interface TAVAudioTransition {
    void applyNextAudioMixInputParameters(com.tencent.tav.core.MutableAudioMixInputParameters mutableAudioMixInputParameters, com.tencent.tav.coremedia.CMTimeRange cMTimeRange);

    void applyPreviousAudioMixInputParameters(com.tencent.tav.core.MutableAudioMixInputParameters mutableAudioMixInputParameters, com.tencent.tav.coremedia.CMTimeRange cMTimeRange);

    com.tencent.tav.coremedia.CMTime getDuration();

    java.lang.String getIdentifier();

    void setIdentifier(java.lang.String str);
}
