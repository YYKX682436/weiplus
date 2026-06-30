package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class b1 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.b1 f185956d = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.b1();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiFastBindCardGetResult", "get data");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_APPID, (java.lang.String) msg.f340790a.get("appid"));
        bundle.putString("nonce_str", (java.lang.String) msg.f340790a.get("noncestr"));
        bundle.putString("timeStamp", (java.lang.String) msg.f340790a.get(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP));
        bundle.putString("package", (java.lang.String) msg.f340790a.get("package"));
        bundle.putString("signType", (java.lang.String) msg.f340790a.get("signtype"));
        bundle.putString("paySign", (java.lang.String) msg.f340790a.get("paysign"));
        bundle.putString("sessionid", (java.lang.String) msg.f340790a.get("sessionid"));
        bundle.putString("jsapiName", "fastBindCardGetResult");
        bundle.putInt("jsapi_type", 0);
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, bundle, com.tencent.kinda.framework.jsapi.IPCInvoke_KindaJSInvoke.class, new com.tencent.mm.plugin.webview.ui.tools.newjsapi.a1(env, msg));
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 402;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "fastBindCardGetResult";
    }
}
