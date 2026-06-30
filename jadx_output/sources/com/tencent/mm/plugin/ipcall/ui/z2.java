package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes15.dex */
public class z2 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.IPCallPackageUI f143094d;

    public z2(com.tencent.mm.plugin.ipcall.ui.IPCallPackageUI iPCallPackageUI) {
        this.f143094d = iPCallPackageUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.ipcall.ui.IPCallPackageUI iPCallPackageUI = this.f143094d;
        q83.e eVar = iPCallPackageUI.f142649n;
        eVar.f360762h++;
        eVar.b();
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(iPCallPackageUI.getContext(), com.tencent.mm.plugin.ipcall.ui.IPCallRechargeUI.class);
        com.tencent.mm.plugin.ipcall.ui.IPCallPackageUI iPCallPackageUI2 = this.f143094d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(iPCallPackageUI2, arrayList.toArray(), "com/tencent/mm/plugin/ipcall/ui/IPCallPackageUI$4", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        iPCallPackageUI2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(iPCallPackageUI2, "com/tencent/mm/plugin/ipcall/ui/IPCallPackageUI$4", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        iPCallPackageUI.finish();
    }
}
