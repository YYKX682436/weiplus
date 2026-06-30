package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes.dex */
public class x5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.IPCallUserProfileUI f143076d;

    public x5(com.tencent.mm.plugin.ipcall.ui.IPCallUserProfileUI iPCallUserProfileUI) {
        this.f143076d = iPCallUserProfileUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ipcall/ui/IPCallUserProfileUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.ipcall.ui.IPCallUserProfileUI iPCallUserProfileUI = this.f143076d;
        com.tencent.mm.plugin.ipcall.ui.IPCallUserProfileUI.T6(iPCallUserProfileUI, iPCallUserProfileUI.f142735u);
        yj0.a.h(this, "com/tencent/mm/plugin/ipcall/ui/IPCallUserProfileUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
