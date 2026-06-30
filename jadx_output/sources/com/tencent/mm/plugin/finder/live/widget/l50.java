package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class l50 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.q50 f118907d;

    public l50(com.tencent.mm.plugin.finder.live.widget.q50 q50Var) {
        this.f118907d = q50Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        java.lang.Object obj;
        com.tencent.mm.plugin.finder.live.widget.q50 q50Var = this.f118907d;
        com.tencent.mm.plugin.finder.live.widget.m40 m40Var = q50Var.B1;
        com.tencent.mm.plugin.finder.live.widget.l40 l40Var = com.tencent.mm.plugin.finder.live.widget.m40.f119035e;
        int itemId = menuItem.getItemId();
        l40Var.getClass();
        java.util.Iterator it = ((kz5.h) com.tencent.mm.plugin.finder.live.widget.m40.f119039i).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((com.tencent.mm.plugin.finder.live.widget.m40) obj).f119040d == itemId) {
                    break;
                }
            }
        }
        com.tencent.mm.plugin.finder.live.widget.m40 m40Var2 = (com.tencent.mm.plugin.finder.live.widget.m40) obj;
        if (m40Var2 == null) {
            m40Var2 = com.tencent.mm.plugin.finder.live.widget.m40.f119036f;
        }
        if (m40Var2 == m40Var) {
            return;
        }
        q50Var.B1 = m40Var2;
        q50Var.j0(m40Var2 == com.tencent.mm.plugin.finder.live.widget.m40.f119036f ? com.tencent.mm.plugin.finder.live.widget.o40.f119251f : com.tencent.mm.plugin.finder.live.widget.o40.f119252g);
    }
}
