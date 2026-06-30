package ze5;

/* loaded from: classes9.dex */
public final class h1 {
    public h1(kotlin.jvm.internal.i iVar) {
    }

    public final boolean a(yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        ot0.q v17;
        if (f9Var == null || dVar == null) {
            return false;
        }
        com.tencent.mm.modelstat.b.d(f9Var, com.tencent.mm.modelstat.a.Click, dVar.f460722q, dVar.k());
        android.app.Activity g17 = dVar.g();
        kotlin.jvm.internal.o.f(g17, "getContext(...)");
        if (te5.t.b(f9Var, g17)) {
            return false;
        }
        ((fq3.w) ((bx1.t) i95.n0.c(bx1.t.class))).Di(f9Var.Q0(), 1);
        java.lang.String j17 = f9Var.j();
        if (j17 == null || (v17 = ot0.q.v(c01.w9.l(dVar.D(), f9Var.j(), f9Var.A0()))) == null) {
            return false;
        }
        ot0.o0 a17 = ot0.o0.a(j17);
        ((rq3.k) ((cc0.l) i95.n0.c(cc0.l.class))).Zi(f9Var.getMsgId(), f9Var.Q0(), 4);
        int i17 = a17.f348617b;
        if (i17 != 0) {
            v17.f348666i = i17;
        }
        lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
        java.lang.String str = v17.f348646d;
        ((kt.c) i0Var).getClass();
        com.tencent.mm.pluginsdk.model.app.m j18 = com.tencent.mm.pluginsdk.model.app.w.j(str, false, false);
        java.lang.String t17 = com.tencent.mm.ui.chatting.viewitems.a0.t(dVar, f9Var);
        if (t17 == null) {
            t17 = "";
        }
        java.lang.String str2 = t17;
        if (j18 != null) {
            com.tencent.mm.ui.chatting.w5.e(dVar, v17, str2, j18, f9Var.I0(), dVar.x());
        }
        sc5.g gVar = sc5.g.f406572a;
        android.app.Activity g18 = dVar.g();
        kotlin.jvm.internal.o.f(g18, "getContext(...)");
        java.lang.String str3 = dVar.f460722q;
        kotlin.jvm.internal.o.f(str3, "getSessionConv(...)");
        gVar.f(g18, f9Var, new sc5.h(str3));
        return true;
    }
}
