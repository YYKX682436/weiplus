package zo1;

/* loaded from: classes5.dex */
public final class t1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f474773d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.pkg.CreatePackageUI f474774e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(kotlin.jvm.internal.h0 h0Var, com.tencent.mm.plugin.backup.roambackup.ui.pkg.CreatePackageUI createPackageUI) {
        super(0);
        this.f474773d = h0Var;
        this.f474774e = createPackageUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.backup.roambackup.a2 a2Var = com.tencent.mm.plugin.backup.roambackup.a2.f92567a;
        com.tencent.mm.plugin.backup.roambackup.y1 y1Var = com.tencent.mm.plugin.backup.roambackup.y1.f92946p;
        po1.d dVar = (po1.d) this.f474773d.f310123d;
        com.tencent.mm.plugin.backup.roambackup.ui.pkg.CreatePackageUI createPackageUI = this.f474774e;
        com.tencent.mm.plugin.backup.roambackup.storage.entity.BackupRangeInfo backupRangeInfo = createPackageUI.f92826r;
        if (backupRangeInfo != null) {
            com.tencent.mm.plugin.backup.roambackup.a2.a(a2Var, y1Var, null, null, dVar, backupRangeInfo, new zo1.s1(createPackageUI), 6, null);
            return jz5.f0.f302826a;
        }
        kotlin.jvm.internal.o.o("rangeInfo");
        throw null;
    }
}
