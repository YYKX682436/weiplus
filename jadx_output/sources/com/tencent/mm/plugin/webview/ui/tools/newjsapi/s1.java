package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class s1 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.s1 f186508d;

    /* renamed from: e, reason: collision with root package name */
    public static final int f186509e;

    /* renamed from: f, reason: collision with root package name */
    public static final int f186510f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String f186511g;

    static {
        com.tencent.mm.plugin.webview.ui.tools.newjsapi.s1 s1Var = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.s1();
        f186508d = s1Var;
        f186509e = cf.b.a(s1Var);
        f186510f = com.tencent.mm.plugin.appbrand.jsapi.storage.e0.CTRL_INDEX;
        f186511g = com.tencent.mm.plugin.appbrand.jsapi.pay.s.NAME;
    }

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        rk0.c.c("MicroMsg.JsApiGetEncryptHKPasswd", "handle msg", new java.lang.Object[0]);
        if (msg.f340790a.isEmpty()) {
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
        intent.putExtra("intent_jump_ui", com.tencent.mm.plugin.appbrand.jsapi.pay.s.NAME);
        android.content.Context context = env.f340860a;
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        j45.l.w((com.tencent.mm.ui.MMActivity) context, ".plugin.wallet.ui.WalletJsApiAdapterUI", intent, f186509e, new com.tencent.mm.plugin.webview.ui.tools.newjsapi.r1(env, msg));
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return f186510f;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return f186511g;
    }
}
