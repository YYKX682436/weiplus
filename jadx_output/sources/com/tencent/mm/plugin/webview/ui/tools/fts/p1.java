package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes8.dex */
public class p1 implements com.tencent.mm.plugin.webview.ui.tools.fts.t4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI f184582a;

    public p1(com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI fTSSOSHomeWebViewUI) {
        this.f184582a = fTSSOSHomeWebViewUI;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.t4
    public void onAnimationEnd() {
        com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI fTSSOSHomeWebViewUI = this.f184582a;
        fTSSOSHomeWebViewUI.f184301p5.l(3);
        com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI.za(fTSSOSHomeWebViewUI);
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.t4
    public void onAnimationStart() {
        com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI fTSSOSHomeWebViewUI = this.f184582a;
        fTSSOSHomeWebViewUI.f184303r5++;
        fTSSOSHomeWebViewUI.Ta(false);
    }
}
