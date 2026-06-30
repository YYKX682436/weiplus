package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes8.dex */
public class n6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem f185294d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f185295e;

    public n6(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem webViewJSSDKFileItem) {
        this.f185295e = c1Var;
        this.f185294d = webViewJSSDKFileItem;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.autogen.events.ExtSimpleRecordEvent extSimpleRecordEvent = new com.tencent.mm.autogen.events.ExtSimpleRecordEvent();
        am.q8 q8Var = extSimpleRecordEvent.f54208g;
        q8Var.f7696a = 2;
        q8Var.f7697b = this.f185294d.f182738g;
        extSimpleRecordEvent.e();
        this.f185295e.Y = null;
    }
}
