package tc4;

/* loaded from: classes4.dex */
public final class b2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public long f417292d;

    /* renamed from: e, reason: collision with root package name */
    public int f417293e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ tc4.d2 f417294f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(tc4.d2 d2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f417294f = d2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemLoad$itemLoad$2");
        tc4.b2 b2Var = new tc4.b2(this.f417294f, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemLoad$itemLoad$2");
        return b2Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemLoad$itemLoad$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemLoad$itemLoad$2");
        java.lang.Object invokeSuspend = ((tc4.b2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemLoad$itemLoad$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemLoad$itemLoad$2");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        long j17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemLoad$itemLoad$2");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f417293e;
        tc4.d2 d2Var = this.f417294f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity.f169929s.a(d2Var.name(), "loadCustomItemInfo");
            this.f417292d = currentTimeMillis;
            this.f417293e = 1;
            if (d2Var.E(this) == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemLoad$itemLoad$2");
                return aVar;
            }
            j17 = currentTimeMillis;
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemLoad$itemLoad$2");
                throw illegalStateException;
            }
            j17 = this.f417292d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity.f169929s.b(d2Var.name());
        d2Var.x("MicroMsg.Improve.TimelineItemLoad", "itemLoad cost:" + (java.lang.System.currentTimeMillis() - j17));
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemLoad$itemLoad$2");
        return f0Var;
    }
}
