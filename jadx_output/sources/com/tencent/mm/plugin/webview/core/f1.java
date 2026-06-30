package com.tencent.mm.plugin.webview.core;

/* loaded from: classes7.dex */
public final class f1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.net.http.SslError f181827d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.core.h1 f181828e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f181829f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f181830g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f181831h;

    public f1(android.net.http.SslError sslError, com.tencent.mm.plugin.webview.core.h1 h1Var, java.lang.String str, int i17, int i18) {
        this.f181827d = sslError;
        this.f181828e = h1Var;
        this.f181829f = str;
        this.f181830g = i17;
        this.f181831h = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.net.Uri uri;
        java.lang.String host;
        android.net.http.SslError sslError = this.f181827d;
        java.lang.String url = sslError.getUrl();
        if (url == null) {
            url = "";
        }
        try {
            uri = android.net.Uri.parse(url);
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebPageErrorMonitor", "onReceivedError, parse uri error:".concat(url));
            uri = null;
        }
        java.lang.String str = (uri == null || (host = uri.getHost()) == null) ? "" : host;
        int primaryError = sslError.getPrimaryError();
        android.net.http.SslCertificate certificate = sslError.getCertificate();
        java.lang.String sslCertificate = certificate != null ? certificate.toString() : null;
        com.tencent.mm.plugin.webview.core.h1 h1Var = this.f181828e;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(22086, 3, java.lang.Integer.valueOf(primaryError), str, com.tencent.mm.plugin.webview.core.h1.a(h1Var, url), com.tencent.mm.plugin.webview.core.h1.a(h1Var, sslCertificate), 1, this.f181829f, java.lang.Integer.valueOf(this.f181830g), java.lang.Integer.valueOf(this.f181831h));
    }
}
