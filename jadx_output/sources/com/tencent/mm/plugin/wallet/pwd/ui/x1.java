package com.tencent.mm.plugin.wallet.pwd.ui;

/* loaded from: classes9.dex */
public class x1 implements com.tencent.mm.wallet_core.model.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f179111a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pwd.ui.WalletPasswordSettingUI f179112b;

    public x1(com.tencent.mm.plugin.wallet.pwd.ui.WalletPasswordSettingUI walletPasswordSettingUI, int i17) {
        this.f179112b = walletPasswordSettingUI;
        this.f179111a = i17;
    }

    @Override // com.tencent.mm.wallet_core.model.q
    public void a(int i17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletPasswordSettingUI", "showProtocalBottomDialog click next");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(24835, 2, 2);
        com.tencent.mm.plugin.wallet.pwd.ui.WalletPasswordSettingUI walletPasswordSettingUI = this.f179112b;
        walletPasswordSettingUI.f178931t.f275109g = false;
        walletPasswordSettingUI.C = true;
        walletPasswordSettingUI.W6(this.f179111a);
    }

    @Override // com.tencent.mm.wallet_core.model.q
    public void onCancel() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletPasswordSettingUI", "showProtocalBottomDialog click cancel");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(24835, 2, 3);
        com.tencent.mm.plugin.wallet.pwd.ui.WalletPasswordSettingUI walletPasswordSettingUI = this.f179112b;
        walletPasswordSettingUI.C = true;
        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = walletPasswordSettingUI.f178921g;
        checkBoxPreference.O(true ^ checkBoxPreference.N());
        ((com.tencent.mm.ui.base.preference.h0) walletPasswordSettingUI.f178918d).notifyDataSetChanged();
    }
}
