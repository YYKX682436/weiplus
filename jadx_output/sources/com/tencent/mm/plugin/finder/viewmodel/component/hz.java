package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes.dex */
public final class hz implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ so2.j0 f134680d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.iz f134681e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f134682f;

    public hz(so2.j0 j0Var, com.tencent.mm.plugin.finder.viewmodel.component.iz izVar, android.content.Context context) {
        this.f134680d = j0Var;
        this.f134681e = izVar;
        this.f134682f = context;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.finder.viewmodel.component.iz izVar = this.f134681e;
        android.content.Context context = this.f134682f;
        so2.j0 j0Var = this.f134680d;
        if (itemId == 1) {
            r45.vx0 vx0Var = (r45.vx0) j0Var.f410438d.getCustom(0);
            if (vx0Var != null) {
                long j17 = vx0Var.getLong(0);
                pq5.g l17 = new db2.b0(j17).l();
                l17.I(izVar.getActivity());
                pm0.v.T(l17, new com.tencent.mm.plugin.finder.viewmodel.component.fz(context, j17));
                return;
            }
            return;
        }
        if (itemId != 2) {
            return;
        }
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        r45.vx0 vx0Var2 = (r45.vx0) j0Var.f410438d.getCustom(0);
        long j18 = vx0Var2 != null ? vx0Var2.getLong(0) : 0L;
        com.tencent.mm.plugin.finder.viewmodel.component.gz gzVar = new com.tencent.mm.plugin.finder.viewmodel.component.gz(izVar);
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(context, 1, true);
        k0Var.q(context.getResources().getString(com.tencent.mm.R.string.o17), 17);
        k0Var.f211872n = new ya2.n(1, context);
        k0Var.f211881s = new ya2.o(1, gzVar, context);
        k0Var.f211854d = new ya2.p(gzVar);
        k0Var.f211892z = new ya2.q(1, context, j18);
        k0Var.v();
    }
}
