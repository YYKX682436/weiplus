package com.tencent.mm.plugin.wallet.pwd.ui;

/* loaded from: classes9.dex */
public class e implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pwd.ui.WalletBalancePrivacyUI f178990d;

    public e(com.tencent.mm.plugin.wallet.pwd.ui.WalletBalancePrivacyUI walletBalancePrivacyUI) {
        this.f178990d = walletBalancePrivacyUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f178990d.finish();
    }
}
