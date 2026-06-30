package zw1;

/* loaded from: classes8.dex */
public final class j6 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI f476682d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ww1.a3 f476683e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f476684f;

    public j6(com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI, ww1.a3 a3Var, int i17) {
        this.f476682d = walletCollectQrCodeUI;
        this.f476683e = a3Var;
        this.f476684f = i17;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        ww1.a3 a3Var = this.f476683e;
        int i18 = this.f476684f;
        if (i17 == 0) {
            this.f476682d.M7(a3Var, i18);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(25983, 23, java.lang.Integer.valueOf(i18));
            return;
        }
        if (i17 != 1) {
            return;
        }
        r45.i34 a17 = zw1.n6.f476744a.a(a3Var);
        if (a17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletCollectQrCodeUIHelp", "getCurrentJumpInfo returned null");
            return;
        }
        r45.uk4 uk4Var = a17.f376700e;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("navigateToAddReceiveOptionsPage - username: ");
        sb6.append(uk4Var != null ? uk4Var.f387434g : null);
        sb6.append(", path: ");
        sb6.append(uk4Var != null ? uk4Var.f387435h : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeUIHelp", sb6.toString());
        if ((uk4Var != null ? uk4Var.f387435h : null) == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletCollectQrCodeUIHelp", "navigateToAddReceiveOptionsPage: waapp_path is null");
        } else {
            com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent();
            java.lang.String str = uk4Var.f387434g;
            am.nx nxVar = startAppBrandUIFromOuterEvent.f54857g;
            nxVar.f7466a = str;
            nxVar.f7467b = uk4Var.f387435h;
            startAppBrandUIFromOuterEvent.e();
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(25983, 24, java.lang.Integer.valueOf(i18));
    }
}
