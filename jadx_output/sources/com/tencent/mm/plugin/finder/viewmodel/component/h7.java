package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes.dex */
public final class h7 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ so2.j0 f134590d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.o7 f134591e;

    public h7(so2.j0 j0Var, com.tencent.mm.plugin.finder.viewmodel.component.o7 o7Var) {
        this.f134590d = j0Var;
        this.f134591e = o7Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        r45.vx0 vx0Var;
        if (menuItem.getItemId() != 1 || (vx0Var = (r45.vx0) this.f134590d.f410438d.getCustom(0)) == null) {
            return;
        }
        long j17 = vx0Var.getLong(0);
        pm0.v.T(new db2.b0(j17).l(), new com.tencent.mm.plugin.finder.viewmodel.component.g7(this.f134591e, j17));
    }
}
