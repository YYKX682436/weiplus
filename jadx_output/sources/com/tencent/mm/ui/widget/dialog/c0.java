package com.tencent.mm.ui.widget.dialog;

/* loaded from: classes3.dex */
public class c0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.a f211754d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.j0 f211755e;

    public c0(com.tencent.mm.ui.widget.dialog.j0 j0Var, com.tencent.mm.ui.widget.dialog.a aVar) {
        this.f211755e = j0Var;
        this.f211754d = aVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/dialog/MMAlertDialog$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.DialogInterface.OnClickListener onClickListener = this.f211754d.F;
        com.tencent.mm.ui.widget.dialog.j0 j0Var = this.f211755e;
        if (onClickListener != null) {
            onClickListener.onClick(j0Var, -2);
        }
        j0Var.cancel();
        yj0.a.h(this, "com/tencent/mm/ui/widget/dialog/MMAlertDialog$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
