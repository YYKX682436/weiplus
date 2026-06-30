package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes14.dex */
public class c2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.f2 f142771d;

    public c2(com.tencent.mm.plugin.ipcall.ui.f2 f2Var) {
        this.f142771d = f2Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ipcall/ui/IPCallFeedbackDialog$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.ipcall.ui.f2 f2Var = this.f142771d;
        f2Var.dismiss();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("IPCallShareCouponCardUI_KFrom", 2);
        intent.setClass(f2Var.f142809h, com.tencent.mm.plugin.ipcall.ui.IPCallShareCouponCardUI.class);
        android.content.Context context = f2Var.f142809h;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/ipcall/ui/IPCallFeedbackDialog$8", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/ipcall/ui/IPCallFeedbackDialog$8", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        int i17 = f2Var.f142820v;
        q83.c.a(1, -1, i17, f2Var.e(i17), 1, 1, -1, f2Var.f142806e, f2Var.f142807f);
        yj0.a.h(this, "com/tencent/mm/plugin/ipcall/ui/IPCallFeedbackDialog$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
