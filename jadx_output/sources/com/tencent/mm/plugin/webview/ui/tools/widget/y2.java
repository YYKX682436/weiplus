package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes8.dex */
public class y2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f187609d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.p3 f187610e;

    public y2(com.tencent.mm.plugin.webview.ui.tools.widget.p3 p3Var, android.os.Bundle bundle) {
        this.f187610e = p3Var;
        this.f187609d = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.webview.permission.w wVar;
        android.os.Bundle bundle = this.f187609d;
        boolean containsKey = bundle.containsKey("jsapi_preverify_fun_list");
        com.tencent.mm.plugin.webview.ui.tools.widget.p3 p3Var = this.f187610e;
        if (!containsKey || (wVar = p3Var.f187495f.f187552e) == null) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = java.lang.Boolean.valueOf(p3Var.f187495f.f187552e != null);
            com.tencent.mars.xlog.Log.e("MicroMsg.MMWebViewClient", "has JSAPI_CONTROL_BYTES wvPerm %b", objArr);
        } else {
            wVar.i(bundle);
        }
        nw4.n nVar = p3Var.f187495f.f187554g;
        if (nVar != null) {
            nVar.q();
        }
    }
}
