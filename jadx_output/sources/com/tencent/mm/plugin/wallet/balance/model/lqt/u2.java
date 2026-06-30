package com.tencent.mm.plugin.wallet.balance.model.lqt;

/* loaded from: classes9.dex */
public class u2 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f177724a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.model.lqt.w2 f177725b;

    public u2(com.tencent.mm.plugin.wallet.balance.model.lqt.w2 w2Var, java.lang.String str) {
        this.f177725b = w2Var;
        this.f177724a = str;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        r45.vg5 vg5Var = (r45.vg5) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.LqtSaveFetchLogic", "doQueryPurchaseResult finish: %s", vg5Var);
        com.tencent.mm.plugin.wallet.balance.model.lqt.w2 w2Var = this.f177725b;
        w2Var.f177732b.hideLoading();
        w2Var.d(this.f177724a);
        km5.b bVar = w2Var.f177742l;
        if (bVar == null) {
            return null;
        }
        bVar.c(vg5Var);
        return null;
    }
}
