package org.chromium.base.metrics;

/* loaded from: classes16.dex */
class NoopUmaRecorder implements org.chromium.base.metrics.UmaRecorder {
    @Override // org.chromium.base.metrics.UmaRecorder
    public void addUserActionCallbackForTesting(org.chromium.base.Callback<java.lang.String> callback) {
    }

    @Override // org.chromium.base.metrics.UmaRecorder
    public java.util.List<org.chromium.base.metrics.HistogramBucket> getHistogramSamplesForTesting(java.lang.String str) {
        return java.util.Collections.emptyList();
    }

    @Override // org.chromium.base.metrics.UmaRecorder
    public int getHistogramTotalCountForTesting(java.lang.String str) {
        return 0;
    }

    @Override // org.chromium.base.metrics.UmaRecorder
    public int getHistogramValueCountForTesting(java.lang.String str, int i17) {
        return 0;
    }

    @Override // org.chromium.base.metrics.UmaRecorder
    public void recordBooleanHistogram(java.lang.String str, boolean z17) {
    }

    @Override // org.chromium.base.metrics.UmaRecorder
    public void recordExponentialHistogram(java.lang.String str, int i17, int i18, int i19, int i27) {
    }

    @Override // org.chromium.base.metrics.UmaRecorder
    public void recordLinearHistogram(java.lang.String str, int i17, int i18, int i19, int i27) {
    }

    @Override // org.chromium.base.metrics.UmaRecorder
    public void recordSparseHistogram(java.lang.String str, int i17) {
    }

    @Override // org.chromium.base.metrics.UmaRecorder
    public void recordUserAction(java.lang.String str, long j17) {
    }

    @Override // org.chromium.base.metrics.UmaRecorder
    public void removeUserActionCallbackForTesting(org.chromium.base.Callback<java.lang.String> callback) {
    }
}
