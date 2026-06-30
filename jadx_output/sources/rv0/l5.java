package rv0;

/* loaded from: classes5.dex */
public final class l5 implements rv0.g5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.movie_composing.panel.clip.ClipStorylineSegmentTimelineView f400103a;

    public l5(com.tencent.mm.mj_publisher.finder.movie_composing.panel.clip.ClipStorylineSegmentTimelineView clipStorylineSegmentTimelineView) {
        this.f400103a = clipStorylineSegmentTimelineView;
    }

    @Override // rv0.g5
    public void a(com.tencent.maas.model.time.MJTime targetTime, com.tencent.maas.moviecomposing.segments.Segment segment) {
        bx0.h timelineLayoutCalc;
        kotlin.jvm.internal.o.g(targetTime, "targetTime");
        kotlin.jvm.internal.o.g(segment, "segment");
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.clip.ClipStorylineSegmentTimelineView clipStorylineSegmentTimelineView = this.f400103a;
        clipStorylineSegmentTimelineView.getClass();
        if (targetTime.isValid() && (timelineLayoutCalc = clipStorylineSegmentTimelineView.getTimelineLayoutCalc()) != null) {
            clipStorylineSegmentTimelineView.post(new rv0.n5(clipStorylineSegmentTimelineView, segment.C() == ug.m.ImageClip ? 0.0d : timelineLayoutCalc.f36277d.f36267s.pixelOffsetForTime(targetTime) - clipStorylineSegmentTimelineView.getInsets().f247044a));
        }
    }
}
