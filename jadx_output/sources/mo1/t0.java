package mo1;

/* loaded from: classes5.dex */
public final class t0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.roamlite.RoamLiteTaskDetailUI f330335d;

    public t0(com.tencent.mm.plugin.backup.roambackup.roamlite.RoamLiteTaskDetailUI roamLiteTaskDetailUI) {
        this.f330335d = roamLiteTaskDetailUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.content.Intent intent;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/roamlite/RoamLiteTaskDetailUI$updateStatus$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.ref.WeakReference weakReference = com.tencent.mm.plugin.backup.roambackup.roamlite.RoamLiteTaskDetailUI.f92712o;
        com.tencent.mars.xlog.Log.i("MM.Roam.RoamLiteTaskDetailUI", "try to get restore conversation list.");
        com.tencent.mm.plugin.backup.roambackup.roamlite.RoamLiteTaskDetailUI roamLiteTaskDetailUI = this.f330335d;
        long j17 = roamLiteTaskDetailUI.f92713d;
        roamLiteTaskDetailUI.getClass();
        int c17 = j62.e.g().c(new com.tencent.mm.repairer.config.roambackup.RepairerConfigRoamNewContactSelectUI());
        com.tencent.mars.xlog.Log.i("RoamBackupExpt", "Exp value of clicfg_roam_backup_new_contact_select_ui is " + c17);
        if (c17 == 1) {
            intent = new android.content.Intent(roamLiteTaskDetailUI.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.backup.roambackup.ui.pkg.RoamSelectContactUI.class);
            intent.putExtra("titile", roamLiteTaskDetailUI.getString(com.tencent.mm.R.string.mvn));
            intent.putExtra("contactListShowSize", true);
            intent.putExtra("contactListSortType", 2);
            com.tencent.mm.plugin.backup.roambackup.y1 y1Var = com.tencent.mm.plugin.backup.roambackup.y1.f92938f;
            intent.putExtra("reportPageId", 11L);
            intent.putExtra("packageId", j17);
            intent.putExtra("contactListPushDownAnim", true);
            pf5.j0.a(intent, ap1.w.class);
            pf5.j0.a(intent, ap1.o0.class);
            pf5.j0.a(intent, ap1.x0.class);
            pf5.j0.a(intent, ap1.x1.class);
            pf5.j0.a(intent, ap1.f1.class);
            pf5.j0.a(intent, ap1.p1.class);
            pf5.j0.a(intent, ap1.u1.class);
            pf5.j0.a(intent, ap1.b2.class);
        } else {
            intent = new android.content.Intent(roamLiteTaskDetailUI, (java.lang.Class<?>) com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectContactUI.class);
            intent.putExtra("contactAdapterClass", com.tencent.mm.plugin.backup.roambackup.ui.component.BackedUpConversationAdapter.class.getName());
            intent.putExtra("packageId", j17);
            com.tencent.mm.plugin.backup.roambackup.y1 y1Var2 = com.tencent.mm.plugin.backup.roambackup.y1.f92938f;
            intent.putExtra("reportPageId", 11L);
        }
        roamLiteTaskDetailUI.startActivityForResult(intent, 126);
        roamLiteTaskDetailUI.overridePendingTransition(com.tencent.mm.R.anim.f477857df, com.tencent.mm.R.anim.f477729q);
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/roamlite/RoamLiteTaskDetailUI$updateStatus$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
