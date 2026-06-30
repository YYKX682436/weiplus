package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class a9 implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.a9 f185947a = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.a9();

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenUrlWithExtraWebview", "onPageStateChange resultCallback:" + ((java.lang.String) obj));
    }
}
