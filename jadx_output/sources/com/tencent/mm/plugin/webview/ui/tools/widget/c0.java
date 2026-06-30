package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes8.dex */
public final class c0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.d0 f187121d;

    public c0(com.tencent.mm.plugin.webview.ui.tools.widget.d0 d0Var) {
        this.f187121d = d0Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.plugin.webview.ui.tools.widget.d0 d0Var = this.f187121d;
        android.content.Context d17 = d0Var.d();
        android.app.Activity activity = d17 instanceof android.app.Activity ? (android.app.Activity) d17 : null;
        if (activity != null && activity.isFinishing()) {
            return;
        }
        if (menuItem.getItemId() == 1) {
            d0Var.f187146d.f286174b = 2;
        } else {
            d0Var.f187146d.f286174b = 4;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.HalfScreenWebViewMenuHelper", "onMMMenuItemSelected %d", java.lang.Integer.valueOf(menuItem.getItemId()));
        int itemId = menuItem.getItemId();
        if (itemId == 1) {
            nw4.n g07 = d0Var.e().g0();
            if (g07 != null) {
                g07.j("sendAppMessage", true);
                g07.j0(null, 0);
                return;
            }
            return;
        }
        if (itemId == 2) {
            nw4.n g08 = d0Var.e().g0();
            if (g08 != null) {
                g08.j(com.tencent.mm.plugin.appbrand.jsapi.share.g1.NAME, true);
                g08.l0(0, null, 0);
                return;
            }
            return;
        }
        if (itemId != 6) {
            db5.t4 t4Var = d0Var.f187152j;
            if (t4Var != null) {
                t4Var.onMMMenuItemSelected(menuItem, i17);
                return;
            }
            return;
        }
        java.lang.String l07 = d0Var.e().l0();
        if (l07 == null) {
            return;
        }
        com.tencent.mm.sdk.platformtools.b0.e(l07);
        android.widget.Toast.makeText(d0Var.d(), d0Var.d().getString(com.tencent.mm.R.string.laa), 0).show();
    }
}
