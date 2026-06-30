package p74;

/* loaded from: classes4.dex */
public final class r implements p74.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p74.t f352582d;

    public r(p74.t tVar) {
        this.f352582d = tVar;
    }

    @Override // p74.a
    public void M(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onItemClick", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardTimelineItem$fillSlideCardContent$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$onItemClick", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardTimelineItem");
        this.f352582d.I(i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$onItemClick", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardTimelineItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onItemClick", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardTimelineItem$fillSlideCardContent$2");
    }
}
