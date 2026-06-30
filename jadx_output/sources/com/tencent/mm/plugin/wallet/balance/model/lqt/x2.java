package com.tencent.mm.plugin.wallet.balance.model.lqt;

/* loaded from: classes9.dex */
public class x2 implements lm5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.model.lqt.b3 f177749a;

    public x2(com.tencent.mm.plugin.wallet.balance.model.lqt.b3 b3Var) {
        this.f177749a = b3Var;
    }

    @Override // lm5.e
    public java.lang.String a() {
        return "Vending.UI";
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        nm5.d dVar = (nm5.d) obj;
        com.tencent.mm.plugin.wallet.balance.model.lqt.w2 w2Var = this.f177749a.f177618a;
        int intValue = ((java.lang.Integer) dVar.a(0)).intValue();
        int intValue2 = ((java.lang.Integer) dVar.a(1)).intValue();
        int intValue3 = ((java.lang.Integer) dVar.a(2)).intValue();
        r45.kd kdVar = (r45.kd) dVar.a(3);
        w2Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.LqtSaveFetchLogic", "fetchLqt, accountType: %s, %s", java.lang.Integer.valueOf(intValue2), java.lang.Integer.valueOf(intValue3));
        w2Var.f177736f = intValue;
        com.tencent.mm.wallet_core.ui.WalletBaseUI walletBaseUI = w2Var.f177732b;
        java.lang.String stringExtra = walletBaseUI.getIntent().getStringExtra("operate_id");
        w2Var.f177738h = intValue2;
        walletBaseUI.showLoading(true);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(intValue);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(intValue2);
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(intValue3);
        km5.q qVar = new km5.q();
        qVar.y(valueOf, kdVar, valueOf2, valueOf3, stringExtra);
        qVar.n(w2Var.f177731a.f177658e);
        qVar.n(new com.tencent.mm.plugin.wallet.balance.model.lqt.s2(w2Var));
        qVar.s(new com.tencent.mm.plugin.wallet.balance.model.lqt.r2(w2Var));
        km5.u.a(qVar);
        return null;
    }
}
