package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class n1 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.n1 f186371d = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.n1();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        com.tencent.mm.plugin.webview.permission.d O;
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        java.util.HashMap hashMap = new java.util.HashMap();
        zg0.q2 a17 = env.a();
        com.tencent.mm.plugin.webview.core.r0 r0Var = a17 instanceof com.tencent.mm.plugin.webview.core.r0 ? (com.tencent.mm.plugin.webview.core.r0) a17 : null;
        hashMap.put("currentRequestId", java.lang.Integer.valueOf((r0Var == null || (O = r0Var.O()) == null) ? 0 : O.f183390j));
        java.lang.Object obj = env.f340860a;
        if (obj instanceof com.tencent.mm.plugin.webview.core.v0) {
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.core.IWebViewJsApiStub");
            int intExtra = ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) ((com.tencent.mm.plugin.webview.core.v0) obj)).getIntent().getIntExtra("lastGetA8KeyRequestId", 0);
            if (intExtra != 0) {
                hashMap.put("lastRequestId", java.lang.Integer.valueOf(intExtra));
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetContext", "privateGetContext currentRequestId=" + hashMap.get("currentRequestId") + ", lastRequestId=" + hashMap.get("lastRequestId"));
        env.f340863d.e(msg.f341013c, msg.f341019i + ":ok", hashMap);
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return com.tencent.mm.plugin.appbrand.jsapi.appdownload.l1.CTRL_INDEX;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "privateGetContext";
    }
}
