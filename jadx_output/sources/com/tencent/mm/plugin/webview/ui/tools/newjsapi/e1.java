package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class e1 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.e1 f186046d;

    /* renamed from: e, reason: collision with root package name */
    public static final int f186047e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f186048f;

    static {
        com.tencent.mm.plugin.webview.ui.tools.newjsapi.e1 e1Var = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.e1();
        f186046d = e1Var;
        cf.b.a(e1Var);
        f186047e = 521;
        f186048f = com.tencent.mm.plugin.appbrand.jsapi.pay.q.NAME;
    }

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        rk0.c.c("MicroMsg.JsApiGetAccessibilitySecureRiskInfo", "handle msg", new java.lang.Object[0]);
        uk0.a.b(null, new com.tencent.mm.plugin.webview.ui.tools.newjsapi.c1(), new com.tencent.mm.plugin.webview.ui.tools.newjsapi.d1(env, msg));
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return f186047e;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return f186048f;
    }
}
