package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class ib implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f184836d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184837e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.WebViewUI f184838f;

    public ib(com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI, boolean z17, java.lang.String str) {
        this.f184838f = webViewUI;
        this.f184836d = z17;
        this.f184837e = str;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        boolean z17 = this.f184836d;
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = this.f184838f;
        if (z17) {
            webViewUI.V8(this.f184837e);
            return true;
        }
        webViewUI.X8();
        com.tencent.mm.plugin.webview.core.e3 e3Var = webViewUI.L1;
        if (e3Var == null) {
            return true;
        }
        e3Var.O0(2);
        return true;
    }
}
