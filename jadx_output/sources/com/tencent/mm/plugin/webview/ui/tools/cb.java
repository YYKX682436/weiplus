package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class cb implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.WebViewUI f184083d;

    public cb(com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI) {
        this.f184083d = webViewUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = this.f184083d;
        if (webViewUI.getIntent().getBooleanExtra("hide_close_btn", false)) {
            return true;
        }
        webViewUI.hideVKB();
        webViewUI.v8();
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUI", "on back btn press");
        return true;
    }
}
