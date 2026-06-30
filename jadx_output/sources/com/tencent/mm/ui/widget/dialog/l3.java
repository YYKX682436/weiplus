package com.tencent.mm.ui.widget.dialog;

/* loaded from: classes4.dex */
public class l3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f211921d;

    public l3(com.tencent.mm.ui.widget.dialog.z2 z2Var) {
        this.f211921d = z2Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/dialog/MMHalfBottomDialog$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.widget.dialog.p3 p3Var = this.f211921d.E;
        if (p3Var != null) {
            p3Var.a();
        }
        yj0.a.h(this, "com/tencent/mm/ui/widget/dialog/MMHalfBottomDialog$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
