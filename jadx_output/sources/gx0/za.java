package gx0;

/* loaded from: classes5.dex */
public final class za implements gy0.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gy0.j f277277a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.maas.model.time.MJTime f277278b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ gx0.ac f277279c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f277280d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f277281e;

    public za(gx0.ac acVar, ex0.a0 a0Var, int i17) {
        this.f277279c = acVar;
        this.f277280d = a0Var;
        this.f277281e = i17;
        if (!gy0.j.class.isInterface()) {
            throw new java.lang.IllegalArgumentException("T must be an interface".toString());
        }
        java.lang.Object newProxyInstance = java.lang.reflect.Proxy.newProxyInstance(gy0.j.class.getClassLoader(), new java.lang.Class[]{gy0.j.class}, pm0.v.f356803b);
        if (newProxyInstance == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type com.tencent.mm.mj_publisher.finder.widgets.timelineview.itemDecoration.TimelineItemDecoration.TimelineItemDecorationTrimListener");
        }
        this.f277277a = (gy0.j) newProxyInstance;
        this.f277278b = com.tencent.maas.model.time.MJTime.ZeroTime;
    }

    @Override // gy0.j
    public void a(boolean z17) {
        gx0.ac acVar = this.f277279c;
        com.tencent.maas.model.time.MJTime fromSeconds = com.tencent.maas.model.time.MJTime.fromSeconds(acVar.A7().getCurrentScrolledX() / this.f277280d.s(acVar.A7().getTimelineLayoutType()));
        gx0.bf c86 = acVar.c8();
        kotlin.jvm.internal.o.d(fromSeconds);
        gx0.bf.q7(c86, fromSeconds, true, 0L, 4, null);
        acVar.g8(fromSeconds);
        kotlinx.coroutines.l.d(acVar.getMainScope(), null, null, new gx0.xa(acVar, fromSeconds, null), 3, null);
    }

    @Override // gy0.j
    public void b(boolean z17, boolean z18) {
        double s17;
        double seconds;
        double s18;
        ex0.r n17 = this.f277280d.n();
        if (n17 != null && z18) {
            com.tencent.maas.model.time.MJTime k17 = z17 ? n17.k() : n17.l().getEndTime().sub(com.tencent.maas.model.time.MJTime.fromSeconds(0.1d));
            kotlin.jvm.internal.o.d(k17);
            gx0.ac acVar = this.f277279c;
            acVar.k8(k17);
            acVar.getClass();
            ex0.a0 e86 = acVar.e8();
            if (e86 != null) {
                com.tencent.maas.model.time.MJTime k18 = z17 ? n17.k() : n17.l().getEndTime();
                if (z17) {
                    s17 = e86.s(acVar.A7().getTimelineLayoutType());
                    seconds = k18.toSeconds();
                } else if (e86.E(n17.f257168b) || n17.f257170d) {
                    s17 = e86.s(acVar.A7().getTimelineLayoutType());
                    seconds = k18.toSeconds();
                } else {
                    s18 = (e86.s(acVar.A7().getTimelineLayoutType()) * k18.toSeconds()) - (acVar.A7().getGapWidth() / 2);
                    acVar.A7().g(s18);
                }
                s18 = s17 * seconds;
                acVar.A7().g(s18);
            }
            kotlinx.coroutines.l.d(acVar.getMainScope(), null, null, new gx0.ya(acVar, k17, this, null), 3, null);
        }
    }

    @Override // gy0.j
    public void c(boolean z17) {
        this.f277279c.R6().V6();
        com.tencent.maas.model.time.MJTime mJTime = (com.tencent.maas.model.time.MJTime) this.f277280d.f257106p.getValue();
        if (mJTime == null) {
            mJTime = com.tencent.maas.model.time.MJTime.ZeroTime;
        }
        this.f277278b = mJTime;
    }

    @Override // gy0.j
    public void d() {
        this.f277277a.d();
    }

    @Override // gy0.j
    public void e() {
        gx0.ac acVar = this.f277279c;
        com.tencent.maas.model.time.MJTime fromSeconds = com.tencent.maas.model.time.MJTime.fromSeconds(acVar.A7().getCurrentScrolledX() / this.f277280d.s(acVar.A7().getTimelineLayoutType()));
        gx0.bf c86 = acVar.c8();
        kotlin.jvm.internal.o.d(fromSeconds);
        gx0.bf.q7(c86, fromSeconds, false, 0L, 4, null);
        acVar.g8(fromSeconds);
    }

    @Override // gy0.j
    public void f() {
        this.f277277a.f();
    }

    @Override // gy0.j
    public void g() {
        this.f277277a.g();
    }

    @Override // gy0.j
    public void h() {
        this.f277277a.h();
    }

    @Override // gy0.j
    public void i() {
        ex0.r n17 = this.f277280d.n();
        ex0.f fVar = n17 instanceof ex0.f ? (ex0.f) n17 : null;
        if (fVar == null) {
            return;
        }
        gx0.ac acVar = this.f277279c;
        if (acVar.A7().getTimelineLayoutCalc() == null) {
            return;
        }
        int ordinal = fVar.f257134j.ordinal();
        com.tencent.maas.base.MJID mjid = fVar.f257168b;
        com.tencent.maas.model.time.MJTime fromSeconds = com.tencent.maas.model.time.MJTime.fromSeconds(((ordinal != 1 ? ordinal != 2 ? r3.b(mjid, false).left : r3.b(mjid, false).right : r3.b(mjid, false).left) - this.f277281e) / r0.s(acVar.A7().getTimelineLayoutType()));
        gx0.bf c86 = acVar.c8();
        kotlin.jvm.internal.o.d(fromSeconds);
        c86.p7(fromSeconds, false, 8L);
    }
}
