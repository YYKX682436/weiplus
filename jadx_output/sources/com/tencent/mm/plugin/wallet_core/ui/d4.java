package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes5.dex */
public class d4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletConfirmCardIDUI f180235d;

    public d4(com.tencent.mm.plugin.wallet_core.ui.WalletConfirmCardIDUI walletConfirmCardIDUI) {
        this.f180235d = walletConfirmCardIDUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        android.view.View view2;
        android.view.View view3;
        com.tenpay.android.wechat.MyKeyboardWindow myKeyboardWindow;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/WalletConfirmCardIDUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.wallet_core.ui.WalletConfirmCardIDUI walletConfirmCardIDUI = this.f180235d;
        view2 = ((com.tencent.mm.wallet_core.ui.WalletBaseUI) walletConfirmCardIDUI).mKBLayout;
        if (!view2.isShown() && !walletConfirmCardIDUI.f180001f) {
            view3 = ((com.tencent.mm.wallet_core.ui.WalletBaseUI) walletConfirmCardIDUI).mKBLayout;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/wallet_core/ui/WalletConfirmCardIDUI$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/wallet_core/ui/WalletConfirmCardIDUI$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            myKeyboardWindow = ((com.tencent.mm.wallet_core.ui.WalletBaseUI) walletConfirmCardIDUI).mKeyboard;
            myKeyboardWindow.setVisibility(0);
        }
        walletConfirmCardIDUI.f180001f = false;
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/WalletConfirmCardIDUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
