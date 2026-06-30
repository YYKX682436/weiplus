package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes8.dex */
public class n1 implements com.tencent.mm.plugin.webview.ui.tools.fts.t4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI f184535a;

    public n1(com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI fTSSOSHomeWebViewUI) {
        this.f184535a = fTSSOSHomeWebViewUI;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.t4
    public void onAnimationEnd() {
        com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI fTSSOSHomeWebViewUI = this.f184535a;
        fTSSOSHomeWebViewUI.f184301p5.l(4);
        com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI.za(fTSSOSHomeWebViewUI);
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.t4
    public void onAnimationStart() {
        com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI fTSSOSHomeWebViewUI = this.f184535a;
        fTSSOSHomeWebViewUI.f184303r5++;
        fTSSOSHomeWebViewUI.Ta(false);
    }
}
