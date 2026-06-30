package com.tencent.mm.plugin.wallet.pwd.ui;

/* loaded from: classes9.dex */
public class p implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f179047a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pwd.ui.WalletDelayTransferSettingUI f179048b;

    public p(com.tencent.mm.plugin.wallet.pwd.ui.WalletDelayTransferSettingUI walletDelayTransferSettingUI, com.tencent.mm.ui.widget.dialog.z2 z2Var) {
        this.f179048b = walletDelayTransferSettingUI;
        this.f179047a = z2Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public void a() {
        this.f179047a.B();
        int i17 = com.tencent.mm.plugin.wallet.pwd.ui.WalletDelayTransferSettingUI.f178839u;
        com.tencent.mm.plugin.wallet.pwd.ui.WalletDelayTransferSettingUI walletDelayTransferSettingUI = this.f179048b;
        if (walletDelayTransferSettingUI.V6(16)) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(23319, java.lang.Integer.valueOf(walletDelayTransferSettingUI.f178852s), java.lang.Integer.valueOf(walletDelayTransferSettingUI.f178853t), 2);
        } else if (walletDelayTransferSettingUI.V6(32)) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(23319, java.lang.Integer.valueOf(walletDelayTransferSettingUI.f178852s), java.lang.Integer.valueOf(walletDelayTransferSettingUI.f178853t), 3);
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(23319, java.lang.Integer.valueOf(walletDelayTransferSettingUI.f178852s), java.lang.Integer.valueOf(walletDelayTransferSettingUI.f178853t), 1);
        }
        gm0.j1.i();
        gm0.j1.u().c().w(147457, java.lang.Long.valueOf(walletDelayTransferSettingUI.f178841e));
        db5.t7.i(walletDelayTransferSettingUI.getContext(), walletDelayTransferSettingUI.getString(com.tencent.mm.R.string.f493524kl2), com.tencent.mm.R.raw.icons_filled_done);
        walletDelayTransferSettingUI.finish();
    }
}
