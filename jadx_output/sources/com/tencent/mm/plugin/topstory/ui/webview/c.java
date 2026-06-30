package com.tencent.mm.plugin.topstory.ui.webview;

/* loaded from: classes13.dex */
public class c extends com.tencent.xweb.s0 {
    @Override // com.tencent.xweb.s0
    public boolean b(android.webkit.ConsoleMessage consoleMessage) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryWebChromeClient", "onConsoleMessage %d %s %s %s", java.lang.Integer.valueOf(consoleMessage.lineNumber()), consoleMessage.messageLevel().name(), consoleMessage.message(), consoleMessage.sourceId());
        if (consoleMessage.messageLevel() != android.webkit.ConsoleMessage.MessageLevel.ERROR || com.tencent.mm.sdk.platformtools.t8.K0(consoleMessage.message())) {
            return false;
        }
        jx3.f.INSTANCE.d(19153, java.lang.Integer.valueOf(com.tencent.mm.plugin.websearch.l2.a(1)), consoleMessage.messageLevel(), 1);
        if (consoleMessage.message().contains("SyntaxError")) {
            su4.k3.e(22);
            return false;
        }
        if (!consoleMessage.message().contains("Maximum call stack size exceeded")) {
            return false;
        }
        su4.k3.e(33);
        return false;
    }

    @Override // com.tencent.xweb.s0
    public boolean i(com.tencent.xweb.WebView webView, java.lang.String str, java.lang.String str2, com.tencent.xweb.z zVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryWebChromeClient", "onJsAlert %s %s", str, str2);
        return false;
    }

    @Override // com.tencent.xweb.s0
    public boolean j(com.tencent.xweb.WebView webView, java.lang.String str, java.lang.String str2, com.tencent.xweb.z zVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryWebChromeClient", "onJsConfirm %s %s", str, str2);
        return false;
    }

    @Override // com.tencent.xweb.s0
    public boolean k(com.tencent.xweb.WebView webView, java.lang.String str, java.lang.String str2, java.lang.String str3, com.tencent.xweb.y yVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryWebChromeClient", "onJsPrompt %s %s", str, str2);
        return false;
    }

    @Override // com.tencent.xweb.s0
    public void n(com.tencent.xweb.WebView webView, int i17) {
    }
}
