package rv0;

/* loaded from: classes5.dex */
public final class s0 implements gy0.j {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.maas.model.time.MJTime f400226a = com.tencent.maas.model.time.MJTime.ZeroTime;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f400227b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f400228c;

    public s0(rv0.n1 n1Var, ex0.a0 a0Var) {
        this.f400227b = n1Var;
        this.f400228c = a0Var;
    }

    @Override // gy0.j
    public void a(boolean z17) {
        rv0.n1 n1Var = this.f400227b;
        com.tencent.maas.model.time.MJTime fromSeconds = com.tencent.maas.model.time.MJTime.fromSeconds(n1Var.r7().getCurrentScrolledX() / this.f400228c.s(n1Var.r7().getTimelineLayoutType()));
        gx0.bf p76 = n1Var.p7();
        kotlin.jvm.internal.o.d(fromSeconds);
        gx0.bf.q7(p76, fromSeconds, true, 0L, 4, null);
        n1Var.v7(fromSeconds);
        kotlinx.coroutines.l.d(n1Var.getMainScope(), null, null, new rv0.o0(n1Var, fromSeconds, null), 3, null);
    }

    @Override // gy0.j
    public void b(boolean z17, boolean z18) {
        double s17;
        double seconds;
        double s18;
        ex0.r n17 = this.f400228c.n();
        if (n17 == null) {
            return;
        }
        rv0.n1 n1Var = this.f400227b;
        if (!z18) {
            kotlinx.coroutines.l.d(n1Var.getMainScope(), null, null, new rv0.p0(n1Var, null), 3, null);
            return;
        }
        com.tencent.maas.model.time.MJTime k17 = z17 ? n17.k() : n17.l().getEndTime().sub(com.tencent.maas.model.time.MJTime.fromSeconds(0.1d));
        kotlin.jvm.internal.o.d(k17);
        n1Var.y7(k17);
        n1Var.getClass();
        ex0.a0 s76 = n1Var.s7();
        if (s76 != null) {
            com.tencent.maas.model.time.MJTime k18 = z17 ? n17.k() : n17.l().getEndTime();
            if (z17) {
                s17 = s76.s(n1Var.r7().getTimelineLayoutType());
                seconds = k18.toSeconds();
            } else if (s76.E(n17.f257168b) || n17.f257170d) {
                s17 = s76.s(n1Var.r7().getTimelineLayoutType());
                seconds = k18.toSeconds();
            } else {
                s18 = (s76.s(n1Var.r7().getTimelineLayoutType()) * k18.toSeconds()) - (n1Var.r7().getGapWidth() / 2);
                n1Var.r7().g(s18);
            }
            s18 = s17 * seconds;
            n1Var.r7().g(s18);
        }
        kotlinx.coroutines.l.d(n1Var.getMainScope(), null, null, new rv0.q0(n1Var, k17, this, null), 3, null);
    }

    @Override // gy0.j
    public void c(boolean z17) {
        rv0.n1 n1Var = this.f400227b;
        n1Var.R6().V6();
        ex0.a0 a0Var = this.f400228c;
        ex0.r n17 = a0Var.n();
        ex0.f fVar = n17 instanceof ex0.f ? (ex0.f) n17 : null;
        if (fVar != null) {
            ex0.r n76 = n1Var.n7();
            if ((n76 != null ? n76.f257169c : null) == ug.m.Music) {
                a0Var.I(fVar);
            }
        }
        com.tencent.maas.model.time.MJTime mJTime = (com.tencent.maas.model.time.MJTime) a0Var.f257106p.getValue();
        if (mJTime == null) {
            mJTime = com.tencent.maas.model.time.MJTime.ZeroTime;
        }
        this.f400226a = mJTime;
        kotlinx.coroutines.l.d(n1Var.getMainScope(), null, null, new rv0.r0(n1Var, null), 3, null);
    }

    @Override // gy0.j
    public void d() {
    }

    @Override // gy0.j
    public void e() {
        rv0.n1 n1Var = this.f400227b;
        com.tencent.maas.model.time.MJTime fromSeconds = com.tencent.maas.model.time.MJTime.fromSeconds(n1Var.r7().getCurrentScrolledX() / this.f400228c.s(n1Var.r7().getTimelineLayoutType()));
        gx0.bf p76 = n1Var.p7();
        kotlin.jvm.internal.o.d(fromSeconds);
        gx0.bf.q7(p76, fromSeconds, false, 0L, 4, null);
        n1Var.v7(fromSeconds);
    }

    @Override // gy0.j
    public void f() {
    }

    @Override // gy0.j
    public void g() {
    }

    @Override // gy0.j
    public void h() {
    }

    @Override // gy0.j
    public void i() {
        rv0.n1 n1Var = this.f400227b;
        kotlinx.coroutines.l.d(n1Var.getMainScope(), null, null, new rv0.m1(n1Var, null), 3, null);
        ex0.a0 s76 = n1Var.s7();
        if (s76 == null) {
            return;
        }
        ex0.r n17 = s76.n();
        ex0.f fVar = n17 instanceof ex0.f ? (ex0.f) n17 : null;
        if (fVar == null) {
            return;
        }
        if (fVar.f257169c == ug.m.ImageClip) {
            gx0.bf p76 = n1Var.p7();
            com.tencent.maas.model.time.MJTime ZeroTime = com.tencent.maas.model.time.MJTime.ZeroTime;
            kotlin.jvm.internal.o.f(ZeroTime, "ZeroTime");
            p76.b7(ZeroTime, false);
            return;
        }
        com.tencent.maas.model.time.MJTimeRange m17 = fVar.m();
        if (m17 == null) {
            return;
        }
        int ordinal = fVar.f257134j.ordinal();
        if (ordinal == 1) {
            gx0.bf p77 = n1Var.p7();
            com.tencent.maas.model.time.MJTime startTime = m17.getStartTime();
            kotlin.jvm.internal.o.f(startTime, "getStartTime(...)");
            p77.b7(startTime, false);
            return;
        }
        if (ordinal != 2) {
            return;
        }
        gx0.bf p78 = n1Var.p7();
        com.tencent.maas.model.time.MJTime endTime = m17.getEndTime();
        kotlin.jvm.internal.o.f(endTime, "getEndTime(...)");
        p78.b7(endTime, false);
    }
}
