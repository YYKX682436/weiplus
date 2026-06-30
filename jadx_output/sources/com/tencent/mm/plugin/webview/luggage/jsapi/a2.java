package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes15.dex */
public class a2 implements com.tencent.mm.pluginsdk.model.app.b5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.b2 f182252a;

    public a2(com.tencent.mm.plugin.webview.luggage.jsapi.b2 b2Var) {
        this.f182252a = b2Var;
    }

    @Override // com.tencent.mm.pluginsdk.model.app.b5
    public void a(boolean z17, boolean z18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiLaunchApplication", "onLaunchAppCallback(launchRet : %s, launchSuccess : %s)", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        com.tencent.mm.plugin.webview.luggage.jsapi.b2 b2Var = this.f182252a;
        if (z17) {
            b2Var.f182266g.f182279d.a(null, null);
        } else {
            b2Var.f182266g.f182279d.a("fail", null);
        }
    }
}
