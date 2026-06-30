package zo1;

/* loaded from: classes5.dex */
public final class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.pkg.BackupRangeManagerUI f474629d;

    public h(com.tencent.mm.plugin.backup.roambackup.ui.pkg.BackupRangeManagerUI backupRangeManagerUI) {
        this.f474629d = backupRangeManagerUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/pkg/BackupRangeManagerUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.backup.roambackup.ui.pkg.BackupRangeManagerUI backupRangeManagerUI = this.f474629d;
        com.tencent.mm.plugin.backup.roambackup.storage.entity.BackupRangeInfo backupRangeInfo = backupRangeManagerUI.f92787f;
        if (backupRangeInfo == null) {
            kotlin.jvm.internal.o.o("rangeInfo");
            throw null;
        }
        backupRangeInfo.f92730d = po1.b.f357291f;
        backupRangeManagerUI.X6();
        backupRangeManagerUI.V6();
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/pkg/BackupRangeManagerUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
