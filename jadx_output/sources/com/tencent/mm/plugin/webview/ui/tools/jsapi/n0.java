package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public final class n0 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.jsapi.n0 f185281d = new com.tencent.mm.plugin.webview.ui.tools.jsapi.n0();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiH5ReuqestQueryCashier", "get data");
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiH5ReuqestQueryCashier", "data: %s", msg.f340790a.toString());
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("appId", (java.lang.String) msg.f340790a.get("appId"));
        bundle.putString("nonceStr", (java.lang.String) msg.f340790a.get("nonceStr"));
        bundle.putString("timeStamp", (java.lang.String) msg.f340790a.get("timeStamp"));
        bundle.putString("package", (java.lang.String) msg.f340790a.get("package"));
        bundle.putString("paySign", (java.lang.String) msg.f340790a.get("paySign"));
        bundle.putString("signType", (java.lang.String) msg.f340790a.get("signType"));
        bundle.putString("jsapiName", com.tencent.mm.plugin.appbrand.jsapi.y6.NAME);
        bundle.putString("notifyType", com.tencent.mm.plugin.appbrand.jsapi.y6.NAME);
        bundle.putInt("jsapi_type", 0);
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, bundle, com.tencent.kinda.framework.jsapi.IPCInvoke_KindaJSInvoke.class, new com.tencent.mm.plugin.webview.ui.tools.jsapi.m0(env, msg));
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return com.tencent.mm.plugin.sns.storage.ADXml.AD_TURN_CARD_ANIMATION_TIME;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return com.tencent.mm.plugin.appbrand.jsapi.y6.NAME;
    }
}
