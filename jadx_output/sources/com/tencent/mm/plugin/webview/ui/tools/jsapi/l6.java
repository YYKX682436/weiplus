package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes8.dex */
public class l6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem f185253d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f185254e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f185255f;

    public l6(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem webViewJSSDKFileItem, nw4.y2 y2Var) {
        this.f185255f = c1Var;
        this.f185253d = webViewJSSDKFileItem;
        this.f185254e = y2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.autogen.events.ExtSimpleRecordEvent extSimpleRecordEvent = new com.tencent.mm.autogen.events.ExtSimpleRecordEvent();
        am.q8 q8Var = extSimpleRecordEvent.f54208g;
        q8Var.f7696a = 1;
        q8Var.f7697b = this.f185253d.f182738g;
        q8Var.f7698c = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) this.f185254e.f340790a.get("duration"), 60);
        q8Var.f7699d = new com.tencent.mm.plugin.webview.ui.tools.jsapi.k6(this, extSimpleRecordEvent);
        extSimpleRecordEvent.e();
    }
}
