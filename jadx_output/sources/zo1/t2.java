package zo1;

/* loaded from: classes5.dex */
public final class t2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.pkg.PackageManagerUI f474775d;

    public t2(com.tencent.mm.plugin.backup.roambackup.ui.pkg.PackageManagerUI packageManagerUI) {
        this.f474775d = packageManagerUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        int i17;
        android.content.Intent intent;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/pkg/PackageManagerUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.RoamReport28098", "start simple report for pageAction=" + com.tencent.mm.plugin.backup.roambackup.y1.M);
        com.tencent.mm.autogen.mmdata.rpt.RoamBackupRecoverReport28098Struct roamBackupRecoverReport28098Struct = new com.tencent.mm.autogen.mmdata.rpt.RoamBackupRecoverReport28098Struct();
        roamBackupRecoverReport28098Struct.f60066d = 8L;
        roamBackupRecoverReport28098Struct.f60067e = 3L;
        roamBackupRecoverReport28098Struct.k();
        com.tencent.mm.plugin.backup.roambackup.ui.pkg.PackageManagerUI packageManagerUI = this.f474775d;
        com.tencent.wechat.aff.affroam.g gVar = packageManagerUI.f92839e;
        if (gVar == null) {
            kotlin.jvm.internal.o.o("pkgInfo");
            throw null;
        }
        com.tencent.wechat.aff.affroam.h hVar = gVar.f215837o;
        if (hVar.f215839e <= 0) {
            i17 = com.tencent.mm.R.string.mzt;
        } else {
            if (gVar == null) {
                kotlin.jvm.internal.o.o("pkgInfo");
                throw null;
            }
            i17 = hVar.f215838d <= 0 ? com.tencent.mm.R.string.mzn : -1;
        }
        if (i17 > 0) {
            int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(packageManagerUI);
            e4Var.d(i17);
            e4Var.b(com.tencent.mm.R.raw.icons_filled_info);
            e4Var.c();
            yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/pkg/PackageManagerUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        packageManagerUI.getClass();
        int c17 = j62.e.g().c(new com.tencent.mm.repairer.config.roambackup.RepairerConfigRoamNewContactSelectUI());
        com.tencent.mars.xlog.Log.i("RoamBackupExpt", "Exp value of clicfg_roam_backup_new_contact_select_ui is " + c17);
        if (c17 == 1) {
            intent = new android.content.Intent(packageManagerUI.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.backup.roambackup.ui.pkg.RoamSelectContactUI.class);
            intent.putExtra("titile", packageManagerUI.getString(com.tencent.mm.R.string.mvn));
            intent.putExtra("contactListShowSize", true);
            intent.putExtra("contactListSortType", 2);
            intent.putExtra("reportPageId", 9L);
            com.tencent.wechat.aff.affroam.g gVar2 = packageManagerUI.f92839e;
            if (gVar2 == null) {
                kotlin.jvm.internal.o.o("pkgInfo");
                throw null;
            }
            intent.putExtra("packageId", gVar2.f215829d);
            intent.putExtra("contactListPushDownAnim", true);
            pf5.j0.a(intent, ap1.w.class);
            pf5.j0.a(intent, ap1.o0.class);
            pf5.j0.a(intent, ap1.x0.class);
            pf5.j0.a(intent, ap1.c1.class);
            pf5.j0.a(intent, ap1.f1.class);
            pf5.j0.a(intent, ap1.p1.class);
            pf5.j0.a(intent, ap1.u1.class);
            pf5.j0.a(intent, ap1.b2.class);
        } else {
            intent = new android.content.Intent(packageManagerUI.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.backup.roambackup.ui.pkg.CheckPackageContentUI.class);
            com.tencent.wechat.aff.affroam.g gVar3 = packageManagerUI.f92839e;
            if (gVar3 == null) {
                kotlin.jvm.internal.o.o("pkgInfo");
                throw null;
            }
            intent.putExtra("packageId", gVar3.f215829d);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(packageManagerUI, arrayList2.toArray(), "com/tencent/mm/plugin/backup/roambackup/ui/pkg/PackageManagerUI", "gotoContactSelectUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        packageManagerUI.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(packageManagerUI, "com/tencent/mm/plugin/backup/roambackup/ui/pkg/PackageManagerUI", "gotoContactSelectUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        packageManagerUI.overridePendingTransition(com.tencent.mm.R.anim.f477857df, com.tencent.mm.R.anim.f477729q);
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/pkg/PackageManagerUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
