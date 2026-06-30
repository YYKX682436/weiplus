package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes8.dex */
public class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI f184595d;

    public r(com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI baseSOSWebViewUI) {
        this.f184595d = baseSOSWebViewUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI baseSOSWebViewUI = this.f184595d;
        int visibility = baseSOSWebViewUI.J4.getSearchBarCancelTextContainer().getVisibility();
        android.view.View searchBarCancelTextContainer = baseSOSWebViewUI.J4.getSearchBarCancelTextContainer();
        searchBarCancelTextContainer.postDelayed(new com.tencent.mm.plugin.webview.ui.tools.fts.w(baseSOSWebViewUI, visibility, searchBarCancelTextContainer), 0L);
    }
}
