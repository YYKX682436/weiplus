package fw0;

/* loaded from: classes5.dex */
public final class c implements yv0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.movie_composing.panel.narration.timeline.NarrationTimelineView f267040a;

    public c(com.tencent.mm.mj_publisher.finder.movie_composing.panel.narration.timeline.NarrationTimelineView narrationTimelineView) {
        this.f267040a = narrationTimelineView;
    }

    @Override // yv0.a
    public void a(com.tencent.maas.model.time.MJTime targetTime) {
        kotlin.jvm.internal.o.g(targetTime, "targetTime");
        com.tencent.mm.mj_publisher.finder.widgets.timelineview.BaseTimelineView.l(this.f267040a, targetTime, false, 2, null);
    }

    @Override // yv0.a
    public void b(double d17, boolean z17) {
        int i17 = com.tencent.mm.mj_publisher.finder.movie_composing.panel.narration.timeline.NarrationTimelineView.E;
        fy0.r scrollHelper = this.f267040a.getScrollHelper();
        if (scrollHelper != null) {
            scrollHelper.d(d17, z17);
        }
    }
}
