package yw3;

/* loaded from: classes.dex */
public final class d4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final yw3.d4 f466717d = new yw3.d4();

    public d4() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.tencent.mm.storage.ja m07 = ((com.tencent.mm.storage.ka) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).hj()).m0("@t.qq.com");
        if (m07 != null) {
            arrayList.add(m07.f195058b);
        }
        arrayList.add("blogapp");
        arrayList.add("tmessage");
        arrayList.add("officialaccounts");
        arrayList.add("service_officialaccounts");
        arrayList.add("helper_entry");
        arrayList.add(c01.z1.r());
        boolean a17 = com.tencent.mm.contact.d.f64855g.a();
        g95.d dVar = g95.e.f269801a;
        p75.m c17 = dVar.g().c(a17 ? dm.e2.Y1.l(kz5.b0.c("0")) : dm.e2.P1.t("'%@%'"));
        p75.d dVar2 = dm.e2.P1;
        p75.m d17 = c17.c(dVar2.s(arrayList)).d(dVar2.j("weixin"));
        p75.n0 n0Var = dm.e2.N1;
        p75.i0 g17 = n0Var.g(kz5.b0.c(dVar2));
        g17.f352656c = "MicroMsg.RepairerMvvmDBDemoUI";
        g17.f352657d = d17;
        g17.f352659f = dVar.h();
        g17.f352661h = 5L;
        g17.f352662i = true;
        p75.l0 a18 = g17.a();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.LinkedList linkedList3 = new java.util.LinkedList();
        linkedList.add(dVar2);
        p75.m0 j17 = dVar2.j("weixin");
        p75.i0 g18 = n0Var.g(linkedList);
        g18.f352657d = j17;
        g18.d(linkedList2);
        g18.b(linkedList3);
        p75.l0 a19 = g18.a();
        java.lang.String str = "SELECT * FROM (" + a18.f352636a + ") UNION SELECT * FROM (" + a19.f352636a + ')';
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.String[] strArr = a18.f352637b;
        if (strArr != null) {
            kz5.h0.w(arrayList2, strArr);
        }
        java.lang.String[] strArr2 = a19.f352637b;
        if (strArr2 != null) {
            kz5.h0.w(arrayList2, strArr2);
        }
        java.lang.String[] strArr3 = (java.lang.String[]) arrayList2.toArray(new java.lang.String[0]);
        long max = java.lang.Math.max(a18.f352670c, a19.f352670c);
        boolean z17 = a18.f352672e || a19.f352672e;
        p75.g1 g1Var = new p75.g1(str + "", strArr3, max, a18.f352671d || a19.f352671d, z17);
        try {
            g1Var.o(gm0.j1.u().f273153f, com.tencent.mm.storage.z3.class);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.RepairerMvvmDBDemoUI", e17, "timeoutBtn", new java.lang.Object[0]);
        }
        try {
            g1Var.k(gm0.j1.u().f273153f, com.tencent.mm.storage.z3.class);
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.RepairerMvvmDBDemoUI", e18, "timeoutBtn", new java.lang.Object[0]);
        }
        try {
            g1Var.p(gm0.j1.u().f273153f);
        } catch (java.lang.Exception e19) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.RepairerMvvmDBDemoUI", e19, "timeoutBtn", new java.lang.Object[0]);
        }
        try {
            g1Var.l(gm0.j1.u().f273153f);
        } catch (java.lang.Exception e27) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.RepairerMvvmDBDemoUI", e27, "timeoutBtn", new java.lang.Object[0]);
        }
        p75.i0 g19 = dm.e2.N1.g(kz5.b0.c(dm.e2.T1));
        g19.f352656c = "MicroMsg.RepairerMvvmDBDemoUI";
        g19.f352657d = d17;
        g19.f352659f = kz5.c0.i(new p75.g("showHead", true), new g95.c());
        g19.f352662i = true;
        p75.l0 a27 = g19.a();
        a27.o(gm0.j1.u().f273153f, com.tencent.mm.storage.z3.class);
        a27.k(gm0.j1.u().f273153f, com.tencent.mm.storage.z3.class);
        a27.m(gm0.j1.u().f273153f);
        a27.i(gm0.j1.u().f273153f);
        a27.n(gm0.j1.u().f273153f);
        a27.j(gm0.j1.u().f273153f);
        return jz5.f0.f302826a;
    }
}
