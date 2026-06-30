package zo1;

/* loaded from: classes5.dex */
public final class x implements fo1.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.pkg.CheckPackageContentUI f474817a;

    public x(com.tencent.mm.plugin.backup.roambackup.ui.pkg.CheckPackageContentUI checkPackageContentUI) {
        this.f474817a = checkPackageContentUI;
    }

    @Override // fo1.o
    public final void a(fo1.n it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.backup.roambackup.ui.pkg.CheckPackageContentUI checkPackageContentUI = this.f474817a;
        com.tencent.mars.xlog.Log.w(checkPackageContentUI.f92799e, "Permission reauthorize result = " + it + '.');
        if (it == fo1.n.f264886f) {
            com.tencent.mm.plugin.backup.roambackup.b bVar = com.tencent.mm.plugin.backup.roambackup.b.f92568a;
            com.tencent.wechat.aff.affroam.g gVar = checkPackageContentUI.f92808q;
            if (gVar == null) {
                kotlin.jvm.internal.o.o("pkgInfo");
                throw null;
            }
            bVar.c(gVar.f215829d, com.tencent.mm.plugin.backup.roambackup.a.f92560d, null);
            android.content.Intent intent = new android.content.Intent(checkPackageContentUI, (java.lang.Class<?>) com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectPackageUI.class);
            intent.putExtra("expandCard", true);
            intent.putExtra("packageId", checkPackageContentUI.f92800f);
            com.tencent.mm.plugin.backup.roambackup.ui.pkg.CheckPackageContentUI checkPackageContentUI2 = this.f474817a;
            android.content.Intent intent2 = checkPackageContentUI2.getIntent();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent2);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(checkPackageContentUI2, arrayList.toArray(), "com/tencent/mm/plugin/backup/roambackup/ui/pkg/CheckPackageContentUI$checkPermission$1$1", "onResult", "(Lcom/tencent/mm/plugin/backup/roambackup/helper/RoamPermissionHelper$IReauthorizeCallback$ErrorCode;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            checkPackageContentUI2.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(checkPackageContentUI2, "com/tencent/mm/plugin/backup/roambackup/ui/pkg/CheckPackageContentUI$checkPermission$1$1", "onResult", "(Lcom/tencent/mm/plugin/backup/roambackup/helper/RoamPermissionHelper$IReauthorizeCallback$ErrorCode;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }
}
