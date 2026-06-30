package com.tencent.mm.plugin.wallet.balance.model.lqt;

/* loaded from: classes9.dex */
public class r2 implements km5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.model.lqt.w2 f177713a;

    public r2(com.tencent.mm.plugin.wallet.balance.model.lqt.w2 w2Var) {
        this.f177713a = w2Var;
    }

    @Override // km5.e
    public void a(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LqtSaveFetchLogic", "onInterrupt %s", obj);
        this.f177713a.f177732b.hideLoading();
        km5.u.b().a(obj);
    }
}
