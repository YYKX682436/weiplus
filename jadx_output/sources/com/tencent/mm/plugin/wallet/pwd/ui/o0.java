package com.tencent.mm.plugin.wallet.pwd.ui;

/* loaded from: classes3.dex */
public class o0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdVerifyIdUI f179041d;

    public o0(com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdVerifyIdUI walletForgotPwdVerifyIdUI) {
        this.f179041d = walletForgotPwdVerifyIdUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/pwd/ui/WalletForgotPwdVerifyIdUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.wallet_core.ui.r1.V(this.f179041d, "https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.f492291fy2) + "/touch/scene_product.html?scene_id=kf3258", false);
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/pwd/ui/WalletForgotPwdVerifyIdUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
