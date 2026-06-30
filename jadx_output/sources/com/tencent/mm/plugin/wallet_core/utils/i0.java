package com.tencent.mm.plugin.wallet_core.utils;

/* loaded from: classes3.dex */
public class i0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f180904d;

    public i0(com.tencent.mm.plugin.wallet_core.utils.l0 l0Var, com.tencent.mm.ui.widget.dialog.z2 z2Var) {
        this.f180904d = z2Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/utils/WCPayInterceptWinLogic$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.widget.dialog.z2 z2Var = this.f180904d;
        if (z2Var != null) {
            z2Var.B();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/utils/WCPayInterceptWinLogic$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
