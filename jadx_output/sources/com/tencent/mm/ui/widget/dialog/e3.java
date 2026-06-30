package com.tencent.mm.ui.widget.dialog;

/* loaded from: classes14.dex */
public class e3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f211773d;

    public e3(com.tencent.mm.ui.widget.dialog.z2 z2Var) {
        this.f211773d = z2Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/dialog/MMHalfBottomDialog$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.widget.dialog.z2 z2Var = this.f211773d;
        com.tencent.mm.ui.widget.dialog.r3 r3Var = z2Var.K;
        if (r3Var != null) {
            r3Var.a(z2Var.f212055d, 0);
        }
        yj0.a.h(this, "com/tencent/mm/ui/widget/dialog/MMHalfBottomDialog$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
