package zo1;

/* loaded from: classes5.dex */
public final class f2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.pkg.PackageDeleteConfirmUI f474604d;

    public f2(com.tencent.mm.plugin.backup.roambackup.ui.pkg.PackageDeleteConfirmUI packageDeleteConfirmUI) {
        this.f474604d = packageDeleteConfirmUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/pkg/PackageDeleteConfirmUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("On delete btn clicked, pkgId=");
        com.tencent.mm.plugin.backup.roambackup.ui.pkg.PackageDeleteConfirmUI packageDeleteConfirmUI = this.f474604d;
        sb6.append(packageDeleteConfirmUI.f92829d);
        sb6.append(", deviceId=");
        po1.d dVar = packageDeleteConfirmUI.f92831f;
        if (dVar == null) {
            kotlin.jvm.internal.o.o("deviceInfo");
            throw null;
        }
        sb6.append(dVar.f357295a);
        com.tencent.mars.xlog.Log.i("PackageDeleteConfirmUI", sb6.toString());
        com.tencent.wechat.aff.affroam.g gVar = packageDeleteConfirmUI.f92830e;
        if (gVar == null) {
            kotlin.jvm.internal.o.o("pkgInfo");
            throw null;
        }
        com.tencent.wechat.aff.affroam.h hVar = gVar.f215837o;
        if (hVar.f215839e == 0) {
            if (gVar == null) {
                kotlin.jvm.internal.o.o("pkgInfo");
                throw null;
            }
            if (hVar.f215838d == 0) {
                com.tencent.mars.xlog.Log.i("PackageDeleteConfirmUI", "Delete package directly, pkgId=" + packageDeleteConfirmUI.f92829d);
                com.tencent.mm.plugin.backup.roambackup.ui.pkg.PackageDeleteConfirmUI.T6(packageDeleteConfirmUI);
                yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/pkg/PackageDeleteConfirmUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }
        int i17 = packageDeleteConfirmUI.f92836n + 1;
        packageDeleteConfirmUI.f92836n = i17;
        packageDeleteConfirmUI.getClass();
        com.tencent.mm.ui.widget.dialog.y1 y1Var = new com.tencent.mm.ui.widget.dialog.y1(packageDeleteConfirmUI);
        android.view.View inflate = android.view.LayoutInflater.from(packageDeleteConfirmUI).inflate(com.tencent.mm.R.layout.f488714e46, (android.view.ViewGroup) null);
        ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.t3s)).setOnClickListener(new zo1.i2(packageDeleteConfirmUI, y1Var));
        zo1.j2 j2Var = new zo1.j2(i17, packageDeleteConfirmUI, y1Var);
        com.tencent.mm.plugin.backup.roambackup.u uVar = com.tencent.mm.plugin.backup.roambackup.u.f92737a;
        po1.d dVar2 = packageDeleteConfirmUI.f92831f;
        if (dVar2 == null) {
            kotlin.jvm.internal.o.o("deviceInfo");
            throw null;
        }
        com.tencent.wechat.aff.affroam.o1 c17 = uVar.c(dVar2.f357295a);
        if (c17 == null) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("Fail to get device manager by deviceId=");
            po1.d dVar3 = packageDeleteConfirmUI.f92831f;
            if (dVar3 == null) {
                kotlin.jvm.internal.o.o("deviceInfo");
                throw null;
            }
            sb7.append(dVar3.f357295a);
            com.tencent.mars.xlog.Log.e("PackageDeleteConfirmUI", sb7.toString());
            j2Var.invoke(java.lang.Boolean.FALSE);
        } else {
            c17.a(new zo1.d2(j2Var));
        }
        y1Var.k(inflate);
        y1Var.s();
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/pkg/PackageDeleteConfirmUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
