package com.tencent.mm.plugin.wallet_payu.pwd.ui;

/* loaded from: classes9.dex */
public class WalletPayUPasswordSettingUI extends com.tencent.mm.plugin.wallet.pwd.ui.WalletPasswordSettingUI {
    @Override // com.tencent.mm.plugin.wallet.pwd.ui.WalletPasswordSettingUI
    public void X6() {
        com.tencent.mm.wallet_core.a.j(this, yt4.g.class, null, null);
    }

    @Override // com.tencent.mm.plugin.wallet.pwd.ui.WalletPasswordSettingUI
    public void Z6() {
        com.tencent.mm.wallet_core.a.j(this, yt4.j.class, null, null);
    }

    @Override // com.tencent.mm.plugin.wallet.pwd.ui.WalletPasswordSettingUI
    public int a7() {
        return com.tencent.mm.R.xml.f494975d4;
    }

    @Override // com.tencent.mm.plugin.wallet.pwd.ui.WalletPasswordSettingUI
    public void i7() {
        ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).m("wallet_modify_gesture_password", true);
        ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).m("wallet_open_gesture_password", true);
    }
}
