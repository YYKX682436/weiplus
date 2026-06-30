package com.tencent.mm.plugin.webview.luggage;

/* loaded from: classes8.dex */
public class o3 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f182588d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.w3 f182589e;

    public o3(com.tencent.mm.plugin.webview.luggage.w3 w3Var, java.lang.String str) {
        this.f182589e = w3Var;
        this.f182588d = str;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        java.lang.String str = this.f182588d;
        com.tencent.mm.plugin.webview.luggage.w3 w3Var = this.f182589e;
        if (itemId == 1) {
            com.tencent.mm.pluginsdk.ui.tools.e9.h(w3Var.f182669j.f406610d, str, com.tencent.xweb.d.g().a(str), fp.i.b(), new com.tencent.mm.plugin.webview.luggage.c3(w3Var));
        } else if (itemId == 2) {
            com.tencent.mm.pluginsdk.ui.tools.e9.m(w3Var.f182669j.f406610d, str, "", com.tencent.xweb.d.g().a(str), fp.i.b(), null);
        } else {
            if (itemId != 3) {
                return;
            }
            com.tencent.mm.pluginsdk.ui.tools.e9.h(w3Var.f182669j.f406610d, str, com.tencent.xweb.d.g().a(str), fp.i.b(), new com.tencent.mm.plugin.webview.luggage.f3(w3Var));
        }
    }
}
