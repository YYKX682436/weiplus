package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class u4 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.model.lqt.z0 f157971a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f157972b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f157973c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI f157974d;

    public u4(com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI remittanceDetailUI, com.tencent.mm.plugin.wallet.balance.model.lqt.z0 z0Var, android.app.Dialog dialog, java.lang.String str) {
        this.f157974d = remittanceDetailUI;
        this.f157971a = z0Var;
        this.f157972b = dialog;
        this.f157973c = str;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        r45.zg5 zg5Var = (r45.zg5) obj;
        if (zg5Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceDetailUI", "fetch detail failed");
            return null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceDetailUI", "fetch detail success, account_type: %s, is_hide_close_account_btn: %s", java.lang.Integer.valueOf(zg5Var.C), java.lang.Boolean.valueOf(zg5Var.B));
        this.f157971a.f177758e.b(zg5Var.C, 2);
        if (vr4.f1.wi().Ai().f13999h != null) {
            com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI.X6(this.f157974d, zg5Var, this.f157972b, this.f157973c);
            return null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceDetailUI", "publish WalletGetUserInfoEvent");
        com.tencent.mm.autogen.events.WalletGetUserInfoEvent walletGetUserInfoEvent = new com.tencent.mm.autogen.events.WalletGetUserInfoEvent();
        am.l10 l10Var = walletGetUserInfoEvent.f54958g;
        l10Var.f7215a = 1;
        l10Var.f7216b = true;
        l10Var.f7217c = true;
        walletGetUserInfoEvent.f54959h.f7292a = new com.tencent.mm.plugin.remittance.ui.t4(this, zg5Var);
        walletGetUserInfoEvent.b(android.os.Looper.myLooper());
        return null;
    }
}
