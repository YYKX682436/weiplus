package com.tencent.mm.plugin.wallet.pay.ui;

/* loaded from: classes9.dex */
public class o0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f178794d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI f178795e;

    public o0(com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI walletPayUI, int i17) {
        this.f178795e = walletPayUI;
        this.f178794d = i17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        boolean z17 = com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI.C1;
        com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI walletPayUI = this.f178795e;
        if (walletPayUI.m7()) {
            walletPayUI.o7(true);
        } else {
            walletPayUI.i7(this.f178794d, false);
        }
    }
}
