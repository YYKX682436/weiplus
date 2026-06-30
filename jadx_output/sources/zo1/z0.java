package zo1;

/* loaded from: classes5.dex */
public final class z0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f474834d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.pkg.CreatePackageUI f474835e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ po1.d f474836f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f474837g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f474838h;

    public z0(com.tencent.mm.ui.widget.dialog.u3 u3Var, com.tencent.mm.plugin.backup.roambackup.ui.pkg.CreatePackageUI createPackageUI, po1.d dVar, int i17, long j17) {
        this.f474834d = u3Var;
        this.f474835e = createPackageUI;
        this.f474836f = dVar;
        this.f474837g = i17;
        this.f474838h = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f474834d.dismiss();
        com.tencent.mm.plugin.backup.roambackup.ui.pkg.CreatePackageUI createPackageUI = this.f474835e;
        android.widget.Button button = createPackageUI.f92822n;
        if (button == null) {
            kotlin.jvm.internal.o.o("createBtn");
            throw null;
        }
        button.setEnabled(true);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("createBackupPackage done, device.deviceId = ");
        po1.d dVar = this.f474836f;
        sb6.append(dVar.f357295a);
        com.tencent.mars.xlog.Log.i("MicroMsg.CreatePackageUI", sb6.toString());
        if (this.f474837g == 0) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("deviceId", dVar.f357295a);
            intent.putExtra("packageId", this.f474838h);
            createPackageUI.setResult(-1, intent);
            createPackageUI.finish();
            return;
        }
        int size = com.tencent.mm.plugin.backup.roambackup.r0.f92684a.h(false).size();
        com.tencent.mars.xlog.Log.i("MicroMsg.CreatePackageUI", "Create package failed, count of packages is " + size);
        if (size >= 20) {
            int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(createPackageUI);
            e4Var.d(com.tencent.mm.R.string.f492857mx5);
            e4Var.c();
        }
    }
}
