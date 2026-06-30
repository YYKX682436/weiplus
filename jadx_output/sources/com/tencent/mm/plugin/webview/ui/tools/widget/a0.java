package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes8.dex */
public final class a0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.d0 f187093d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.JsapiPermissionWrapper f187094e;

    public a0(com.tencent.mm.plugin.webview.ui.tools.widget.d0 d0Var, com.tencent.mm.protocal.JsapiPermissionWrapper jsapiPermissionWrapper) {
        this.f187093d = d0Var;
        this.f187094e = jsapiPermissionWrapper;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.webview.ui.tools.widget.d0 d0Var = this.f187093d;
        android.content.Context d17 = d0Var.d();
        android.app.Activity activity = d17 instanceof android.app.Activity ? (android.app.Activity) d17 : null;
        boolean z17 = false;
        if (activity != null && activity.isFinishing()) {
            z17 = true;
        }
        if (z17) {
            return;
        }
        g4Var.clear();
        com.tencent.mm.plugin.webview.core.q1 q1Var = com.tencent.mm.plugin.webview.core.s1.f181972a;
        if (qk.ka.a()) {
            com.tencent.mm.protocal.JsapiPermissionWrapper jsapiPermissionWrapper = this.f187094e;
            if (com.tencent.mm.plugin.webview.ui.tools.widget.d0.a(d0Var, jsapiPermissionWrapper, 44) && d0Var.c(6)) {
                g4Var.l(6, d0Var.d().getString(com.tencent.mm.R.string.la_), com.tencent.mm.R.raw.icons_outlined_link, com.tencent.mm.plugin.webview.ui.tools.widget.d0.b(d0Var, jsapiPermissionWrapper, 44));
            }
        }
        java.util.Iterator it = d0Var.f187153k.iterator();
        while (it.hasNext()) {
            g4Var.v((android.view.MenuItem) it.next());
        }
        com.tencent.mm.ui.widget.dialog.k0 k0Var = d0Var.f187143a;
        if (k0Var != null) {
            k0Var.j();
        }
    }
}
