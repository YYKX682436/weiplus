package vf0;

/* loaded from: classes12.dex */
public final class f3 extends jm0.g implements wf0.j1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(jm0.o service) {
        super(service);
        kotlin.jvm.internal.o.g(service, "service");
    }

    @Override // jm0.g
    public void P6(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        ((vf0.y2) ((wf0.b2) i95.n0.c(wf0.b2.class))).Zi(this);
    }

    @Override // jm0.g
    public void S6() {
        ((vf0.y2) ((wf0.b2) i95.n0.c(wf0.b2.class))).mj(this);
    }

    @Override // wf0.j1
    public void l1(qi3.e0 event) {
        t21.v2 d17;
        t21.v2 d18;
        vf0.i3 i3Var;
        kotlin.jvm.internal.o.g(event, "event");
        zf0.v0 v0Var = (zf0.v0) event.f363692b;
        vf0.h3 h3Var = v0Var != null ? v0Var.f472563i : null;
        if (event.f363691a == qi3.g0.f363708g) {
            pt0.e0 e0Var = pt0.f0.f358209b1;
            com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker = event.f363697g;
            java.lang.String a17 = msgIdTalker != null ? msgIdTalker.a() : null;
            com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker2 = event.f363697g;
            com.tencent.mm.storage.f9 k17 = e0Var.k(a17, msgIdTalker2 != null ? msgIdTalker2.f149480d : 0L);
            if (k17 == null || (d18 = vf0.m3.d(k17)) == null) {
                return;
            }
            tg3.u0 u0Var = (tg3.u0) i95.n0.c(tg3.u0.class);
            oi3.h hVar = h3Var != null ? h3Var.f436178e : null;
            bm5.f0 f0Var = bm5.f0.f22571s;
            java.lang.String sj6 = ((k90.b) u0Var).sj(hVar, f0Var, d18.d(), true);
            wf0.m1 m1Var = (wf0.m1) i95.n0.c(wf0.m1.class);
            java.lang.String f17 = d18.f();
            wf0.l1 l1Var = new wf0.l1(d18.d(), f0Var);
            java.lang.String h17 = d18.h();
            vf0.j3 j3Var = (h3Var == null || (i3Var = h3Var.f436177d) == null) ? null : i3Var.f436196a;
            ((t21.i2) m1Var).Di(f17, sj6, l1Var, h17, "", "", (j3Var == null ? -1 : vf0.e3.f436155a[j3Var.ordinal()]) == 1 ? 3 : 1, 2);
        }
        if (!vf0.m3.j(event) || h3Var == null) {
            return;
        }
        pt0.e0 e0Var2 = pt0.f0.f358209b1;
        com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker3 = event.f363697g;
        java.lang.String a18 = msgIdTalker3 != null ? msgIdTalker3.a() : null;
        com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker4 = event.f363697g;
        com.tencent.mm.storage.f9 k18 = e0Var2.k(a18, msgIdTalker4 != null ? msgIdTalker4.f149480d : 0L);
        if (k18 == null || (d17 = vf0.m3.d(k18)) == null) {
            return;
        }
        ((t21.i2) ((wf0.m1) i95.n0.c(wf0.m1.class))).Ri(h3Var.f436188o.f436142c, new wf0.l1(d17.d(), bm5.f0.f22571s), !com.tencent.mm.sdk.platformtools.t8.K0(d17.M) ? d17.M : c01.ia.v(k18.G), k18.I0());
    }
}
