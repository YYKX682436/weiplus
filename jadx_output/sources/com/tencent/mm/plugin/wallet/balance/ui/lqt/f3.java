package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes8.dex */
public class f3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI f178171d;

    public f3(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI walletLqtPlanAddUI) {
        this.f178171d = walletLqtPlanAddUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView = this.f178171d.f177987m;
        com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText = walletFormView.f214161h;
        if (tenpaySecureEditText != null) {
            tenpaySecureEditText.setFocusable(true);
            walletFormView.f214161h.requestFocus();
        }
    }
}
