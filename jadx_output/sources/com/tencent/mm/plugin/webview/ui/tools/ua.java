package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class ua implements ey4.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.WebViewUI f186948a;

    public ua(com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI) {
        this.f186948a = webViewUI;
    }

    public void a(java.lang.String text) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUI", "keyboard onTextCancel, text = %s", text);
        com.tencent.mm.plugin.webview.core.e3 e3Var = this.f186948a.L1;
        if (e3Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUI", "controller == null");
            return;
        }
        nw4.n jsApiHandler = e3Var.g0();
        kotlin.jvm.internal.o.g(jsApiHandler, "jsApiHandler");
        kotlin.jvm.internal.o.g(text, "text");
        if (com.tencent.mm.plugin.webview.ui.tools.newjsapi.ed.f186069e == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiShowKeyBoard", "callbackID == null, return");
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT, text);
        jsApiHandler.e(com.tencent.mm.plugin.webview.ui.tools.newjsapi.ed.f186069e, "showKeyboard:cancel", hashMap);
        com.tencent.mm.plugin.webview.ui.tools.newjsapi.ed.f186069e = null;
    }
}
