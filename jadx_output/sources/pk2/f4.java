package pk2;

/* loaded from: classes3.dex */
public final class f4 extends qk2.h {

    /* renamed from: h, reason: collision with root package name */
    public final int f355730h;

    /* renamed from: i, reason: collision with root package name */
    public final int f355731i;

    /* renamed from: j, reason: collision with root package name */
    public final int f355732j;

    /* renamed from: k, reason: collision with root package name */
    public final int f355733k;

    /* renamed from: l, reason: collision with root package name */
    public final int f355734l;

    /* renamed from: m, reason: collision with root package name */
    public final int f355735m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.k0 f355736n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f355737o;

    /* renamed from: p, reason: collision with root package name */
    public final int f355738p;

    /* renamed from: q, reason: collision with root package name */
    public final db5.t4 f355739q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4(pk2.o9 helper, int i17) {
        super(helper, i17);
        kotlin.jvm.internal.o.g(helper, "helper");
        this.f355730h = 1;
        this.f355731i = 2;
        this.f355732j = 3;
        this.f355733k = 4;
        this.f355734l = 5;
        this.f355735m = 6;
        this.f355737o = "anchorlive.bottom.tools.screenshare";
        this.f355738p = helper.Q;
        this.f355739q = new pk2.e4(this, helper);
    }

    public static final void D(pk2.f4 f4Var) {
        f4Var.getClass();
        cl0.g gVar = new cl0.g();
        ml2.v2[] v2VarArr = ml2.v2.f328147d;
        gVar.s("type", 2);
        ml2.w2[] w2VarArr = ml2.w2.f328181d;
        gVar.s("result", 2);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.y6((zy2.zb) c17, ml2.z4.H, gVar.toString(), null, 4, null);
    }

    public static final void E(pk2.f4 f4Var) {
        f4Var.getClass();
        cl0.g gVar = new cl0.g();
        ml2.v2[] v2VarArr = ml2.v2.f328147d;
        gVar.s("type", 2);
        ml2.w2[] w2VarArr = ml2.w2.f328181d;
        gVar.s("result", 1);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.y6((zy2.zb) c17, ml2.z4.H, gVar.toString(), null, 4, null);
    }

    @Override // qk2.h
    public void B(pk2.o9 o9Var) {
        java.util.List list;
        java.util.List list2;
        java.util.List list3;
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.t1 t1Var = ml2.t1.f328005y0;
        ml2.j0 j0Var = (ml2.j0) i95.n0.c(ml2.j0.class);
        ml2.s1 s1Var = ml2.s1.f327916f;
        zy2.zb.T8(zbVar, t1Var, j0Var.bj(s1Var), null, null, null, null, false, 124, null);
        i95.m c18 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        zy2.zb.T8((zy2.zb) c18, t1Var, ((ml2.j0) i95.n0.c(ml2.j0.class)).bj(s1Var), null, null, null, null, false, 124, null);
        dk2.ef efVar = dk2.ef.f233372a;
        mm2.o4 o4Var = (mm2.o4) efVar.i(mm2.o4.class);
        boolean z17 = false;
        boolean z18 = (o4Var == null || (list3 = o4Var.f329324s) == null || !(list3.isEmpty() ^ true)) ? false : true;
        pk2.o9 o9Var2 = this.f364427a;
        if (z18) {
            com.tencent.mm.ui.MMActivity mMActivity = o9Var2.f356078d;
            db5.t7.g(mMActivity, mMActivity.getResources().getString(com.tencent.mm.R.string.e3q));
        } else {
            xh2.c cVar = (xh2.c) ((mm2.o4) o9Var2.c(mm2.o4.class)).A.getValue();
            int i17 = cVar != null ? cVar.f454533c : 0;
            com.tencent.mm.ui.MMActivity mMActivity2 = o9Var2.f356078d;
            if (i17 == 1 || i17 == 0) {
                mm2.c1 c1Var = (mm2.c1) efVar.i(mm2.c1.class);
                if (!(c1Var != null && c1Var.A3)) {
                    mm2.o4 o4Var2 = (mm2.o4) efVar.i(mm2.o4.class);
                    if ((o4Var2 == null || (list2 = o4Var2.f329327v) == null || !(list2.isEmpty() ^ true)) ? false : true) {
                        db5.t7.g(mMActivity2, mMActivity2.getResources().getString(com.tencent.mm.R.string.e3q));
                    }
                }
                mm2.c1 c1Var2 = (mm2.c1) efVar.i(mm2.c1.class);
                if (c1Var2 != null && c1Var2.A3) {
                    mm2.o4 o4Var3 = (mm2.o4) efVar.i(mm2.o4.class);
                    if (((o4Var3 == null || (list = o4Var3.f329327v) == null) ? 0 : list.size()) > 3) {
                        db5.t7.g(mMActivity2, mMActivity2.getResources().getString(com.tencent.mm.R.string.f491670lr0));
                    }
                }
                z17 = true;
            } else {
                mm2.c1 c1Var3 = (mm2.c1) efVar.i(mm2.c1.class);
                if (c1Var3 != null && c1Var3.S4) {
                    db5.t7.g(mMActivity2, mMActivity2.getResources().getString(com.tencent.mm.R.string.f491738fm));
                } else {
                    db5.t7.g(mMActivity2, mMActivity2.getResources().getString(com.tencent.mm.R.string.mll));
                }
            }
        }
        if (z17) {
            if (this.f355736n == null) {
                com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) o9Var2.f356078d, 1, true);
                this.f355736n = k0Var;
                k0Var.U1 = true;
            }
            com.tencent.mm.ui.widget.dialog.k0 k0Var2 = this.f355736n;
            if (k0Var2 != null) {
                k0Var2.f211855d2 = true;
            }
            if (k0Var2 != null) {
                k0Var2.f211872n = new pk2.c4(this);
            }
            if (k0Var2 != null) {
                k0Var2.f211881s = this.f355739q;
            }
            if (k0Var2 != null) {
                k0Var2.p(new pk2.d4(this));
            }
            com.tencent.mm.ui.widget.dialog.k0 k0Var3 = this.f355736n;
            if (k0Var3 != null) {
                k0Var3.v();
            }
            cl0.g gVar = new cl0.g();
            ml2.v2[] v2VarArr = ml2.v2.f328147d;
            gVar.s("type", 1);
            ml2.w2[] w2VarArr = ml2.w2.f328181d;
            gVar.s("result", 1);
            i95.m c19 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c19, "getService(...)");
            zy2.zb zbVar2 = (zy2.zb) c19;
            ml2.z4 z4Var = ml2.z4.H;
            zy2.zb.y6(zbVar2, z4Var, gVar.toString(), null, 4, null);
            cl0.g gVar2 = new cl0.g();
            gVar2.s("type", 1);
            gVar2.s("result", 2);
            i95.m c27 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c27, "getService(...)");
            zy2.zb.y6((zy2.zb) c27, z4Var, gVar2.toString(), null, 4, null);
        }
        ll2.e.b(ll2.e.f319133a, this.f355737o, false, false, 6, null);
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f355737o;
    }

    @Override // qk2.f
    public boolean o() {
        pk2.o9 o9Var = this.f364427a;
        if (((mm2.e1) o9Var.c(mm2.e1.class)).b7()) {
            return false;
        }
        zl2.r4 r4Var = zl2.r4.f473950a;
        return (r4Var.p2(((mm2.e1) o9Var.c(mm2.e1.class)).f328989s) || r4Var.z1(o9Var.f356074b) || r4Var.W1(o9Var.f356074b) || ((mm2.e1) o9Var.c(mm2.e1.class)).f7()) ? false : true;
    }

    @Override // qk2.h
    public void v(pk2.o9 o9Var, db5.g4 menu) {
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        kotlin.jvm.internal.o.g(menu, "menu");
        ll2.e.f319133a.j(this.f355737o, false);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.I8((zy2.zb) c17, ml2.u1.f328102y0, ((ml2.j0) i95.n0.c(ml2.j0.class)).bj(ml2.s1.f327916f), null, null, null, null, false, 124, null);
        java.lang.String string = this.f364427a.f356078d.getString(com.tencent.mm.R.string.ec9);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        s(menu, this.f355738p, string, com.tencent.mm.R.raw.icons_outlined_screen_cast);
    }

    @Override // qk2.h
    public int y() {
        return this.f355738p;
    }
}
