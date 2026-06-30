package com.tencent.mm.plugin.voip.model;

/* loaded from: classes13.dex */
public class s0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.net.Network f176795d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.net.ConnectivityManager.NetworkCallback f176796e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voip.model.t0 f176797f;

    public s0(com.tencent.mm.plugin.voip.model.t0 t0Var, android.net.Network network, android.net.ConnectivityManager.NetworkCallback networkCallback) {
        this.f176797f = t0Var;
        this.f176795d = network;
        this.f176796e = networkCallback;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.voip.model.t0 t0Var = this.f176797f;
        com.tencent.mm.plugin.voip.model.g1 g1Var = t0Var.f176802a;
        android.net.Network network = g1Var.P;
        android.net.Network network2 = this.f176795d;
        if (network != null) {
            g1Var.P = network2;
            if (g1Var.R != null) {
                for (int i17 = 0; i17 < t0Var.f176802a.R.size(); i17++) {
                    com.tencent.mm.plugin.voip.model.g1 g1Var2 = t0Var.f176802a;
                    g1Var2.j(((java.lang.Integer) g1Var2.R.get(i17)).intValue(), true);
                }
            }
        } else {
            g1Var.P = network2;
        }
        com.tencent.mm.plugin.voip.model.g1 g1Var3 = t0Var.f176802a;
        android.net.ConnectivityManager.NetworkCallback networkCallback = this.f176796e;
        g1Var3.Q = networkCallback;
        if (networkCallback != null) {
            try {
                vq4.d0.c("MicroMsg.Voip.VoipContext", "networkcallback hashCode: " + t0Var.f176802a.Q.hashCode());
            } catch (java.lang.Throwable unused) {
                vq4.d0.a("MicroMsg.Voip.VoipContext", "networkcallback is null");
            }
        }
        t0Var.f176802a.f176532x.f176875p0 = 1;
    }
}
