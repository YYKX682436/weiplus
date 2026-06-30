package org.chromium.net;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public class NetworkActiveNotifierJni implements org.chromium.net.NetworkActiveNotifier.Natives {
    public static final c56.a TEST_HOOKS = new c56.a() { // from class: org.chromium.net.NetworkActiveNotifierJni.1
        public void setInstanceForTesting(org.chromium.net.NetworkActiveNotifier.Natives natives) {
            if (org.jni_zero.GEN_JNI.TESTING_ENABLED) {
                org.chromium.net.NetworkActiveNotifierJni.testInstance = natives;
                return;
            }
            throw new java.lang.RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static org.chromium.net.NetworkActiveNotifier.Natives testInstance;

    public static org.chromium.net.NetworkActiveNotifier.Natives get() {
        if (org.jni_zero.GEN_JNI.TESTING_ENABLED) {
            org.chromium.net.NetworkActiveNotifier.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (org.jni_zero.GEN_JNI.REQUIRE_MOCK) {
                throw new java.lang.UnsupportedOperationException("No mock found for the native implementation of NetworkActiveNotifier.Natives. The current configuration requires implementations be mocked.");
            }
        }
        return new org.chromium.net.NetworkActiveNotifierJni();
    }

    @Override // org.chromium.net.NetworkActiveNotifier.Natives
    public void notifyOfDefaultNetworkActive(long j17) {
        org.jni_zero.GEN_JNI.org_chromium_net_NetworkActiveNotifier_notifyOfDefaultNetworkActive(j17);
    }
}
