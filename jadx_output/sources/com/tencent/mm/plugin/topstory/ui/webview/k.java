package com.tencent.mm.plugin.topstory.ui.webview;

/* loaded from: classes8.dex */
public class k extends aw4.u {

    /* renamed from: e, reason: collision with root package name */
    public final r45.in6 f175213e;

    public k(r45.in6 in6Var) {
        super(1);
        this.f175213e = in6Var;
    }

    @Override // aw4.u, com.tencent.xweb.h1
    public void n(com.tencent.xweb.WebView webView, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryWebViewClient", "onPageFinished %s  %d", str, java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        super.n(webView, str);
        wm4.u.b(this.f175213e, "pageFinish", java.lang.System.currentTimeMillis());
    }

    @Override // com.tencent.xweb.h1
    public void o(com.tencent.xweb.WebView webView, java.lang.String str, android.graphics.Bitmap bitmap) {
        wm4.u.b(this.f175213e, "pageStart", java.lang.System.currentTimeMillis());
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryWebViewClient", "onPageStarted %s %d", str, java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
    }
}
