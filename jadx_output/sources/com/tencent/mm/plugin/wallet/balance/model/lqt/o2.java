package com.tencent.mm.plugin.wallet.balance.model.lqt;

/* loaded from: classes9.dex */
public class o2 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.model.Bankcard f177700a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.model.lqt.w2 f177701b;

    public o2(com.tencent.mm.plugin.wallet.balance.model.lqt.w2 w2Var, com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard) {
        this.f177701b = w2Var;
        this.f177700a = bankcard;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        r45.ff5 ff5Var = (r45.ff5) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.LqtSaveFetchLogic", "doSaveLqt, prepayid: %s, cashierType: %d", ff5Var.f374282f, java.lang.Integer.valueOf(ff5Var.f374285i));
        r45.na5 na5Var = ff5Var.f374286m;
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = this.f177700a;
        com.tencent.mm.plugin.wallet.balance.model.lqt.w2 w2Var = this.f177701b;
        if (na5Var == null) {
            w2Var.f177744n = false;
            ((java.util.HashMap) w2Var.f177743m).put(ff5Var.f374282f, w2Var.f177733c);
            w2Var.c(ff5Var, bankcard);
            return null;
        }
        w2Var.f177745o = ff5Var;
        w2Var.f177746p = bankcard;
        km5.b b17 = km5.u.b();
        w2Var.f177742l = b17;
        b17.b();
        com.tencent.mm.autogen.events.WCPayLqtSaveFetchUIShowDialogEvent wCPayLqtSaveFetchUIShowDialogEvent = new com.tencent.mm.autogen.events.WCPayLqtSaveFetchUIShowDialogEvent();
        wCPayLqtSaveFetchUIShowDialogEvent.f54948g.f6207c = ff5Var.f374286m;
        wCPayLqtSaveFetchUIShowDialogEvent.e();
        return null;
    }
}
