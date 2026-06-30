package com.tencent.mm.plugin.wallet_index.ui;

/* loaded from: classes15.dex */
public final class u0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_index.ui.WecoinIapUI f181212d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f181213e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(com.tencent.mm.plugin.wallet_index.ui.WecoinIapUI wecoinIapUI, java.lang.ref.WeakReference weakReference) {
        super(1);
        this.f181212d = wecoinIapUI;
        this.f181213e = weakReference;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        pr4.b bVar = (pr4.b) obj;
        kotlin.jvm.internal.o.g(bVar, "<name for destructuring parameter 0>");
        com.tencent.mm.modelbase.r1 r1Var = gm0.j1.n().f273288b;
        com.tencent.mm.plugin.wallet_index.ui.WecoinIapUI wecoinIapUI = this.f181212d;
        com.tencent.mm.plugin.wallet_index.ui.r0 r0Var = wecoinIapUI.f181124d;
        kotlin.jvm.internal.o.e(r0Var, "null cannot be cast to non-null type com.tencent.mm.plugin.wallet_index.ui.WecoinIapData");
        r1Var.g(new com.tencent.mm.wallet_core.model.c1(r0Var.f181200i, r0Var.f181192a, r0Var.f181193b, r0Var.f181195d, 1, null));
        wecoinIapUI.f181128h = wecoinIapUI.f181127g;
        com.tencent.mm.plugin.wallet_index.ui.WecoinIapUI wecoinIapUI2 = (com.tencent.mm.plugin.wallet_index.ui.WecoinIapUI) this.f181213e.get();
        if (wecoinIapUI2 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WecoinIapUI", "showLoadingDialog!");
            wecoinIapUI2.f181131n = com.tencent.mm.ui.widget.dialog.u3.f(wecoinIapUI2, wecoinIapUI2.getString(com.tencent.mm.R.string.f490604zq), true, 0, new com.tencent.mm.plugin.wallet_index.ui.t0(wecoinIapUI2));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WecoinIapUI", "[WeCoin] consumeWeCoin onSuccess, data:%s", java.lang.Long.valueOf(bVar.f357986a));
        return jz5.f0.f302826a;
    }
}
