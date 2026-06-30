package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class ob implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.WebViewUI f186737d;

    public ob(com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI) {
        this.f186737d = webViewUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = this.f186737d;
        if (webViewUI.f183876z1.f(webViewUI.x7())) {
            com.tencent.mm.plugin.webview.model.x5.a(webViewUI.F7(), 6);
        } else {
            com.tencent.mm.plugin.webview.model.x5.a(webViewUI.F7(), 5);
        }
        webViewUI.X8();
        webViewUI.E2.c();
        com.tencent.mm.plugin.webview.core.e3 e3Var = webViewUI.L1;
        if (e3Var != null) {
            e3Var.O0(2);
        }
        com.tencent.mm.plugin.webview.ui.tools.c6 c6Var = webViewUI.f183849q2;
        if (c6Var == null) {
            return true;
        }
        c6Var.a0(49, 0, 0, com.tencent.mm.plugin.webview.model.s5.CLICK);
        return true;
    }
}
