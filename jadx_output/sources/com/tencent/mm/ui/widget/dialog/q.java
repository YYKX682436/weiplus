package com.tencent.mm.ui.widget.dialog;

/* loaded from: classes8.dex */
public class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.a f211948d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.j0 f211949e;

    public q(com.tencent.mm.ui.widget.dialog.j0 j0Var, com.tencent.mm.ui.widget.dialog.a aVar) {
        this.f211949e = j0Var;
        this.f211948d = aVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/dialog/MMAlertDialog$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.DialogInterface.OnClickListener onClickListener = this.f211948d.I;
        com.tencent.mm.ui.widget.dialog.j0 j0Var = this.f211949e;
        if (onClickListener != null) {
            onClickListener.onClick(j0Var, -1);
        }
        j0Var.dismiss();
        yj0.a.h(this, "com/tencent/mm/ui/widget/dialog/MMAlertDialog$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
