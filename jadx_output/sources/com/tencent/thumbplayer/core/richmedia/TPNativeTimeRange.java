package com.tencent.thumbplayer.core.richmedia;

/* loaded from: classes16.dex */
public class TPNativeTimeRange {
    private long mEndTimeMs;
    private long mStartTimeMs;

    public TPNativeTimeRange(long j17, long j18) {
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
