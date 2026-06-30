package com.tencent.mm.wallet_core.ui;

/* loaded from: classes9.dex */
public class a2 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.ui.WalletPreferenceUI f214111d;

    public a2(com.tencent.mm.wallet_core.ui.WalletPreferenceUI walletPreferenceUI) {
        this.f214111d = walletPreferenceUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f214111d.finish();
    }
}
