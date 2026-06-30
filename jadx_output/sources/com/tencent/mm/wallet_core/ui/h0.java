package com.tencent.mm.wallet_core.ui;

/* loaded from: classes9.dex */
public class h0 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.ui.WalletBaseUI f214188d;

    public h0(com.tencent.mm.wallet_core.ui.WalletBaseUI walletBaseUI) {
        this.f214188d = walletBaseUI;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        this.f214188d.forceCancel();
    }
}
