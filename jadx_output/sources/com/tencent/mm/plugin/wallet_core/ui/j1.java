package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes8.dex */
public class j1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletBankcardIdUI f180353d;

    public j1(com.tencent.mm.plugin.wallet_core.ui.WalletBankcardIdUI walletBankcardIdUI) {
        this.f180353d = walletBankcardIdUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        int i18 = com.tencent.mm.plugin.wallet_core.ui.WalletBankcardIdUI.f179858r;
        com.tencent.mm.plugin.wallet_core.ui.WalletBankcardIdUI walletBankcardIdUI = this.f180353d;
        android.view.View findFocus = walletBankcardIdUI.getContentView() == null ? null : walletBankcardIdUI.getContentView().findFocus();
        if (findFocus == null || !(findFocus instanceof android.widget.EditText)) {
            return;
        }
        walletBankcardIdUI.showVKB();
    }
}
