package tc4;

/* loaded from: classes4.dex */
public final class t extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tc4.a0 f417461d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.g92 f417462e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(tc4.a0 a0Var, r45.g92 g92Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f417461d = a0Var;
        this.f417462e = g92Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$loadCustomItemInfo$needUpdate$1");
        tc4.t tVar = new tc4.t(this.f417461d, this.f417462e, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$loadCustomItemInfo$needUpdate$1");
        return tVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$loadCustomItemInfo$needUpdate$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$loadCustomItemInfo$needUpdate$1");
        java.lang.Object invokeSuspend = ((tc4.t) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$loadCustomItemInfo$needUpdate$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$loadCustomItemInfo$needUpdate$1");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$loadCustomItemInfo$needUpdate$1");
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        int i17 = tc4.a0.P1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateLiveTag$default", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        this.f417461d.e0(this.f417462e, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateLiveTag$default", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$loadCustomItemInfo$needUpdate$1");
        return bool;
    }
}
