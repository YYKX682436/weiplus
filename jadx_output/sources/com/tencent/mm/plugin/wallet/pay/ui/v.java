package com.tencent.mm.plugin.wallet.pay.ui;

/* loaded from: classes9.dex */
public class v implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pay.ui.WalletPayCustomUI f178812d;

    public v(com.tencent.mm.plugin.wallet.pay.ui.WalletPayCustomUI walletPayCustomUI) {
        this.f178812d = walletPayCustomUI;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        this.f178812d.finish();
    }
}
