package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes8.dex */
public final class u implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.core.r0 f187544d;

    public u(com.tencent.mm.plugin.webview.core.r0 r0Var) {
        this.f187544d = r0Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        nw4.n g07;
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.webview.core.r0 r0Var = this.f187544d;
        if (itemId != 1) {
            if (itemId == 2 && (g07 = r0Var.g0()) != null) {
                g07.j(com.tencent.mm.plugin.appbrand.jsapi.share.g1.NAME, true);
                g07.l0(0, null, 0);
                return;
            }
            return;
        }
        nw4.n g08 = r0Var.g0();
        if (g08 != null) {
            g08.j("sendAppMessage", true);
            g08.j0(null, 0);
        }
    }
}
