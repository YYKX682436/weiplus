package df2;

/* loaded from: classes3.dex */
public final class r0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.v0 f231206d;

    public r0(df2.v0 v0Var) {
        this.f231206d = v0Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        java.lang.String str;
        int itemId = menuItem.getItemId();
        df2.v0 v0Var = this.f231206d;
        if (itemId == 1) {
            vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
            com.tencent.mm.ui.MMActivity N6 = v0Var.N6();
            ((ub0.r) oVar).getClass();
            com.tencent.mm.pluginsdk.ui.tools.l7.c(N6, 155001, 1, 28, 1, false, null);
            df2.v0.Z6(v0Var, 2, df2.k0.f230531e);
            return;
        }
        if (itemId != 2) {
            return;
        }
        ya2.g gVar = ya2.h.f460484a;
        com.tencent.mm.ui.MMActivity N62 = v0Var.N6();
        ya2.b2 b17 = gVar.b(N62 != null ? xy2.c.e(N62) : null);
        if (b17 == null || (str = b17.field_avatarUrl) == null) {
            return;
        }
        if (!(str.length() > 0)) {
            str = null;
        }
        if (str != null) {
            df2.v0.Z6(v0Var, 2, df2.k0.f230532f);
            com.tencent.mm.plugin.finder.live.util.y.o(v0Var, null, null, new df2.q0(v0Var, str, null), 3, null);
        }
    }
}
