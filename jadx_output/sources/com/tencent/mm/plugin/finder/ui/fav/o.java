package com.tencent.mm.plugin.finder.ui.fav;

/* loaded from: classes.dex */
public final class o implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.fav.p f129193d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f129194e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f129195f;

    public o(com.tencent.mm.plugin.finder.ui.fav.p pVar, android.view.View view, int i17) {
        this.f129193d = pVar;
        this.f129194e = view;
        this.f129195f = i17;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        jz5.f0 f0Var = null;
        if (menuItem != null) {
            int itemId = menuItem.getItemId();
            com.tencent.mm.plugin.finder.ui.fav.p pVar = this.f129193d;
            if (itemId == pVar.f129199m) {
                android.content.Context context = this.f129194e.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(context, 1, true);
                k0Var.r(context.getString(com.tencent.mm.R.string.dep), 17, i65.a.b(context, 12), null);
                k0Var.f211872n = new com.tencent.mm.plugin.finder.ui.fav.j(pVar, context);
                k0Var.f211881s = new com.tencent.mm.plugin.finder.ui.fav.l(pVar, this.f129195f);
                k0Var.v();
            }
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e("FinderGlobalFavPresenter", "[OnMMMenuItemSelectedListener] item = null!!");
        }
    }
}
