package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes7.dex */
public final class w9 extends com.tencent.xweb.h1 {
    @Override // com.tencent.xweb.h1
    public boolean B(com.tencent.xweb.WebView webView, java.lang.String str) {
        return false;
    }

    @Override // com.tencent.xweb.h1
    public void n(com.tencent.xweb.WebView webView, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("FinderLiveWebViewBottomSheet", "onPageFinished: " + str);
    }

    @Override // com.tencent.xweb.h1
    public void o(com.tencent.xweb.WebView webView, java.lang.String str, android.graphics.Bitmap bitmap) {
        com.tencent.mars.xlog.Log.i("FinderLiveWebViewBottomSheet", "onPageStarted: " + str);
    }
}
