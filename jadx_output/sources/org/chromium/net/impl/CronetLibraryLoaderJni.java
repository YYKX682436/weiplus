package org.chromium.net.impl;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public class CronetLibraryLoaderJni implements org.chromium.net.impl.CronetLibraryLoader.Natives {
    public static final c56.a TEST_HOOKS = new c56.a() { // from class: org.chromium.net.impl.CronetLibraryLoaderJni.1
        public void setInstanceForTesting(org.chromium.net.impl.CronetLibraryLoader.Natives natives) {
            if (org.jni_zero.GEN_JNI.TESTING_ENABLED) {
                org.chromium.net.impl.CronetLibraryLoaderJni.testInstance = natives;
                return;
            }
            throw new java.lang.RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static org.chromium.net.impl.CronetLibraryLoader.Natives testInstance;

    public static org.chromium.net.impl.CronetLibraryLoader.Natives get() {
        if (org.jni_zero.GEN_JNI.TESTING_ENABLED) {
            org.chromium.net.impl.CronetLibraryLoader.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (org.jni_zero.GEN_JNI.REQUIRE_MOCK) {
                throw new java.lang.UnsupportedOperationException("No mock found for the native implementation of CronetLibraryLoader.Natives. The current configuration requires implementations be mocked.");
            }
        }
        return new org.chromium.net.impl.CronetLibraryLoaderJni();
    }

    @Override // org.chromium.net.impl.CronetLibraryLoader.Natives
    public void cronetInitOnInitThread() {
        org.jni_zero.GEN_JNI.org_chromium_net_impl_CronetLibraryLoader_cronetInitOnInitThread();
    }

    @Override // org.chromium.net.impl.CronetLibraryLoader.Natives
    public java.lang.String getCronetVersion() {
        return org.jni_zero.GEN_JNI.org_chromium_net_impl_CronetLibraryLoader_getCronetVersion();
    }

    @Override // org.chromium.net.impl.CronetLibraryLoader.Natives
    public void setMinLogLevel(int i17) {
        org.jni_zero.GEN_JNI.org_chromium_net_impl_CronetLibraryLoader_setMinLogLevel(i17);
    }
}
