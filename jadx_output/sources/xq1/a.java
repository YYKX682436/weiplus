package xq1;

/* loaded from: classes13.dex */
public class a extends com.tencent.xweb.s0 {
    @Override // com.tencent.xweb.s0
    public boolean b(android.webkit.ConsoleMessage consoleMessage) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Box.BoxWebChromeClient", "onConsoleMessage %d %s %s %s", java.lang.Integer.valueOf(consoleMessage.lineNumber()), consoleMessage.messageLevel().name(), consoleMessage.message(), consoleMessage.sourceId());
        return false;
    }

    @Override // com.tencent.xweb.s0
    public boolean i(com.tencent.xweb.WebView webView, java.lang.String str, java.lang.String str2, com.tencent.xweb.z zVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Box.BoxWebChromeClient", "onJsAlert %s %s", str, str2);
        return false;
    }

    @Override // com.tencent.xweb.s0
    public boolean j(com.tencent.xweb.WebView webView, java.lang.String str, java.lang.String str2, com.tencent.xweb.z zVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Box.BoxWebChromeClient", "onJsConfirm %s %s", str, str2);
        return false;
    }

    @Override // com.tencent.xweb.s0
    public boolean k(com.tencent.xweb.WebView webView, java.lang.String str, java.lang.String str2, java.lang.String str3, com.tencent.xweb.y yVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Box.BoxWebChromeClient", "onJsPrompt %s %s", str, str2);
        return false;
    }

    @Override // com.tencent.xweb.s0
    public void n(com.tencent.xweb.WebView webView, int i17) {
    }
}
