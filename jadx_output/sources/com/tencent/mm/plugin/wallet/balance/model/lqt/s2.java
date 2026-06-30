package com.tencent.mm.plugin.wallet.balance.model.lqt;

/* loaded from: classes9.dex */
public class s2 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.model.lqt.w2 f177715a;

    public s2(com.tencent.mm.plugin.wallet.balance.model.lqt.w2 w2Var) {
        this.f177715a = w2Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        r45.qb5 qb5Var = (r45.qb5) obj;
        com.tencent.mm.plugin.wallet.balance.model.lqt.w2 w2Var = this.f177715a;
        com.tencent.mars.xlog.Log.i("MicroMsg.LqtSaveFetchLogic", "%s pre redeem finish: %s", java.lang.Integer.valueOf(w2Var.hashCode()), qb5Var);
        w2Var.f177732b.hideLoading();
        km5.b b17 = km5.u.b();
        w2Var.f177742l = b17;
        b17.b();
        w2Var.f177737g = qb5Var.f383805f;
        if (qb5Var.f383803d != 0) {
            return null;
        }
        if (qb5Var.f383806g == null) {
            w2Var.a();
            return null;
        }
        com.tencent.mm.autogen.events.WCPayLqtSaveFetchUIShowDialogEvent wCPayLqtSaveFetchUIShowDialogEvent = new com.tencent.mm.autogen.events.WCPayLqtSaveFetchUIShowDialogEvent();
        wCPayLqtSaveFetchUIShowDialogEvent.f54948g.f6207c = qb5Var.f383806g;
        wCPayLqtSaveFetchUIShowDialogEvent.e();
        return null;
    }
}
