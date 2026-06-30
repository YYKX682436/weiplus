package km4;

/* loaded from: classes11.dex */
public final class t extends com.tencent.mm.sdk.event.n {
    public t() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.RepairerActionEvent event = (com.tencent.mm.autogen.events.RepairerActionEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        if (!gm0.j1.a()) {
            return false;
        }
        am.uq uqVar = event.f54679g;
        if (kotlin.jvm.internal.o.b(uqVar.f8126b, new com.tencent.mm.repairer.config.ting.RepairerConfigTingPlayerParams().l())) {
            ml4.b.f328407a.a();
            return false;
        }
        boolean z17 = true;
        if (kotlin.jvm.internal.o.b(uqVar.f8126b, new com.tencent.mm.repairer.config.ting.RepairerEditValueTingPlayListenId().l())) {
            java.lang.String str = uqVar.f8127c;
            if (str != null && !r26.n0.N(str)) {
                z17 = false;
            }
            if (z17) {
                return false;
            }
            qk.g9 g9Var = (qk.g9) i95.n0.c(qk.g9.class);
            kotlin.jvm.internal.o.d(str);
            ((rk4.z8) g9Var).sj(str, new il4.e(null, 0, 1300, false, null, null, 0, 0, false, false, null, null, null, null, null, null, false, false, null, null, false, null, false, null, false, 33554427, null));
            return false;
        }
        if (!kotlin.jvm.internal.o.b(uqVar.f8126b, new com.tencent.mm.repairer.config.ting.RepairerEditValueTingPlayUrl().l())) {
            return false;
        }
        java.lang.String str2 = uqVar.f8127c;
        if (str2 == null || r26.n0.N(str2)) {
            return false;
        }
        kotlin.jvm.internal.o.d(str2);
        bw5.v70 v70Var = new bw5.v70();
        v70Var.y(1);
        v70Var.x("测试标题");
        v70Var.p("测试作者");
        bw5.z90 z90Var = new bw5.z90();
        z90Var.z(str2);
        v70Var.w(z90Var);
        bw5.lp0 lp0Var = new bw5.lp0();
        lp0Var.j(v70Var);
        lp0Var.g("URL-" + java.lang.System.currentTimeMillis());
        bw5.fq0 fq0Var = new bw5.fq0();
        fq0Var.c(1.0f);
        fq0Var.d(0);
        lp0Var.i(fq0Var);
        bw5.gq0 gq0Var = new bw5.gq0();
        gq0Var.f27952e = str2;
        gq0Var.f27967w[2] = true;
        lp0Var.f29893f = gq0Var;
        lp0Var.f29905u[4] = true;
        ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).qj("", lp0Var, new il4.e(null, 0, 1300, false, null, null, 0, 0, false, false, null, null, null, null, null, null, false, false, null, null, false, null, false, null, false, 33554427, null));
        return false;
    }
}
