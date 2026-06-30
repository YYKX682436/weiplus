package tc4;

/* loaded from: classes4.dex */
public final class c2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f417302d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f417303e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f417304f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ tc4.d2 f417305g;

    /* renamed from: h, reason: collision with root package name */
    public int f417306h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(tc4.d2 d2Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f417305g = d2Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemLoad$onBindViewHolder$1");
        this.f417304f = obj;
        this.f417306h |= Integer.MIN_VALUE;
        java.lang.Object F = tc4.d2.F(this.f417305g, null, null, 0, false, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemLoad$onBindViewHolder$1");
        return F;
    }
}
