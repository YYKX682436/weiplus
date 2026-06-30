package com.tencent.mm.ui.widget.dialog;

/* loaded from: classes5.dex */
public class z3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.a4 f212075d;

    public z3(com.tencent.mm.ui.widget.dialog.a4 a4Var) {
        this.f212075d = a4Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/dialog/NewBottomSheetDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.widget.dialog.a4 a4Var = this.f212075d;
        if (a4Var.isShowing() && a4Var.f211745h) {
            a4Var.cancel();
        }
        yj0.a.h(this, "com/tencent/mm/ui/widget/dialog/NewBottomSheetDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
