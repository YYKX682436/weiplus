package zo1;

/* loaded from: classes5.dex */
public final class x4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectPackageUI f474823d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4(com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectPackageUI selectPackageUI) {
        super(1);
        this.f474823d = selectPackageUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.ArrayList pkgs = (java.util.ArrayList) obj;
        kotlin.jvm.internal.o.g(pkgs, "pkgs");
        com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectPackageUI.Z6(this.f474823d, pkgs.isEmpty());
        return jz5.f0.f302826a;
    }
}
