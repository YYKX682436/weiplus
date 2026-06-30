package p74;

/* loaded from: classes4.dex */
public final class e implements w64.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p74.f f352533a;

    public e(p74.f fVar) {
        this.f352533a = fVar;
    }

    @Override // w64.l
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPrepareOpenCanvasAnim", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardDetailItem$initViewInternal$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMTimelineClickListener$p$s1010423042", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardDetailItem");
        p74.f fVar = this.f352533a;
        com.tencent.mm.plugin.sns.ui.listener.i iVar = fVar.f228838n;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMTimelineClickListener$p$s1010423042", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardDetailItem");
        if (iVar != null) {
            iVar.J(fVar);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPrepareOpenCanvasAnim", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardDetailItem$initViewInternal$1");
    }

    @Override // w64.l
    public android.view.View b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGetAnimContentView", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardDetailItem$initViewInternal$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGetAnimContentView", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardDetailItem$initViewInternal$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getContentRecyclerView$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardDetailItem");
        com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardRecyclerView adSlideCardRecyclerView = this.f352533a.f352540v;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getContentRecyclerView$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardDetailItem");
        kotlin.jvm.internal.o.d(adSlideCardRecyclerView);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGetAnimContentView", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardDetailItem$initViewInternal$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGetAnimContentView", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardDetailItem$initViewInternal$1");
        return adSlideCardRecyclerView;
    }
}
