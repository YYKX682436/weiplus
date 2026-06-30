package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class o4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public boolean f157858d = false;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f157859e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI f157860f;

    public o4(com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI remittanceDetailUI, android.app.Dialog dialog) {
        this.f157860f = remittanceDetailUI;
        this.f157859e = dialog;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceDetailUI", "WalletGetUserInfoEvent callback() hasCallback:%s", java.lang.Boolean.valueOf(this.f157858d));
        if (!this.f157858d) {
            int i17 = com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI.f157336u2;
            com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI remittanceDetailUI = this.f157860f;
            remittanceDetailUI.getClass();
            android.app.Dialog dialog = this.f157859e;
            if (dialog != null) {
                dialog.dismiss();
            }
            android.content.Intent intent = new android.content.Intent(remittanceDetailUI, (java.lang.Class<?>) com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI.class);
            intent.putExtra("key_account_type", 0);
            remittanceDetailUI.v7(intent, true);
        }
        this.f157858d = true;
    }
}
