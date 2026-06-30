package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public final class w0 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.jsapi.w0 f185488d = new com.tencent.mm.plugin.webview.ui.tools.jsapi.w0();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        java.lang.Object obj = msg.f340790a.get("appId");
        java.lang.String obj2 = obj != null ? obj.toString() : null;
        zg0.q2 a17 = env.a();
        java.lang.String i17 = a17 != null ? a17.i() : null;
        if (i17 == null) {
            i17 = "";
        }
        if (!(obj2 == null || obj2.length() == 0)) {
            if (r26.n0.B(i17, "appid=" + obj2, false)) {
                ((com.tencent.mm.plugin.appbrand.service.r5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.r5.class)).Eh(obj2, new com.tencent.mm.plugin.webview.ui.tools.jsapi.v0(env, msg));
                return true;
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleMsg with invalid params, rawUrl:");
        sb6.append(i17);
        sb6.append(", wxaAppId:");
        sb6.append(obj2);
        sb6.append(", binderId:");
        zg0.q2 a18 = env.a();
        sb6.append(a18 != null ? ((com.tencent.mm.plugin.webview.core.r0) a18).U() : -1);
        com.tencent.mars.xlog.Log.e("MicroMsg.WebView.JsApiRebaseWxappPubLibAndRestart", sb6.toString());
        java.lang.String str = msg.f341013c;
        if (obj2 == null) {
            obj2 = "";
        }
        env.f340863d.e(str, "rebaseWxappPubLibAndRestart:fail invalid appId:".concat(obj2), null);
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return kf1.i.CTRL_INDEX;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "rebaseWxappPubLibAndRestart";
    }
}
