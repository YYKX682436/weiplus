package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes14.dex */
public class x1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.f2 f143068d;

    public x1(com.tencent.mm.plugin.ipcall.ui.f2 f2Var) {
        this.f143068d = f2Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ipcall/ui/IPCallFeedbackDialog$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.ipcall.ui.f2 f2Var = this.f143068d;
        if (view == f2Var.f142814p) {
            f2Var.c(1);
        } else if (view == f2Var.f142815q) {
            f2Var.c(2);
        } else if (view == f2Var.f142816r) {
            f2Var.c(3);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/ipcall/ui/IPCallFeedbackDialog$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
