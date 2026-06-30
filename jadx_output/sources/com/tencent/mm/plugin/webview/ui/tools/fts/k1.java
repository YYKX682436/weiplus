package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes8.dex */
public class k1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI f184492d;

    public k1(com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI fTSSOSHomeWebViewUI) {
        this.f184492d = fTSSOSHomeWebViewUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI fTSSOSHomeWebViewUI = this.f184492d;
        if (fTSSOSHomeWebViewUI.F4.getLayoutParams() instanceof android.widget.RelativeLayout.LayoutParams) {
            fTSSOSHomeWebViewUI.f184311z5 = ((android.widget.RelativeLayout.LayoutParams) fTSSOSHomeWebViewUI.F4.getLayoutParams()).topMargin;
        }
    }
}
