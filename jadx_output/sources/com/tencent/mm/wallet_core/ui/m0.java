package com.tencent.mm.wallet_core.ui;

/* loaded from: classes9.dex */
public class m0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.ui.WalletBaseUI f214204d;

    public m0(com.tencent.mm.wallet_core.ui.WalletBaseUI walletBaseUI) {
        this.f214204d = walletBaseUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.wallet_core.a.c(this.f214204d, null, com.tencent.tinker.loader.shareutil.ShareConstants.ERROR_LOAD_GET_INTENT_FAIL);
    }
}
