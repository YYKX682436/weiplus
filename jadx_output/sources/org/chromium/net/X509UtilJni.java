package org.chromium.net;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public class X509UtilJni implements org.chromium.net.X509Util.Natives {
    public static final c56.a TEST_HOOKS = new c56.a() { // from class: org.chromium.net.X509UtilJni.1
        public void setInstanceForTesting(org.chromium.net.X509Util.Natives natives) {
            if (org.jni_zero.GEN_JNI.TESTING_ENABLED) {
                org.chromium.net.X509UtilJni.testInstance = natives;
                return;
            }
            throw new java.lang.RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static org.chromium.net.X509Util.Natives testInstance;

    public static org.chromium.net.X509Util.Natives get() {
        if (org.jni_zero.GEN_JNI.TESTING_ENABLED) {
            org.chromium.net.X509Util.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (org.jni_zero.GEN_JNI.REQUIRE_MOCK) {
                throw new java.lang.UnsupportedOperationException("No mock found for the native implementation of X509Util.Natives. The current configuration requires implementations be mocked.");
            }
        }
        return new org.chromium.net.X509UtilJni();
    }

    @Override // org.chromium.net.X509Util.Natives
    public void notifyClientCertStoreChanged() {
        org.jni_zero.GEN_JNI.org_chromium_net_X509Util_notifyClientCertStoreChanged();
    }

    @Override // org.chromium.net.X509Util.Natives
    public void notifyTrustStoreChanged() {
        org.jni_zero.GEN_JNI.org_chromium_net_X509Util_notifyTrustStoreChanged();
    }
}
