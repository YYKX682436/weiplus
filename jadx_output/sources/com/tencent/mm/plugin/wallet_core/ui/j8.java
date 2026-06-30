package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class j8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.DialogInterface.OnCancelListener f180362d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.n8 f180363e;

    public j8(com.tencent.mm.plugin.wallet_core.ui.n8 n8Var, android.content.DialogInterface.OnCancelListener onCancelListener) {
        this.f180363e = n8Var;
        this.f180362d = onCancelListener;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.DialogInterface.OnCancelListener onCancelListener = this.f180362d;
        if (onCancelListener != null) {
            onCancelListener.onCancel(null);
        }
        com.tencent.mm.plugin.wallet_core.ui.n8 n8Var = this.f180363e;
        com.tencent.mm.plugin.wallet_core.ui.k8 k8Var = n8Var.E;
        if (k8Var != null) {
            ((com.tencent.mm.plugin.offline.ui.w0) k8Var).a();
        }
        n8Var.cancel();
        if (n8Var.M.isShown()) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11977, 1, 0, 1, 0, 0, 0);
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11977, 0, 0, 1, 0, 0, 0);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
