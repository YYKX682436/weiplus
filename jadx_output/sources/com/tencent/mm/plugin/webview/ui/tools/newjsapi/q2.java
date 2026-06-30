package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class q2 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.q2 f186450d = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.q2();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        java.lang.String str = (java.lang.String) msg.f340790a.get("extInfo");
        if (str == null) {
            str = "";
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetWCCoinBalance", "getWCCoinBalance extInfo: %s", str);
        com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiGetWCCoinBalance$GetWeCoinTaskData(str), com.tencent.mm.plugin.webview.ui.tools.newjsapi.n2.class, new com.tencent.mm.plugin.webview.ui.tools.newjsapi.p2(new java.util.HashMap(), "balance", "newUserDiscount", env, msg));
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 407;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return com.tencent.mm.plugin.appbrand.jsapi.wccoin.w.NAME;
    }
}
