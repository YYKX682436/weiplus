package com.tencent.mm.plugin.webview.ui.tools.newjsapi.wechatpay;

/* loaded from: classes9.dex */
public final class m implements h45.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f186638a;

    public m(com.tencent.mm.ipcinvoker.r rVar) {
        this.f186638a = rVar;
    }

    @Override // h45.n
    public final void onSessionId(java.lang.String str) {
        if (str == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiReportCrossPlatformPay", "onSessionId is null");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiReportCrossPlatformPay", "onSessionId: ".concat(str));
        com.tencent.mm.ipcinvoker.r rVar = this.f186638a;
        if (rVar != null) {
            rVar.a(new com.tencent.mm.plugin.webview.ui.tools.newjsapi.wechatpay.JsApiReportCrossPlatformPayResponse(str));
        }
    }
}
