package yv0;

/* loaded from: classes5.dex */
public final class k implements yv0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.movie_composing.panel.clip.timeline.ClipTimelineView f465975a;

    public k(com.tencent.mm.mj_publisher.finder.movie_composing.panel.clip.timeline.ClipTimelineView clipTimelineView) {
        this.f465975a = clipTimelineView;
    }

    @Override // yv0.a
    public void a(com.tencent.maas.model.time.MJTime targetTime) {
        kotlin.jvm.internal.o.g(targetTime, "targetTime");
        com.tencent.mm.mj_publisher.finder.widgets.timelineview.BaseTimelineView.l(this.f465975a, targetTime, false, 2, null);
    }

    @Override // yv0.a
    public void b(double d17, boolean z17) {
        int i17 = com.tencent.mm.mj_publisher.finder.movie_composing.panel.clip.timeline.ClipTimelineView.L;
        fy0.r scrollHelper = this.f465975a.getScrollHelper();
        if (scrollHelper != null) {
            scrollHelper.d(d17, z17);
        }
    }
}
