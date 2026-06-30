package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class ta implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.WebViewUI f186909d;

    public ta(com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI) {
        this.f186909d = webViewUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = this.f186909d;
        try {
            webViewUI.p8(webViewUI.K1.Ge(null), null, false);
        } catch (android.os.RemoteException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebViewUI", e17, "[oneliang]feedback exception:%s", e17.getMessage());
        }
        return false;
    }
}
