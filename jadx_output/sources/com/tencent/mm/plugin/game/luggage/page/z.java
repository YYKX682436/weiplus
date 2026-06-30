package com.tencent.mm.plugin.game.luggage.page;

/* loaded from: classes8.dex */
public class z extends com.tencent.mm.plugin.webview.luggage.d0 {

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.modeltools.o0 f139958b = new com.tencent.mm.plugin.webview.modeltools.o0();

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.page.b0 f139959c;

    public z(com.tencent.mm.plugin.game.luggage.page.b0 b0Var) {
        this.f139959c = b0Var;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.d0, com.tencent.xweb.s0
    public boolean b(android.webkit.ConsoleMessage consoleMessage) {
        org.json.JSONObject optJSONObject;
        sx4.d0 c17;
        vz4.x xVar = this.f139959c.P;
        if (xVar != null) {
            xVar.f(consoleMessage);
        }
        java.lang.String message = consoleMessage != null ? consoleMessage.message() : "";
        if (message.contains("luggage_err") || message.contains("luggageBridge is not defined")) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GameWebCoreImpl", "luggage bridge error");
            this.f139959c.f139871l1.P = message;
        } else if (message.startsWith("WXGAMEPERF:")) {
            if (message.contains("first-contentful-paint")) {
                try {
                    sx4.d0.f(this.f139959c.U, (long) new org.json.JSONObject(message.replaceFirst("WXGAMEPERF:", "").trim()).optDouble("startTime", 0.0d));
                } catch (org.json.JSONException | java.lang.Exception unused) {
                }
            } else if (message.contains("timing") && (optJSONObject = new org.json.JSONObject(message.replaceFirst("WXGAMEPERF:", "").trim()).optJSONObject("timing")) != null && (c17 = sx4.d0.c(this.f139959c.U)) != null) {
                c17.f413593l = optJSONObject.optLong("domainLookupEnd") - optJSONObject.optLong("domainLookupStart");
                c17.f413594m = optJSONObject.optLong("connectEnd") - optJSONObject.optLong("connectStart");
                c17.f413595n = optJSONObject.optLong("responseEnd") - optJSONObject.optLong("requestStart");
                c17.f413596o = optJSONObject.optLong("domInteractive") - optJSONObject.optLong("domLoading");
                c17.f413598q = optJSONObject.optLong("domContentLoadedEventEnd") - optJSONObject.optLong("responseEnd");
                c17.f413599r = optJSONObject.optLong("domComplete") - optJSONObject.optLong("responseEnd");
                c17.f413600s = optJSONObject.optLong("navigationStart");
            }
            ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.game.luggage.page.y(this, message));
        }
        return super.b(consoleMessage);
    }

    @Override // com.tencent.xweb.s0
    public void l(android.webkit.PermissionRequest permissionRequest) {
        com.tencent.mars.xlog.Log.i("LuggageGameWebChromeClientProxy", "onPermissionRequest");
        com.tencent.mm.plugin.game.luggage.page.b0 b0Var = this.f139959c;
        android.app.Activity a17 = q75.a.a(b0Var.getContext());
        if (a17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GameWebCoreImpl", "onPermissionRequest NULL activity");
        } else {
            this.f139958b.h(permissionRequest, a17, b0Var.getUrl());
        }
    }

    @Override // com.tencent.mm.plugin.webview.luggage.d0, com.tencent.xweb.s0
    public void o(com.tencent.xweb.WebView webView, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.GameWebCoreImpl", "onReceivedTitle, title = %s", str);
        if (!com.tencent.mm.plugin.webview.luggage.util.g.d(str)) {
            this.f139959c.R = str;
        }
        super.o(webView, str);
    }
}
