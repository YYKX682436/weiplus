package com.tencent.mm.plugin.wallet.balance.model.lqt;

/* loaded from: classes9.dex */
public class p2 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.model.lqt.w2 f177705a;

    public p2(com.tencent.mm.plugin.wallet.balance.model.lqt.w2 w2Var) {
        this.f177705a = w2Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        r45.ff5 ff5Var = (r45.ff5) obj;
        java.lang.String str = ff5Var.f374283g;
        com.tencent.mm.plugin.wallet.balance.model.lqt.w2 w2Var = this.f177705a;
        w2Var.f177733c = str;
        w2Var.f177732b.hideLoading();
        com.tencent.mars.xlog.Log.i("MicroMsg.LqtSaveFetchLogic", "get tradeNo: %s", w2Var.f177733c);
        return ff5Var;
    }
}
