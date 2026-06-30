package com.tencent.mm.plugin.topstory.ui.webview;

/* loaded from: classes8.dex */
public abstract class b {
    public static void a(com.tencent.mm.plugin.topstory.ui.webview.l lVar, java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.websearch.webview.WebSearchWebView webSearchWebView;
        try {
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                return;
            }
            if (str2 == null) {
                str2 = "";
            }
            java.lang.Object[] objArr = new java.lang.Object[4];
            objArr[0] = str;
            objArr[1] = str2;
            objArr[2] = lVar;
            objArr[3] = lVar == null ? null : lVar.f175219f;
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryJsEventNotifier", "notifyJsEvent %s %s %s, %s", objArr);
            java.lang.String format = java.lang.String.format("javascript:window['%s'] && %s(%s)", str, str, str2);
            if (lVar == null || (webSearchWebView = lVar.f175219f) == null) {
                return;
            }
            webSearchWebView.evaluateJavascript(format, new com.tencent.mm.plugin.topstory.ui.webview.a(str, str2));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TopStory.TopStoryJsEventNotifier", e17, "notifyJsEvent", new java.lang.Object[0]);
        }
    }
}
