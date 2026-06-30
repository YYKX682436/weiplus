package tc4;

/* loaded from: classes4.dex */
public final class u0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f417478d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f417479e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ tc4.v0 f417480f;

    /* renamed from: g, reason: collision with root package name */
    public int f417481g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(tc4.v0 v0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f417480f = v0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.ImprovePositionTimelineItem$onViewRecycled$1");
        this.f417479e = obj;
        this.f417481g |= Integer.MIN_VALUE;
        java.lang.Object S = tc4.v0.S(this.f417480f, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.ImprovePositionTimelineItem$onViewRecycled$1");
        return S;
    }
}
