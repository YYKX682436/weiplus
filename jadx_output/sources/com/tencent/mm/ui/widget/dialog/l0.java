package com.tencent.mm.ui.widget.dialog;

/* loaded from: classes.dex */
public class l0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f211913d;

    public l0(com.tencent.mm.ui.widget.dialog.k0 k0Var, int i17) {
        this.f211913d = k0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/dialog/MMBottomSheet$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.widget.dialog.k0 k0Var = this.f211913d;
        k0Var.getClass();
        if (!k0Var.U1) {
            k0Var.u();
        }
        yj0.a.h(this, "com/tencent/mm/ui/widget/dialog/MMBottomSheet$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
