package org.chromium.base.metrics;

/* loaded from: classes13.dex */
public class TimingMetric implements java.lang.AutoCloseable {
    private final java.lang.String mMetricName;
    private long mStartTime;
    private final int mTimerType;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface TimerType {
        public static final int MEDIUM_UPTIME = 1;
        public static final int SHORT_THREAD_TIME = 2;
        public static final int SHORT_UPTIME = 0;
    }

    private TimingMetric(java.lang.String str, int i17) {
        this.mMetricName = str;
        this.mTimerType = i17;
    }

    public static org.chromium.base.metrics.TimingMetric mediumUptime(java.lang.String str) {
        org.chromium.base.metrics.TimingMetric timingMetric = new org.chromium.base.metrics.TimingMetric(str, 1);
        timingMetric.mStartTime = org.chromium.base.TimeUtils.uptimeMillis();
        return timingMetric;
    }

    public static org.chromium.base.metrics.TimingMetric shortThreadTime(java.lang.String str) {
        org.chromium.base.metrics.TimingMetric timingMetric = new org.chromium.base.metrics.TimingMetric(str, 2);
        timingMetric.mStartTime = org.chromium.base.TimeUtils.currentThreadTimeMillis();
        return timingMetric;
    }

    public static org.chromium.base.metrics.TimingMetric shortUptime(java.lang.String str) {
        org.chromium.base.metrics.TimingMetric timingMetric = new org.chromium.base.metrics.TimingMetric(str, 0);
        timingMetric.mStartTime = org.chromium.base.TimeUtils.uptimeMillis();
        return timingMetric;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        java.lang.String str = this.mMetricName;
        long j17 = this.mStartTime;
        if (j17 == 0) {
            return;
        }
        this.mStartTime = 0L;
        int i17 = this.mTimerType;
        if (i17 == 0) {
            org.chromium.base.metrics.RecordHistogram.recordTimesHistogram(str, org.chromium.base.TimeUtils.uptimeMillis() - j17);
        } else if (i17 == 1) {
            org.chromium.base.metrics.RecordHistogram.recordMediumTimesHistogram(str, org.chromium.base.TimeUtils.uptimeMillis() - j17);
        } else {
            if (i17 != 2) {
                return;
            }
            org.chromium.base.metrics.RecordHistogram.recordTimesHistogram(str, org.chromium.base.TimeUtils.currentThreadTimeMillis() - j17);
        }
    }
}
