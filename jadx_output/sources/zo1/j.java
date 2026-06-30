package zo1;

/* loaded from: classes5.dex */
public final class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.pkg.BackupRangeManagerUI f474651d;

    public j(com.tencent.mm.plugin.backup.roambackup.ui.pkg.BackupRangeManagerUI backupRangeManagerUI) {
        this.f474651d = backupRangeManagerUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.content.Intent intent;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/pkg/BackupRangeManagerUI$onCreate$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.util.Calendar calendar = com.tencent.mm.plugin.backup.roambackup.ui.pkg.BackupRangeManagerUI.f92784t;
        com.tencent.mm.plugin.backup.roambackup.ui.pkg.BackupRangeManagerUI backupRangeManagerUI = this.f474651d;
        backupRangeManagerUI.getClass();
        int c17 = j62.e.g().c(new com.tencent.mm.repairer.config.roambackup.RepairerConfigRoamNewContactSelectUI());
        com.tencent.mars.xlog.Log.i("RoamBackupExpt", "Exp value of clicfg_roam_backup_new_contact_select_ui is " + c17);
        if (c17 == 1) {
            intent = new android.content.Intent(backupRangeManagerUI, (java.lang.Class<?>) com.tencent.mm.plugin.backup.roambackup.ui.pkg.RoamSelectContactUI.class);
            if (backupRangeManagerUI.f92785d < 0) {
                intent.putExtra("contactListShowSize", true);
                intent.putExtra("contactListSortType", 3);
            } else {
                intent.putExtra("contactListShowSize", false);
                intent.putExtra("contactListSortType", 1);
            }
            intent.putExtra("titile", backupRangeManagerUI.getString(com.tencent.mm.R.string.mzg));
            com.tencent.mm.plugin.backup.roambackup.storage.entity.BackupRangeInfo backupRangeInfo = backupRangeManagerUI.f92787f;
            if (backupRangeInfo == null) {
                kotlin.jvm.internal.o.o("rangeInfo");
                throw null;
            }
            intent.putExtra("already_select_contact", (java.lang.String[]) backupRangeInfo.f92732f.toArray(new java.lang.String[0]));
            com.tencent.mm.plugin.backup.roambackup.y1 y1Var = com.tencent.mm.plugin.backup.roambackup.y1.f92938f;
            intent.putExtra("reportPageId", 4L);
            intent.putExtra("contactListPushDownAnim", true);
            pf5.j0.a(intent, ap1.g.class);
            pf5.j0.a(intent, ap1.o0.class);
            pf5.j0.a(intent, ap1.x0.class);
            pf5.j0.a(intent, ap1.x1.class);
            pf5.j0.a(intent, ap1.f1.class);
            pf5.j0.a(intent, ap1.p1.class);
            pf5.j0.a(intent, ap1.u1.class);
            pf5.j0.a(intent, ap1.b2.class);
        } else {
            intent = new android.content.Intent(backupRangeManagerUI, (java.lang.Class<?>) com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectContactUI.class);
            intent.putExtra("contactAdapterClass", com.tencent.mm.plugin.backup.roambackup.ui.component.AllConversationAdapter.class.getName());
            com.tencent.mm.plugin.backup.roambackup.storage.entity.BackupRangeInfo backupRangeInfo2 = backupRangeManagerUI.f92787f;
            if (backupRangeInfo2 == null) {
                kotlin.jvm.internal.o.o("rangeInfo");
                throw null;
            }
            intent.putExtra("already_select_contact", (java.lang.String[]) backupRangeInfo2.f92732f.toArray(new java.lang.String[0]));
            intent.putExtra("contactListShowSize", backupRangeManagerUI.f92785d < 0);
            com.tencent.mm.plugin.backup.roambackup.y1 y1Var2 = com.tencent.mm.plugin.backup.roambackup.y1.f92938f;
            intent.putExtra("reportPageId", 4L);
        }
        backupRangeManagerUI.startActivityForResult(intent, 126);
        backupRangeManagerUI.overridePendingTransition(com.tencent.mm.R.anim.f477857df, com.tencent.mm.R.anim.f477729q);
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/pkg/BackupRangeManagerUI$onCreate$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
