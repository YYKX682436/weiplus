package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class y2 implements db5.d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.z2 f180806a;

    public y2(com.tencent.mm.plugin.wallet_core.ui.z2 z2Var) {
        this.f180806a = z2Var;
    }

    @Override // db5.d1
    public void a(int i17, int i18) {
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.wallet_core.ui.z2 z2Var = this.f180806a;
        if (i17 == 0) {
            intent.putExtra("rawUrl", z2Var.f180820d.getString(com.tencent.mm.R.string.f493481ke2, com.tencent.mm.sdk.platformtools.m2.d()));
        } else if (i17 == 1) {
            com.tencent.mm.plugin.wallet_core.ui.WalletCardImportUI walletCardImportUI = z2Var.f180820d;
            if (walletCardImportUI.f179960z != null) {
                intent.putExtra("rawUrl", walletCardImportUI.getString(com.tencent.mm.R.string.f493480ke1, com.tencent.mm.sdk.platformtools.m2.d(), z2Var.f180820d.f179960z.f179659s));
            }
        }
        intent.putExtra("showShare", false);
        com.tencent.mm.wallet_core.ui.r1.T(z2Var.f180820d.getContext(), intent);
    }
}
