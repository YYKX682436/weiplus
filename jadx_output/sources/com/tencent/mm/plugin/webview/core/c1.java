package com.tencent.mm.plugin.webview.core;

/* loaded from: classes7.dex */
public final class c1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f181766d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f181767e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.core.h1 f181768f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f181769g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f181770h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f181771i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f181772m;

    public c1(java.lang.String str, int i17, com.tencent.mm.plugin.webview.core.h1 h1Var, java.lang.String str2, java.lang.String str3, int i18, int i19) {
        this.f181766d = str;
        this.f181767e = i17;
        this.f181768f = h1Var;
        this.f181769g = str2;
        this.f181770h = str3;
        this.f181771i = i18;
        this.f181772m = i19;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.net.Uri uri;
        java.lang.String str;
        java.lang.String str2 = this.f181766d;
        try {
            uri = android.net.Uri.parse(str2);
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebPageErrorMonitor", "onReceivedError, parse uri error:" + str2);
            uri = null;
        }
        if (uri == null || (str = uri.getHost()) == null) {
            str = "";
        }
        java.lang.String str3 = str;
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f181767e);
        com.tencent.mm.plugin.webview.core.h1 h1Var = this.f181768f;
        g0Var.d(22086, 4, valueOf, str3, com.tencent.mm.plugin.webview.core.h1.a(h1Var, str2), com.tencent.mm.plugin.webview.core.h1.a(h1Var, this.f181769g), 1, this.f181770h, java.lang.Integer.valueOf(this.f181771i), java.lang.Integer.valueOf(this.f181772m));
    }
}
