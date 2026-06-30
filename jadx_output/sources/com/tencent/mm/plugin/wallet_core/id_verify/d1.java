package com.tencent.mm.plugin.wallet_core.id_verify;

/* loaded from: classes9.dex */
public class d1 implements db5.d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.id_verify.e1 f179357a;

    public d1(com.tencent.mm.plugin.wallet_core.id_verify.e1 e1Var) {
        this.f179357a = e1Var;
    }

    @Override // db5.d1
    public void a(int i17, int i18) {
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.wallet_core.id_verify.e1 e1Var = this.f179357a;
        if (i17 == 0) {
            intent.putExtra("rawUrl", e1Var.f179368d.getString(com.tencent.mm.R.string.f493481ke2, com.tencent.mm.sdk.platformtools.m2.d()));
        } else if (i17 == 1) {
            com.tencent.mm.plugin.wallet_core.id_verify.WalletRealNameVerifyUI walletRealNameVerifyUI = e1Var.f179368d;
            if (walletRealNameVerifyUI.f179237o != null) {
                intent.putExtra("rawUrl", walletRealNameVerifyUI.getString(com.tencent.mm.R.string.f493480ke1, com.tencent.mm.sdk.platformtools.m2.d(), e1Var.f179368d.f179237o.f179659s));
            }
        }
        intent.putExtra("showShare", false);
        intent.putExtra("allow_mix_content_mode", false);
        com.tencent.mm.wallet_core.ui.r1.T(e1Var.f179368d.getContext(), intent);
    }
}
