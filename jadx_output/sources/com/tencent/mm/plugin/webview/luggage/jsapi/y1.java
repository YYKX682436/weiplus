package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes.dex */
public class y1 implements com.tencent.mm.pluginsdk.model.app.a5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f182520a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.q5 f182521b;

    public y1(com.tencent.mm.plugin.webview.luggage.jsapi.z1 z1Var, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        this.f182520a = str;
        this.f182521b = q5Var;
    }

    @Override // com.tencent.mm.pluginsdk.model.app.a5
    public void a(boolean z17, boolean z18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiLaunch3RdApp", "doLaunch3RdApp launchSuccess:" + z17 + " pkg:" + this.f182520a);
        com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var = this.f182521b;
        if (z17) {
            q5Var.a(null, null);
        } else {
            q5Var.a("fail", null);
        }
    }
}
