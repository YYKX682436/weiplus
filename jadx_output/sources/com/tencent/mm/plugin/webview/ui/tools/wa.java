package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class wa implements com.tencent.mm.plugin.webview.ui.tools.widget.p7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.WebViewUI f187018a;

    public wa(com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI) {
        this.f187018a = webViewUI;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.p7
    public void a(com.tencent.mm.plugin.webview.ui.tools.widget.WebViewSearchContentInputFooter webViewSearchContentInputFooter, java.lang.String str) {
        if (webViewSearchContentInputFooter.getVisibility() == 0) {
            b(webViewSearchContentInputFooter);
        }
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.p7
    public void b(com.tencent.mm.plugin.webview.ui.tools.widget.WebViewSearchContentInputFooter webViewSearchContentInputFooter) {
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = this.f187018a;
        webViewUI.f183815f.clearMatches();
        webViewSearchContentInputFooter.c();
        webViewUI.H.d(0, 0, true);
        webViewUI.I = false;
        webViewUI.f183815f.findAllAsync(webViewSearchContentInputFooter.getSearchContent());
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.p7
    public void c(com.tencent.mm.plugin.webview.ui.tools.widget.WebViewSearchContentInputFooter webViewSearchContentInputFooter) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(480L, 5L, 1L, false);
        this.f187018a.f183815f.findNext(false);
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.p7
    public void d(com.tencent.mm.plugin.webview.ui.tools.widget.WebViewSearchContentInputFooter webViewSearchContentInputFooter) {
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = this.f187018a;
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI.W6(webViewUI, 0);
        webViewUI.f183815f.clearMatches();
        webViewUI.H.f187084e.setText("");
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.p7
    public void e(com.tencent.mm.plugin.webview.ui.tools.widget.WebViewSearchContentInputFooter webViewSearchContentInputFooter) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(480L, 4L, 1L, false);
        this.f187018a.f183815f.findNext(true);
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.p7
    public boolean onKey(android.view.View view, int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 67 || keyEvent.getAction() != 0) {
            return false;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(480L, 6L, 1L, false);
        return false;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.p7
    public void onShow() {
    }
}
