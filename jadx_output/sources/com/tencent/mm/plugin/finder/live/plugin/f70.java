package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class f70 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.v70 f112507d;

    public f70(com.tencent.mm.plugin.finder.live.plugin.v70 v70Var) {
        this.f112507d = v70Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 0) {
            com.tencent.mm.plugin.finder.live.plugin.v70 v70Var = this.f112507d;
            com.tencent.mm.ui.widget.dialog.k0 k0Var = v70Var.C;
            if (k0Var != null) {
                k0Var.u();
            }
            qo0.c.a(v70Var.f114682p, qo0.b.N3, null, 2, null);
            ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
            ml2.j0.f327583i.f328307o = true;
        }
    }
}
