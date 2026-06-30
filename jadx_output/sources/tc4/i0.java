package tc4;

/* loaded from: classes4.dex */
public final class i0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tc4.n0 f417364d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(tc4.n0 n0Var) {
        super(1);
        this.f417364d = n0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$play$1$2$1");
        int intValue = ((java.lang.Number) obj).intValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$play$1$2$1");
        tc4.n0 n0Var = this.f417364d;
        if (intValue == 0) {
            int i17 = tc4.n0.N1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$dismissLoading", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
            n0Var.c0();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$dismissLoading", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        } else {
            int i18 = tc4.n0.N1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$stopPlay", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
            n0Var.d0();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$stopPlay", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$play$1$2$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$play$1$2$1");
        return f0Var;
    }
}
