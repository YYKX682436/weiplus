package org.chromium.net;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public class NetworkChangeNotifierJni implements org.chromium.net.NetworkChangeNotifier.Natives {
    public static final c56.a TEST_HOOKS = new c56.a() { // from class: org.chromium.net.NetworkChangeNotifierJni.1
        public void setInstanceForTesting(org.chromium.net.NetworkChangeNotifier.Natives natives) {
            if (org.jni_zero.GEN_JNI.TESTING_ENABLED) {
                org.chromium.net.NetworkChangeNotifierJni.testInstance = natives;
                return;
            }
            throw new java.lang.RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static org.chromium.net.NetworkChangeNotifier.Natives testInstance;

    public static org.chromium.net.NetworkChangeNotifier.Natives get() {
        if (org.jni_zero.GEN_JNI.TESTING_ENABLED) {
            org.chromium.net.NetworkChangeNotifier.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (org.jni_zero.GEN_JNI.REQUIRE_MOCK) {
                throw new java.lang.UnsupportedOperationException("No mock found for the native implementation of NetworkChangeNotifier.Natives. The current configuration requires implementations be mocked.");
            }
        }
        return new org.chromium.net.NetworkChangeNotifierJni();
    }

    @Override // org.chromium.net.NetworkChangeNotifier.Natives
    public void notifyConnectionCostChanged(long j17, org.chromium.net.NetworkChangeNotifier networkChangeNotifier, int i17) {
        org.jni_zero.GEN_JNI.org_chromium_net_NetworkChangeNotifier_notifyConnectionCostChanged(j17, networkChangeNotifier, i17);
    }

    @Override // org.chromium.net.NetworkChangeNotifier.Natives
    public void notifyConnectionTypeChanged(long j17, org.chromium.net.NetworkChangeNotifier networkChangeNotifier, int i17, long j18) {
        org.jni_zero.GEN_JNI.org_chromium_net_NetworkChangeNotifier_notifyConnectionTypeChanged(j17, networkChangeNotifier, i17, j18);
    }

    @Override // org.chromium.net.NetworkChangeNotifier.Natives
    public void notifyMaxBandwidthChanged(long j17, org.chromium.net.NetworkChangeNotifier networkChangeNotifier, int i17) {
        org.jni_zero.GEN_JNI.org_chromium_net_NetworkChangeNotifier_notifyMaxBandwidthChanged(j17, networkChangeNotifier, i17);
    }

    @Override // org.chromium.net.NetworkChangeNotifier.Natives
    public void notifyOfNetworkConnect(long j17, org.chromium.net.NetworkChangeNotifier networkChangeNotifier, long j18, int i17) {
        org.jni_zero.GEN_JNI.org_chromium_net_NetworkChangeNotifier_notifyOfNetworkConnect(j17, networkChangeNotifier, j18, i17);
    }

    @Override // org.chromium.net.NetworkChangeNotifier.Natives
    public void notifyOfNetworkDisconnect(long j17, org.chromium.net.NetworkChangeNotifier networkChangeNotifier, long j18) {
        org.jni_zero.GEN_JNI.org_chromium_net_NetworkChangeNotifier_notifyOfNetworkDisconnect(j17, networkChangeNotifier, j18);
    }

    @Override // org.chromium.net.NetworkChangeNotifier.Natives
    public void notifyOfNetworkSoonToDisconnect(long j17, org.chromium.net.NetworkChangeNotifier networkChangeNotifier, long j18) {
        org.jni_zero.GEN_JNI.org_chromium_net_NetworkChangeNotifier_notifyOfNetworkSoonToDisconnect(j17, networkChangeNotifier, j18);
    }

    @Override // org.chromium.net.NetworkChangeNotifier.Natives
    public void notifyPurgeActiveNetworkList(long j17, org.chromium.net.NetworkChangeNotifier networkChangeNotifier, long[] jArr) {
        org.jni_zero.GEN_JNI.org_chromium_net_NetworkChangeNotifier_notifyPurgeActiveNetworkList(j17, networkChangeNotifier, jArr);
    }
}
