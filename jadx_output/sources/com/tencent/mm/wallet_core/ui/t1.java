package com.tencent.mm.wallet_core.ui;

/* loaded from: classes9.dex */
public class t1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.ui.WalletBaseUI f214234d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f214235e;

    public t1(com.tencent.mm.wallet_core.ui.WalletBaseUI walletBaseUI, java.lang.String str) {
        this.f214234d = walletBaseUI;
        this.f214235e = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.wallet_core.ui.WalletBaseUI walletBaseUI = this.f214234d;
        com.tencent.mm.wallet_core.ui.v1.a(walletBaseUI);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", this.f214235e);
        com.tencent.mm.wallet_core.ui.r1.T(walletBaseUI.getContext(), intent);
        com.tencent.mm.wallet_core.ui.r1.q0(3, 1);
    }
}
