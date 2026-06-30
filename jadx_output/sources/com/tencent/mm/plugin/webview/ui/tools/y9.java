package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class y9 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f187703d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.u7 f187704e;

    public y9(com.tencent.mm.plugin.webview.ui.tools.u7 u7Var, android.os.Bundle bundle) {
        this.f187704e = u7Var;
        this.f187703d = bundle;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.webview.ui.tools.u7 u7Var = this.f187704e;
        android.os.Bundle bundle = this.f187703d;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewStubCallbackAIDLStub", "WebViewUITipsDialogCancel");
        try {
            bundle.putInt("WebViewShare_BinderID", ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) u7Var.f186929e.get()).t7());
            ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) u7Var.f186929e.get()).K1.i(111, bundle);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewStubCallbackAIDLStub", "hide dialog err %s", e17.getMessage());
        }
    }
}
