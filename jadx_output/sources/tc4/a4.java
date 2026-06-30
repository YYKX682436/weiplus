package tc4;

/* loaded from: classes4.dex */
public final class a4 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f417281d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f417282e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ tc4.b4 f417283f;

    /* renamed from: g, reason: collision with root package name */
    public int f417284g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(tc4.b4 b4Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f417283f = b4Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.VideoFlexibleTimelineItem$onViewRecycled$1");
        this.f417282e = obj;
        this.f417284g |= Integer.MIN_VALUE;
        java.lang.Object g17 = this.f417283f.g(this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.VideoFlexibleTimelineItem$onViewRecycled$1");
        return g17;
    }
}
