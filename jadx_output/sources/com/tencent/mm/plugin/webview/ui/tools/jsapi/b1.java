package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public final class b1 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.jsapi.b1 f184941d;

    /* renamed from: e, reason: collision with root package name */
    public static final int f184942e;

    static {
        com.tencent.mm.plugin.webview.ui.tools.jsapi.b1 b1Var = new com.tencent.mm.plugin.webview.ui.tools.jsapi.b1();
        f184941d = b1Var;
        f184942e = cf.b.a(b1Var);
    }

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiRequestKidsPayRechargePayment", "handled, params: " + msg.f340790a);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("appId", (java.lang.String) msg.f340790a.get("appId"));
        bundle.putString("timeStamp", (java.lang.String) msg.f340790a.get("timeStamp"));
        bundle.putString("package", (java.lang.String) msg.f340790a.get("package"));
        bundle.putString("nonceStr", (java.lang.String) msg.f340790a.get("nonceStr"));
        bundle.putString("paySign", (java.lang.String) msg.f340790a.get("paySign"));
        bundle.putString("signType", (java.lang.String) msg.f340790a.get("signType"));
        bundle.putString("webViewUrl", (java.lang.String) msg.f340790a.get("url"));
        bundle.putString("jsapiName", "requestKidsPayRechargePayment");
        nf.g.a(env.f340860a).f(new com.tencent.mm.plugin.webview.ui.tools.jsapi.a1(msg, env));
        j45.l.n(env.f340860a, "wallet", ".ui.WXPayJsApiKindaEntranceUI", new android.content.Intent().putExtras(bundle), f184942e);
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return com.tencent.mm.plugin.appbrand.jsapi.appdownload.m0.CTRL_INDEX;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "requestKidsPayRechargePayment";
    }
}
