package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class r7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.v7 f180602d;

    public r7(com.tencent.mm.plugin.wallet_core.ui.v7 v7Var) {
        this.f180602d = v7Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/WalletPwdCustomDialog$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f180602d.e();
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdCustomDialog$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
