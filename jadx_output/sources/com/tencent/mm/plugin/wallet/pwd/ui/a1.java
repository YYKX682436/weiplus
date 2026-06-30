package com.tencent.mm.plugin.wallet.pwd.ui;

/* loaded from: classes9.dex */
public class a1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f178972d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pwd.ui.WalletIdCardCheckUI f178973e;

    public a1(com.tencent.mm.plugin.wallet.pwd.ui.WalletIdCardCheckUI walletIdCardCheckUI, boolean z17) {
        this.f178973e = walletIdCardCheckUI;
        this.f178972d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tenpay.android.wechat.MyKeyboardWindow myKeyboardWindow;
        com.tenpay.android.wechat.MyKeyboardWindow myKeyboardWindow2;
        boolean z17 = this.f178972d;
        com.tencent.mm.plugin.wallet.pwd.ui.WalletIdCardCheckUI walletIdCardCheckUI = this.f178973e;
        if (!z17) {
            android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) walletIdCardCheckUI.f178901g.getLayoutParams();
            layoutParams.removeRule(3);
            layoutParams.addRule(12);
            layoutParams.bottomMargin = i65.a.b(walletIdCardCheckUI.getContext(), 96);
            walletIdCardCheckUI.f178901g.setLayoutParams(layoutParams);
            return;
        }
        int height = ((walletIdCardCheckUI.f178902h.getHeight() - walletIdCardCheckUI.f178898d.getTop()) - walletIdCardCheckUI.f178898d.getHeight()) - i65.a.b(walletIdCardCheckUI.getContext(), 32);
        int height2 = walletIdCardCheckUI.f178901g.getHeight() + i65.a.b(walletIdCardCheckUI.getContext(), 32);
        myKeyboardWindow = ((com.tencent.mm.wallet_core.ui.WalletBaseUI) walletIdCardCheckUI).mKeyboard;
        if (height2 + myKeyboardWindow.getHeight() + i65.a.b(walletIdCardCheckUI.getContext(), 30) <= height) {
            android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) walletIdCardCheckUI.f178901g.getLayoutParams();
            layoutParams2.removeRule(3);
            layoutParams2.addRule(12);
            int b17 = i65.a.b(walletIdCardCheckUI.getContext(), 32);
            myKeyboardWindow2 = ((com.tencent.mm.wallet_core.ui.WalletBaseUI) walletIdCardCheckUI).mKeyboard;
            layoutParams2.bottomMargin = b17 + myKeyboardWindow2.getHeight() + i65.a.b(walletIdCardCheckUI.getContext(), 30);
            walletIdCardCheckUI.f178901g.setLayoutParams(layoutParams2);
            return;
        }
        android.widget.RelativeLayout.LayoutParams layoutParams3 = (android.widget.RelativeLayout.LayoutParams) walletIdCardCheckUI.f178900f.getLayoutParams();
        layoutParams3.topMargin = i65.a.b(walletIdCardCheckUI.getContext(), 25);
        walletIdCardCheckUI.f178900f.setLayoutParams(layoutParams3);
        android.widget.RelativeLayout.LayoutParams layoutParams4 = (android.widget.RelativeLayout.LayoutParams) walletIdCardCheckUI.f178901g.getLayoutParams();
        layoutParams4.removeRule(12);
        layoutParams4.addRule(3, com.tencent.mm.R.id.f485303h83);
        layoutParams4.topMargin = i65.a.b(walletIdCardCheckUI.getContext(), 32);
        walletIdCardCheckUI.f178901g.setLayoutParams(layoutParams4);
    }
}
