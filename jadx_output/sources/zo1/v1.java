package zo1;

/* loaded from: classes5.dex */
public final class v1 implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.pkg.CreatePackageUI f474796a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ po1.d f474797b;

    public v1(com.tencent.mm.plugin.backup.roambackup.ui.pkg.CreatePackageUI createPackageUI, po1.d dVar) {
        this.f474796a = createPackageUI;
        this.f474797b = dVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public final void a(boolean z17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CreatePackageUI", "[onVolumeMounted] user click is " + z17);
        if (z17) {
            com.tencent.mm.plugin.backup.roambackup.ui.pkg.CreatePackageUI activity = this.f474796a;
            zo1.u1 u1Var = new zo1.u1(activity);
            kotlin.jvm.internal.o.g(activity, "activity");
            po1.d deviceInfo = this.f474797b;
            kotlin.jvm.internal.o.g(deviceInfo, "deviceInfo");
            android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.tencent.mm.plugin.backup.roambackup.ui.permission.PermissionRequestUI.class);
            intent.putExtra("deviceInfo", deviceInfo.c());
            ((com.tencent.mm.ui.bd) activity.startActivityForResult(intent)).f197877a = new to1.e(u1Var);
        }
    }
}
