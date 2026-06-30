package pk2;

/* loaded from: classes3.dex */
public final class wb extends qk2.h {

    /* renamed from: h, reason: collision with root package name */
    public final int f356339h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f356340i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wb(pk2.o9 helper, int i17) {
        super(helper, i17);
        kotlin.jvm.internal.o.g(helper, "helper");
        this.f356339h = helper.f356118x;
        this.f356340i = "";
    }

    @Override // qk2.h
    public void B(pk2.o9 o9Var) {
        pk2.g8 g8Var;
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        com.tencent.mars.xlog.Log.i(o9Var.f356072a, "share2Friend isLandscape:" + o9Var.h());
        if (!o9Var.h() || (com.tencent.mm.ui.bk.A() && !com.tencent.mm.ui.bk.Q())) {
            D(o9Var);
            o9Var.j(qo0.b.f365335c3, null);
            return;
        }
        o9Var.j(qo0.b.f365335c3, null);
        pk2.d9 d9Var = o9Var.f356082f;
        if (d9Var == null || (g8Var = d9Var.f355658a) == null) {
            return;
        }
        ((pk2.k9) g8Var).b(new pk2.tb(this, o9Var));
    }

    public final void D(pk2.o9 o9Var) {
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        pk2.f8.f355747a.c(5, 2, null);
        dk2.ef efVar = dk2.ef.f233372a;
        tn0.w0 w0Var = dk2.ef.f233378d;
        if (w0Var != null && w0Var.X()) {
            db5.t7.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.e2h, 1).show();
            return;
        }
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.T8((zy2.zb) c17, ml2.t1.f327934a2, kz5.c1.l(new jz5.l("liveId", java.lang.String.valueOf(((mm2.e1) o9Var.c(mm2.e1.class)).f328988r.getLong(0))), new jz5.l("feedId", java.lang.String.valueOf(((mm2.e1) o9Var.c(mm2.e1.class)).f328983m)), new jz5.l("panel_sence", "3")), null, null, null, null, false, 124, null);
        mm2.e1 e1Var = (mm2.e1) o9Var.c(mm2.e1.class);
        long j17 = e1Var.f328983m;
        java.lang.String str = e1Var.f328992v;
        java.lang.String str2 = e1Var.f328984n;
        com.tencent.mm.ui.MMActivity activity = o9Var.f356078d;
        kotlin.jvm.internal.o.g(activity, "activity");
        pq5.g l17 = new ek2.u0(j17, str, str2, 1, 0, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) pf5.z.f353948a.a(activity).c(zy2.ra.class))).V6(), 1).l();
        l17.K(new pk2.vb(o9Var));
        l17.f(activity);
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f356340i;
    }

    @Override // qk2.f
    public boolean o() {
        return true;
    }

    @Override // qk2.h
    public void v(pk2.o9 o9Var, db5.g4 menu) {
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        kotlin.jvm.internal.o.g(menu, "menu");
        menu.g(this.f356339h, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.gyz), com.tencent.mm.R.raw.finder_live_dislike);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.I8((zy2.zb) c17, ml2.u1.S1, kz5.c1.l(new jz5.l("liveId", java.lang.String.valueOf(((mm2.e1) o9Var.c(mm2.e1.class)).f328988r.getLong(0))), new jz5.l("feedId", java.lang.String.valueOf(((mm2.e1) o9Var.c(mm2.e1.class)).f328983m)), new jz5.l("panel_sence", "3")), null, null, null, null, false, 124, null);
        pk2.f8.f355747a.c(5, 1, null);
    }

    @Override // qk2.h
    public int y() {
        return this.f356339h;
    }
}
