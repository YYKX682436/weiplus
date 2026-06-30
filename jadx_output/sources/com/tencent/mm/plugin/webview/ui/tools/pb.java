package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes.dex */
public class pb implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.WebViewUI f186756d;

    public pb(com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI) {
        this.f186756d = webViewUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = this.f186756d;
        android.view.View findViewById = webViewUI.findViewById(com.tencent.mm.R.id.f482483fr);
        if (findViewById != null) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(findViewById, "split_view_icon");
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(findViewById, 40, 26430);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).fk(findViewById, "split_view_scene_info", webViewUI.x7());
        }
    }
}
