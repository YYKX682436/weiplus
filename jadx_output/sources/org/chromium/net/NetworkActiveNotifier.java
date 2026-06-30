package org.chromium.net;

@org.chromium.base.annotations.JNINamespace("net")
/* loaded from: classes13.dex */
public class NetworkActiveNotifier implements android.net.ConnectivityManager.OnNetworkActiveListener {
    private boolean mAreNotificationsEnabled;
    private final android.net.ConnectivityManager mConnectivityManager = (android.net.ConnectivityManager) org.chromium.base.ContextUtils.getApplicationContext().getSystemService("connectivity");
    private final long mNativeNetworkActiveObserver;

    /* loaded from: classes13.dex */
    public interface Natives {
        @org.chromium.base.annotations.NativeClassQualifiedName("NetworkChangeNotifierDelegateAndroid")
        void notifyOfDefaultNetworkActive(long j17);
    }

    private NetworkActiveNotifier(long j17) {
        this.mNativeNetworkActiveObserver = j17;
    }

    public static org.chromium.net.NetworkActiveNotifier build(long j17) {
        return new org.chromium.net.NetworkActiveNotifier(j17);
    }

    public void disableNotifications() {
        this.mAreNotificationsEnabled = false;
        this.mConnectivityManager.removeDefaultNetworkActiveListener(this);
    }

    public void enableNotifications() {
        this.mAreNotificationsEnabled = true;
        this.mConnectivityManager.addDefaultNetworkActiveListener(this);
    }

    public void fakeDefaultNetworkActive() {
        if (this.mAreNotificationsEnabled) {
            onNetworkActive();
        }
    }

    public boolean isDefaultNetworkActive() {
        return this.mConnectivityManager.isDefaultNetworkActive();
    }

    @Override // android.net.ConnectivityManager.OnNetworkActiveListener
    public void onNetworkActive() {
        org.chromium.net.NetworkActiveNotifierJni.get().notifyOfDefaultNetworkActive(this.mNativeNetworkActiveObserver);
    }
}
