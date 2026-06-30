package com.tencent.mm.plugin.wallet.pay.ui;

/* loaded from: classes9.dex */
public class r0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI f178804d;

    public r0(com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI walletPayUI) {
        this.f178804d = walletPayUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI walletPayUI = this.f178804d;
        walletPayUI.f178731w.putInt("key_pay_flag", 3);
        walletPayUI.r7(walletPayUI.f178731w);
    }
}
