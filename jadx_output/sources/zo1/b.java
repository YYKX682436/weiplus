package zo1;

/* loaded from: classes5.dex */
public final class b implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.pkg.BackupRangeManagerUI f474548a;

    public b(com.tencent.mm.plugin.backup.roambackup.ui.pkg.BackupRangeManagerUI backupRangeManagerUI) {
        this.f474548a = backupRangeManagerUI;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public final void a(boolean z17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupRangeManagerUI", "onBackPressed, isOk=" + z17);
        com.tencent.mm.plugin.backup.roambackup.ui.pkg.BackupRangeManagerUI backupRangeManagerUI = this.f474548a;
        if (z17) {
            com.tencent.mm.plugin.backup.roambackup.ui.pkg.BackupRangeManagerUI.T6(backupRangeManagerUI);
        } else {
            java.util.Calendar calendar = com.tencent.mm.plugin.backup.roambackup.ui.pkg.BackupRangeManagerUI.f92784t;
            backupRangeManagerUI.W6();
        }
    }
}
