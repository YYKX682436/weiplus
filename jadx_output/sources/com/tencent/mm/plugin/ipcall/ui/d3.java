package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes15.dex */
public class d3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.f3 f142780d;

    public d3(com.tencent.mm.plugin.ipcall.ui.f3 f3Var) {
        this.f142780d = f3Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ipcall/ui/IPCallPackageUI$PackageAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int intValue = ((java.lang.Integer) view.getTag()).intValue();
        com.tencent.mm.plugin.ipcall.ui.f3 f3Var = this.f142780d;
        r45.p57 p57Var = (r45.p57) f3Var.getItem(intValue);
        if (p57Var == null || com.tencent.mm.sdk.platformtools.t8.K0(p57Var.f382781m)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.IPCallPackageUI", "buyBtnClick: proToBuy is null");
            yj0.a.h(this, "com/tencent/mm/plugin/ipcall/ui/IPCallPackageUI$PackageAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        f3Var.f142826e.f142649n.d();
        com.tencent.mm.plugin.ipcall.ui.IPCallPackageUI iPCallPackageUI = f3Var.f142826e;
        q83.e eVar = iPCallPackageUI.f142649n;
        eVar.f360757c++;
        eVar.f360761g = p57Var.f382781m;
        db5.e1.C(iPCallPackageUI, iPCallPackageUI.getString(com.tencent.mm.R.string.g5p, p57Var.f382776e, p57Var.f382775d), f3Var.f142826e.getString(com.tencent.mm.R.string.g5q), f3Var.f142826e.getString(com.tencent.mm.R.string.g5n), f3Var.f142826e.getString(com.tencent.mm.R.string.g5o), false, new com.tencent.mm.plugin.ipcall.ui.b3(this, p57Var), new com.tencent.mm.plugin.ipcall.ui.c3(this));
        yj0.a.h(this, "com/tencent/mm/plugin/ipcall/ui/IPCallPackageUI$PackageAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
