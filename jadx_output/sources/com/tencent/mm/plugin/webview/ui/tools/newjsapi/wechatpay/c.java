package com.tencent.mm.plugin.webview.ui.tools.newjsapi.wechatpay;

/* loaded from: classes7.dex */
public final class c extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.wechatpay.c f186624d = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.wechatpay.c();

    public static final void e(com.tencent.mm.plugin.webview.ui.tools.newjsapi.wechatpay.c cVar, nw4.k kVar, java.lang.String str) {
        nw4.n g07;
        cVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiReportCrossPlatformPay", str + " onDestroy stopListen");
        com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.plugin.webview.ui.tools.newjsapi.wechatpay.JsApiReportCrossPlatformPayParameter("stopListen", str), com.tencent.mm.plugin.webview.ui.tools.newjsapi.wechatpay.n.class, com.tencent.mm.plugin.webview.ui.tools.newjsapi.wechatpay.b.f186623d);
        java.util.Map l17 = kz5.c1.l(new jz5.l("cmdId", "clientDidStopReportSessionId"));
        zg0.q2 a17 = kVar.a();
        if (a17 == null || (g07 = ((com.tencent.mm.plugin.webview.core.r0) a17).g0()) == null) {
            return;
        }
        g07.o(com.tencent.mm.plugin.appbrand.jsapi.pay.q0.NAME, l17);
    }

    @Override // nw4.q2
    public boolean a(final nw4.k env, nw4.y2 msg) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        java.lang.Object obj = msg.f340790a.get("type");
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        if (str == null) {
            str = "1";
        }
        final java.lang.String uuid = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.o.f(uuid, "toString(...)");
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiReportCrossPlatformPay", "JsApiReportCrossPlatformPay data:" + msg.f340790a + " uuid:" + uuid);
        com.tencent.mm.ui.widget.MMWebView mMWebView = env.f340864e;
        java.lang.Object activityContextIfHas = mMWebView != null ? mMWebView.getActivityContextIfHas() : null;
        if (activityContextIfHas instanceof androidx.lifecycle.y) {
            ((androidx.lifecycle.y) activityContextIfHas).mo133getLifecycle().a(new androidx.lifecycle.f() { // from class: com.tencent.mm.plugin.webview.ui.tools.newjsapi.wechatpay.JsApiReportCrossPlatformPay$setupLifecycleObserver$1
                @Override // androidx.lifecycle.f, androidx.lifecycle.h
                public void onDestroy(androidx.lifecycle.y owner) {
                    kotlin.jvm.internal.o.g(owner, "owner");
                    com.tencent.mm.plugin.webview.ui.tools.newjsapi.wechatpay.c.e(com.tencent.mm.plugin.webview.ui.tools.newjsapi.wechatpay.c.f186624d, nw4.k.this, uuid);
                }
            });
        }
        com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.plugin.webview.ui.tools.newjsapi.wechatpay.JsApiReportCrossPlatformPayParameter(str, uuid), com.tencent.mm.plugin.webview.ui.tools.newjsapi.wechatpay.n.class, new com.tencent.mm.plugin.webview.ui.tools.newjsapi.wechatpay.a(env, uuid, msg));
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 531;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return com.tencent.mm.plugin.appbrand.jsapi.pay.x0.NAME;
    }
}
