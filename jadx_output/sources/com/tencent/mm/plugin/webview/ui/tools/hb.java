package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class hb implements db5.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184810a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.WebViewUI f184811b;

    public hb(com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI, java.lang.String str) {
        this.f184811b = webViewUI;
        this.f184810a = str;
    }

    @Override // db5.c1
    public void e(int i17) {
        java.lang.String str = this.f184810a;
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = this.f184811b;
        if (i17 != 0) {
            if (i17 != 1) {
                return;
            }
            com.tencent.mm.sdk.platformtools.b0.d(webViewUI.getApplicationContext(), str, str, null);
        } else {
            if (webViewUI.L1.G(str)) {
                webViewUI.p8(str, null, false);
                return;
            }
            com.tencent.mars.xlog.Log.f("MicroMsg.WebViewUI", "showLoadUrlMenu, canLoadUrl fail, url = " + str);
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUI", "forceQuit");
            pm0.v.W(new com.tencent.mm.plugin.webview.ui.tools.ma(webViewUI));
        }
    }
}
