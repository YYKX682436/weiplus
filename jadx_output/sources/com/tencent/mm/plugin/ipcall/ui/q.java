package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes8.dex */
public class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.IPCallAcitivityUI f142984d;

    public q(com.tencent.mm.plugin.ipcall.ui.IPCallAcitivityUI iPCallAcitivityUI) {
        this.f142984d = iPCallAcitivityUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ipcall/ui/IPCallAcitivityUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.ipcall.ui.IPCallAcitivityUI iPCallAcitivityUI = this.f142984d;
        if (iPCallAcitivityUI.f142534m.f404865e == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.IPCallAcitivityUI", "click activity, go to IPCallPackageUI");
            android.content.Intent intent = new android.content.Intent();
            intent.setClass(iPCallAcitivityUI.getContext(), com.tencent.mm.plugin.ipcall.ui.IPCallShareCouponUI.class);
            com.tencent.mm.plugin.ipcall.ui.IPCallAcitivityUI iPCallAcitivityUI2 = this.f142984d;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(iPCallAcitivityUI2, arrayList2.toArray(), "com/tencent/mm/plugin/ipcall/ui/IPCallAcitivityUI$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            iPCallAcitivityUI2.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(iPCallAcitivityUI2, "com/tencent/mm/plugin/ipcall/ui/IPCallAcitivityUI$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            android.content.Intent intent2 = new android.content.Intent();
            intent2.setClass(iPCallAcitivityUI.getContext(), com.tencent.mm.plugin.ipcall.ui.IPCallPackageUI.class);
            com.tencent.mm.plugin.ipcall.ui.IPCallAcitivityUI iPCallAcitivityUI3 = this.f142984d;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(intent2);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(iPCallAcitivityUI3, arrayList3.toArray(), "com/tencent/mm/plugin/ipcall/ui/IPCallAcitivityUI$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            iPCallAcitivityUI3.startActivity((android.content.Intent) arrayList3.get(0));
            yj0.a.f(iPCallAcitivityUI3, "com/tencent/mm/plugin/ipcall/ui/IPCallAcitivityUI$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        iPCallAcitivityUI.f142533i = true;
        iPCallAcitivityUI.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/ipcall/ui/IPCallAcitivityUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
