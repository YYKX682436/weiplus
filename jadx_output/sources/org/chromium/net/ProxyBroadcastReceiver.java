package org.chromium.net;

/* loaded from: classes13.dex */
final class ProxyBroadcastReceiver extends android.content.BroadcastReceiver {
    private final org.chromium.net.ProxyChangeListener mListener;

    public ProxyBroadcastReceiver(org.chromium.net.ProxyChangeListener proxyChangeListener) {
        this.mListener = proxyChangeListener;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        if (intent.getAction().equals("android.intent.action.PROXY_CHANGE")) {
            this.mListener.updateProxyConfigFromConnectivityManager(intent);
        }
    }
}
