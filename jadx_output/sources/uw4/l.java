package uw4;

/* loaded from: classes8.dex */
public class l extends com.tencent.mm.plugin.webview.luggage.r1 {
    public l(uw4.n nVar) {
    }

    @Override // com.tencent.mm.plugin.webview.luggage.r1, com.tencent.xweb.h1
    public void o(com.tencent.xweb.WebView webView, java.lang.String str, android.graphics.Bitmap bitmap) {
        com.tencent.mars.xlog.Log.i(uw4.l.class.getSimpleName(), "onPageStarted");
        super.o(webView, str, bitmap);
    }
}
