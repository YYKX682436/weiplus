package zo1;

/* loaded from: classes5.dex */
public final class u1 implements ro1.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.pkg.CreatePackageUI f474781a;

    public u1(com.tencent.mm.plugin.backup.roambackup.ui.pkg.CreatePackageUI createPackageUI) {
        this.f474781a = createPackageUI;
    }

    @Override // ro1.h
    public void a(java.lang.String deviceId) {
        kotlin.jvm.internal.o.g(deviceId, "deviceId");
        com.tencent.mars.xlog.Log.i("MicroMsg.CreatePackageUI", "save new device successfully, deviceId=".concat(deviceId));
        po1.d e17 = ro1.v.f398014a.e(deviceId);
        kotlin.jvm.internal.o.d(e17);
        java.lang.ref.WeakReference weakReference = com.tencent.mm.plugin.backup.roambackup.ui.pkg.CreatePackageUI.f92814u;
        this.f474781a.Y6(e17);
    }

    @Override // ro1.h
    public void onFailed(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CreatePackageUI", "Fail to save new device");
    }
}
