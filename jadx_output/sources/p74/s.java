package p74;

/* loaded from: classes4.dex */
public final class s implements w64.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.bs f352583a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p74.q f352584b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardRecyclerView f352585c;

    public s(com.tencent.mm.plugin.sns.ui.bs bsVar, p74.q qVar, com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardRecyclerView adSlideCardRecyclerView) {
        this.f352583a = bsVar;
        this.f352584b = qVar;
        this.f352585c = adSlideCardRecyclerView;
    }

    @Override // w64.l
    public void a() {
        com.tencent.mm.plugin.sns.ui.listener.i iVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPrepareOpenCanvasAnim", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardTimelineItem$fillViewHolder$1$1");
        com.tencent.mm.plugin.sns.ui.bs bsVar = this.f352583a;
        if (bsVar != null && (iVar = bsVar.f168039e) != null) {
            iVar.N(this.f352584b);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPrepareOpenCanvasAnim", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardTimelineItem$fillViewHolder$1$1");
    }

    @Override // w64.l
    public android.view.View b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGetAnimContentView", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardTimelineItem$fillViewHolder$1$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGetAnimContentView", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardTimelineItem$fillViewHolder$1$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGetAnimContentView", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardTimelineItem$fillViewHolder$1$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGetAnimContentView", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardTimelineItem$fillViewHolder$1$1");
        return this.f352585c;
    }
}
