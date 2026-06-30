package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes9.dex */
public class f4 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI f178172d;

    public f4(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI walletLqtPlanAddUI) {
        this.f178172d = walletLqtPlanAddUI;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        com.tencent.mm.wallet_core.keyboard.WcPayKeyboard wcPayKeyboard;
        com.tencent.mm.wallet_core.keyboard.WcPayKeyboard wcPayKeyboard2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtPlanAddUI$9", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI walletLqtPlanAddUI = this.f178172d;
        wcPayKeyboard = ((com.tencent.mm.wallet_core.ui.WalletBaseUI) walletLqtPlanAddUI).mWcKeyboard;
        if (wcPayKeyboard.isShown()) {
            wcPayKeyboard2 = ((com.tencent.mm.wallet_core.ui.WalletBaseUI) walletLqtPlanAddUI).mWcKeyboard;
            if (wcPayKeyboard2.q()) {
                walletLqtPlanAddUI.hideWcKb();
                yj0.a.i(true, this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtPlanAddUI$9", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return true;
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtPlanAddUI$9", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
