package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class e9 implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.WalletMerchantPayUI f157694d;

    public e9(com.tencent.mm.plugin.remittance.ui.WalletMerchantPayUI walletMerchantPayUI) {
        this.f157694d = walletMerchantPayUI;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(android.view.View view, boolean z17) {
        if (z17) {
            this.f157694d.showNormalStWcKb();
        }
    }
}
