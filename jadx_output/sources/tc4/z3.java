package tc4;

/* loaded from: classes4.dex */
public final class z3 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f417547d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f417548e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f417549f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ tc4.b4 f417550g;

    /* renamed from: h, reason: collision with root package name */
    public int f417551h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(tc4.b4 b4Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f417550g = b4Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.VideoFlexibleTimelineItem$onBindViewHolder$1");
        this.f417549f = obj;
        this.f417551h |= Integer.MIN_VALUE;
        java.lang.Object h17 = this.f417550g.h(null, null, 0, false, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.VideoFlexibleTimelineItem$onBindViewHolder$1");
        return h17;
    }
}
