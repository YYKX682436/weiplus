package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class t2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f180622d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.u2 f180623e;

    public t2(com.tencent.mm.plugin.wallet_core.ui.u2 u2Var, int i17) {
        this.f180623e = u2Var;
        this.f180622d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.wallet_core.ui.u2 u2Var = this.f180623e;
        int visibility = u2Var.f180633a.f179942e.getVisibility();
        int i17 = this.f180622d;
        if (i17 != visibility) {
            u2Var.f180633a.f179942e.setVisibility(i17);
        }
    }
}
