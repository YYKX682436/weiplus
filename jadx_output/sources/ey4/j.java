package ey4;

/* loaded from: classes8.dex */
public class j implements ck5.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewRedesignInputFooter f257621d;

    public j(com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewRedesignInputFooter webViewRedesignInputFooter) {
        this.f257621d = webViewRedesignInputFooter;
    }

    @Override // ck5.e
    public void R5(java.lang.String str) {
    }

    @Override // ck5.e
    public void c1(java.lang.String str) {
        com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewRedesignInputFooter webViewRedesignInputFooter = this.f257621d;
        ey4.u uVar = webViewRedesignInputFooter.f187292d;
        if (uVar != null) {
            java.lang.String text = webViewRedesignInputFooter.f187300o.getText().toString();
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUI", "keyboard onTextSend, text = %s", text);
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = ((com.tencent.mm.plugin.webview.ui.tools.ua) uVar).f186948a;
            com.tencent.mm.plugin.webview.core.e3 e3Var = webViewUI.L1;
            if (e3Var == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUI", "controller == null");
            } else {
                nw4.n jsApiHandler = e3Var.g0();
                kotlin.jvm.internal.o.g(jsApiHandler, "jsApiHandler");
                kotlin.jvm.internal.o.g(text, "text");
                if (com.tencent.mm.plugin.webview.ui.tools.newjsapi.ed.f186069e == null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.JsApiShowKeyBoard", "callbackID == null, return");
                } else {
                    java.util.HashMap hashMap = new java.util.HashMap();
                    hashMap.put(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT, text);
                    jsApiHandler.e(com.tencent.mm.plugin.webview.ui.tools.newjsapi.ed.f186069e, "showKeyboard:ok", hashMap);
                    com.tencent.mm.plugin.webview.ui.tools.newjsapi.ed.f186069e = null;
                }
            }
            if (webViewUI.F != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUI", "keyboard hide onWebPlusKeyBoardTextSent");
                webViewUI.F.b();
            }
        }
        webViewRedesignInputFooter.f187300o.clearComposingText();
        webViewRedesignInputFooter.f187300o.setText("");
    }

    @Override // ck5.e
    public void w0(java.lang.String str) {
    }
}
