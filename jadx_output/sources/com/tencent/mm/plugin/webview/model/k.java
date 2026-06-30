package com.tencent.mm.plugin.webview.model;

/* loaded from: classes8.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.String f182974a = "";

    /* renamed from: b, reason: collision with root package name */
    public static java.util.regex.Pattern f182975b;

    public static void a(com.tencent.mm.ui.widget.MMWebView mMWebView, boolean z17) {
        mMWebView.getSettings().I(false);
        boolean z18 = !z17;
        mMWebView.getSettings().S(z18);
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_webview_audio_autoplay, 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.AutoPlayLogic", "enableAutoPlay audioAutoPlayControl:%d, enable:%b", java.lang.Integer.valueOf(Ni), java.lang.Boolean.valueOf(z17));
        if (Ni == 1) {
            mMWebView.getSettings().n(z18);
        }
    }

    public static void b(com.tencent.mm.ui.widget.MMWebView mMWebView) {
        if (mMWebView == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AutoPlayLogic", "webView null");
            return;
        }
        java.lang.String url = mMWebView.getUrl();
        com.tencent.mars.xlog.Log.i("MicroMsg.AutoPlayLogic", "currentUrl:%s", url);
        if (com.tencent.mm.sdk.platformtools.t8.K0(url)) {
            return;
        }
        c(mMWebView, url, false);
    }

    public static void c(com.tencent.mm.ui.widget.MMWebView mMWebView, java.lang.String str, boolean z17) {
        if (mMWebView == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AutoPlayLogic", "webView null");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AutoPlayLogic", "currentUrl:%s", str);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || str.startsWith("webcompt://")) {
            return;
        }
        com.tencent.mm.ipcinvoker.w0.b(new com.tencent.mm.plugin.webview.model.j(z17, str, mMWebView));
    }
}
