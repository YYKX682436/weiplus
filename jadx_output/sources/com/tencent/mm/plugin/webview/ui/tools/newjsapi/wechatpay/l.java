package com.tencent.mm.plugin.webview.ui.tools.newjsapi.wechatpay;

/* loaded from: classes.dex */
public final class l extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.wechatpay.l f186634d = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.wechatpay.l();

    /* renamed from: e, reason: collision with root package name */
    public static nw4.k f186635e;

    /* renamed from: f, reason: collision with root package name */
    public static nw4.y2 f186636f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.mm.sdk.event.IListener f186637g;

    static {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        f186637g = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.LiteAppLifeCycleEvent>(a0Var) { // from class: com.tencent.mm.plugin.webview.ui.tools.newjsapi.wechatpay.JsApiRequestMerchantTransfer$liteAppCloseWindowEvent$1
            {
                this.__eventId = 1907495603;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.LiteAppLifeCycleEvent liteAppLifeCycleEvent) {
                nw4.g gVar;
                com.tencent.mm.autogen.events.LiteAppLifeCycleEvent event = liteAppLifeCycleEvent;
                kotlin.jvm.internal.o.g(event, "event");
                am.ri riVar = event.f54468g;
                if (riVar.f7817a != 3 || !com.tencent.mm.sdk.platformtools.t8.D0(riVar.f7819c, "wxalite735b0917c7aabe235747cbfbe75cb71b@pay")) {
                    return false;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiRequestMerchantTransfer", "close liteapp appId %s, %s", riVar.f7819c, "wxalite735b0917c7aabe235747cbfbe75cb71b@pay");
                nw4.k kVar = com.tencent.mm.plugin.webview.ui.tools.newjsapi.wechatpay.l.f186635e;
                if (kVar != null && (gVar = kVar.f340863d) != null) {
                    nw4.y2 y2Var = com.tencent.mm.plugin.webview.ui.tools.newjsapi.wechatpay.l.f186636f;
                    java.lang.String str = y2Var != null ? y2Var.f341013c : null;
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    nw4.y2 y2Var2 = com.tencent.mm.plugin.webview.ui.tools.newjsapi.wechatpay.l.f186636f;
                    sb6.append(y2Var2 != null ? y2Var2.f341019i : null);
                    sb6.append(":fail");
                    gVar.e(str, sb6.toString(), null);
                }
                dead();
                return false;
            }
        };
    }

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        java.lang.String url;
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        f186635e = env;
        f186636f = msg;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiRequestMerchantTransfer", "JsApiRequestMerchantTransfer data:" + msg.f340790a);
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
        java.util.Map params = msg.f340790a;
        kotlin.jvm.internal.o.f(params, "params");
        params.put("sourceType", "WEBVIEW");
        java.util.Map params2 = msg.f340790a;
        kotlin.jvm.internal.o.f(params2, "params");
        params2.put("sourceAppId", V);
        java.lang.String jSONObject = new org.json.JSONObject(msg.f340790a).toString();
        kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("appId", "wxalite735b0917c7aabe235747cbfbe75cb71b@pay");
        bundle.putString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, "");
        bundle.putString("query", jSONObject);
        bundle.putLong("timeout", 30000L);
        bundle.putBoolean(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_TRANSPARENT, true);
        bundle.putBoolean("withDownloadLoading", true);
        com.tencent.liteapp.storage.LiteAppReferrerInfo liteAppReferrerInfo = new com.tencent.liteapp.storage.LiteAppReferrerInfo();
        liteAppReferrerInfo.scene = com.tencent.liteapp.gen.LiteAppOpenScene.WEB_VIEW;
        liteAppReferrerInfo.sceneId = V;
        bundle.putParcelable("liteappReferrerInfo", liteAppReferrerInfo);
        com.tencent.mm.plugin.lite.s sVar = new com.tencent.mm.plugin.lite.s();
        sVar.f144167d = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.wechatpay.j(env, msg);
        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).jk(com.tencent.mm.sdk.platformtools.x2.f193071a, bundle, true, false, sVar, new com.tencent.mm.plugin.webview.ui.tools.newjsapi.wechatpay.k(env, msg));
        f186637g.alive();
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return com.tencent.mm.plugin.appbrand.jsapi.bio.face.j.CTRL_INDEX;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return com.tencent.mm.plugin.appbrand.jsapi.pay.u1.NAME;
    }
}
