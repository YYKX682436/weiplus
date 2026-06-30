package com.tencent.tavkit.composition.audio;

/* loaded from: classes16.dex */
public class TAVAudioConfigurationSegment {
    public final com.tencent.tavkit.composition.model.TAVAudioConfiguration audioConfiguration;
    public final com.tencent.tav.coremedia.CMTimeRange compositionTimeRange;

    public TAVAudioConfigurationSegment(com.tencent.tav.coremedia.CMTimeRange cMTimeRange, com.tencent.tavkit.composition.model.TAVAudioConfiguration tAVAudioConfiguration) {
        this.audioConfiguration = tAVAudioConfiguration;
        this.compositionTimeRange = cMTimeRange;
    }

    public java.lang.String toString() {
        return "TAVAudioConfigurationSegment{compositionTimeRange=" + this.compositionTimeRange.toSimpleString() + ", audioConfiguration=" + this.audioConfiguration + '}';
    }
}
