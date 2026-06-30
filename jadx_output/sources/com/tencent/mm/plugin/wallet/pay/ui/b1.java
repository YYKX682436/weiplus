package com.tencent.mm.plugin.wallet.pay.ui;

/* loaded from: classes9.dex */
public class b1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI f178749d;

    public b1(com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI walletPayUI) {
        this.f178749d = walletPayUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f178749d.finish();
    }
}
