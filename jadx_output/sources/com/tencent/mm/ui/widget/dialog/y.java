package com.tencent.mm.ui.widget.dialog;

/* loaded from: classes3.dex */
public class y implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.a f212022d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.j0 f212023e;

    public y(com.tencent.mm.ui.widget.dialog.j0 j0Var, com.tencent.mm.ui.widget.dialog.a aVar) {
        this.f212023e = j0Var;
        this.f212022d = aVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/dialog/MMAlertDialog$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.widget.dialog.a aVar = this.f212022d;
        android.content.DialogInterface.OnClickListener onClickListener = aVar.E;
        com.tencent.mm.ui.widget.dialog.j0 j0Var = this.f212023e;
        if (onClickListener != null) {
            onClickListener.onClick(j0Var, -1);
        }
        if (aVar.Z) {
            j0Var.dismiss();
        }
        yj0.a.h(this, "com/tencent/mm/ui/widget/dialog/MMAlertDialog$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
