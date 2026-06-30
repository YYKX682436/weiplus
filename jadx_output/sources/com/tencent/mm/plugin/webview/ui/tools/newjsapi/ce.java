package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes5.dex */
public abstract class ce {
    public static final sk.e a(nw4.k kVar) {
        com.tencent.mm.plugin.webview.core.e3 e3Var;
        com.tencent.mm.plugin.webview.ui.tools.u4 u4Var;
        android.content.Context context = kVar.f340860a;
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = context instanceof com.tencent.mm.plugin.webview.ui.tools.WebViewUI ? (com.tencent.mm.plugin.webview.ui.tools.WebViewUI) context : null;
        java.lang.Object obj = (webViewUI == null || (e3Var = webViewUI.L1) == null || (u4Var = e3Var.Z0) == null) ? null : u4Var.f186925a;
        if (obj instanceof sk.e) {
            return (sk.e) obj;
        }
        return null;
    }
}
