package pk2;

/* loaded from: classes3.dex */
public final class b8 extends qk2.h {

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f355585h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b8(pk2.o9 helper, int i17) {
        super(helper, i17);
        kotlin.jvm.internal.o.g(helper, "helper");
        this.f355585h = "anchorlive.more.sharefriend";
    }

    @Override // qk2.h
    public void B(pk2.o9 o9Var) {
        pk2.c7 c7Var;
        com.tencent.mm.ui.widget.dialog.k0 k0Var;
        pk2.g8 g8Var;
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        boolean E = E();
        java.lang.String str = o9Var.f356072a;
        if (E) {
            com.tencent.mars.xlog.Log.i(str, "share2Friend is disabled");
            return;
        }
        com.tencent.mars.xlog.Log.i(str, "share2Friend isLandscape:" + o9Var.h());
        boolean h17 = o9Var.h();
        pk2.d9 d9Var = o9Var.f356082f;
        if (!h17 || ((com.tencent.mm.ui.bk.A() && !com.tencent.mm.ui.bk.Q()) || zl2.r4.f473950a.x1())) {
            D(o9Var);
            o9Var.j(qo0.b.f365335c3, null);
            if (d9Var != null && (k0Var = d9Var.f355660c) != null) {
                k0Var.u();
            }
            if (d9Var != null && (c7Var = d9Var.f355662e) != null) {
                c7Var.a().h();
            }
        } else {
            o9Var.j(qo0.b.f365335c3, null);
            if (d9Var != null && (g8Var = d9Var.f355658a) != null) {
                ((pk2.k9) g8Var).b(new pk2.z7(this, o9Var));
            }
        }
        zl2.r4 r4Var = zl2.r4.f473950a;
        if (r4Var.w1()) {
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb.T8((zy2.zb) c17, ml2.t1.f327954i, ((ml2.j0) i95.n0.c(ml2.j0.class)).bj(ml2.s1.f327916f), null, null, null, null, false, 124, null);
        } else {
            i95.m c18 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            zy2.zb.T8((zy2.zb) c18, ml2.t1.f327954i, r4Var.l(this.f364427a.f356074b), null, null, null, null, false, 124, null);
        }
        i95.m c19 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c19, "getService(...)");
        zy2.zb.I8((zy2.zb) c19, ml2.u1.f328085t, null, null, null, null, null, false, 126, null);
    }

    public final void D(pk2.o9 o9Var) {
        o25.y1 y1Var;
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        com.tencent.mars.xlog.Log.i(o9Var.f356072a, "share2FriendImpl");
        com.tencent.mm.ui.MMActivity mMActivity = o9Var.f356078d;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = ((mm2.c1) o9Var.c(mm2.c1.class)).f328846n;
        if (finderObject != null) {
            o9Var.k(finderObject, ((mm2.e1) o9Var.c(mm2.e1.class)).f328988r);
            qe2.a.f(finderObject, (mm2.n0) o9Var.c(mm2.n0.class));
            com.tencent.mm.plugin.finder.storage.FinderItem a17 = com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a(finderObject, 16384);
            a17.setEcSource(((mm2.c1) o9Var.c(mm2.c1.class)).f328786c3);
            a17.setShareScene(zl2.r4.f473950a.Z0());
            android.os.Bundle bundle = new android.os.Bundle();
            pk2.d9 d9Var = o9Var.f356082f;
            bundle.putInt("quick_share_item_count", (d9Var == null || (y1Var = d9Var.f355666i) == null) ? 0 : ((com.tencent.mm.pluginsdk.forward.m) y1Var).f188722e);
            i95.m c17 = i95.n0.c(c61.ub.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            c61.ub.ah((c61.ub) c17, mMActivity, a17, bundle, 0, new pk2.a8(o9Var), 8, null);
            ((mm2.c1) o9Var.c(mm2.c1.class)).O1 = false;
        }
    }

    public final boolean E() {
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = ((mm2.c1) this.f364427a.c(mm2.c1.class)).f328846n;
        return finderObject == null || finderObject.getId() == 0 || !hc2.o0.d(finderObject);
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f355585h;
    }

    @Override // qk2.f
    public boolean o() {
        return zl2.r4.f473950a.n(((mm2.c1) this.f364427a.c(mm2.c1.class)).Q1);
    }

    @Override // qk2.h
    public void v(pk2.o9 o9Var, db5.g4 menu) {
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        kotlin.jvm.internal.o.g(menu, "menu");
        int i17 = this.f364428b;
        boolean z17 = i17 == 0 || i17 == 3;
        boolean E = E();
        com.tencent.mars.xlog.Log.i(o9Var.f356072a, "share2Friend is disabled:" + E);
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(E ? com.tencent.mm.R.string.owv : com.tencent.mm.R.string.dyd);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        C(menu.j(0, string, com.tencent.mm.R.raw.finder_icons_filled_share, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.f478502m), E));
        pk2.o9 o9Var2 = this.f364427a;
        if (z17) {
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb.I8((zy2.zb) c17, ml2.u1.f328062m, zl2.r4.f473950a.l(o9Var2.f356074b), null, null, null, null, false, 124, null);
        } else {
            i95.m c18 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            zy2.zb.I8((zy2.zb) c18, ml2.u1.f328062m, zl2.r4.f473950a.l(o9Var2.f356074b), null, null, null, null, false, 124, null);
        }
    }

    @Override // qk2.h
    public boolean x() {
        return !E();
    }

    @Override // qk2.h
    public int y() {
        return 0;
    }
}
