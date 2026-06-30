package com.tencent.tavkit.composition.model;

/* loaded from: classes16.dex */
public interface TAVCompositionTimeRange {
    com.tencent.tav.coremedia.CMTime getDuration();

    com.tencent.tav.coremedia.CMTime getStartTime();

    com.tencent.tav.coremedia.CMTimeRange getTimeRange();

    void setDuration(com.tencent.tav.coremedia.CMTime cMTime);

    void setStartTime(com.tencent.tav.coremedia.CMTime cMTime);
}
