package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class m9 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f157824d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.WalletMerchantPayUI f157825e;

    public m9(com.tencent.mm.plugin.remittance.ui.WalletMerchantPayUI walletMerchantPayUI, boolean z17) {
        this.f157825e = walletMerchantPayUI;
        this.f157824d = z17;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        com.tencent.mm.wallet_core.keyboard.WcPayKeyboard wcPayKeyboard;
        com.tencent.mm.wallet_core.keyboard.WcPayKeyboard wcPayKeyboard2;
        com.tencent.mm.wallet_core.keyboard.WcPayKeyboard wcPayKeyboard3;
        com.tencent.mm.wallet_core.keyboard.WcPayKeyboard wcPayKeyboard4;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/remittance/ui/WalletMerchantPayUI$20", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        boolean z17 = this.f157824d;
        com.tencent.mm.plugin.remittance.ui.WalletMerchantPayUI walletMerchantPayUI = this.f157825e;
        if (z17) {
            walletMerchantPayUI.handleKeyboardTouchEvent(motionEvent);
        } else {
            wcPayKeyboard = ((com.tencent.mm.wallet_core.ui.WalletBaseUI) walletMerchantPayUI).mWcKeyboard;
            if (wcPayKeyboard != null) {
                wcPayKeyboard2 = ((com.tencent.mm.wallet_core.ui.WalletBaseUI) walletMerchantPayUI).mWcKeyboard;
                if (wcPayKeyboard2.isShown()) {
                    wcPayKeyboard3 = ((com.tencent.mm.wallet_core.ui.WalletBaseUI) walletMerchantPayUI).mWcKeyboard;
                    if (wcPayKeyboard3.q()) {
                        wcPayKeyboard4 = ((com.tencent.mm.wallet_core.ui.WalletBaseUI) walletMerchantPayUI).mWcKeyboard;
                        wcPayKeyboard4.i();
                    }
                }
            }
        }
        walletMerchantPayUI.hideTenpayKB();
        walletMerchantPayUI.hideVKB();
        walletMerchantPayUI.f157602h.getContentEt().clearFocus();
        if (walletMerchantPayUI.f157609r) {
            walletMerchantPayUI.f157608q.clearFocus();
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/remittance/ui/WalletMerchantPayUI$20", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
