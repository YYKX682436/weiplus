package com.tencent.mm.plugin.remittance.mobile.ui;

/* loaded from: classes9.dex */
public class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f156669d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitNumberInputUI f156670e;

    public g0(com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitNumberInputUI mobileRemitNumberInputUI, java.lang.ref.WeakReference weakReference) {
        this.f156670e = mobileRemitNumberInputUI;
        this.f156669d = weakReference;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView = (com.tencent.mm.wallet_core.ui.formview.WalletFormView) this.f156669d.get();
        if (walletFormView != null) {
            walletFormView.getContentEt().requestFocus();
            this.f156670e.showVKB();
        }
    }
}
