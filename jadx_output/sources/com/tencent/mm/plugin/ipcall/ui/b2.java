package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes14.dex */
public class b2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.f2 f142759d;

    public b2(com.tencent.mm.plugin.ipcall.ui.f2 f2Var) {
        this.f142759d = f2Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ipcall/ui/IPCallFeedbackDialog$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.ipcall.ui.f2 f2Var = this.f142759d;
        f2Var.dismiss();
        int i17 = f2Var.f142820v;
        q83.c.a(1, -1, i17, f2Var.e(i17), 1, -1, 1, f2Var.f142806e, f2Var.f142807f);
        yj0.a.h(this, "com/tencent/mm/plugin/ipcall/ui/IPCallFeedbackDialog$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
