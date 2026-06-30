package com.tencent.mm.plugin.voip.model;

/* loaded from: classes9.dex */
public class NewVoipMgr$NetChangedBroadcastReceiver extends android.content.BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        if (!intent.getAction().equals(io.flutter.plugins.connectivity.patched.PatchedConnectivityBroadcastReceiver.CONNECTIVITY_ACTION)) {
            if (intent.getAction().equals("android.net.wifi.STATE_CHANGE")) {
                throw null;
            }
            if (intent.getAction().equals("android.net.wifi.WIFI_STATE_CHANGED")) {
                throw null;
            }
            return;
        }
        int e17 = vq4.d0.e(context);
        if (e17 == 4) {
            throw null;
        }
        if (e17 == 5) {
            throw null;
        }
        if (e17 == 6) {
            throw null;
        }
    }
}
