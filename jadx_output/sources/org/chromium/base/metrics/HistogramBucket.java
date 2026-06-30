package org.chromium.base.metrics;

/* loaded from: classes16.dex */
public class HistogramBucket {
    public final int mCount;
    public final long mMax;
    public final int mMin;

    public HistogramBucket(int i17, long j17, int i18) {
        this.mMin = i17;
        this.mMax = j17;
        this.mCount = i18;
    }

    public boolean contains(int i17) {
        return i17 >= this.mMin && ((long) i17) < this.mMax;
    }
}
