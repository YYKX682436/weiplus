package p74;

/* loaded from: classes4.dex */
public final class l implements z84.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p74.o f352566a;

    public l(p74.o oVar) {
        this.f352566a = oVar;
    }

    @Override // z84.j
    public final void a(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSlideDistanceChange", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardOverSlideLeftLogic$mOnSlideDistanceChangeListener$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMIsOverMinDistance$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardOverSlideLeftLogic");
        p74.o oVar = this.f352566a;
        boolean z17 = oVar.f352579k;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMIsOverMinDistance$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardOverSlideLeftLogic");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSlideOverMinDistance", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardOverSlideLeftLogic");
        boolean z18 = i17 > oVar.f352577i;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSlideOverMinDistance", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardOverSlideLeftLogic");
        if (z18) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMIsOverMinDistance$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardOverSlideLeftLogic");
            boolean z19 = oVar.f352579k;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMIsOverMinDistance$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardOverSlideLeftLogic");
            if (!z19) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setMIsOverMinDistance$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardOverSlideLeftLogic");
                oVar.f352579k = true;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setMIsOverMinDistance$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardOverSlideLeftLogic");
                ca4.z0.I0(new long[]{0, 80});
                p74.o.b(oVar, true);
            }
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMIsOverMinDistance$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardOverSlideLeftLogic");
            boolean z27 = oVar.f352579k;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMIsOverMinDistance$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardOverSlideLeftLogic");
            if (z27) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setMIsOverMinDistance$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardOverSlideLeftLogic");
                oVar.f352579k = false;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setMIsOverMinDistance$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardOverSlideLeftLogic");
                p74.o.b(oVar, false);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSlideDistanceChange", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardOverSlideLeftLogic$mOnSlideDistanceChangeListener$1");
    }
}
