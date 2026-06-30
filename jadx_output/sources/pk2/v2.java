package pk2;

/* loaded from: classes3.dex */
public final class v2 extends qk2.h {

    /* renamed from: h, reason: collision with root package name */
    public final int f356300h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f356301i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(pk2.o9 helper, int i17) {
        super(helper, i17);
        kotlin.jvm.internal.o.g(helper, "helper");
        this.f356300h = helper.f356106r;
        this.f356301i = "anchorlive.more.pauselive";
    }

    @Override // qk2.h
    public void B(pk2.o9 o9Var) {
        pk2.g8 g8Var;
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.T8((zy2.zb) c17, ml2.t1.f328004y, ((ml2.j0) i95.n0.c(ml2.j0.class)).bj(ml2.s1.f327916f), null, null, null, null, false, 124, null);
        in0.q e17 = dk2.ef.f233372a.e();
        java.lang.String str = o9Var.f356072a;
        if (e17 == null) {
            com.tencent.mars.xlog.Log.e(str, "pauseLive wasn't anchor!");
            return;
        }
        kotlin.jvm.internal.o.f(((mm2.o4) o9Var.c(mm2.o4.class)).f329327v, "<get-audienceLinkMicUserList>(...)");
        if (!(!r2.isEmpty()) && ((mm2.o4) o9Var.c(mm2.o4.class)).f329324s.size() <= 0) {
            dk2.xf f17 = o9Var.f();
            if (f17 != null) {
                ((dk2.r4) f17).d0(1, 0, new pk2.u2(o9Var));
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.i(str, "pauseLive mick linking!");
        pk2.d9 d9Var = o9Var.f356082f;
        if (d9Var == null || (g8Var = d9Var.f355658a) == null) {
            return;
        }
        com.tencent.mm.plugin.finder.live.view.ub ubVar = ((pk2.k9) g8Var).f355924a.f291099e;
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = ubVar instanceof com.tencent.mm.plugin.finder.live.view.k0 ? (com.tencent.mm.plugin.finder.live.view.k0) ubVar : null;
        if (k0Var != null) {
            k0Var.showAlertDialog(o9Var.f356078d, "", com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.e3q), "");
        }
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f356301i;
    }

    @Override // qk2.f
    public boolean o() {
        if (((mm2.c1) this.f364427a.c(mm2.c1.class)).f328778a5) {
            return false;
        }
        return in0.q.f292769b2 != null;
    }

    @Override // qk2.h
    public void v(pk2.o9 o9Var, db5.g4 menu) {
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        kotlin.jvm.internal.o.g(menu, "menu");
        java.lang.String string = o9Var.f356078d.getResources().getString(com.tencent.mm.R.string.e3t);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        s(menu, this.f356300h, string, com.tencent.mm.R.raw.finder_icons_filled_pause);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.I8((zy2.zb) c17, ml2.u1.D, ((ml2.j0) i95.n0.c(ml2.j0.class)).bj(ml2.s1.f327916f), null, null, null, null, false, 124, null);
    }

    @Override // qk2.h
    public int y() {
        return this.f356300h;
    }
}
