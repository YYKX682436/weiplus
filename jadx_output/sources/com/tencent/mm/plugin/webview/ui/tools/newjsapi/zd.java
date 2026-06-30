package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes5.dex */
public final class zd implements com.tencent.mm.pluginsdk.ui.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186718a;

    public zd(nw4.k kVar) {
        this.f186718a = kVar;
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void a(java.lang.String str) {
        android.content.Context context = this.f186718a.f340860a;
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = context instanceof com.tencent.mm.plugin.webview.ui.tools.WebViewUI ? (com.tencent.mm.plugin.webview.ui.tools.WebViewUI) context : null;
        if (webViewUI == null || str == null) {
            return;
        }
        webViewUI.f183844p0.M(str);
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void b() {
        nw4.n nVar;
        android.content.Context context = this.f186718a.f340860a;
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = context instanceof com.tencent.mm.plugin.webview.ui.tools.WebViewUI ? (com.tencent.mm.plugin.webview.ui.tools.WebViewUI) context : null;
        if (webViewUI == null || (nVar = webViewUI.f183844p0) == null) {
            return;
        }
        nVar.M("[DELETE_EMOTION]");
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void c(boolean z17) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void d() {
        nw4.n nVar;
        android.content.Context context = this.f186718a.f340860a;
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = context instanceof com.tencent.mm.plugin.webview.ui.tools.WebViewUI ? (com.tencent.mm.plugin.webview.ui.tools.WebViewUI) context : null;
        if (webViewUI == null || (nVar = webViewUI.f183844p0) == null) {
            return;
        }
        nVar.M("[DONE_EMOTION]");
    }
}
