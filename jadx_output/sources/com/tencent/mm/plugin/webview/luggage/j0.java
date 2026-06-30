package com.tencent.mm.plugin.webview.luggage;

/* loaded from: classes8.dex */
public class j0 implements com.tencent.mm.plugin.webview.ui.tools.widget.p7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.e0 f182238a;

    public j0(com.tencent.mm.plugin.webview.luggage.e0 e0Var) {
        this.f182238a = e0Var;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.p7
    public void a(com.tencent.mm.plugin.webview.ui.tools.widget.WebViewSearchContentInputFooter webViewSearchContentInputFooter, java.lang.String str) {
        if (webViewSearchContentInputFooter.getVisibility() == 0) {
            b(webViewSearchContentInputFooter);
        }
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.p7
    public void b(com.tencent.mm.plugin.webview.ui.tools.widget.WebViewSearchContentInputFooter webViewSearchContentInputFooter) {
        com.tencent.mm.plugin.webview.luggage.e0 e0Var = this.f182238a;
        e0Var.f182180p.clearMatches();
        webViewSearchContentInputFooter.c();
        e0Var.f182189w.d(0, 0, true);
        e0Var.f182180p.findAllAsync(webViewSearchContentInputFooter.getSearchContent());
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.p7
    public void c(com.tencent.mm.plugin.webview.ui.tools.widget.WebViewSearchContentInputFooter webViewSearchContentInputFooter) {
        this.f182238a.f182180p.findNext(false);
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.p7
    public void d(com.tencent.mm.plugin.webview.ui.tools.widget.WebViewSearchContentInputFooter webViewSearchContentInputFooter) {
        com.tencent.mm.plugin.webview.luggage.e0 e0Var = this.f182238a;
        e0Var.r(0);
        e0Var.f182180p.clearMatches();
        e0Var.f182189w.f187084e.setText("");
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.p7
    public void e(com.tencent.mm.plugin.webview.ui.tools.widget.WebViewSearchContentInputFooter webViewSearchContentInputFooter) {
        this.f182238a.f182180p.findNext(true);
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.p7
    public boolean onKey(android.view.View view, int i17, android.view.KeyEvent keyEvent) {
        return false;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.p7
    public void onShow() {
    }
}
