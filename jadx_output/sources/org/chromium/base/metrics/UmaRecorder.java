package org.chromium.base.metrics;

@com.google.errorprone.annotations.DoNotMock("Use HistogramWatcher for histograms or UserActionTester for user actions instead.")
/* loaded from: classes16.dex */
public interface UmaRecorder {
    void addUserActionCallbackForTesting(org.chromium.base.Callback<java.lang.String> callback);

    java.util.List<org.chromium.base.metrics.HistogramBucket> getHistogramSamplesForTesting(java.lang.String str);

    int getHistogramTotalCountForTesting(java.lang.String str);

    int getHistogramValueCountForTesting(java.lang.String str, int i17);

    void recordBooleanHistogram(java.lang.String str, boolean z17);

    void recordExponentialHistogram(java.lang.String str, int i17, int i18, int i19, int i27);

    void recordLinearHistogram(java.lang.String str, int i17, int i18, int i19, int i27);

    void recordSparseHistogram(java.lang.String str, int i17);

    void recordUserAction(java.lang.String str, long j17);

    void removeUserActionCallbackForTesting(org.chromium.base.Callback<java.lang.String> callback);
}
