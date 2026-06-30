package ku4;

/* loaded from: classes7.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f312520d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f312521e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f312522f;

    public k(java.lang.String str, java.lang.String str2, int i17) {
        this.f312520d = str;
        this.f312521e = str2;
        this.f312522f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str = this.f312520d;
        try {
            boolean j17 = com.tencent.mm.vfs.w6.j(str);
            int i17 = this.f312522f;
            java.lang.String appId = this.f312521e;
            if (j17) {
                com.tencent.mm.plugin.appbrand.appcache.y8 y8Var = new com.tencent.mm.plugin.appbrand.appcache.y8(str);
                y8Var.a();
                int b17 = com.tencent.mm.plugin.webview.webcompt.a.b(y8Var);
                kotlin.jvm.internal.o.g(appId, "appId");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(20780, appId, 0, java.lang.Integer.valueOf(b17), 0, java.lang.Integer.valueOf(i17), 1);
            } else {
                kotlin.jvm.internal.o.g(appId, "appId");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(20780, appId, 0, 0, 3, java.lang.Integer.valueOf(i17), 1);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebCanvasStorageLogic", e17, "readPkgVersionAndReport exception", new java.lang.Object[0]);
        }
    }
}
