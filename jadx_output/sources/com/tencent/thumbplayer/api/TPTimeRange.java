package com.tencent.thumbplayer.api;

/* loaded from: classes16.dex */
public class TPTimeRange {
    private long mEndTimeMs;
    private long mStartTimeMs;

    public TPTimeRange(long j17, long j18) {
        this.mStartTimeMs = j17;
        this.mEndTimeMs = j18;
    }

    public long getEndTimeMs() {
        return this.mEndTimeMs;
    }

    public long getStartTimeMs() {
        return this.mStartTimeMs;
    }

    public void setEndTimeMs(long j17) {
        this.mEndTimeMs = j17;
    }

    public void setStartTimeMs(long j17) {
        this.mStartTimeMs = j17;
    }
}
