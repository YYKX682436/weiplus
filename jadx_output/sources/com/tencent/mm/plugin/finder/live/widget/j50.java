package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class j50 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.q50 f118726d;

    public j50(com.tencent.mm.plugin.finder.live.widget.q50 q50Var) {
        this.f118726d = q50Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        java.lang.Object obj;
        com.tencent.mm.plugin.finder.live.widget.q50 q50Var = this.f118726d;
        com.tencent.mm.plugin.finder.live.widget.o40 o40Var = q50Var.A1;
        com.tencent.mm.plugin.finder.live.widget.n40 n40Var = com.tencent.mm.plugin.finder.live.widget.o40.f119250e;
        int itemId = menuItem.getItemId();
        n40Var.getClass();
        java.util.Iterator it = ((kz5.h) com.tencent.mm.plugin.finder.live.widget.o40.f119255m).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((com.tencent.mm.plugin.finder.live.widget.o40) obj).f119256d == itemId) {
                    break;
                }
            }
        }
        com.tencent.mm.plugin.finder.live.widget.o40 o40Var2 = (com.tencent.mm.plugin.finder.live.widget.o40) obj;
        if (o40Var2 == null) {
            o40Var2 = com.tencent.mm.plugin.finder.live.widget.o40.f119251f;
        }
        if (o40Var2 == o40Var) {
            return;
        }
        q50Var.j0(o40Var2);
    }
}
