package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class d9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f157678d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.WalletMerchantPayUI f157679e;

    public d9(com.tencent.mm.plugin.remittance.ui.WalletMerchantPayUI walletMerchantPayUI, boolean z17) {
        this.f157679e = walletMerchantPayUI;
        this.f157678d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f157678d) {
            com.tencent.mm.plugin.remittance.ui.WalletMerchantPayUI walletMerchantPayUI = this.f157679e;
            walletMerchantPayUI.f157602h.setHint("");
            walletMerchantPayUI.f157602h.getContentEt().requestFocus();
        }
    }
}
