package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class b7 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoUI f180151d;

    public b7(com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoUI walletOrderInfoUI) {
        this.f180151d = walletOrderInfoUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f180151d.finish();
    }
}
