package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class s7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.DialogInterface.OnCancelListener f180616d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.v7 f180617e;

    public s7(com.tencent.mm.plugin.wallet_core.ui.v7 v7Var, android.content.DialogInterface.OnCancelListener onCancelListener) {
        this.f180617e = v7Var;
        this.f180616d = onCancelListener;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/WalletPwdCustomDialog$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.DialogInterface.OnCancelListener onCancelListener = this.f180616d;
        if (onCancelListener != null) {
            onCancelListener.onCancel(null);
        }
        com.tencent.mm.plugin.wallet_core.ui.v7 v7Var = this.f180617e;
        com.tencent.mm.plugin.wallet_core.ui.t7 t7Var = v7Var.f180689w;
        if (t7Var != null) {
            ((com.tencent.mm.plugin.wallet.pay.ui.w) t7Var).f178814a.finish();
        }
        v7Var.cancel();
        if (v7Var.A.isShown()) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11977, 1, 0, 1, 0, 0, 0);
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11977, 0, 0, 1, 0, 0, 0);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdCustomDialog$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
