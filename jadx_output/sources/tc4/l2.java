package tc4;

/* loaded from: classes4.dex */
public final class l2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f417397d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f417398e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ tc4.m2 f417399f;

    /* renamed from: g, reason: collision with root package name */
    public int f417400g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(tc4.m2 m2Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f417399f = m2Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemReport$onBindViewHolder$1");
        this.f417398e = obj;
        this.f417400g |= Integer.MIN_VALUE;
        java.lang.Object I = tc4.m2.I(this.f417399f, null, null, 0, false, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemReport$onBindViewHolder$1");
        return I;
    }
}
