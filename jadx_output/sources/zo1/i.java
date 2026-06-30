package zo1;

/* loaded from: classes5.dex */
public final class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.pkg.BackupRangeManagerUI f474639d;

    public i(com.tencent.mm.plugin.backup.roambackup.ui.pkg.BackupRangeManagerUI backupRangeManagerUI) {
        this.f474639d = backupRangeManagerUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/pkg/BackupRangeManagerUI$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.util.Calendar calendar = com.tencent.mm.plugin.backup.roambackup.ui.pkg.BackupRangeManagerUI.f92784t;
        com.tencent.mm.plugin.backup.roambackup.ui.pkg.BackupRangeManagerUI backupRangeManagerUI = this.f474639d;
        backupRangeManagerUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupRangeManagerUI", "goto select group");
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.backup.roambackup.storage.entity.BackupRangeInfo backupRangeInfo = backupRangeManagerUI.f92787f;
        if (backupRangeInfo == null) {
            kotlin.jvm.internal.o.o("rangeInfo");
            throw null;
        }
        com.tencent.mm.plugin.backup.roambackup.storage.entity.BackupRangeInfo backupRangeInfo2 = backupRangeManagerUI.f92787f;
        if (backupRangeInfo2 == null) {
            kotlin.jvm.internal.o.o("rangeInfo");
            throw null;
        }
        java.util.ArrayList<java.lang.String> arrayList2 = new java.util.ArrayList<>(backupRangeInfo2.f92731e.size());
        java.util.Iterator it = backupRangeInfo.f92731e.iterator();
        while (it.hasNext()) {
            arrayList2.add(java.lang.String.valueOf(((java.lang.Number) it.next()).intValue()));
        }
        intent.putStringArrayListExtra("label_id", arrayList2);
        intent.setClassName(backupRangeManagerUI, "com.tencent.mm.plugin.label.ui.ContactLabelSelectUI");
        backupRangeManagerUI.startActivityForResult(intent, 127);
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/pkg/BackupRangeManagerUI$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
