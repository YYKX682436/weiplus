package com.tencent.mm.plugin.webview.core;

/* loaded from: classes7.dex */
public final class e1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.xweb.x0 f181792d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.core.h1 f181793e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.xweb.y0 f181794f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f181795g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f181796h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f181797i;

    public e1(com.tencent.xweb.x0 x0Var, com.tencent.mm.plugin.webview.core.h1 h1Var, com.tencent.xweb.y0 y0Var, java.lang.String str, int i17, int i18) {
        this.f181792d = x0Var;
        this.f181793e = h1Var;
        this.f181794f = y0Var;
        this.f181795g = str;
        this.f181796h = i17;
        this.f181797i = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String path;
        com.tencent.xweb.x0 x0Var = this.f181792d;
        if (!x0Var.isForMainFrame()) {
            android.net.Uri url = x0Var.getUrl();
            boolean z17 = false;
            if (url != null && (path = url.getPath()) != null && r26.i0.n(path, ".ico", false)) {
                z17 = true;
            }
            if (z17) {
                return;
            }
        }
        java.lang.String host = x0Var.getUrl().getHost();
        if (host == null) {
            host = "";
        }
        java.lang.String str = host;
        android.net.Uri url2 = x0Var.getUrl();
        java.lang.String uri = url2 != null ? url2.toString() : null;
        com.tencent.mm.plugin.webview.core.h1 h1Var = this.f181793e;
        java.lang.String a17 = com.tencent.mm.plugin.webview.core.h1.a(h1Var, uri);
        com.tencent.xweb.y0 y0Var = this.f181794f;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(22086, 2, java.lang.Integer.valueOf(y0Var != null ? y0Var.f220623c : -1), str, a17, com.tencent.mm.plugin.webview.core.h1.a(h1Var, y0Var != null ? y0Var.f220624d : null), java.lang.Integer.valueOf(x0Var.isForMainFrame() ? 1 : 0), this.f181795g, java.lang.Integer.valueOf(this.f181796h), java.lang.Integer.valueOf(this.f181797i));
    }
}
