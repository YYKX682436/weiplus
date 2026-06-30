package org.chromium.base.metrics;

@org.chromium.build.annotations.MainDex
/* loaded from: classes16.dex */
public class RecordHistogram {
    private static int clampToInt(long j17) {
        if (j17 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j17 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j17;
    }

    public static java.util.List<org.chromium.base.metrics.HistogramBucket> getHistogramSamplesForTesting(java.lang.String str) {
        return org.chromium.base.metrics.UmaRecorderHolder.get().getHistogramSamplesForTesting(str);
    }

    @java.lang.Deprecated
    public static int getHistogramTotalCountForTesting(java.lang.String str) {
        return org.chromium.base.metrics.UmaRecorderHolder.get().getHistogramTotalCountForTesting(str);
    }

    @java.lang.Deprecated
    public static int getHistogramValueCountForTesting(java.lang.String str, int i17) {
        return org.chromium.base.metrics.UmaRecorderHolder.get().getHistogramValueCountForTesting(str, i17);
    }

    public static void recordBooleanHistogram(java.lang.String str, boolean z17) {
        org.chromium.base.metrics.UmaRecorderHolder.get().recordBooleanHistogram(str, z17);
    }

    public static void recordCount100000Histogram(java.lang.String str, int i17) {
        org.chromium.base.metrics.UmaRecorderHolder.get().recordExponentialHistogram(str, i17, 1, 100000, 50);
    }

    public static void recordCount1000Histogram(java.lang.String str, int i17) {
        org.chromium.base.metrics.UmaRecorderHolder.get().recordExponentialHistogram(str, i17, 1, 1000, 50);
    }

    public static void recordCount100Histogram(java.lang.String str, int i17) {
        org.chromium.base.metrics.UmaRecorderHolder.get().recordExponentialHistogram(str, i17, 1, 100, 50);
    }

    public static void recordCount1MHistogram(java.lang.String str, int i17) {
        org.chromium.base.metrics.UmaRecorderHolder.get().recordExponentialHistogram(str, i17, 1, 1000000, 50);
    }

    public static void recordCustomCountHistogram(java.lang.String str, int i17, int i18, int i19, int i27) {
        org.chromium.base.metrics.UmaRecorderHolder.get().recordExponentialHistogram(str, i17, i18, i19, i27);
    }

    public static void recordCustomTimesHistogram(java.lang.String str, long j17, long j18, long j19, int i17) {
        recordCustomTimesHistogramMilliseconds(str, j17, j18, j19, i17);
    }

    private static void recordCustomTimesHistogramMilliseconds(java.lang.String str, long j17, long j18, long j19, int i17) {
        org.chromium.base.metrics.UmaRecorderHolder.get().recordExponentialHistogram(str, clampToInt(j17), clampToInt(j18), clampToInt(j19), i17);
    }

    public static void recordEnumeratedHistogram(java.lang.String str, int i17, int i18) {
        recordExactLinearHistogram(str, i17, i18);
    }

    public static void recordExactLinearHistogram(java.lang.String str, int i17, int i18) {
        org.chromium.base.metrics.UmaRecorderHolder.get().recordLinearHistogram(str, i17, 1, i18, i18 + 1);
    }

    public static void recordLinearCountHistogram(java.lang.String str, int i17, int i18, int i19, int i27) {
        org.chromium.base.metrics.UmaRecorderHolder.get().recordLinearHistogram(str, i17, i18, i19, i27);
    }

    public static void recordLongTimesHistogram(java.lang.String str, long j17) {
        recordCustomTimesHistogramMilliseconds(str, j17, 1L, 3600000L, 50);
    }

    public static void recordLongTimesHistogram100(java.lang.String str, long j17) {
        recordCustomTimesHistogramMilliseconds(str, j17, 1L, 3600000L, 100);
    }

    public static void recordMediumTimesHistogram(java.lang.String str, long j17) {
        recordCustomTimesHistogramMilliseconds(str, j17, 10L, 180000L, 50);
    }

    public static void recordMemoryKBHistogram(java.lang.String str, int i17) {
        org.chromium.base.metrics.UmaRecorderHolder.get().recordExponentialHistogram(str, i17, 1000, 500000, 50);
    }

    public static void recordMemoryMediumMBHistogram(java.lang.String str, int i17) {
        org.chromium.base.metrics.UmaRecorderHolder.get().recordExponentialHistogram(str, i17, 1, 4000, 100);
    }

    public static void recordPercentageHistogram(java.lang.String str, int i17) {
        recordExactLinearHistogram(str, i17, 101);
    }

    public static void recordSparseHistogram(java.lang.String str, int i17) {
        org.chromium.base.metrics.UmaRecorderHolder.get().recordSparseHistogram(str, i17);
    }

    public static void recordTimesHistogram(java.lang.String str, long j17) {
        recordCustomTimesHistogramMilliseconds(str, j17, 1L, com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT, 50);
    }
}
