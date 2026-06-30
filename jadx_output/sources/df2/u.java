package df2;

/* loaded from: classes3.dex */
public final class u implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.y f231484d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.y1 f231485e;

    public u(df2.y yVar, com.tencent.mm.ui.widget.dialog.y1 y1Var) {
        this.f231484d = yVar;
        this.f231485e = y1Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() != 1) {
            this.f231485e.s();
            return;
        }
        df2.o oVar = (df2.o) this.f231484d.getStore().controller(df2.o.class);
        if (oVar != null) {
            com.tencent.mm.plugin.finder.live.util.y.o(oVar, null, null, new df2.n(oVar, null), 3, null);
        }
        ((ml2.j0) i95.n0.c(ml2.j0.class)).zj(ml2.c5.f327345p);
    }
}
