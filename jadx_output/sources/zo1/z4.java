package zo1;

/* loaded from: classes5.dex */
public final class z4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectPackageUI f474843d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z4(com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectPackageUI selectPackageUI) {
        super(1);
        this.f474843d = selectPackageUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.ArrayList pkgs = (java.util.ArrayList) obj;
        kotlin.jvm.internal.o.g(pkgs, "pkgs");
        java.util.Iterator it = pkgs.iterator();
        while (it.hasNext()) {
            qo1.j1.f365523a.e(((com.tencent.wechat.aff.affroam.g) it.next()).f215829d, false);
        }
        zo1.x3 x3Var = com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectPackageUI.f92864q;
        com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectPackageUI selectPackageUI = this.f474843d;
        selectPackageUI.a7();
        com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectPackageUI.Z6(selectPackageUI, pkgs.isEmpty());
        return jz5.f0.f302826a;
    }
}
