package pk2;

/* loaded from: classes3.dex */
public final class d8 extends qk2.h {

    /* renamed from: h, reason: collision with root package name */
    public final int f355656h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f355657i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d8(pk2.o9 helper, int i17) {
        super(helper, i17);
        kotlin.jvm.internal.o.g(helper, "helper");
        this.f355656h = helper.f356090j;
        this.f355657i = "anchorlive.more.sharemoments";
    }

    @Override // qk2.h
    public void B(pk2.o9 o9Var) {
        pk2.g8 g8Var;
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        boolean E = E();
        java.lang.String str = o9Var.f356072a;
        if (E) {
            com.tencent.mars.xlog.Log.i(str, "share2SNS is disabled");
            return;
        }
        com.tencent.mars.xlog.Log.i(str, "share2SNS isLandscape:" + o9Var.h());
        if (!o9Var.h() || ((com.tencent.mm.ui.bk.A() && !com.tencent.mm.ui.bk.Q()) || zl2.r4.f473950a.x1())) {
            D(o9Var);
        } else {
            pk2.d9 d9Var = o9Var.f356082f;
            if (d9Var != null && (g8Var = d9Var.f355658a) != null) {
                ((pk2.k9) g8Var).b(new pk2.c8(this, o9Var));
            }
        }
        zl2.r4 r4Var = zl2.r4.f473950a;
        boolean w17 = r4Var.w1();
        pk2.o9 o9Var2 = this.f364427a;
        if (w17) {
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb.T8((zy2.zb) c17, ml2.t1.f327964m, r4Var.l(o9Var2.f356074b), null, null, null, null, false, 124, null);
        } else {
            i95.m c18 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            zy2.zb.T8((zy2.zb) c18, ml2.t1.f327964m, r4Var.l(o9Var2.f356074b), null, null, null, null, false, 124, null);
        }
        i95.m c19 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c19, "getService(...)");
        zy2.zb.I8((zy2.zb) c19, ml2.u1.f328082s, null, null, null, null, null, false, 126, null);
    }

    public final void D(pk2.o9 o9Var) {
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        com.tencent.mars.xlog.Log.i(o9Var.f356072a, "share2SNSImpl");
        com.tencent.mm.ui.MMActivity mMActivity = o9Var.f356078d;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = ((mm2.c1) o9Var.c(mm2.c1.class)).f328846n;
        if (finderObject != null) {
            o9Var.k(finderObject, ((mm2.e1) o9Var.c(mm2.e1.class)).f328988r);
            qe2.a.f(finderObject, (mm2.n0) o9Var.c(mm2.n0.class));
            com.tencent.mm.plugin.finder.storage.FinderItem a17 = com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a(finderObject, 16384);
            a17.setEcSource(((mm2.c1) o9Var.c(mm2.c1.class)).f328786c3);
            a17.setShareScene(zl2.r4.f473950a.Z0());
            i95.m c17 = i95.n0.c(c61.ub.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            c61.ub.I2((c61.ub) c17, mMActivity, new so2.h1(a17), null, 0, 0, 28, null);
            ((mm2.c1) o9Var.c(mm2.c1.class)).O1 = false;
            df2.od odVar = (df2.od) o9Var.e(df2.od.class);
            if (odVar != null) {
                odVar.e7(r45.n72.kActionType_ShareLive);
            }
        }
    }

    public final boolean E() {
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = ((mm2.c1) this.f364427a.c(mm2.c1.class)).f328846n;
        return finderObject == null || finderObject.getId() == 0 || !hc2.o0.f(finderObject);
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f355657i;
    }

    @Override // qk2.f
    public boolean o() {
        return zl2.r4.f473950a.n(((mm2.c1) this.f364427a.c(mm2.c1.class)).Q1);
    }

    @Override // qk2.h
    public void v(pk2.o9 o9Var, db5.g4 menu) {
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        kotlin.jvm.internal.o.g(menu, "menu");
        boolean E = E();
        com.tencent.mars.xlog.Log.i(o9Var.f356072a, "share2Sns is disabled:" + E);
        int i17 = this.f355656h;
        java.lang.String string = o9Var.f356078d.getResources().getString(E ? com.tencent.mm.R.string.owx : com.tencent.mm.R.string.dye);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        C(menu.j(i17, string, com.tencent.mm.R.raw.bottomsheet_icon_moment, 0, E));
        boolean n17 = n();
        pk2.o9 o9Var2 = this.f364427a;
        if (n17) {
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb.I8((zy2.zb) c17, ml2.u1.f328065n, zl2.r4.f473950a.l(o9Var2.f356074b), null, null, null, null, false, 124, null);
        } else {
            i95.m c18 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            zy2.zb.I8((zy2.zb) c18, ml2.u1.f328065n, zl2.r4.f473950a.l(o9Var2.f356074b), null, null, null, null, false, 124, null);
        }
    }

    @Override // qk2.h
    public boolean x() {
        return !E();
    }

    @Override // qk2.h
    public int y() {
        return this.f355656h;
    }
}
