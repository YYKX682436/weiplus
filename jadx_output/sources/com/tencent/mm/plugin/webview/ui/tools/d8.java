package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class d8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.WebViewUI f184100d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f184101e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f184102f;

    public d8(com.tencent.mm.plugin.webview.ui.tools.u7 u7Var, com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI, nw4.n nVar, java.util.Map map) {
        this.f184100d = webViewUI;
        this.f184101e = nVar;
        this.f184102f = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = this.f184100d;
        if (webViewUI == null || webViewUI.isFinishing()) {
            return;
        }
        webViewUI.setMMSubTitle((java.lang.String) null);
        nw4.n nVar = this.f184101e;
        if (nVar != null) {
            nVar.r0(this.f184102f);
        }
    }
}
