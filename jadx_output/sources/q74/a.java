package q74;

/* loaded from: classes4.dex */
public class a implements w64.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q74.d f360386a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q74.e f360387b;

    public a(q74.e eVar, q74.d dVar) {
        this.f360387b = eVar;
        this.f360386a = dVar;
    }

    @Override // w64.l
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPrepareOpenCanvasAnim", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
        com.tencent.mm.plugin.sns.ui.bs bsVar = this.f360387b.f169251h;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
        bsVar.f168039e.N(this.f360386a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPrepareOpenCanvasAnim", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem$1");
    }

    @Override // w64.l
    public android.view.View b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGetAnimContentView", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGetAnimContentView", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem$1");
        com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideRecyclerView adSlideRecyclerView = this.f360386a.F0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGetAnimContentView", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGetAnimContentView", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem$1");
        return adSlideRecyclerView;
    }
}
