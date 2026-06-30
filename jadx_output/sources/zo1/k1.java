package zo1;

/* loaded from: classes5.dex */
public final class k1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.pkg.CreatePackageUI f474664d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(com.tencent.mm.plugin.backup.roambackup.ui.pkg.CreatePackageUI createPackageUI) {
        super(1);
        this.f474664d = createPackageUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        com.tencent.mm.plugin.backup.roambackup.ui.pkg.CreatePackageUI createPackageUI = this.f474664d;
        createPackageUI.f92825q = intValue;
        if ((intValue & 1) == 1) {
            com.tencent.mm.plugin.backup.roambackup.storage.entity.BackupRangeInfo backupRangeInfo = createPackageUI.f92826r;
            if (backupRangeInfo == null) {
                kotlin.jvm.internal.o.o("rangeInfo");
                throw null;
            }
            backupRangeInfo.f92734h = 0L;
            createPackageUI.X6();
        }
        createPackageUI.W6();
        return jz5.f0.f302826a;
    }
}
