package xq1;

/* loaded from: classes8.dex */
public class c extends com.tencent.xweb.h1 {
    public c(r45.sn snVar, xq1.g gVar) {
    }

    @Override // com.tencent.xweb.h1
    public boolean B(com.tencent.xweb.WebView webView, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Box.BoxWebChromeClient", "shouldOverrideUrlLoading %s", str);
        return this instanceof j82.h;
    }

    @Override // com.tencent.xweb.h1
    public void n(com.tencent.xweb.WebView webView, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Box.BoxWebChromeClient", "onPageFinished %s  %d", str, java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
    }

    @Override // com.tencent.xweb.h1
    public void o(com.tencent.xweb.WebView webView, java.lang.String str, android.graphics.Bitmap bitmap) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Box.BoxWebChromeClient", "onPageStarted %s %d", str, java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
    }
}
