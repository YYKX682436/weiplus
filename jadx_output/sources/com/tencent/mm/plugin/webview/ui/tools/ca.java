package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class ca implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.WebViewUI f184077d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f184078e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.permission.w f184079f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184080g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f184081h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Boolean f184082i;

    public ca(com.tencent.mm.plugin.webview.ui.tools.u7 u7Var, com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI, nw4.n nVar, com.tencent.mm.plugin.webview.permission.w wVar, java.lang.String str, int i17, java.lang.Boolean bool) {
        this.f184077d = webViewUI;
        this.f184078e = nVar;
        this.f184079f = wVar;
        this.f184080g = str;
        this.f184081h = i17;
        this.f184082i = bool;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = this.f184077d;
        if (webViewUI == null || webViewUI.isFinishing()) {
            return;
        }
        int i17 = this.f184081h;
        java.lang.String str = this.f184080g;
        com.tencent.mm.plugin.webview.permission.w wVar = this.f184079f;
        nw4.n nVar = this.f184078e;
        if (nVar != null && wVar != null) {
            wVar.c().getClass();
            nVar.t0(str, i17);
        } else {
            if (nVar != null && this.f184082i.booleanValue()) {
                nVar.t0(str, i17);
                return;
            }
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = java.lang.Boolean.valueOf(nVar == null);
            objArr[1] = java.lang.Boolean.valueOf(wVar == null);
            com.tencent.mars.xlog.Log.w("MicroMsg.WebViewStubCallbackAIDLStub", "something null, %s, %s", objArr);
        }
    }
}
