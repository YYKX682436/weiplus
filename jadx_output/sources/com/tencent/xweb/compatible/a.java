package com.tencent.xweb.compatible;

/* loaded from: classes7.dex */
public abstract class a {
    private static final java.lang.String TAG = "PinusAdaptClient";
    public static final int XWEB_PINUS = 1;
    protected com.tencent.xweb.pinus.sdk.WebView psWebview;
    public int xwebType = -1;

    public void init(com.tencent.xweb.i2 i2Var) {
        if (i2Var instanceof com.tencent.xweb.pinus.sdk.WebView) {
            initPSWebView((com.tencent.xweb.pinus.sdk.WebView) i2Var);
        } else {
            by5.c4.c(TAG, "PinusAdaptClient constructor error");
        }
        if (this.xwebType != -1) {
            return;
        }
        by5.c4.c(TAG, "xwebType = -1, super init not call view:" + i2Var);
        throw new java.lang.RuntimeException("PinusAdaptClient init error royle");
    }

    public void initPSWebView(com.tencent.xweb.pinus.sdk.WebView webView) {
        this.xwebType = 1;
        this.psWebview = webView;
    }
}
