package org.chromium.net;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public class ProxyChangeListenerJni implements org.chromium.net.ProxyChangeListener.Natives {
    public static final c56.a TEST_HOOKS = new c56.a() { // from class: org.chromium.net.ProxyChangeListenerJni.1
        public void setInstanceForTesting(org.chromium.net.ProxyChangeListener.Natives natives) {
            if (org.jni_zero.GEN_JNI.TESTING_ENABLED) {
                org.chromium.net.ProxyChangeListenerJni.testInstance = natives;
                return;
            }
            throw new java.lang.RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static org.chromium.net.ProxyChangeListener.Natives testInstance;

    public static org.chromium.net.ProxyChangeListener.Natives get() {
        if (org.jni_zero.GEN_JNI.TESTING_ENABLED) {
            org.chromium.net.ProxyChangeListener.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (org.jni_zero.GEN_JNI.REQUIRE_MOCK) {
                throw new java.lang.UnsupportedOperationException("No mock found for the native implementation of ProxyChangeListener.Natives. The current configuration requires implementations be mocked.");
            }
        }
        return new org.chromium.net.ProxyChangeListenerJni();
    }

    @Override // org.chromium.net.ProxyChangeListener.Natives
    public void proxySettingsChanged(long j17, org.chromium.net.ProxyChangeListener proxyChangeListener) {
        org.jni_zero.GEN_JNI.org_chromium_net_ProxyChangeListener_proxySettingsChanged(j17, proxyChangeListener);
    }

    @Override // org.chromium.net.ProxyChangeListener.Natives
    public void proxySettingsChangedTo(long j17, org.chromium.net.ProxyChangeListener proxyChangeListener, java.lang.String str, int i17, java.lang.String str2, java.lang.String[] strArr) {
        org.jni_zero.GEN_JNI.org_chromium_net_ProxyChangeListener_proxySettingsChangedTo(j17, proxyChangeListener, str, i17, str2, strArr);
    }
}
