package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes12.dex */
public class q6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem f185363d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185364e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f185365f;

    public q6(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem webViewJSSDKFileItem, java.lang.String str) {
        this.f185365f = c1Var;
        this.f185363d = webViewJSSDKFileItem;
        this.f185364e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.autogen.events.ExtPlayerEvent extPlayerEvent = new com.tencent.mm.autogen.events.ExtPlayerEvent();
        am.m8 m8Var = extPlayerEvent.f54204g;
        m8Var.f7324a = 1;
        m8Var.f7325b = this.f185363d.f182741m;
        m8Var.f7327d = true;
        m8Var.f7328e = new com.tencent.mm.plugin.webview.ui.tools.jsapi.o6(this);
        m8Var.f7329f = new com.tencent.mm.plugin.webview.ui.tools.jsapi.p6(this);
        extPlayerEvent.e();
    }
}
