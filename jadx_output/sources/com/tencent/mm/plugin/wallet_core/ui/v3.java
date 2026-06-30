package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class v3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f180666d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.w3 f180667e;

    public v3(com.tencent.mm.plugin.wallet_core.ui.w3 w3Var, boolean z17) {
        this.f180667e = w3Var;
        this.f180666d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = this.f180666d;
        com.tencent.mm.plugin.wallet_core.ui.w3 w3Var = this.f180667e;
        if (z17) {
            w3Var.f180761a.f179985m.fullScroll(130);
        } else {
            w3Var.f180761a.f179985m.fullScroll(33);
        }
    }
}
