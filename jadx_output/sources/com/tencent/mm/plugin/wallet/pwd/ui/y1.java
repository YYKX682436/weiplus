package com.tencent.mm.plugin.wallet.pwd.ui;

/* loaded from: classes9.dex */
public class y1 implements com.tencent.mm.ui.widget.dialog.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pwd.ui.WalletPasswordSettingUI f179121a;

    public y1(com.tencent.mm.plugin.wallet.pwd.ui.WalletPasswordSettingUI walletPasswordSettingUI) {
        this.f179121a = walletPasswordSettingUI;
    }

    @Override // com.tencent.mm.ui.widget.dialog.q3
    public void dismiss() {
        com.tencent.mm.plugin.wallet.pwd.ui.WalletPasswordSettingUI walletPasswordSettingUI = this.f179121a;
        if (walletPasswordSettingUI.C) {
            return;
        }
        walletPasswordSettingUI.f178921g.O(!r1.N());
        ((com.tencent.mm.ui.base.preference.h0) walletPasswordSettingUI.f178918d).notifyDataSetChanged();
    }
}
