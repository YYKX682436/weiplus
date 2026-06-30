package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes.dex */
public class q4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f180584d;

    public q4(android.app.Dialog dialog) {
        this.f180584d = dialog;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/WalletIdCardTip$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.app.Dialog dialog = this.f180584d;
        if (dialog != null && dialog.isShowing()) {
            dialog.dismiss();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/WalletIdCardTip$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
