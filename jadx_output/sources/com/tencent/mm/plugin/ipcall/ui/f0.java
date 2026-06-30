package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes3.dex */
public class f0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.m0 f142802d;

    public f0(com.tencent.mm.plugin.ipcall.ui.m0 m0Var) {
        this.f142802d = m0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ipcall/ui/IPCallAddressController$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.ipcall.ui.m0 m0Var = this.f142802d;
        android.content.Intent intent = new android.content.Intent(m0Var.f142932d, (java.lang.Class<?>) com.tencent.mm.plugin.ipcall.ui.IPCallDialUI.class);
        intent.putExtra("IPCallTalkUI_dialScene", 1);
        m0Var.f142932d.startActivityForResult(intent, 1001);
        yj0.a.h(this, "com/tencent/mm/plugin/ipcall/ui/IPCallAddressController$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
