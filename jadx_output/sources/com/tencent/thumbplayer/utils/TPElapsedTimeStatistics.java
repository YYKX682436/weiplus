package com.tencent.thumbplayer.utils;

/* loaded from: classes16.dex */
public class TPElapsedTimeStatistics {
    private long mLastPointTimeMs;
    private long mStartTimeMs;

    public long costTimeMsFromLastPoint() {
        return android.os.SystemClock.elapsedRealtime() - this.mLastPointTimeMs;
    }

    public long costTimeMsFromLastPointAndPoint() {
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        long j17 = elapsedRealtime - this.mLastPointTimeMs;
        this.mLastPointTimeMs = elapsedRealtime;
        return j17;
    }

    public long costTimeMsFromStartPoint() {
        return android.os.SystemClock.elapsedRealtime() - this.mStartTimeMs;
    }

    public long costTimeMsFromStartPointAndPoint() {
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        this.mLastPointTimeMs = elapsedRealtime;
        return elapsedRealtime - this.mStartTimeMs;
    }

    public void point() {
        this.mLastPointTimeMs = android.os.SystemClock.elapsedRealtime();
    }

    public void startPoint() {
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        this.mStartTimeMs = elapsedRealtime;
        this.mLastPointTimeMs = elapsedRealtime;
    }
}
