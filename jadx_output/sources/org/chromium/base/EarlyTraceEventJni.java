package org.chromium.base;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public class EarlyTraceEventJni implements org.chromium.base.EarlyTraceEvent.Natives {
    public static final c56.a TEST_HOOKS = new c56.a() { // from class: org.chromium.base.EarlyTraceEventJni.1
        public void setInstanceForTesting(org.chromium.base.EarlyTraceEvent.Natives natives) {
            if (org.jni_zero.GEN_JNI.TESTING_ENABLED) {
                org.chromium.base.EarlyTraceEventJni.testInstance = natives;
                return;
            }
            throw new java.lang.RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static org.chromium.base.EarlyTraceEvent.Natives testInstance;

    public static org.chromium.base.EarlyTraceEvent.Natives get() {
        if (org.jni_zero.GEN_JNI.TESTING_ENABLED) {
            org.chromium.base.EarlyTraceEvent.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (org.jni_zero.GEN_JNI.REQUIRE_MOCK) {
                throw new java.lang.UnsupportedOperationException("No mock found for the native implementation of EarlyTraceEvent.Natives. The current configuration requires implementations be mocked.");
            }
        }
        return new org.chromium.base.EarlyTraceEventJni();
    }

    @Override // org.chromium.base.EarlyTraceEvent.Natives
    public void recordEarlyAsyncBeginEvent(java.lang.String str, long j17, long j18) {
        org.jni_zero.GEN_JNI.org_chromium_base_EarlyTraceEvent_recordEarlyAsyncBeginEvent(str, j17, j18);
    }

    @Override // org.chromium.base.EarlyTraceEvent.Natives
    public void recordEarlyAsyncEndEvent(long j17, long j18) {
        org.jni_zero.GEN_JNI.org_chromium_base_EarlyTraceEvent_recordEarlyAsyncEndEvent(j17, j18);
    }

    @Override // org.chromium.base.EarlyTraceEvent.Natives
    public void recordEarlyBeginEvent(java.lang.String str, long j17, int i17, long j18) {
        org.jni_zero.GEN_JNI.org_chromium_base_EarlyTraceEvent_recordEarlyBeginEvent(str, j17, i17, j18);
    }

    @Override // org.chromium.base.EarlyTraceEvent.Natives
    public void recordEarlyEndEvent(java.lang.String str, long j17, int i17, long j18) {
        org.jni_zero.GEN_JNI.org_chromium_base_EarlyTraceEvent_recordEarlyEndEvent(str, j17, i17, j18);
    }

    @Override // org.chromium.base.EarlyTraceEvent.Natives
    public void recordEarlyToplevelBeginEvent(java.lang.String str, long j17, int i17, long j18) {
        org.jni_zero.GEN_JNI.org_chromium_base_EarlyTraceEvent_recordEarlyToplevelBeginEvent(str, j17, i17, j18);
    }

    @Override // org.chromium.base.EarlyTraceEvent.Natives
    public void recordEarlyToplevelEndEvent(java.lang.String str, long j17, int i17, long j18) {
        org.jni_zero.GEN_JNI.org_chromium_base_EarlyTraceEvent_recordEarlyToplevelEndEvent(str, j17, i17, j18);
    }
}
