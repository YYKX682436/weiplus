package tc4;

/* loaded from: classes4.dex */
public final class e3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ting.widget.TingCategoryView f417324d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.lm6 f417325e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(com.tencent.mm.plugin.ting.widget.TingCategoryView tingCategoryView, r45.lm6 lm6Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f417324d = tingCategoryView;
        this.f417325e = lm6Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.item.MusicTingCategoryImproveTimelineItem$loadCustomItemInfo$2$1");
        tc4.e3 e3Var = new tc4.e3(this.f417324d, this.f417325e, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.item.MusicTingCategoryImproveTimelineItem$loadCustomItemInfo$2$1");
        return e3Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.MusicTingCategoryImproveTimelineItem$loadCustomItemInfo$2$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.MusicTingCategoryImproveTimelineItem$loadCustomItemInfo$2$1");
        tc4.e3 e3Var = (tc4.e3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        e3Var.invokeSuspend(f0Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.MusicTingCategoryImproveTimelineItem$loadCustomItemInfo$2$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.MusicTingCategoryImproveTimelineItem$loadCustomItemInfo$2$1");
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.MusicTingCategoryImproveTimelineItem$loadCustomItemInfo$2$1");
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.ting.widget.TingCategoryView tingCategoryView = this.f417324d;
        tingCategoryView.setContainerBackgroundColor(tingCategoryView.getContext().getResources().getColor(com.tencent.mm.R.color.f478492d));
        tingCategoryView.b(this.f417325e);
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.MusicTingCategoryImproveTimelineItem$loadCustomItemInfo$2$1");
        return f0Var;
    }
}
