package db2;

/* loaded from: classes.dex */
public class y2 extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public cz2.f f228242t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(java.util.List stats, r45.qt2 qt2Var) {
        super(qt2Var, null, 2, null);
        kotlin.jvm.internal.o.g(stats, "stats");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.sw2 sw2Var = new r45.sw2();
        java.util.ArrayList<r45.vd6> arrayList = new java.util.ArrayList();
        java.util.Iterator it = stats.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (!(((r45.vd6) next).getLong(0) == 0)) {
                arrayList.add(next);
            }
        }
        for (r45.vd6 vd6Var : arrayList) {
            vd6Var.set(10, java.lang.Integer.valueOf(qt2Var != null ? qt2Var.getInteger(5) : 0));
            com.tencent.mm.plugin.finder.report.n4.f125151r0.c(vd6Var, "Finder.CgiFinderStatsReport");
        }
        lVar.f70664a = sw2Var;
        sw2Var.getList(1).addAll(stats);
        sw2Var.set(2, xy2.c.f(qt2Var));
        db2.t4 t4Var = db2.t4.f228171a;
        sw2Var.set(3, t4Var.b(3776, qt2Var));
        sw2Var.set(5, java.lang.Long.valueOf(c01.id.c()));
        r45.dx0 n17 = t4Var.n();
        n17.set(9, B());
        sw2Var.set(4, n17);
        r45.kv0 kv0Var = (r45.kv0) sw2Var.getCustom(3);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(stats, 10));
        java.util.Iterator it6 = stats.iterator();
        while (it6.hasNext()) {
            r45.vd6 vd6Var2 = (r45.vd6) it6.next();
            arrayList2.add(new jz5.o(java.lang.Integer.valueOf(vd6Var2.getInteger(10)), java.lang.Long.valueOf(vd6Var2.getLong(0)), vd6Var2.getString(28)));
        }
        t4Var.h(kv0Var, qt2Var, arrayList2);
        r45.tw2 tw2Var = new r45.tw2();
        tw2Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) tw2Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = tw2Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderstatsreport";
        lVar.f70667d = 3776;
        p(lVar.a());
        this.f228242t = cz2.f.f225004f;
    }

    public synchronized java.util.LinkedList B() {
        java.util.LinkedList linkedList;
        linkedList = new java.util.LinkedList();
        linkedList.addAll(com.tencent.mm.plugin.finder.report.v1.f125393a.f());
        return linkedList;
    }

    @Override // az2.j
    /* renamed from: C */
    public void A(int i17, int i18, java.lang.String str, r45.tw2 resp, com.tencent.mm.modelbase.m1 m1Var) {
        kotlin.jvm.internal.o.g(resp, "resp");
        if (i17 >= 4) {
            this.f228242t = cz2.f.f225002d;
        }
    }

    @Override // az2.j, cz2.j
    public cz2.f v() {
        return this.f228242t;
    }
}
