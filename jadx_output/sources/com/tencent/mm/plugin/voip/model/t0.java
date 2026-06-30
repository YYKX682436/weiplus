package com.tencent.mm.plugin.voip.model;

/* loaded from: classes13.dex */
public class t0 extends android.net.ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voip.model.g1 f176802a;

    public t0(com.tencent.mm.plugin.voip.model.g1 g1Var) {
        this.f176802a = g1Var;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(android.net.Network network) {
        super.onAvailable(network);
        com.tencent.mm.plugin.voip.model.g1 g1Var = this.f176802a;
        g1Var.f176532x.f176878q0++;
        vq4.d0.c("MicroMsg.Voip.VoipContext", "found requested network, toString: " + network.toString());
        if (fp.h.c(28)) {
            android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("connectivity");
            try {
                int multipathPreference = connectivityManager.getMultipathPreference(network);
                vq4.d0.c("MicroMsg.Voip.VoipContext", "getMultipathPreference ret " + multipathPreference);
                if (multipathPreference == 0) {
                    g1Var.f176532x.f176875p0 = 3;
                }
            } catch (java.lang.Exception unused) {
                vq4.d0.c("MicroMsg.Voip.VoipContext", "getMultipathPreference  Error");
                g1Var.f176532x.f176875p0 = 2;
                try {
                    connectivityManager.unregisterNetworkCallback(this);
                    return;
                } catch (java.lang.Exception unused2) {
                    vq4.d0.c("MicroMsg.Voip.VoipContext", "unregisterNetworkCallback Error");
                    return;
                }
            }
        }
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.voip.model.s0(this, network, this));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(android.net.Network network) {
        super.onLost(network);
        this.f176802a.f176532x.f176881r0++;
        vq4.d0.c("MicroMsg.Voip.VoipContext", "network onLost, toString: " + network.toString());
    }
}
