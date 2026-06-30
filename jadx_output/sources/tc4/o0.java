package tc4;

/* loaded from: classes4.dex */
public final class o0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f417416d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tc4.r0 f417417e;

    /* renamed from: f, reason: collision with root package name */
    public int f417418f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(tc4.r0 r0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f417417e = r0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.FoldImproveTimelineItem$loadCustomItemInfo$1");
        this.f417416d = obj;
        this.f417418f |= Integer.MIN_VALUE;
        java.lang.Object E = this.f417417e.E(this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.FoldImproveTimelineItem$loadCustomItemInfo$1");
        return E;
    }
}
