package gx0;

/* loaded from: classes5.dex */
public final class z1 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.u2 f277252d;

    public z1(gx0.u2 u2Var) {
        this.f277252d = u2Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        ow0.g gVar;
        cx0.c cVar = (cx0.c) obj;
        gx0.u2 u2Var = this.f277252d;
        com.tencent.maas.moviecomposing.segments.MovieTitleSegment l76 = u2Var.S7().l7();
        if (cVar.a() && (!cVar.f224501b.isEmpty()) && l76 == null && (gVar = (ow0.g) u2Var.f69240i) != null) {
            gVar.setTitle("");
        }
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.text.timeline.CaptionTimelineView n76 = u2Var.n7();
        if (n76 != null) {
            n76.n(cVar);
        }
        u2Var.R7().n7();
        ex0.a0 a0Var = u2Var.S7().f276642r;
        ex0.r n17 = a0Var != null ? a0Var.n() : null;
        ex0.f fVar = n17 instanceof ex0.f ? (ex0.f) n17 : null;
        if (fVar == null) {
            return;
        }
        int ordinal = fVar.f257134j.ordinal();
        com.tencent.maas.model.time.MJTime i76 = ordinal != 1 ? ordinal != 2 ? u2Var.R7().i7() : fVar.l().getEndTime() : fVar.k();
        com.tencent.maas.model.time.MJTime mJTime = (com.tencent.maas.model.time.MJTime) u2Var.R7().f276258y.getValue();
        if (mJTime == null) {
            mJTime = com.tencent.maas.model.time.MJTime.InvalidTime;
        }
        if (i76.isValid() && mJTime.isValid()) {
            u2Var.T7().i7(i76, mJTime);
        }
    }
}
