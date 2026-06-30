package zo1;

/* loaded from: classes5.dex */
public final class q1 implements ro1.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f474743a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f474744b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.a f474745c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.pkg.CreatePackageUI f474746d;

    public q1(com.tencent.mm.ui.widget.dialog.u3 u3Var, kotlin.jvm.internal.h0 h0Var, yz5.a aVar, com.tencent.mm.plugin.backup.roambackup.ui.pkg.CreatePackageUI createPackageUI) {
        this.f474743a = u3Var;
        this.f474744b = h0Var;
        this.f474745c = aVar;
        this.f474746d = createPackageUI;
    }

    @Override // ro1.h
    public void a(java.lang.String deviceId) {
        kotlin.jvm.internal.o.g(deviceId, "deviceId");
        com.tencent.mm.ui.widget.dialog.u3 waitDialog = this.f474743a;
        waitDialog.dismiss();
        po1.d e17 = ro1.v.f398014a.e(deviceId);
        kotlin.jvm.internal.o.d(e17);
        kotlin.jvm.internal.h0 h0Var = this.f474744b;
        h0Var.f310123d = e17;
        com.tencent.mars.xlog.Log.e("MicroMsg.CreatePackageUI", "Bind new device=" + h0Var.f310123d + " successful.");
        this.f474745c.invoke();
        po1.d dVar = (po1.d) h0Var.f310123d;
        kotlin.jvm.internal.o.f(waitDialog, "$waitDialog");
        com.tencent.mm.plugin.backup.roambackup.ui.pkg.CreatePackageUI.U6(this.f474746d, dVar, waitDialog);
    }

    @Override // ro1.h
    public void onFailed(int i17) {
        com.tencent.mars.xlog.Log.e("MicroMsg.CreatePackageUI", "Bind new device=" + this.f474744b.f310123d + " failed.");
        com.tencent.mm.plugin.backup.roambackup.ui.pkg.CreatePackageUI createPackageUI = this.f474746d;
        android.widget.Button button = createPackageUI.f92822n;
        if (button == null) {
            kotlin.jvm.internal.o.o("createBtn");
            throw null;
        }
        button.setEnabled(true);
        this.f474743a.dismiss();
        this.f474745c.invoke();
        com.tencent.mars.xlog.Log.i("MicroMsg.CreatePackageUI", "[onFailed] err=" + i17);
        if (i17 != -2) {
            int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(createPackageUI);
            e4Var.d(com.tencent.mm.R.string.mxr);
            e4Var.c();
        }
    }
}
