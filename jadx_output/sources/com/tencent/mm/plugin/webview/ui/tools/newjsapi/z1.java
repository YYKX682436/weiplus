package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class z1 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.z1 f186697d = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.z1();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        java.lang.String Z;
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetHKCashier", "handleMsg");
        java.util.Map map = msg.f340790a;
        if (map != null && map.isEmpty()) {
            env.f340863d.e(msg.f341013c, msg.f341019i + ":fail invalid param", null);
            return true;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        java.lang.Object obj = msg.f340790a.get("appId");
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        java.lang.String str2 = "";
        if (str == null) {
            str = "";
        }
        bundle.putString("appId", str);
        java.lang.Object obj2 = msg.f340790a.get("nonceStr");
        java.lang.String str3 = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
        if (str3 == null) {
            str3 = "";
        }
        bundle.putString("nonce_str", str3);
        java.lang.Object obj3 = msg.f340790a.get("timeStamp");
        java.lang.String str4 = obj3 instanceof java.lang.String ? (java.lang.String) obj3 : null;
        if (str4 == null) {
            str4 = "";
        }
        bundle.putString("timeStamp", str4);
        java.lang.Object obj4 = msg.f340790a.get("package");
        java.lang.String str5 = obj4 instanceof java.lang.String ? (java.lang.String) obj4 : null;
        if (str5 == null) {
            str5 = "";
        }
        bundle.putString("package", str5);
        java.lang.Object obj5 = msg.f340790a.get("signType");
        java.lang.String str6 = obj5 instanceof java.lang.String ? (java.lang.String) obj5 : null;
        if (str6 == null) {
            str6 = "";
        }
        bundle.putString("signType", str6);
        java.lang.Object obj6 = msg.f340790a.get("paySign");
        java.lang.String str7 = obj6 instanceof java.lang.String ? (java.lang.String) obj6 : null;
        if (str7 == null) {
            str7 = "";
        }
        bundle.putString("paySign", str7);
        bundle.putString("jsapiName", "getHKCashier");
        bundle.putInt("jsapi_type", 0);
        bundle.putInt("sourceType", 1);
        zg0.q2 a17 = env.a();
        if (a17 == null || (Z = ((com.tencent.mm.plugin.webview.core.r0) a17).Z()) == null) {
            com.tencent.mm.ui.widget.MMWebView mMWebView = env.f340864e;
            java.lang.String url = mMWebView != null ? mMWebView.getUrl() : null;
            if (url != null) {
                str2 = url;
            }
        } else {
            str2 = Z;
        }
        bundle.putString("stepInURL", str2);
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, bundle, com.tencent.kinda.framework.jsapi.IPCInvoke_KindaJSInvoke.class, new com.tencent.mm.plugin.webview.ui.tools.newjsapi.y1(env, msg));
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 539;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "getHKCashier";
    }
}
