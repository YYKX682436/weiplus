package com.tencent.mm.plugin.multitalk.ilinkservice;

/* loaded from: classes13.dex */
public class t3 extends android.net.ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ilinkservice.i4 f149800a;

    public t3(com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var) {
        this.f149800a = i4Var;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(android.net.Network network) {
        super.onAvailable(network);
        android.os.Parcel obtain = android.os.Parcel.obtain();
        network.writeToParcel(obtain, 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkService", "found requested network. netid: " + obtain.readInt() + " toString: " + network.toString());
        if (fp.h.c(28)) {
            android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("connectivity");
            try {
                com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkService", "getMultipathPreference ret " + connectivityManager.getMultipathPreference(network));
            } catch (java.lang.Exception unused) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkService", "getMultipathPreference  Error");
                try {
                    connectivityManager.unregisterNetworkCallback(this);
                    return;
                } catch (java.lang.Exception unused2) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkService", "unregisterNetworkCallback Error");
                    return;
                }
            }
        }
        com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var = this.f149800a;
        i4Var.U1 = network;
        if (i4Var.W1 != null) {
            for (int i17 = 0; i17 < i4Var.W1.size(); i17++) {
                i4Var.n(((java.lang.Integer) i4Var.W1.get(i17)).intValue(), true);
            }
        }
        i4Var.V1 = this;
        com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkService", "networkcallback hashCode: " + i4Var.V1.hashCode());
    }
}
