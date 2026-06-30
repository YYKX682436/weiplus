package zx4;

/* loaded from: classes8.dex */
public final class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zx4.l0 f477126d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f477127e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.WebViewUI f477128f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f477129g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f477130h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f477131i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ zx4.l0 f477132m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ zx4.o f477133n;

    public f0(zx4.l0 l0Var, boolean z17, com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI, boolean z18, java.lang.String str, com.tencent.mm.ui.widget.dialog.u3 u3Var, zx4.l0 l0Var2, zx4.o oVar) {
        this.f477126d = l0Var;
        this.f477127e = z17;
        this.f477128f = webViewUI;
        this.f477129g = z18;
        this.f477130h = str;
        this.f477131i = u3Var;
        this.f477132m = l0Var2;
        this.f477133n = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String sb6;
        zx4.l0 l0Var = this.f477126d;
        boolean z17 = this.f477127e;
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI context = this.f477128f;
        boolean z18 = this.f477129g;
        java.lang.String exifInfo = this.f477130h;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f477131i;
        zx4.l0 l0Var2 = this.f477132m;
        zx4.n nVar = (zx4.n) this.f477133n;
        l0Var.getClass();
        if (z17) {
            com.tencent.mm.vfs.r6 j17 = com.tencent.mm.vfs.r6.j(context.getDir("webview", 0));
            if (j17 != null) {
                j17.J();
            }
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(j17 != null ? j17.o() : null);
            sb7.append("/webviewscpictemp");
            sb7.append(java.lang.System.currentTimeMillis());
            sb7.append(".png");
            sb6 = sb7.toString();
        } else {
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            ((ub0.r) ((vb0.o) i95.n0.c(vb0.o.class))).getClass();
            sb8.append(q75.c.d());
            sb8.append("webviewscpic");
            sb8.append(java.lang.System.currentTimeMillis());
            sb8.append(".png");
            sb6 = sb8.toString();
        }
        java.lang.String path = sb6;
        zx4.a0 a0Var = new zx4.a0(z17, l0Var, path, context, z18, u3Var);
        android.graphics.Bitmap bitmap = nVar.f477167a;
        zx4.z zVar = new zx4.z(l0Var, context, z18, u3Var);
        l0Var2.getClass();
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(exifInfo, "exifInfo");
        ((ku5.t0) ku5.t0.f312615d).g(new zx4.e0(bitmap, path, exifInfo, a0Var, zVar));
    }
}
