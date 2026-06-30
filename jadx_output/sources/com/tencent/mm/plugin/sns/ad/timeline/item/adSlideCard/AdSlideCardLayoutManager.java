package com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/sns/ad/timeline/item/adSlideCard/AdSlideCardLayoutManager;", "Lcom/tencent/mm/plugin/sns/ad/widget/recyclerview/CardLayoutManager;", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class AdSlideCardLayoutManager extends com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager {
    public final int A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdSlideCardLayoutManager(androidx.recyclerview.widget.RecyclerView recyclerView) {
        super(recyclerView);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        this.A = 1;
    }

    @Override // com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i17, androidx.recyclerview.widget.z2 recycler, androidx.recyclerview.widget.h3 state) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("scrollHorizontallyBy", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLayoutManager");
        kotlin.jvm.internal.o.g(recycler, "recycler");
        kotlin.jvm.internal.o.g(state, "state");
        if (this.f163780d <= 0 && i17 < 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("scrollHorizontallyBy", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLayoutManager");
            return 0;
        }
        int t17 = t(getItemCount() - 1);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getOverSlideDistance", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLayoutManager");
        int i18 = this.A;
        int s17 = ca4.m0.s((i18 == 1 || i18 != 2) ? 60 : 30);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getOverSlideDistance", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLayoutManager");
        int scrollHorizontallyBy = super.scrollHorizontallyBy(e06.p.f(this.f163780d + i17, 0, t17 + s17) - this.f163780d, recycler, state);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("scrollHorizontallyBy", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLayoutManager");
        return scrollHorizontallyBy;
    }

    @Override // com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.h3 h3Var, int i17) {
        java.lang.Object m521constructorimpl;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("smoothScrollToPosition", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLayoutManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getViewItemWidth", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        int i18 = this.f163781e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewItemWidth", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        if (i18 != 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getViewItemHeight", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
            int i19 = this.f163782f;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewItemHeight", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
            if (i19 != 0) {
                try {
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    jz5.f0 f0Var = null;
                    java.lang.Integer valueOf = h3Var != null ? java.lang.Integer.valueOf(h3Var.b()) : null;
                    if (valueOf != null && valueOf.intValue() == 0) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("smoothScrollToPosition", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLayoutManager");
                        return;
                    }
                    int t17 = t(i17);
                    if (recyclerView != null) {
                        recyclerView.b1(t17 - this.f163780d, 0, s74.q4.f404513a.f());
                        f0Var = jz5.f0.f302826a;
                    }
                    m521constructorimpl = kotlin.Result.m521constructorimpl(f0Var);
                } catch (java.lang.Throwable th6) {
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
                }
                if (kotlin.Result.m527isFailureimpl(m521constructorimpl)) {
                    ca4.q.c("AdSlideCardLayoutManager", kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl));
                }
                kotlin.Result.m527isFailureimpl(m521constructorimpl);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("smoothScrollToPosition", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLayoutManager");
                return;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("smoothScrollToPosition", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLayoutManager");
    }
}
