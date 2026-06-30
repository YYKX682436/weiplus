package v74;

/* loaded from: classes4.dex */
public final class o implements v74.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardTimelineItem f433873a;

    public o(com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardTimelineItem adLookbookCardTimelineItem) {
        this.f433873a = adLookbookCardTimelineItem;
    }

    @Override // v74.u
    public void a() {
        com.tencent.mm.plugin.sns.ui.listener.i iVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPrepareOpenCanvasAnim", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardTimelineItem$mOpenCanvasAnimPrepareListener$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getAdapter$p$s-1334340689", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardTimelineItem");
        com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardTimelineItem adLookbookCardTimelineItem = this.f433873a;
        com.tencent.mm.plugin.sns.ui.bs bsVar = adLookbookCardTimelineItem.f169251h;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getAdapter$p$s-1334340689", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardTimelineItem");
        if (bsVar != null && (iVar = bsVar.f168039e) != null) {
            adLookbookCardTimelineItem.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardTimelineItem");
            v74.n nVar = adLookbookCardTimelineItem.f163236q;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardTimelineItem");
            iVar.P(nVar, null);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPrepareOpenCanvasAnim", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardTimelineItem$mOpenCanvasAnimPrepareListener$1");
    }
}
