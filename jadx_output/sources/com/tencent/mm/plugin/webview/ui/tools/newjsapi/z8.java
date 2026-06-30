package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class z8 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.z8 f186711d = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.z8();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        java.lang.String str = (java.lang.String) msg.f340790a.get("url");
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOpenUrlByExtBrowser", "openUrlByExtBrowser url is null");
            env.f340863d.e(msg.f341013c, "open_url_by_ext_browser:fail", null);
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenUrlByExtBrowser", "openUrlByExtBrowser url: %s", str);
        java.lang.String string = env.f340860a.getString(com.tencent.mm.R.string.l5f);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        if (r26.i0.y(str, "http", false)) {
            com.tencent.mm.plugin.webview.modeltools.h.b(env.f340860a, str, string, new com.tencent.mm.plugin.webview.ui.tools.newjsapi.v8(env, msg), new com.tencent.mm.plugin.webview.ui.tools.newjsapi.w8(env, msg));
        } else {
            com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(env.f340860a);
            u1Var.g(string);
            u1Var.n(env.f340860a.getString(com.tencent.mm.R.string.f490002i4));
            u1Var.j(env.f340860a.getString(com.tencent.mm.R.string.f490347sg));
            u1Var.l(new com.tencent.mm.plugin.webview.ui.tools.newjsapi.x8(str, env, msg));
            u1Var.i(new com.tencent.mm.plugin.webview.ui.tools.newjsapi.y8(env, msg));
            u1Var.q(false);
        }
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 55;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "openUrlByExtBrowser";
    }
}
