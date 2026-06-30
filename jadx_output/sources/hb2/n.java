package hb2;

/* loaded from: classes2.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final hb2.n f280072d = new hb2.n();

    public n() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        r45.y31 y31Var;
        java.util.LinkedList list;
        int a17 = hc2.d0.a(hc2.d0.d(4));
        bu2.d0 d0Var = bu2.e0.f24498a;
        d0Var.l(a17);
        java.util.LinkedList list2 = bu2.e0.f24502e.a(a17).f24493c.getList(0);
        if (list2 != null && (y31Var = (r45.y31) kz5.n0.a0(list2, 0)) != null && (list = y31Var.getList(0)) != null) {
            kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
            pm0.v.d0(list, new bu2.x(7, c0Var));
            if (c0Var.f310112d) {
                d0Var.b(bu2.e0.f24502e.a(a17));
            }
        }
        pf5.u uVar = pf5.u.f353936a;
        java.util.List list3 = ((ey2.t0) uVar.e(c61.l7.class).a(ey2.t0.class)).N6(4).f257443c;
        kotlin.jvm.internal.o.f(list3, "<get-lastDataList>(...)");
        if (pm0.v.c0(list3, hb2.m.f280070d)) {
            hb2.q.f280082e.getClass();
            com.tencent.mars.xlog.Log.i(hb2.q.f280083f, "clean lastExitPosition");
            ((ey2.t0) uVar.e(c61.l7.class).a(ey2.t0.class)).N6(4).f257445e = 0;
        }
        return jz5.f0.f302826a;
    }
}
