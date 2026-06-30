package com.tencent.mm.plugin.webview.ui.tools.newjsapi.wechatpay;

/* loaded from: classes.dex */
public final class h extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.wechatpay.h f186629d = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.wechatpay.h();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        java.lang.String url;
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiRequestMedicalInsurancePay", "JsApiRequestMedicalInsurancePay data:" + msg.f340790a);
        zg0.q2 a17 = env.a();
        if (a17 == null || (url = ((com.tencent.mm.plugin.webview.core.r0) a17).Z()) == null) {
            com.tencent.mm.ui.widget.MMWebView mMWebView = env.f340864e;
            url = mMWebView != null ? mMWebView.getUrl() : null;
            if (url == null) {
                url = "";
            }
        }
        zg0.q2 a18 = env.a();
        java.lang.String V = a18 != null ? ((com.tencent.mm.plugin.webview.core.e3) a18).V(url) : "";
        java.lang.String jSONObject = new org.json.JSONObject(msg.f340790a).toString();
        kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("appId", "wxalitebd687f90a5690a0e4fe5b08bfb273e90@pay");
        bundle.putString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, "");
        bundle.putString("query", jSONObject);
        bundle.putLong("timeout", 30000L);
        bundle.putBoolean("withDownloadLoading", true);
        com.tencent.liteapp.storage.LiteAppReferrerInfo liteAppReferrerInfo = new com.tencent.liteapp.storage.LiteAppReferrerInfo();
        liteAppReferrerInfo.scene = com.tencent.liteapp.gen.LiteAppOpenScene.WEB_VIEW;
        liteAppReferrerInfo.sceneId = V;
        bundle.putParcelable("liteappReferrerInfo", liteAppReferrerInfo);
        com.tencent.mm.plugin.lite.s sVar = new com.tencent.mm.plugin.lite.s();
        sVar.f144167d = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.wechatpay.f(env, msg);
        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).jk(com.tencent.mm.sdk.platformtools.x2.f193071a, bundle, true, false, sVar, new com.tencent.mm.plugin.webview.ui.tools.newjsapi.wechatpay.g(env, msg));
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 494;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return com.tencent.mm.plugin.appbrand.jsapi.pay.s1.NAME;
    }
}
