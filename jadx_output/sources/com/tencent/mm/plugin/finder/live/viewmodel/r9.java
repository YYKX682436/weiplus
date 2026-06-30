package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes.dex */
public final class r9 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.v9 f117368d;

    public r9(com.tencent.mm.plugin.finder.live.viewmodel.v9 v9Var) {
        this.f117368d = v9Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.finder.live.viewmodel.v9 v9Var = this.f117368d;
        if (itemId == 10001) {
            new ke2.l(v9Var.f117503y, c01.id.a() - v9Var.f117504z, new com.tencent.mm.plugin.finder.live.viewmodel.q9(v9Var)).l();
        }
        com.tencent.mm.ui.widget.dialog.k0 k0Var = v9Var.f117491m;
        if (k0Var != null) {
            k0Var.u();
        }
    }
}
