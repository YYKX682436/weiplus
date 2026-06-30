package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes8.dex */
public class b2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI f184353d;

    public b2(com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI fTSSOSHomeWebViewUI) {
        this.f184353d = fTSSOSHomeWebViewUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI fTSSOSHomeWebViewUI = this.f184353d;
        fTSSOSHomeWebViewUI.f184293h5 = fTSSOSHomeWebViewUI.F4.getX();
        fTSSOSHomeWebViewUI.f184294i5 = fTSSOSHomeWebViewUI.F4.getY();
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSSOSHomeWebViewUI", "getSearchInputLayout originInputX=%s originInputY=%s", java.lang.Float.valueOf(fTSSOSHomeWebViewUI.f184293h5), java.lang.Float.valueOf(fTSSOSHomeWebViewUI.f184294i5));
    }
}
