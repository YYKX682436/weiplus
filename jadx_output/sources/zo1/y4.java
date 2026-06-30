package zo1;

/* loaded from: classes5.dex */
public final class y4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectPackageUI f474833d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4(com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectPackageUI selectPackageUI) {
        super(1);
        this.f474833d = selectPackageUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.ArrayList pkgs = (java.util.ArrayList) obj;
        kotlin.jvm.internal.o.g(pkgs, "pkgs");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectPackageUI selectPackageUI = this.f474833d;
        selectPackageUI.f92870i = currentTimeMillis;
        java.util.Iterator it = pkgs.iterator();
        while (it.hasNext()) {
            qo1.j1.f365523a.e(((com.tencent.wechat.aff.affroam.g) it.next()).f215829d, false);
        }
        selectPackageUI.a7();
        com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectPackageUI.Z6(selectPackageUI, pkgs.isEmpty());
        return jz5.f0.f302826a;
    }
}
