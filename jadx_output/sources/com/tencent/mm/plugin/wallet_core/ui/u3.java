package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class u3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI f180634d;

    public u3(com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI walletCheckPwdUI) {
        this.f180634d = walletCheckPwdUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/WalletCheckPwdUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI.B;
        com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI walletCheckPwdUI = this.f180634d;
        walletCheckPwdUI.U6();
        if (walletCheckPwdUI.f179990r == 0) {
            walletCheckPwdUI.f179990r = 1;
            walletCheckPwdUI.V6();
        } else {
            walletCheckPwdUI.f179990r = 0;
        }
        walletCheckPwdUI.Z6();
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/WalletCheckPwdUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
