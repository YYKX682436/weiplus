package zo1;

/* loaded from: classes5.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.pkg.BackupRangeManagerUI f474694d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.tencent.mm.plugin.backup.roambackup.ui.pkg.BackupRangeManagerUI backupRangeManagerUI) {
        super(1);
        this.f474694d = backupRangeManagerUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.tencent.mm.plugin.backup.roambackup.ui.pkg.BackupRangeManagerUI backupRangeManagerUI = this.f474694d;
        android.content.Intent intent = backupRangeManagerUI.getIntent();
        com.tencent.mm.plugin.backup.roambackup.storage.entity.BackupRangeInfo backupRangeInfo = backupRangeManagerUI.f92787f;
        if (backupRangeInfo == null) {
            kotlin.jvm.internal.o.o("rangeInfo");
            throw null;
        }
        intent.putExtra("convParcelRange", backupRangeInfo);
        backupRangeManagerUI.setResult(-1, backupRangeManagerUI.getIntent());
        com.tencent.mm.plugin.backup.roambackup.y1 y1Var = booleanValue ? com.tencent.mm.plugin.backup.roambackup.y1.f92951s : com.tencent.mm.plugin.backup.roambackup.y1.f92950r;
        com.tencent.mm.plugin.backup.roambackup.a2 a2Var = com.tencent.mm.plugin.backup.roambackup.a2.f92567a;
        com.tencent.mm.plugin.backup.roambackup.storage.entity.BackupRangeInfo backupRangeInfo2 = backupRangeManagerUI.f92787f;
        if (backupRangeInfo2 == null) {
            kotlin.jvm.internal.o.o("rangeInfo");
            throw null;
        }
        com.tencent.mm.plugin.backup.roambackup.a2.a(a2Var, y1Var, null, null, null, backupRangeInfo2, null, 46, null);
        backupRangeManagerUI.W6();
        return jz5.f0.f302826a;
    }
}
