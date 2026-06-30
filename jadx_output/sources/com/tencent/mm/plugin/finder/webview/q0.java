package com.tencent.mm.plugin.finder.webview;

/* loaded from: classes8.dex */
public interface q0 {
    android.content.Context getContext();

    /* renamed from: getController */
    zg0.q2 getWebViewController();

    java.lang.String getCurrentURL();

    com.tencent.mm.plugin.webview.stub.v0 getInvoke();

    com.tencent.mm.plugin.scanner.MultiCodeMaskView getMaskView();

    com.tencent.mm.plugin.webview.permission.w getPerm();

    java.lang.Float getTouchX();

    java.lang.Float getTouchY();

    int getWVTopOffset();

    com.tencent.mm.ui.widget.MMWebView getWebView();

    android.view.Window getWindow();

    /* renamed from: isRelease */
    boolean getIsReleased();
}
