package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class s1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f185392d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f185393e;

    public s1(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, nw4.y2 y2Var) {
        this.f185393e = c1Var;
        this.f185392d = y2Var;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        nw4.y2 y2Var = this.f185392d;
        com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var = this.f185393e;
        if (itemId != 1) {
            if (itemId != 2) {
                return;
            }
            c1Var.k5(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.J1, 0);
            c1Var.w5(y2Var);
            return;
        }
        c1Var.k5(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.K1, 0);
        android.content.Context context = c1Var.f184975d;
        if (context == null) {
            c1Var.i5(y2Var, "chooseIdCard:fail", null);
            return;
        }
        if (c1Var.E.b("identity_pay_auth", context, new com.tencent.mm.plugin.webview.ui.tools.jsapi.u1(c1Var, y2Var))) {
            return;
        }
        c1Var.i5(y2Var, "chooseIdCard:fail", null);
    }
}
