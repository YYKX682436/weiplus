package org.chromium.base.metrics;

/* loaded from: classes16.dex */
public class NativeUmaRecorderJni implements org.chromium.base.metrics.NativeUmaRecorder.Natives {
    public static final c56.a TEST_HOOKS = new c56.a() { // from class: org.chromium.base.metrics.NativeUmaRecorderJni.1
        public void setInstanceForTesting(org.chromium.base.metrics.NativeUmaRecorder.Natives natives) {
            if (org.jni_zero.GEN_JNI.TESTING_ENABLED) {
                org.chromium.base.metrics.NativeUmaRecorderJni.testInstance = natives;
                return;
            }
            throw new java.lang.RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static org.chromium.base.metrics.NativeUmaRecorder.Natives testInstance;

    public static org.chromium.base.metrics.NativeUmaRecorder.Natives get() {
        if (org.jni_zero.GEN_JNI.TESTING_ENABLED) {
            org.chromium.base.metrics.NativeUmaRecorder.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (org.jni_zero.GEN_JNI.REQUIRE_MOCK) {
                throw new java.lang.UnsupportedOperationException("No mock found for the native implementation of NativeUmaRecorder.Natives. The current configuration requires implementations be mocked.");
            }
        }
        return new org.chromium.base.metrics.NativeUmaRecorderJni();
    }

    @Override // org.chromium.base.metrics.NativeUmaRecorder.Natives
    public long addActionCallbackForTesting(org.chromium.base.Callback callback) {
        return org.jni_zero.GEN_JNI.org_chromium_base_metrics_NativeUmaRecorder_addActionCallbackForTesting(callback);
    }

    @Override // org.chromium.base.metrics.NativeUmaRecorder.Natives
    public long createHistogramSnapshotForTesting() {
        return org.jni_zero.GEN_JNI.org_chromium_base_metrics_NativeUmaRecorder_createHistogramSnapshotForTesting();
    }

    @Override // org.chromium.base.metrics.NativeUmaRecorder.Natives
    public void destroyHistogramSnapshotForTesting(long j17) {
        org.jni_zero.GEN_JNI.org_chromium_base_metrics_NativeUmaRecorder_destroyHistogramSnapshotForTesting(j17);
    }

    @Override // org.chromium.base.metrics.NativeUmaRecorder.Natives
    public long[] getHistogramSamplesForTesting(java.lang.String str) {
        return org.jni_zero.GEN_JNI.org_chromium_base_metrics_NativeUmaRecorder_getHistogramSamplesForTesting(str);
    }

    @Override // org.chromium.base.metrics.NativeUmaRecorder.Natives
    public int getHistogramTotalCountForTesting(java.lang.String str, long j17) {
        return org.jni_zero.GEN_JNI.org_chromium_base_metrics_NativeUmaRecorder_getHistogramTotalCountForTesting(str, j17);
    }

    @Override // org.chromium.base.metrics.NativeUmaRecorder.Natives
    public int getHistogramValueCountForTesting(java.lang.String str, int i17, long j17) {
        return org.jni_zero.GEN_JNI.org_chromium_base_metrics_NativeUmaRecorder_getHistogramValueCountForTesting(str, i17, j17);
    }

    @Override // org.chromium.base.metrics.NativeUmaRecorder.Natives
    public long recordBooleanHistogram(java.lang.String str, long j17, boolean z17) {
        return org.jni_zero.GEN_JNI.org_chromium_base_metrics_NativeUmaRecorder_recordBooleanHistogram(str, j17, z17);
    }

    @Override // org.chromium.base.metrics.NativeUmaRecorder.Natives
    public long recordExponentialHistogram(java.lang.String str, long j17, int i17, int i18, int i19, int i27) {
        return org.jni_zero.GEN_JNI.org_chromium_base_metrics_NativeUmaRecorder_recordExponentialHistogram(str, j17, i17, i18, i19, i27);
    }

    @Override // org.chromium.base.metrics.NativeUmaRecorder.Natives
    public long recordLinearHistogram(java.lang.String str, long j17, int i17, int i18, int i19, int i27) {
        return org.jni_zero.GEN_JNI.org_chromium_base_metrics_NativeUmaRecorder_recordLinearHistogram(str, j17, i17, i18, i19, i27);
    }

    @Override // org.chromium.base.metrics.NativeUmaRecorder.Natives
    public long recordSparseHistogram(java.lang.String str, long j17, int i17) {
        return org.jni_zero.GEN_JNI.org_chromium_base_metrics_NativeUmaRecorder_recordSparseHistogram(str, j17, i17);
    }

    @Override // org.chromium.base.metrics.NativeUmaRecorder.Natives
    public void recordUserAction(java.lang.String str, long j17) {
        org.jni_zero.GEN_JNI.org_chromium_base_metrics_NativeUmaRecorder_recordUserAction(str, j17);
    }

    @Override // org.chromium.base.metrics.NativeUmaRecorder.Natives
    public void removeActionCallbackForTesting(long j17) {
        org.jni_zero.GEN_JNI.org_chromium_base_metrics_NativeUmaRecorder_removeActionCallbackForTesting(j17);
    }
}
