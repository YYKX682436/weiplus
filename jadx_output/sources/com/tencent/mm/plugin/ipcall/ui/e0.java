package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes3.dex */
public class e0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.m0 f142788d;

    public e0(com.tencent.mm.plugin.ipcall.ui.m0 m0Var) {
        this.f142788d = m0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ipcall/ui/IPCallAddressController$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.ipcall.ui.m0 m0Var = this.f142788d;
        intent.setClass(m0Var.f142932d, com.tencent.mm.plugin.ipcall.ui.IPCallContactUI.class);
        com.tencent.mm.plugin.ipcall.ui.IPCallAddressUI iPCallAddressUI = m0Var.f142932d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(iPCallAddressUI, arrayList2.toArray(), "com/tencent/mm/plugin/ipcall/ui/IPCallAddressController$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        iPCallAddressUI.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(iPCallAddressUI, "com/tencent/mm/plugin/ipcall/ui/IPCallAddressController$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.h(this, "com/tencent/mm/plugin/ipcall/ui/IPCallAddressController$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
