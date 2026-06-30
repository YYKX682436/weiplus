package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class hc implements com.tencent.mm.wallet_core.model.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f146990a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI f146991b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f146992c;

    public hc(android.app.Dialog dialog, com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI, boolean z17) {
        this.f146990a = dialog;
        this.f146991b = luckyMoneyNewPrepareUI;
        this.f146992c = z17;
    }

    @Override // com.tencent.mm.wallet_core.model.d
    public /* bridge */ /* synthetic */ void a(java.lang.Object obj) {
    }

    @Override // com.tencent.mm.wallet_core.model.d
    public void b(java.lang.Object obj, int i17, int i18) {
        r45.co3 co3Var = (r45.co3) obj;
        android.app.Dialog dialog = this.f146990a;
        if (dialog != null && dialog.isShowing()) {
            dialog.dismiss();
        }
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI = this.f146991b;
        if (co3Var == null) {
            java.lang.ref.WeakReference weakReference = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI.f146241x2;
            com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyNewPrepareUI", "[openLocalEnvelopeLayout] netCallback failed");
            com.tencent.mm.wallet_core.ui.r1.K(luckyMoneyNewPrepareUI.getContext(), "");
            return;
        }
        java.lang.ref.WeakReference weakReference2 = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI.f146241x2;
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUI", "[openLocalEnvelopeLayout] netCallback retcode: %s", java.lang.Integer.valueOf(co3Var.f371703d));
        if (co3Var.f371703d != 0) {
            com.tencent.mm.wallet_core.ui.r1.L(co3Var.f371704e);
            return;
        }
        try {
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI.V6(luckyMoneyNewPrepareUI, co3Var.toByteArray(), true, this.f146992c);
        } catch (java.lang.Exception e17) {
            java.lang.ref.WeakReference weakReference3 = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI.f146241x2;
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LuckyMoneyNewPrepareUI", e17, "", new java.lang.Object[0]);
        }
        android.widget.TextView textView = luckyMoneyNewPrepareUI.G;
        if (textView != null) {
            textView.setVisibility(8);
        }
        ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
        bk0.a.g().j(com.tencent.mm.storage.u3.USERINFO_LUCKY_MONEY_FIRST_NEW_FLAG_STRING_SYNC, com.tencent.mm.storage.u3.USERINFO_LUCKY_MONEY_FIRST_NEW_FLAG_HOME_STRING_SYNC);
    }
}
