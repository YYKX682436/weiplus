package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class n8 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.n8 f186376d;

    /* renamed from: e, reason: collision with root package name */
    public static final int f186377e;

    /* renamed from: f, reason: collision with root package name */
    public static final int f186378f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String f186379g;

    static {
        com.tencent.mm.plugin.webview.ui.tools.newjsapi.n8 n8Var = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.n8();
        f186376d = n8Var;
        f186377e = cf.b.a(n8Var);
        f186378f = 446;
        f186379g = com.tencent.mm.plugin.appbrand.jsapi.pay.c0.NAME;
    }

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        rk0.c.c("MicroMsg.JsApiOpenHKOfflinePayView", "handle msg", new java.lang.Object[0]);
        java.util.Map params = msg.f340790a;
        kotlin.jvm.internal.o.f(params, "params");
        if (params.size() == 0) {
            env.f340863d.e(msg.f341013c, msg.f341019i + ":fail_missing arguments", null);
            return true;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("appId", (java.lang.String) msg.f340790a.get("appId"));
        intent.putExtra("timeStamp", (java.lang.String) msg.f340790a.get("timeStamp"));
        intent.putExtra("nonceStr", (java.lang.String) msg.f340790a.get("nonceStr"));
        intent.putExtra("packageExt", (java.lang.String) msg.f340790a.get("package"));
        intent.putExtra("signtype", (java.lang.String) msg.f340790a.get("signType"));
        intent.putExtra("paySignature", (java.lang.String) msg.f340790a.get("paySign"));
        zg0.q2 a17 = env.a();
        if (a17 == null || (str = ((com.tencent.mm.plugin.webview.core.r0) a17).Z()) == null) {
            com.tencent.mm.ui.widget.MMWebView mMWebView = env.f340864e;
            java.lang.String url = mMWebView != null ? mMWebView.getUrl() : null;
            str = url == null ? "" : url;
        }
        intent.putExtra("url", str);
        intent.putExtra("source_type", 1);
        intent.putExtra("intent_jump_ui", com.tencent.mm.plugin.appbrand.jsapi.pay.c0.NAME);
        android.content.Context context = env.f340860a;
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        j45.l.w((com.tencent.mm.ui.MMActivity) context, ".plugin.wallet.ui.WalletJsApiAdapterUI", intent, f186377e, new com.tencent.mm.plugin.webview.ui.tools.newjsapi.m8(env, msg));
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return f186378f;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return f186379g;
    }
}
