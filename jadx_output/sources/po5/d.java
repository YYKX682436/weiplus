package po5;

/* loaded from: classes13.dex */
public final class d extends android.net.ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ po5.i f357349a;

    public d(po5.i iVar) {
        this.f357349a = iVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(android.net.Network network) {
        kotlin.jvm.internal.o.g(network, "network");
        super.onAvailable(network);
        android.os.Parcel obtain = android.os.Parcel.obtain();
        kotlin.jvm.internal.o.f(obtain, "obtain(...)");
        network.writeToParcel(obtain, 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMPNetWorkController", "found requested network. netid: " + obtain.readInt() + " toString: " + network);
        if (fp.h.c(28)) {
            java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("connectivity");
            kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) systemService;
            try {
                com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMPNetWorkController", "getMultipathPreference ret " + connectivityManager.getMultipathPreference(network));
            } catch (java.lang.Exception unused) {
                com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMPNetWorkController", "getMultipathPreference  Error");
                try {
                    connectivityManager.unregisterNetworkCallback(this);
                    return;
                } catch (java.lang.Exception unused2) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMPNetWorkController", "unregisterNetworkCallback Error");
                    return;
                }
            }
        }
        po5.i iVar = this.f357349a;
        iVar.f357354a = network;
        int size = iVar.f357356c.size();
        for (int i17 = 0; i17 < size; i17++) {
            java.lang.Object obj = iVar.f357356c.get(i17);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            iVar.c(((java.lang.Number) obj).intValue(), true);
        }
        iVar.f357355b = this;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("networkcallback hashCode: ");
        android.net.ConnectivityManager.NetworkCallback networkCallback = iVar.f357355b;
        sb6.append(networkCallback != null ? networkCallback.hashCode() : 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMPNetWorkController", sb6.toString());
    }
}
