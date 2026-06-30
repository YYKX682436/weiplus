package zo1;

/* loaded from: classes5.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.pkg.BackupRangeManagerUI f474575d;

    public d(com.tencent.mm.plugin.backup.roambackup.ui.pkg.BackupRangeManagerUI backupRangeManagerUI) {
        this.f474575d = backupRangeManagerUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/pkg/BackupRangeManagerUI$onCreate$11$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupRangeManagerUI", "on endTime timeSubMenu clicked");
        com.tencent.mm.plugin.backup.roambackup.ui.pkg.BackupRangeManagerUI backupRangeManagerUI = this.f474575d;
        com.tencent.mm.plugin.backup.roambackup.ui.pkg.BackupRangeManagerUI.U6(backupRangeManagerUI, false);
        backupRangeManagerUI.V6();
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/pkg/BackupRangeManagerUI$onCreate$11$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
