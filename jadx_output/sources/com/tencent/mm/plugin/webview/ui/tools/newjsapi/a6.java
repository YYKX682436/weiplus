package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes8.dex */
public final class a6 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.a6 f185945d = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.a6();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        int P = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) msg.f340790a.get("action"), -1);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiNotifyHotNewsFeedStatus", "notifyHotNewsFeedStatus, action:" + P);
        java.lang.String url = (java.lang.String) msg.f340790a.get("url");
        if (P != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiNotifyHotNewsFeedStatus", "wrong ctx");
            env.f340863d.e(msg.f341013c, msg.f341019i + ":fail", null);
            return false;
        }
        if (!z40.e.l4() || !((y40.i0) z40.e.get()).Di()) {
            com.tencent.wechat.mm.biz.g0.f218063b.a(url, new com.tencent.mm.plugin.webview.ui.tools.newjsapi.z5(env, msg));
            return true;
        }
        z40.e eVar = z40.e.get();
        com.tencent.mm.plugin.webview.ui.tools.newjsapi.y5 y5Var = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.y5(env, msg);
        ((y40.i0) eVar).getClass();
        kotlin.jvm.internal.o.g(url, "url");
        com.tencent.wechat.mm.finder_box.c0 a17 = a50.e1.f1471a.a();
        if (a17 == null) {
            return true;
        }
        a17.a(url, new y40.c(y5Var));
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 522;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "notifyHotNewsFeedStatus";
    }
}
