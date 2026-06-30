package com.tencent.mm.plugin.wallet.balance.model.lqt;

/* loaded from: classes9.dex */
public class z2 implements lm5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.model.lqt.b3 f177762a;

    public z2(com.tencent.mm.plugin.wallet.balance.model.lqt.b3 b3Var) {
        this.f177762a = b3Var;
    }

    @Override // lm5.e
    public java.lang.String a() {
        return "Vending.UI";
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        nm5.c cVar = (nm5.c) obj;
        com.tencent.mm.plugin.wallet.balance.model.lqt.w2 w2Var = this.f177762a.f177618a;
        int intValue = ((java.lang.Integer) cVar.a(0)).intValue();
        int intValue2 = ((java.lang.Integer) cVar.a(1)).intValue();
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = (com.tencent.mm.plugin.wallet_core.model.Bankcard) cVar.a(2);
        w2Var.getClass();
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Integer.valueOf(intValue2);
        objArr[1] = bankcard != null ? bankcard.field_bindSerial : "";
        com.tencent.mars.xlog.Log.i("MicroMsg.LqtSaveFetchLogic", "saveLqt, accountType: %s, bankcard: %s", objArr);
        com.tencent.mm.wallet_core.ui.WalletBaseUI walletBaseUI = w2Var.f177732b;
        java.lang.String stringExtra = walletBaseUI.getIntent().getStringExtra("lqt_save_fund_code");
        java.lang.String stringExtra2 = walletBaseUI.getIntent().getStringExtra("lqt_fund_spid");
        java.lang.String stringExtra3 = walletBaseUI.getIntent().getStringExtra("operate_id");
        w2Var.f177735e = intValue;
        w2Var.f177738h = intValue2;
        java.lang.String str = bankcard.field_bankcardType;
        java.lang.String str2 = bankcard.field_bindSerial;
        walletBaseUI.showLoading(true);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(intValue);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(intValue2);
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(w2Var.f177741k);
        km5.q qVar = new km5.q();
        qVar.y(stringExtra, stringExtra2, valueOf, valueOf2, stringExtra3, valueOf3, str, str2);
        qVar.n(w2Var.f177731a.f177655b);
        qVar.n(new com.tencent.mm.plugin.wallet.balance.model.lqt.p2(w2Var));
        qVar.n(new com.tencent.mm.plugin.wallet.balance.model.lqt.o2(w2Var, bankcard));
        qVar.s(new com.tencent.mm.plugin.wallet.balance.model.lqt.n2(w2Var));
        km5.u.a(qVar);
        return null;
    }
}
