package com.tencent.mm.plugin.webview.ui.tools.newjsapi.wechatpay;

/* loaded from: classes7.dex */
public final class a implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186620d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f186621e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f186622f;

    public a(nw4.k kVar, java.lang.String str, nw4.y2 y2Var) {
        this.f186620d = kVar;
        this.f186621e = str;
        this.f186622f = y2Var;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        nw4.n g07;
        com.tencent.mm.plugin.webview.ui.tools.newjsapi.wechatpay.JsApiReportCrossPlatformPayResponse jsApiReportCrossPlatformPayResponse = (com.tencent.mm.plugin.webview.ui.tools.newjsapi.wechatpay.JsApiReportCrossPlatformPayResponse) obj;
        nw4.k kVar = this.f186620d;
        com.tencent.mm.ui.widget.MMWebView mMWebView = kVar.f340864e;
        if (!((mMWebView == null || mMWebView.f211376y) ? false : true)) {
            com.tencent.mm.plugin.webview.ui.tools.newjsapi.wechatpay.c.e(com.tencent.mm.plugin.webview.ui.tools.newjsapi.wechatpay.c.f186624d, kVar, this.f186621e);
            return;
        }
        java.lang.String str = jsApiReportCrossPlatformPayResponse != null ? jsApiReportCrossPlatformPayResponse.f186619d : null;
        nw4.g gVar = kVar.f340863d;
        nw4.y2 y2Var = this.f186622f;
        if (str == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiReportCrossPlatformPay", "callback sessionId is null");
            gVar.e(y2Var.f341013c, y2Var.f341019i + ":fail", null);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiReportCrossPlatformPay", "callback sessionId: ".concat(str));
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, str);
        gVar.e(y2Var.f341013c, y2Var.f341019i + ":ok", hashMap);
        zg0.q2 a17 = kVar.a();
        if (a17 == null || (g07 = ((com.tencent.mm.plugin.webview.core.r0) a17).g0()) == null) {
            return;
        }
        g07.o(com.tencent.mm.plugin.appbrand.jsapi.pay.q0.NAME, hashMap);
    }
}
