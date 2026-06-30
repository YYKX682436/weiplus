package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f185143d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.net.Uri f185144e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.vfs.r6 f185145f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f185146g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f185147h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f185148i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f185149m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f185150n;

    public h(kotlin.jvm.internal.h0 h0Var, android.net.Uri uri, com.tencent.mm.vfs.r6 r6Var, boolean z17, boolean z18, com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, int i17, boolean z19) {
        this.f185143d = h0Var;
        this.f185144e = uri;
        this.f185145f = r6Var;
        this.f185146g = z17;
        this.f185147h = z18;
        this.f185148i = c1Var;
        this.f185149m = i17;
        this.f185150n = z19;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        kotlin.jvm.internal.h0 h0Var = this.f185143d;
        boolean b17 = kotlin.jvm.internal.o.b(h0Var.f310123d, this.f185144e);
        boolean z17 = this.f185146g;
        if (b17) {
            str = this.f185145f.o();
            kotlin.jvm.internal.o.f(str, "getAbsolutePath(...)");
        } else {
            java.lang.String str2 = z17 ? "capture_video" : "capture_image";
            com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a("wcf://temp/wv_choose_media"));
            r6Var.J();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(str2);
            sb6.append('_');
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            sb6.append(java.lang.System.currentTimeMillis());
            com.tencent.mm.vfs.r6 r6Var2 = new com.tencent.mm.vfs.r6(r6Var, sb6.toString());
            r6Var2.k();
            java.lang.String o17 = r6Var2.o();
            kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
            com.tencent.mm.vfs.w6.c(((android.net.Uri) h0Var.f310123d).toString(), o17);
            str = o17;
        }
        boolean j17 = com.tencent.mm.vfs.w6.j(str);
        int i17 = this.f185149m;
        com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var = this.f185148i;
        if (!j17 || com.tencent.mm.vfs.w6.k(str) <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebView.ChooseMediaFromSystemHelper", "chooseFromCamera onActivityResult realFilePath(" + str + ") invalid");
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.webview.ui.tools.jsapi.f(c1Var, i17));
            return;
        }
        if (!this.f185147h && !z17) {
            android.util.DisplayMetrics displayMetrics = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDisplayMetrics();
            int max = java.lang.Math.max(displayMetrics.heightPixels, displayMetrics.widthPixels) * 2;
            int min = java.lang.Math.min(displayMetrics.heightPixels, displayMetrics.widthPixels) * 2;
            com.tencent.mm.plugin.appbrand.service.f5 f5Var = (com.tencent.mm.plugin.appbrand.service.f5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f5.class);
            java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = pu5.f.f358470a;
            if (max < 0) {
                max = 0;
            } else if (max > 4096) {
                max = 4096;
            }
            if (min < 0) {
                min = 0;
            } else if (min > 4096) {
                min = 4096;
            }
            java.lang.String fc6 = f5Var.fc(str, max, min, 100);
            kotlin.jvm.internal.o.f(fc6, "doCompressImageWithoutAccountRequired(...)");
            if (!(fc6.length() == 0) && com.tencent.mm.vfs.w6.j(fc6) && com.tencent.mm.vfs.w6.k(fc6) > 0) {
                str = fc6;
            }
        }
        com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem b18 = z17 ? com.tencent.mm.plugin.webview.model.m4.b(str) : com.tencent.mm.plugin.webview.model.m4.d(str);
        com.tencent.mm.plugin.webview.model.l4.f183002b.a(b18);
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.webview.ui.tools.jsapi.g(b18, c1Var, i17, this.f185150n));
    }
}
