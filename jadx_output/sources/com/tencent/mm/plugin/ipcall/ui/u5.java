package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes8.dex */
public class u5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.IPCallUserProfileUI f143026d;

    public u5(com.tencent.mm.plugin.ipcall.ui.IPCallUserProfileUI iPCallUserProfileUI) {
        this.f143026d = iPCallUserProfileUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ipcall/ui/IPCallUserProfileUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12766, 3);
        com.tencent.mm.plugin.ipcall.ui.s5 s5Var = new com.tencent.mm.plugin.ipcall.ui.s5(this);
        com.tencent.mm.plugin.ipcall.ui.IPCallUserProfileUI iPCallUserProfileUI = this.f143026d;
        r35.a aVar = new r35.a(iPCallUserProfileUI, s5Var);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(86);
        aVar.f369007e = new com.tencent.mm.plugin.ipcall.ui.t5(this);
        aVar.b(iPCallUserProfileUI.f142733s, linkedList, true, "");
        yj0.a.h(this, "com/tencent/mm/plugin/ipcall/ui/IPCallUserProfileUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
