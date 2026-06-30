package com.tencent.mm.plugin.webview.core;

/* loaded from: classes7.dex */
public final class d1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f181777d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f181778e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.core.h1 f181779f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f181780g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f181781h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f181782i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f181783m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f181784n;

    public d1(java.lang.String str, int i17, com.tencent.mm.plugin.webview.core.h1 h1Var, java.lang.String str2, boolean z17, java.lang.String str3, int i18, int i19) {
        this.f181777d = str;
        this.f181778e = i17;
        this.f181779f = h1Var;
        this.f181780g = str2;
        this.f181781h = z17;
        this.f181782i = str3;
        this.f181783m = i18;
        this.f181784n = i19;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.net.Uri uri;
        java.lang.String str;
        java.lang.String str2 = this.f181777d;
        try {
            uri = android.net.Uri.parse(str2);
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebPageErrorMonitor", "onReceivedError, parse uri error:" + str2);
            uri = null;
        }
        if (uri == null || (str = uri.getHost()) == null) {
            str = "";
        }
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        com.tencent.mm.plugin.webview.core.h1 h1Var = this.f181779f;
        g0Var.d(22086, 1, java.lang.Integer.valueOf(this.f181778e), str, com.tencent.mm.plugin.webview.core.h1.a(h1Var, str2), com.tencent.mm.plugin.webview.core.h1.a(h1Var, this.f181780g), java.lang.Integer.valueOf(this.f181781h ? 1 : 0), this.f181782i, java.lang.Integer.valueOf(this.f181783m), java.lang.Integer.valueOf(this.f181784n));
    }
}
