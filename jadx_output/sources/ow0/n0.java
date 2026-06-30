package ow0;

/* loaded from: classes5.dex */
public final class n0 implements gy0.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.movie_composing.panel.text.timeline.CaptionTimelineView f349337a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f349338b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ gx0.u2 f349339c;

    public n0(com.tencent.mm.mj_publisher.finder.movie_composing.panel.text.timeline.CaptionTimelineView captionTimelineView, ex0.a0 a0Var, gx0.u2 u2Var) {
        this.f349337a = captionTimelineView;
        this.f349338b = a0Var;
        this.f349339c = u2Var;
    }

    @Override // gy0.h
    public void a(com.tencent.maas.base.MJID segmentID) {
        kotlin.jvm.internal.o.g(segmentID, "segmentID");
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.text.timeline.CaptionTimelineView captionTimelineView = this.f349337a;
        captionTimelineView.recyclerView.f1();
        ex0.b c17 = ex0.i0.c(this.f349338b, segmentID);
        if (c17 == null) {
            return;
        }
        gx0.u2 u2Var = this.f349339c;
        ow0.q0.g(u2Var, c17);
        ow0.q0.a(u2Var, c17.f257168b);
        ow0.q0.f(u2Var, captionTimelineView);
    }

    @Override // gy0.h
    public void b(com.tencent.maas.base.MJID segmentID) {
        kotlin.jvm.internal.o.g(segmentID, "segmentID");
        ow0.a0.K7(this.f349339c, null, null, segmentID, 3, null);
    }
}
