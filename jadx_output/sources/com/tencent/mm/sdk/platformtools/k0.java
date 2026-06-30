package com.tencent.mm.sdk.platformtools;

/* loaded from: classes13.dex */
public final class k0 extends android.net.ConnectivityManager.NetworkCallback {
    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(android.net.Network network) {
        kotlin.jvm.internal.o.g(network, "network");
        com.tencent.mars.xlog.Log.i("MicroMsg.ConnectivityCompat", "network available (from network callback)");
        com.tencent.mm.sdk.platformtools.v0.f193027a.b();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(android.net.Network network) {
        kotlin.jvm.internal.o.g(network, "network");
        com.tencent.mars.xlog.Log.i("MicroMsg.ConnectivityCompat", "network lost (from network callback)");
        com.tencent.mm.sdk.platformtools.t0.f192979g = null;
        com.tencent.mm.sdk.platformtools.v0.f193027a.b();
    }
}
