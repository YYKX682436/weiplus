package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class n8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.WebViewUI f185863d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f185864e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185865f;

    public n8(com.tencent.mm.plugin.webview.ui.tools.u7 u7Var, com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI, nw4.n nVar, java.lang.String str) {
        this.f185863d = webViewUI;
        this.f185864e = nVar;
        this.f185865f = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        nw4.n nVar;
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = this.f185863d;
        if (webViewUI == null || webViewUI.isFinishing() || (nVar = this.f185864e) == null) {
            return;
        }
        nVar.X(this.f185865f);
    }
}
