package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class ha extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.ha f186234d = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.ha();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        if (!gm0.j1.a()) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiPreloadWebSearchPage", "[preloadWebSearchPage] preloadWebSearch");
        ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
        su4.r2.o();
        ((ux4.j) ((tg0.j1) i95.n0.c(tg0.j1.class))).wi(env.f340860a);
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return com.tencent.mm.plugin.appbrand.jsapi.media.c4.CTRL_INDEX;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return com.tencent.mm.plugin.appbrand.jsapi.gb.NAME;
    }
}
