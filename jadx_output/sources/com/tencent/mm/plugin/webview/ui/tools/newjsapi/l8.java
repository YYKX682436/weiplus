package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class l8 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.l8 f186342d = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.l8();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        java.lang.String str;
        java.lang.String Z;
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenGameDetail", "OpenGameDetail");
        if (msg.f340790a.get("appId") == null || msg.f340790a.get("promotionId") == null) {
            env.f340863d.e(msg.f341013c, msg.f341019i + ": fail expected input", null);
            return false;
        }
        java.lang.String str2 = (java.lang.String) msg.f340790a.get("appId");
        java.lang.String str3 = (java.lang.String) msg.f340790a.get("promotionId");
        zg0.q2 a17 = env.a();
        if (a17 == null || (Z = ((com.tencent.mm.plugin.webview.core.r0) a17).Z()) == null) {
            com.tencent.mm.ui.widget.MMWebView mMWebView = env.f340864e;
            java.lang.String url = mMWebView != null ? mMWebView.getUrl() : null;
            str = url == null ? "" : url;
        } else {
            str = Z;
        }
        zg0.q2 a18 = env.a();
        java.lang.String V = a18 != null ? ((com.tencent.mm.plugin.webview.core.e3) a18).V(str) : "";
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenGameDetail", "JsApiOpenGameDetail appId:%s, promotionId:%s", str2, str3);
        ((com.tencent.mm.plugin.game.p0) ((m33.l1) i95.n0.c(m33.l1.class))).fj(env.f340860a, V, str, "webview", str2, str3, new com.tencent.mm.plugin.webview.ui.tools.newjsapi.k8(env, msg));
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 131;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "openGameDetail";
    }
}
