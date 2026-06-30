package tc4;

/* loaded from: classes4.dex */
public final class d4 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f417317d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f417318e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ tc4.k4 f417319f;

    /* renamed from: g, reason: collision with root package name */
    public int f417320g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4(tc4.k4 k4Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f417319f = k4Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem$loadCustomInMainThread$1");
        this.f417318e = obj;
        this.f417320g |= Integer.MIN_VALUE;
        java.lang.Object D = this.f417319f.D(this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem$loadCustomInMainThread$1");
        return D;
    }
}
