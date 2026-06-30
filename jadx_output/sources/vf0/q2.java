package vf0;

/* loaded from: classes12.dex */
public final class q2 extends jm0.g implements wf0.j1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(jm0.o service) {
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
        vf0.h3 h3Var;
        t21.v2 d17;
        kotlin.jvm.internal.o.g(event, "event");
        zf0.v0 v0Var = (zf0.v0) event.f363692b;
        if (v0Var == null || (h3Var = v0Var.f472563i) == null || !vf0.m3.j(event)) {
            return;
        }
        pt0.e0 e0Var = pt0.f0.f358209b1;
        com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker = event.f363697g;
        java.lang.String a17 = msgIdTalker != null ? msgIdTalker.a() : null;
        com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker2 = event.f363697g;
        com.tencent.mm.storage.f9 k17 = e0Var.k(a17, msgIdTalker2 != null ? msgIdTalker2.f149480d : 0L);
        if (k17 == null || (d17 = vf0.m3.d(k17)) == null) {
            return;
        }
        tg3.u0 u0Var = (tg3.u0) i95.n0.c(tg3.u0.class);
        bm5.f0 f0Var = bm5.f0.f22571s;
        java.lang.String rj6 = ((k90.b) u0Var).rj(null, f0Var, d17.d(), false);
        vf0.g3 h17 = vf0.m3.h(((t21.i2) ((wf0.m1) i95.n0.c(wf0.m1.class))).Ai(new wf0.l1(d17.d(), f0Var)));
        ci0.r rVar = (ci0.r) i95.n0.c(ci0.r.class);
        long j17 = d17.f415004c;
        java.lang.String str = h3Var.f436174a;
        int i17 = h17.f436170a;
        y15.c n17 = h3Var.f436179f.n();
        ((pc0.g) rVar).wi(rj6, j17, str, i17, n17.getInteger(n17.f458922d + 22));
    }
}
