package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class c9 implements com.tencent.mm.plugin.wallet_core.utils.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.model.d0 f157662a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.WalletMerchantPayUI f157663b;

    public c9(com.tencent.mm.plugin.remittance.ui.WalletMerchantPayUI walletMerchantPayUI, com.tencent.mm.plugin.remittance.model.d0 d0Var) {
        this.f157663b = walletMerchantPayUI;
        this.f157662a = d0Var;
    }

    @Override // com.tencent.mm.plugin.wallet_core.utils.k0
    public void a(r45.n34 n34Var) {
        int i17 = n34Var.f381049e;
        com.tencent.mm.plugin.remittance.ui.WalletMerchantPayUI walletMerchantPayUI = this.f157663b;
        if (i17 == 1) {
            walletMerchantPayUI.finish();
            return;
        }
        if (i17 == 2) {
            java.lang.String str = n34Var.f381050f;
            if (str == null || str.length() <= 0) {
                walletMerchantPayUI.c7(this.f157662a);
                return;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", n34Var.f381050f);
            com.tencent.mm.wallet_core.ui.r1.T(walletMerchantPayUI, intent);
        }
    }
}
