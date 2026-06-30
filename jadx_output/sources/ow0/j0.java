package ow0;

/* loaded from: classes5.dex */
public final class j0 implements gy0.j {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.maas.model.time.MJTime f349323a = com.tencent.maas.model.time.MJTime.ZeroTime;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gx0.u2 f349324b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f349325c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.movie_composing.panel.text.timeline.CaptionTimelineView f349326d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f349327e;

    public j0(gx0.u2 u2Var, ex0.a0 a0Var, com.tencent.mm.mj_publisher.finder.movie_composing.panel.text.timeline.CaptionTimelineView captionTimelineView, int i17) {
        this.f349324b = u2Var;
        this.f349325c = a0Var;
        this.f349326d = captionTimelineView;
        this.f349327e = i17;
    }

    @Override // gy0.j
    public void a(boolean z17) {
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.text.timeline.CaptionTimelineView captionTimelineView = this.f349326d;
        com.tencent.maas.model.time.MJTime fromSeconds = com.tencent.maas.model.time.MJTime.fromSeconds(captionTimelineView.getCurrentScrolledX() / this.f349325c.s(captionTimelineView.getTimelineLayoutType()));
        gx0.u2 u2Var = this.f349324b;
        gx0.bf R7 = u2Var.R7();
        kotlin.jvm.internal.o.d(fromSeconds);
        gx0.bf.q7(R7, fromSeconds, true, 0L, 4, null);
        ow0.q0.e(u2Var, fromSeconds);
        ow0.q0.c(u2Var, fromSeconds, true);
        ow0.q0.f(u2Var, captionTimelineView);
        kotlinx.coroutines.l.d(u2Var.getMainScope(), null, null, new ow0.h0(u2Var, fromSeconds, null), 3, null);
    }

    @Override // gy0.j
    public void b(boolean z17, boolean z18) {
        double s17;
        double seconds;
        double s18;
        ex0.r n17 = this.f349325c.n();
        if (n17 != null && z18) {
            com.tencent.maas.model.time.MJTime k17 = z17 ? n17.k() : n17.l().getEndTime().sub(com.tencent.maas.model.time.MJTime.fromSeconds(0.1d));
            kotlin.jvm.internal.o.d(k17);
            gx0.u2 u2Var = this.f349324b;
            u2Var.b8(k17);
            kotlin.jvm.internal.o.g(u2Var, "<this>");
            com.tencent.mm.mj_publisher.finder.movie_composing.panel.text.timeline.CaptionTimelineView timelineView = this.f349326d;
            kotlin.jvm.internal.o.g(timelineView, "timelineView");
            ex0.a0 a0Var = u2Var.S7().f276642r;
            if (a0Var != null) {
                com.tencent.maas.model.time.MJTime k18 = z17 ? n17.k() : n17.l().getEndTime();
                if (z17) {
                    s17 = a0Var.s(timelineView.getTimelineLayoutType());
                    seconds = k18.toSeconds();
                } else if (a0Var.E(n17.f257168b) || n17.f257170d) {
                    s17 = a0Var.s(timelineView.getTimelineLayoutType());
                    seconds = k18.toSeconds();
                } else {
                    s18 = (a0Var.s(timelineView.getTimelineLayoutType()) * k18.toSeconds()) - (timelineView.getGapWidth() / 2);
                    timelineView.g(s18);
                }
                s18 = s17 * seconds;
                timelineView.g(s18);
            }
            kotlinx.coroutines.l.d(u2Var.getMainScope(), null, null, new ow0.i0(u2Var, k17, this, null), 3, null);
        }
    }

    @Override // gy0.j
    public void c(boolean z17) {
        this.f349324b.R6().V6();
        com.tencent.maas.model.time.MJTime mJTime = (com.tencent.maas.model.time.MJTime) this.f349325c.f257106p.getValue();
        if (mJTime == null) {
            mJTime = com.tencent.maas.model.time.MJTime.ZeroTime;
        }
        this.f349323a = mJTime;
    }

    @Override // gy0.j
    public void d() {
    }

    @Override // gy0.j
    public void e() {
        com.tencent.maas.model.time.MJTime fromSeconds = com.tencent.maas.model.time.MJTime.fromSeconds(this.f349326d.getCurrentScrolledX() / this.f349325c.s(r0.getTimelineLayoutType()));
        gx0.u2 u2Var = this.f349324b;
        gx0.bf R7 = u2Var.R7();
        kotlin.jvm.internal.o.d(fromSeconds);
        gx0.bf.q7(R7, fromSeconds, false, 0L, 4, null);
        ow0.q0.e(u2Var, fromSeconds);
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
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.text.timeline.CaptionTimelineView captionTimelineView;
        bx0.h timelineLayoutCalc;
        ex0.r n17 = this.f349325c.n();
        ex0.f fVar = n17 instanceof ex0.f ? (ex0.f) n17 : null;
        if (fVar == null || (timelineLayoutCalc = (captionTimelineView = this.f349326d).getTimelineLayoutCalc()) == null) {
            return;
        }
        int ordinal = fVar.f257134j.ordinal();
        com.tencent.maas.base.MJID mjid = fVar.f257168b;
        com.tencent.maas.model.time.MJTime fromSeconds = com.tencent.maas.model.time.MJTime.fromSeconds(((ordinal != 1 ? ordinal != 2 ? timelineLayoutCalc.b(mjid, false).left : timelineLayoutCalc.b(mjid, false).right : timelineLayoutCalc.b(mjid, false).left) - this.f349327e) / r0.s(captionTimelineView.getTimelineLayoutType()));
        gx0.bf R7 = this.f349324b.R7();
        kotlin.jvm.internal.o.d(fromSeconds);
        R7.p7(fromSeconds, false, 8L);
    }
}
