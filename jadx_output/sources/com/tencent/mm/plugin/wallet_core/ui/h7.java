package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class h7 implements com.tencent.mm.wallet_core.ui.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.widget.ScrollView f180318a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletPwdConfirmUI f180319b;

    public h7(com.tencent.mm.plugin.wallet_core.ui.WalletPwdConfirmUI walletPwdConfirmUI, android.widget.ScrollView scrollView) {
        this.f180319b = walletPwdConfirmUI;
        this.f180318a = scrollView;
    }

    @Override // com.tencent.mm.wallet_core.ui.m
    public void onVisibleStateChange(boolean z17) {
        android.widget.ScrollView scrollView = this.f180318a;
        if (!z17) {
            scrollView.scrollTo(0, 0);
        } else {
            com.tencent.mm.plugin.wallet_core.ui.WalletPwdConfirmUI walletPwdConfirmUI = this.f180319b;
            walletPwdConfirmUI.scrollToFormEditPosAfterShowTenPay(scrollView, walletPwdConfirmUI.f180076e, 30);
        }
    }
}
