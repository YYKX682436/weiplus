package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes8.dex */
public class h5 extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.SosWebViewUI f184431a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5(com.tencent.mm.plugin.webview.ui.tools.fts.SosWebViewUI sosWebViewUI, android.os.Looper looper) {
        super(looper);
        this.f184431a = sosWebViewUI;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        if (message.what == 0) {
            try {
                com.tencent.mm.plugin.webview.ui.tools.fts.SosWebViewUI sosWebViewUI = this.f184431a;
                int i17 = com.tencent.mm.plugin.webview.ui.tools.fts.SosWebViewUI.K3;
                sosWebViewUI.f183815f.evaluateJavascript("javascript:window.SosJSApi.onHtmlContentReport('<body>'+document.getElementsByTagName('body')[0].innerHTML+'</body>');", null);
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebSearch.SosWebViewUI", th6, "pageHandler", new java.lang.Object[0]);
            }
        }
    }
}
