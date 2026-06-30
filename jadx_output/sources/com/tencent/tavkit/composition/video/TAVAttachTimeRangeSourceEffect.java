package com.tencent.tavkit.composition.video;

/* loaded from: classes14.dex */
public interface TAVAttachTimeRangeSourceEffect {

    /* loaded from: classes14.dex */
    public interface TimeAttachFilter {
        void attachPositionTime(com.tencent.tav.coremedia.CMTime cMTime);
    }

    void attachTimeRange(com.tencent.tav.coremedia.CMTimeRange cMTimeRange);
}
