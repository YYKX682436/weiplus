package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes12.dex */
public class mb implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.WebViewUI f185700d;

    public mb(com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI) {
        this.f185700d = webViewUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = this.f185700d;
        rl5.r rVar = new rl5.r(webViewUI.getContext(), menuItem.getActionView());
        rVar.F = true;
        rVar.f397335J = webViewUI.getString(com.tencent.mm.R.string.k28);
        rVar.f397355y = new com.tencent.mm.plugin.webview.ui.tools.kb(this);
        rVar.f397354x = new com.tencent.mm.plugin.webview.ui.tools.lb(this);
        rVar.m();
        return true;
    }
}
