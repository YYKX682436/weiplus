package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes8.dex */
public class s6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem f185403d;

    public s6(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem webViewJSSDKFileItem) {
        this.f185403d = webViewJSSDKFileItem;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.autogen.events.ExtPlayerEvent extPlayerEvent = new com.tencent.mm.autogen.events.ExtPlayerEvent();
        am.m8 m8Var = extPlayerEvent.f54204g;
        m8Var.f7324a = 4;
        m8Var.f7325b = this.f185403d.f182741m;
        extPlayerEvent.e();
    }
}
