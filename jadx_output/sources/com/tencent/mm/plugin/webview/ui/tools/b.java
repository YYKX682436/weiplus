package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class b extends com.tencent.xweb.h1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.ContactQZoneWebView f183917a;

    public b(com.tencent.mm.plugin.webview.ui.tools.ContactQZoneWebView contactQZoneWebView) {
        this.f183917a = contactQZoneWebView;
    }

    @Override // com.tencent.xweb.h1
    public boolean B(com.tencent.xweb.WebView webView, java.lang.String str) {
        if (str.startsWith("weixin://viewimage/")) {
            this.f183917a.m9(str);
            webView.stopLoading();
        } else if (!str.startsWith("weixinping://iframe") && !str.startsWith("weixinpreinject://iframe")) {
            webView.loadUrl(str);
        }
        return true;
    }

    @Override // com.tencent.xweb.h1
    public void o(com.tencent.xweb.WebView webView, java.lang.String str, android.graphics.Bitmap bitmap) {
        boolean startsWith = str.startsWith("weixin://viewimage/");
        com.tencent.mm.plugin.webview.ui.tools.ContactQZoneWebView contactQZoneWebView = this.f183917a;
        if (startsWith) {
            contactQZoneWebView.m9(str);
            webView.stopLoading();
        } else if (str.equals(contactQZoneWebView.C3)) {
            com.tencent.mm.sdk.platformtools.t8.b1(contactQZoneWebView, str);
            webView.stopLoading();
        }
    }
}
