package org.chromium.base;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public class JavaHandlerThreadJni implements org.chromium.base.JavaHandlerThread.Natives {
    public static final c56.a TEST_HOOKS = new c56.a() { // from class: org.chromium.base.JavaHandlerThreadJni.1
        public void setInstanceForTesting(org.chromium.base.JavaHandlerThread.Natives natives) {
            if (org.jni_zero.GEN_JNI.TESTING_ENABLED) {
                org.chromium.base.JavaHandlerThreadJni.testInstance = natives;
                return;
            }
            throw new java.lang.RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static org.chromium.base.JavaHandlerThread.Natives testInstance;

    public static org.chromium.base.JavaHandlerThread.Natives get() {
        if (org.jni_zero.GEN_JNI.TESTING_ENABLED) {
            org.chromium.base.JavaHandlerThread.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (org.jni_zero.GEN_JNI.REQUIRE_MOCK) {
                throw new java.lang.UnsupportedOperationException("No mock found for the native implementation of JavaHandlerThread.Natives. The current configuration requires implementations be mocked.");
            }
        }
        return new org.chromium.base.JavaHandlerThreadJni();
    }

    @Override // org.chromium.base.JavaHandlerThread.Natives
    public void initializeThread(long j17, long j18) {
        org.jni_zero.GEN_JNI.org_chromium_base_JavaHandlerThread_initializeThread(j17, j18);
    }

    @Override // org.chromium.base.JavaHandlerThread.Natives
    public void onLooperStopped(long j17) {
        org.jni_zero.GEN_JNI.org_chromium_base_JavaHandlerThread_onLooperStopped(j17);
    }
}
