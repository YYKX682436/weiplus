package com.tencent.mm.plugin.webview.webcompt;

/* loaded from: classes8.dex */
public final class y1 {

    /* renamed from: a, reason: collision with root package name */
    public final nw4.n f187950a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f187951b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f187952c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f187953d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f187954e;

    public y1(nw4.n jsapi) {
        kotlin.jvm.internal.o.g(jsapi, "jsapi");
        this.f187950a = jsapi;
        this.f187951b = jz5.h.b(new com.tencent.mm.plugin.webview.webcompt.x1(this));
        this.f187952c = true;
        this.f187953d = "";
        this.f187954e = new java.util.HashMap();
        jz5.h.b(new com.tencent.mm.plugin.webview.webcompt.w1(this));
    }

    public final void a() {
        this.f187953d = "";
        this.f187952c = true;
        this.f187954e.clear();
        com.tencent.mm.plugin.webview.webcompt.f1 c17 = c();
        synchronized (c17) {
            com.tencent.mm.plugin.webview.webcompt.e h17 = com.tencent.mm.plugin.webview.webcompt.f1.f187797e.h();
            h17.f187784a.clear();
            h17.f187785b.clear();
            if (c17.f187813c) {
                c17.k().a(c17.f187812b);
            }
        }
    }

    public final void b(java.lang.String appId, java.lang.String url, java.util.LinkedList webCompts) {
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(webCompts, "webCompts");
        if (webCompts.isEmpty()) {
            com.tencent.mm.plugin.webview.webcompt.h0 h0Var = com.tencent.mm.plugin.webview.webcompt.f1.f187797e;
            com.tencent.mars.xlog.Log.w("MicroMsg.WebComponent", "webCompt is null");
            return;
        }
        o25.k2 k2Var = new o25.k2();
        if (this.f187954e.isEmpty() && (!webCompts.isEmpty())) {
            c().f187812b.a(com.tencent.mm.plugin.webview.webcompt.b.f187753q);
        }
        kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
        if (this.f187952c) {
            c0Var.f310112d = true;
        } else if (kotlin.jvm.internal.o.b(this.f187953d, appId)) {
            c().f187812b.a(com.tencent.mm.plugin.webview.webcompt.b.f187754r);
        } else {
            a();
            com.tencent.mm.plugin.webview.webcompt.f1 c17 = c();
            if (c17.f187813c) {
                pm0.v.X(new com.tencent.mm.plugin.webview.webcompt.z0(c17, "window.WeixinOpenTags && window.WeixinOpenTags.onClean()", com.tencent.mm.plugin.webview.webcompt.x0.f187946d));
                c17.f187812b.a(com.tencent.mm.plugin.webview.webcompt.b.f187752p);
            }
            c().f187812b.f187911a.clear();
        }
        this.f187953d = appId;
        this.f187952c = false;
        if (!webCompts.isEmpty()) {
            com.tencent.mm.plugin.webview.webcompt.h0 h0Var2 = com.tencent.mm.plugin.webview.webcompt.f1.f187797e;
            pm0.v.L("MicroMsg.WebComponent", true, new com.tencent.mm.plugin.webview.webcompt.t1(webCompts, this, k2Var, appId, url, c0Var));
        }
    }

    public final com.tencent.mm.plugin.webview.webcompt.f1 c() {
        return (com.tencent.mm.plugin.webview.webcompt.f1) ((jz5.n) this.f187951b).getValue();
    }

    @android.webkit.JavascriptInterface
    public final void sendMessage(java.lang.String webCompt, java.lang.String message) {
        kotlin.jvm.internal.o.g(webCompt, "webCompt");
        kotlin.jvm.internal.o.g(message, "message");
        com.tencent.mm.plugin.webview.webcompt.f1 c17 = c();
        c17.getClass();
        com.tencent.mm.plugin.appbrand.jsruntime.r f17 = c17.f(webCompt);
        if (f17 != null) {
            c17.h(f17, "WeixinWebCompt.onMessage(" + message + ')');
        }
        c17.f187812b.a(com.tencent.mm.plugin.webview.webcompt.b.H);
    }
}
