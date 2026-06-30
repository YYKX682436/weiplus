package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class xa implements android.webkit.WebView.FindListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.WebViewUI f187681a;

    public xa(com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI) {
        this.f187681a = webViewUI;
    }

    @Override // android.webkit.WebView.FindListener
    public void onFindResultReceived(int i17, int i18, boolean z17) {
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = this.f187681a;
        if (z17 && !webViewUI.I && !com.tencent.mm.sdk.platformtools.t8.K0(webViewUI.H.getSearchContent())) {
            if (i18 == 0) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(480L, 3L, 1L, false);
            } else {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(480L, 2L, 1L, false);
            }
            webViewUI.I = true;
        }
        webViewUI.H.d(i17, i18, z17);
    }
}
