package com.tencent.mm.plugin.wallet.bind.ui;

/* loaded from: classes9.dex */
public class c0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.bind.ui.WalletBindUI f178622d;

    public c0(com.tencent.mm.plugin.wallet.bind.ui.WalletBindUI walletBindUI) {
        this.f178622d = walletBindUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f178622d.finish();
    }
}
