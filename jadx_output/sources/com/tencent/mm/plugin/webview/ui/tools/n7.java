package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class n7 implements zh1.a1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f185860a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f185861b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.service.k5 f185862c;

    public n7(com.tencent.mm.plugin.webview.ui.tools.c6 c6Var, java.lang.String str, com.tencent.mm.plugin.appbrand.service.k5 k5Var) {
        this.f185860a = new java.lang.ref.WeakReference(c6Var);
        this.f185861b = str;
        this.f185862c = k5Var;
    }

    @Override // zh1.a1
    public void a(boolean z17, com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection appBrandOpenMaterialCollection) {
        com.tencent.mm.plugin.webview.ui.tools.c6 c6Var = (com.tencent.mm.plugin.webview.ui.tools.c6) this.f185860a.get();
        if (c6Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewMenuHelper", "onOpenMaterialsGot, menuHelper is null");
        } else {
            if (!z17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WebViewMenuHelper", "onOpenMaterialsGot, fail");
                return;
            }
            c6Var.O = this.f185861b;
            c6Var.P = appBrandOpenMaterialCollection;
            c6Var.q(this.f185862c);
        }
    }
}
