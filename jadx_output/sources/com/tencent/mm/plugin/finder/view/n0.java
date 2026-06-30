package com.tencent.mm.plugin.finder.view;

/* loaded from: classes10.dex */
public final class n0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.o0 f132676d;

    public n0(com.tencent.mm.plugin.finder.view.o0 o0Var) {
        this.f132676d = o0Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.plugin.finder.view.p0 p0Var;
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.finder.view.o0 o0Var = this.f132676d;
        if (itemId == 9) {
            com.tencent.mm.plugin.finder.view.p0 p0Var2 = o0Var.f132757h;
            if (p0Var2 != null) {
                p0Var2.b(o0Var.f132755f, false);
                return;
            }
            return;
        }
        if (itemId != 10 || (p0Var = o0Var.f132757h) == null) {
            return;
        }
        p0Var.b(o0Var.f132755f, true);
    }
}
