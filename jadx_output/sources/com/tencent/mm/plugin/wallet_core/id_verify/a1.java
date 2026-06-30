package com.tencent.mm.plugin.wallet_core.id_verify;

/* loaded from: classes9.dex */
public class a1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.id_verify.WalletRealNameVerifyUI f179332d;

    public a1(com.tencent.mm.plugin.wallet_core.id_verify.WalletRealNameVerifyUI walletRealNameVerifyUI) {
        this.f179332d = walletRealNameVerifyUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/id_verify/WalletRealNameVerifyUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.wallet_core.id_verify.WalletRealNameVerifyUI walletRealNameVerifyUI = this.f179332d;
        walletRealNameVerifyUI.doSceneProgress(new ys4.g(walletRealNameVerifyUI.f179229d.getText(), walletRealNameVerifyUI.f179230e.getText(), walletRealNameVerifyUI.getInput().getInt("entry_scene", -1)), true);
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/id_verify/WalletRealNameVerifyUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
