package yv0;

/* loaded from: classes5.dex */
public final class m implements gy0.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.movie_composing.panel.clip.timeline.ClipTimelineView f465979a;

    public m(com.tencent.mm.mj_publisher.finder.movie_composing.panel.clip.timeline.ClipTimelineView clipTimelineView) {
        this.f465979a = clipTimelineView;
    }

    @Override // gy0.j
    public void a(boolean z17) {
        gy0.j jVar = this.f465979a.K;
        if (jVar != null) {
            jVar.a(z17);
        }
    }

    @Override // gy0.j
    public void b(boolean z17, boolean z18) {
        ex0.a0 timelineVM;
        ex0.o o17;
        int i17 = com.tencent.mm.mj_publisher.finder.movie_composing.panel.clip.timeline.ClipTimelineView.L;
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.clip.timeline.ClipTimelineView clipTimelineView = this.f465979a;
        bx0.h timelineLayoutCalc = clipTimelineView.getTimelineLayoutCalc();
        if (timelineLayoutCalc != null && (timelineVM = clipTimelineView.getTimelineVM()) != null && (o17 = timelineVM.o()) != null) {
            com.tencent.maas.model.time.MJTimeRange q17 = timelineVM.q();
            com.tencent.maas.moviecomposing.segments.Segment segment = o17.f257167a;
            com.tencent.maas.model.time.MJTimeRange v17 = segment.v();
            kotlin.jvm.internal.o.f(v17, "getAbsoluteTimeRange(...)");
            com.tencent.maas.model.time.MJTime startTime = v17.getStartTime();
            kotlin.jvm.internal.o.f(startTime, "getStartTime(...)");
            com.tencent.maas.model.time.MJTime startTime2 = q17.getStartTime();
            kotlin.jvm.internal.o.f(startTime2, "getStartTime(...)");
            boolean z19 = true;
            boolean z27 = startTime.smallThan(startTime2) || startTime.equalsTo(startTime2);
            com.tencent.maas.model.time.MJTimeRange v18 = segment.v();
            kotlin.jvm.internal.o.f(v18, "getAbsoluteTimeRange(...)");
            com.tencent.maas.model.time.MJTime endTime = v18.getEndTime();
            kotlin.jvm.internal.o.f(endTime, "getEndTime(...)");
            com.tencent.maas.model.time.MJTime endTime2 = q17.getEndTime();
            kotlin.jvm.internal.o.f(endTime2, "getEndTime(...)");
            if (!endTime.bigThan(endTime2) && !endTime.equalsTo(endTime2)) {
                z19 = false;
            }
            if (!z27 || !z19) {
                com.tencent.maas.moviecomposing.segments.MusicSegment musicSegment = o17.f257154q;
                musicSegment.getClass();
                com.tencent.maas.moviecomposing.Timeline D = musicSegment.D();
                if (D != null) {
                    com.tencent.maas.moviecomposing.segments.MusicSegment.M1(musicSegment, false, D);
                }
                musicSegment.getClass();
                com.tencent.maas.moviecomposing.Timeline D2 = musicSegment.D();
                if (D2 != null) {
                    com.tencent.maas.moviecomposing.segments.MusicSegment.z1(musicSegment, false, D2);
                }
            }
            timelineVM.g();
            timelineLayoutCalc.a();
        }
        clipTimelineView.o();
        gy0.j jVar = clipTimelineView.K;
        if (jVar != null) {
            jVar.b(z17, z18);
        }
    }

    @Override // gy0.j
    public void c(boolean z17) {
        ex0.r n17;
        bx0.h timelineLayoutCalc;
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.clip.timeline.ClipTimelineView clipTimelineView = this.f465979a;
        gy0.j jVar = clipTimelineView.K;
        if (jVar != null) {
            jVar.c(z17);
        }
        ex0.a0 timelineVM = clipTimelineView.getTimelineVM();
        if (timelineVM == null || (n17 = timelineVM.n()) == null || (timelineLayoutCalc = clipTimelineView.getTimelineLayoutCalc()) == null) {
            return;
        }
        android.graphics.Rect b17 = timelineLayoutCalc.b(n17.f257168b, false);
        if (kz5.z.G(new ug.m[]{ug.m.ImageClip, ug.m.VideoClip, ug.m.MovieClip}, n17.f257169c)) {
            ex0.a0 timelineVM2 = clipTimelineView.getTimelineVM();
            ex0.r n18 = timelineVM2 != null ? timelineVM2.n() : null;
            ex0.f fVar = n18 instanceof ex0.f ? (ex0.f) n18 : null;
            if (fVar != null) {
                if (z17) {
                    bx0.h timelineLayoutCalc2 = clipTimelineView.getTimelineLayoutCalc();
                    if (timelineLayoutCalc2 != null) {
                        com.tencent.maas.base.MJID segmentID = fVar.f257168b;
                        kotlin.jvm.internal.o.g(segmentID, "segmentID");
                        timelineLayoutCalc2.f36285l = timelineLayoutCalc2.b(segmentID, false).width();
                    }
                } else {
                    bx0.h timelineLayoutCalc3 = clipTimelineView.getTimelineLayoutCalc();
                    if (timelineLayoutCalc3 != null) {
                        timelineLayoutCalc3.f36284k = 0;
                        timelineLayoutCalc3.f36285l = 0;
                    }
                }
            }
            e3.d b18 = e3.d.b(clipTimelineView.getInitTimelineInsets().f247044a + b17.width(), clipTimelineView.getInitTimelineInsets().f247045b, clipTimelineView.getInitTimelineInsets().f247046c + b17.width(), clipTimelineView.getInitTimelineInsets().f247047d);
            int width = b17.width();
            bx0.h timelineLayoutCalc4 = clipTimelineView.getTimelineLayoutCalc();
            if (timelineLayoutCalc4 != null) {
                bx0.f fVar2 = timelineLayoutCalc4.f36277d;
                fVar2.getClass();
                fVar2.f36266r = b18;
                fVar2.f36265q = true;
                fVar2.f36267s.markSequenceMapperDirty();
                fVar2.b();
            }
            fy0.o insetsItemDecoration = clipTimelineView.getInsetsItemDecoration();
            if (insetsItemDecoration != null) {
                clipTimelineView.getRecyclerView().S0(insetsItemDecoration);
            }
            fy0.o oVar = new fy0.o(b18);
            clipTimelineView.getRecyclerView().N(oVar);
            clipTimelineView.setInsetsItemDecoration(oVar);
            bx0.j uiStyle = clipTimelineView.getUiStyle();
            uiStyle.getClass();
            uiStyle.f36295a = b18;
            ex0.a0 timelineVM3 = clipTimelineView.getTimelineVM();
            if (timelineVM3 != null) {
                java.util.EnumSet of6 = java.util.EnumSet.of(cx0.d.f224510f);
                kotlin.jvm.internal.o.f(of6, "of(...)");
                timelineVM3.J(of6, null);
            }
            fy0.r scrollHelper = clipTimelineView.getScrollHelper();
            if (scrollHelper != null) {
                scrollHelper.d(clipTimelineView.getScrolledX() + width, false);
            }
            clipTimelineView.j();
            clipTimelineView.getRecyclerView().D0();
        }
    }

    @Override // gy0.j
    public void d() {
    }

    @Override // gy0.j
    public void e() {
        gy0.j jVar = this.f465979a.K;
        if (jVar != null) {
            jVar.e();
        }
    }

    @Override // gy0.j
    public void f() {
    }

    @Override // gy0.j
    public void g() {
        gy0.j jVar = this.f465979a.K;
        if (jVar != null) {
            jVar.g();
        }
    }

    @Override // gy0.j
    public void h() {
    }

    @Override // gy0.j
    public void i() {
        gy0.j jVar = this.f465979a.K;
        if (jVar != null) {
            jVar.i();
        }
    }
}
