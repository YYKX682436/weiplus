package rv0;

/* loaded from: classes5.dex */
public final class n5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.movie_composing.panel.clip.ClipStorylineSegmentTimelineView f400147d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ double f400148e;

    public n5(com.tencent.mm.mj_publisher.finder.movie_composing.panel.clip.ClipStorylineSegmentTimelineView clipStorylineSegmentTimelineView, double d17) {
        this.f400147d = clipStorylineSegmentTimelineView;
        this.f400148e = d17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = com.tencent.mm.mj_publisher.finder.movie_composing.panel.clip.ClipStorylineSegmentTimelineView.f69281z;
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.clip.ClipStorylineSegmentTimelineView clipStorylineSegmentTimelineView = this.f400147d;
        fy0.r scrollHelper = clipStorylineSegmentTimelineView.getScrollHelper();
        if (scrollHelper != null) {
            scrollHelper.c(this.f400148e);
        }
        clipStorylineSegmentTimelineView.j();
    }
}
