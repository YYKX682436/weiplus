package org.chromium.net.mm;

/* loaded from: classes16.dex */
public class CronetJsBindingJni implements org.chromium.net.mm.CronetJsBinding.Natives {
    public static final c56.a TEST_HOOKS = new c56.a() { // from class: org.chromium.net.mm.CronetJsBindingJni.1
        public void setInstanceForTesting(org.chromium.net.mm.CronetJsBinding.Natives natives) {
            if (org.jni_zero.GEN_JNI.TESTING_ENABLED) {
                org.chromium.net.mm.CronetJsBindingJni.testInstance = natives;
                return;
            }
            throw new java.lang.RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static org.chromium.net.mm.CronetJsBinding.Natives testInstance;

    public static org.chromium.net.mm.CronetJsBinding.Natives get() {
        if (org.jni_zero.GEN_JNI.TESTING_ENABLED) {
            org.chromium.net.mm.CronetJsBinding.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (org.jni_zero.GEN_JNI.REQUIRE_MOCK) {
                throw new java.lang.UnsupportedOperationException("No mock found for the native implementation of CronetJsBinding.Natives. The current configuration requires implementations be mocked.");
            }
        }
        return new org.chromium.net.mm.CronetJsBindingJni();
    }

    @Override // org.chromium.net.mm.CronetJsBinding.Natives
    public void cancelAllRequests(long j17) {
        org.jni_zero.GEN_JNI.org_chromium_net_mm_CronetJsBinding_cancelAllRequests(j17);
    }

    @Override // org.chromium.net.mm.CronetJsBinding.Natives
    public void destroy(long j17) {
        org.jni_zero.GEN_JNI.org_chromium_net_mm_CronetJsBinding_destroy(j17);
    }

    @Override // org.chromium.net.mm.CronetJsBinding.Natives
    public long initCronetJsBinding(org.chromium.net.mm.CronetJsBinding cronetJsBinding, long j17, long j18, long j19) {
        return org.jni_zero.GEN_JNI.org_chromium_net_mm_CronetJsBinding_initCronetJsBinding(cronetJsBinding, j17, j18, j19);
    }

    @Override // org.chromium.net.mm.CronetJsBinding.Natives
    public void setupConfig(long j17, java.lang.String str, java.lang.String str2, long j18, long j19, long j27, long j28, java.lang.String str3, boolean z17) {
        org.jni_zero.GEN_JNI.org_chromium_net_mm_CronetJsBinding_setupConfig(j17, str, str2, j18, j19, j27, j28, str3, z17);
    }

    @Override // org.chromium.net.mm.CronetJsBinding.Natives
    public void setupMemoryPressureListener() {
        org.jni_zero.GEN_JNI.org_chromium_net_mm_CronetJsBinding_setupMemoryPressureListener();
    }
}
