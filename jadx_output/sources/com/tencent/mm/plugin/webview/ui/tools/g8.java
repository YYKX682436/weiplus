package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class g8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.WebViewUI f184755d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f184756e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.permission.w f184757f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ nw4.n f184758g;

    public g8(com.tencent.mm.plugin.webview.ui.tools.u7 u7Var, com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI, android.os.Bundle bundle, com.tencent.mm.plugin.webview.permission.w wVar, nw4.n nVar) {
        this.f184755d = webViewUI;
        this.f184756e = bundle;
        this.f184757f = wVar;
        this.f184758g = nVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = this.f184755d;
        if (webViewUI == null || webViewUI.isFinishing()) {
            return;
        }
        android.os.Bundle bundle = this.f184756e;
        boolean containsKey = bundle.containsKey("jsapi_preverify_fun_list");
        com.tencent.mm.plugin.webview.permission.w wVar = this.f184757f;
        if (!containsKey || wVar == null) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = java.lang.Boolean.valueOf(wVar != null);
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewStubCallbackAIDLStub", "has JSAPI_CONTROL_BYTES wvPerm %b", objArr);
        } else {
            wVar.i(bundle);
        }
        nw4.n nVar = this.f184758g;
        if (nVar != null) {
            nVar.q();
        }
    }
}
