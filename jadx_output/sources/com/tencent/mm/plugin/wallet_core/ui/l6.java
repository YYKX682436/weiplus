package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class l6 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoOldUI f180409d;

    public l6(com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoOldUI walletOrderInfoOldUI) {
        this.f180409d = walletOrderInfoOldUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f180409d.finish();
    }
}
