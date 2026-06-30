package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class ni0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.vi0 f113636d;

    public ni0(com.tencent.mm.plugin.finder.live.plugin.vi0 vi0Var) {
        this.f113636d = vi0Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.finder.live.plugin.vi0 vi0Var = this.f113636d;
        vi0Var.getClass();
        if (itemId == 0) {
            ml2.n4 n4Var = ml2.n4.f327758x0;
            com.tencent.mars.xlog.Log.i("FinderLiveMicReportUtil", "reportLink21084 action: 56");
            i95.m c17 = i95.n0.c(ml2.r0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ml2.r0.ik((ml2.r0) c17, n4Var, null, 0, 6, null);
            com.tencent.mm.ui.widget.dialog.k0 k0Var = vi0Var.A;
            if (k0Var != null) {
                k0Var.u();
            }
            vi0Var.v1();
            ((ml2.r0) i95.n0.c(ml2.r0.class)).D1 = true;
            qo0.c.a(vi0Var.f114728p, qo0.b.M3, null, 2, null);
        }
    }
}
