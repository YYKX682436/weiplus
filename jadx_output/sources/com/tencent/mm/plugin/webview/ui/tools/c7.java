package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class c7 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.c6 f184074d;

    public c7(com.tencent.mm.plugin.webview.ui.tools.c6 c6Var) {
        this.f184074d = c6Var;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.webview.ui.tools.c6 c6Var = this.f184074d;
        if (itemId == 1) {
            com.tencent.mm.plugin.webview.model.t5.a(c6Var.c().F7(), 1, 1, c6Var.b().getStringExtra("KPublisherId"), c6Var.b().getStringExtra("KAppId"), c6Var.b().getStringExtra("srcUsername"));
            c6Var.c().H8(1);
        } else {
            if (itemId != 2) {
                return;
            }
            com.tencent.mm.plugin.webview.model.t5.a(c6Var.c().F7(), 2, 1, c6Var.b().getStringExtra("KPublisherId"), c6Var.b().getStringExtra("KAppId"), c6Var.b().getStringExtra("srcUsername"));
            c6Var.e0(c6Var.f184055l.containsKey(c6Var.c().f183815f.getUrl()) ? ((java.lang.Integer) c6Var.f184055l.get(c6Var.c().f183815f.getUrl())).intValue() : 0, 1);
        }
    }
}
