package com.tencent.mm.plugin.finder.webview;

/* loaded from: classes4.dex */
public interface p0 {
    static /* synthetic */ void a(com.tencent.mm.plugin.finder.webview.p0 p0Var, java.lang.String str, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startLoadUrl");
        }
        if ((i17 & 1) != 0) {
            str = "";
        }
        if ((i17 & 2) != 0) {
            z17 = false;
        }
        p0Var.startLoadUrl(str, z17);
    }

    void addWebViewStateListener(com.tencent.mm.plugin.finder.webview.o0 o0Var);

    com.tencent.mm.ui.widget.MMWebView getWithInitWebView();

    void release();

    void reload();

    void setJumperExtInfo(java.lang.String str);

    void startLoadUrl(java.lang.String str, boolean z17);
}
