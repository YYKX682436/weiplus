package com.tencent.mm.plugin.wallet.pwd.ui;

/* loaded from: classes9.dex */
public class n2 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pwd.ui.WalletSecuritySettingUI f179039d;

    public n2(com.tencent.mm.plugin.wallet.pwd.ui.WalletSecuritySettingUI walletSecuritySettingUI) {
        this.f179039d = walletSecuritySettingUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f179039d.finish();
    }
}
