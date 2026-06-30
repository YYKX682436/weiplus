package tc4;

/* loaded from: classes4.dex */
public final class y3 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f417537d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f417538e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ tc4.b4 f417539f;

    /* renamed from: g, reason: collision with root package name */
    public int f417540g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3(tc4.b4 b4Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f417539f = b4Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.VideoFlexibleTimelineItem$loadCustomInMainThread$1");
        this.f417538e = obj;
        this.f417540g |= Integer.MIN_VALUE;
        java.lang.Object D = this.f417539f.D(this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.VideoFlexibleTimelineItem$loadCustomInMainThread$1");
        return D;
    }
}
