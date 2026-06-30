package zo1;

/* loaded from: classes5.dex */
public final class o implements com.tencent.mm.ui.widget.picker.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f474709a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.pkg.BackupRangeManagerUI f474710b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.l f474711c;

    public o(boolean z17, com.tencent.mm.plugin.backup.roambackup.ui.pkg.BackupRangeManagerUI backupRangeManagerUI, yz5.l lVar) {
        this.f474709a = z17;
        this.f474710b = backupRangeManagerUI;
        this.f474711c = lVar;
    }

    @Override // com.tencent.mm.ui.widget.picker.n
    public final void onResult(boolean z17, int i17, int i18, int i19) {
        if (z17) {
            boolean z18 = this.f474709a;
            com.tencent.mm.plugin.backup.roambackup.ui.pkg.BackupRangeManagerUI backupRangeManagerUI = this.f474710b;
            if (i17 != 1 || z18) {
                java.util.Calendar calendar = java.util.Calendar.getInstance();
                calendar.set(i17, i18 - 1, i19);
                this.f474711c.invoke(calendar);
                if (z18) {
                    backupRangeManagerUI.f92797s = true;
                    com.tencent.mm.plugin.backup.roambackup.storage.entity.BackupRangeInfo backupRangeInfo = backupRangeManagerUI.f92787f;
                    if (backupRangeInfo == null) {
                        kotlin.jvm.internal.o.o("rangeInfo");
                        throw null;
                    }
                    backupRangeInfo.f92733g = calendar.getTimeInMillis();
                    android.widget.TextView textView = backupRangeManagerUI.f92795q;
                    if (textView == null) {
                        kotlin.jvm.internal.o.o("startTimeTv");
                        throw null;
                    }
                    textView.setText(backupRangeManagerUI.getString(com.tencent.mm.R.string.a7h, java.lang.Integer.valueOf(calendar.get(1)), java.lang.Integer.valueOf(calendar.get(2) + 1), java.lang.Integer.valueOf(calendar.get(5))));
                } else {
                    com.tencent.mm.plugin.backup.roambackup.storage.entity.BackupRangeInfo backupRangeInfo2 = backupRangeManagerUI.f92787f;
                    if (backupRangeInfo2 == null) {
                        kotlin.jvm.internal.o.o("rangeInfo");
                        throw null;
                    }
                    backupRangeInfo2.f92734h = calendar.getTimeInMillis();
                    android.widget.TextView textView2 = backupRangeManagerUI.f92796r;
                    if (textView2 == null) {
                        kotlin.jvm.internal.o.o("endTimeTv");
                        throw null;
                    }
                    textView2.setText(backupRangeManagerUI.getString(com.tencent.mm.R.string.a7h, java.lang.Integer.valueOf(calendar.get(1)), java.lang.Integer.valueOf(calendar.get(2) + 1), java.lang.Integer.valueOf(calendar.get(5))));
                }
            } else {
                com.tencent.mm.plugin.backup.roambackup.storage.entity.BackupRangeInfo backupRangeInfo3 = backupRangeManagerUI.f92787f;
                if (backupRangeInfo3 == null) {
                    kotlin.jvm.internal.o.o("rangeInfo");
                    throw null;
                }
                backupRangeInfo3.f92734h = 0L;
                android.widget.TextView textView3 = backupRangeManagerUI.f92796r;
                if (textView3 == null) {
                    kotlin.jvm.internal.o.o("endTimeTv");
                    throw null;
                }
                textView3.setText(com.tencent.mm.R.string.mz_);
            }
            java.util.Calendar calendar2 = com.tencent.mm.plugin.backup.roambackup.ui.pkg.BackupRangeManagerUI.f92784t;
            backupRangeManagerUI.V6();
        }
    }
}
