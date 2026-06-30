package com.tencent.mm.plugin.wallet.pwd.ui;

/* loaded from: classes9.dex */
public class t1 extends com.tencent.mm.ui.base.preference.Preference {
    public t1(com.tencent.mm.plugin.wallet.pwd.ui.WalletPasswordSettingUI walletPasswordSettingUI, android.content.Context context) {
        super(context);
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        super.t(view);
        if (this.f197772f != null) {
            view.setOnClickListener(new com.tencent.mm.plugin.wallet.pwd.ui.s1(this));
        }
    }
}
