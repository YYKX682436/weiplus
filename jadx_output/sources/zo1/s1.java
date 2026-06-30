package zo1;

/* loaded from: classes5.dex */
public final class s1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.pkg.CreatePackageUI f474765d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(com.tencent.mm.plugin.backup.roambackup.ui.pkg.CreatePackageUI createPackageUI) {
        super(1);
        this.f474765d = createPackageUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.autogen.mmdata.rpt.RoamBackupRecoverReport28098Struct it = (com.tencent.mm.autogen.mmdata.rpt.RoamBackupRecoverReport28098Struct) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.backup.roambackup.ui.pkg.CreatePackageUI createPackageUI = this.f474765d;
        it.f60071i = createPackageUI.f92825q & 1;
        it.f60086x = createPackageUI.f92824p;
        return jz5.f0.f302826a;
    }
}
