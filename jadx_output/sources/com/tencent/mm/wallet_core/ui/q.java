package com.tencent.mm.wallet_core.ui;

/* loaded from: classes5.dex */
public class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.ui.w f214213d;

    public q(com.tencent.mm.wallet_core.ui.w wVar) {
        this.f214213d = wVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/wallet_core/ui/OfflinePopupWindow$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.wallet_core.ui.w wVar = this.f214213d;
        db5.d5 d5Var = wVar.f214252h;
        if (d5Var != null && d5Var.isShowing()) {
            wVar.f214252h.dismiss();
        }
        yj0.a.h(this, "com/tencent/mm/wallet_core/ui/OfflinePopupWindow$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
