package tv0;

/* loaded from: classes5.dex */
public final class l0 implements rv0.g5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.movie_composing.panel.clip.crop.CropMaterialTimelineView f422216a;

    public l0(com.tencent.mm.mj_publisher.finder.movie_composing.panel.clip.crop.CropMaterialTimelineView cropMaterialTimelineView) {
        this.f422216a = cropMaterialTimelineView;
    }

    @Override // rv0.g5
    public void a(com.tencent.maas.model.time.MJTime targetTime, com.tencent.maas.moviecomposing.segments.Segment segment) {
        kotlin.jvm.internal.o.g(targetTime, "targetTime");
        kotlin.jvm.internal.o.g(segment, "segment");
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.clip.crop.CropMaterialTimelineView cropMaterialTimelineView = this.f422216a;
        com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment = cropMaterialTimelineView.f69284z;
        bx0.h timelineLayoutCalc = cropMaterialTimelineView.getTimelineLayoutCalc();
        if (!targetTime.isValid() || clipSegment == null || timelineLayoutCalc == null) {
            return;
        }
        cropMaterialTimelineView.post(new tv0.m0(cropMaterialTimelineView, timelineLayoutCalc.f36277d.f36267s.pixelOffsetForTime(targetTime.sub(clipSegment.x1().getStartTime())) - cropMaterialTimelineView.getInsets().f247044a));
    }
}
