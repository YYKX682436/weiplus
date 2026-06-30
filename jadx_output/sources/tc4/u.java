package tc4;

/* loaded from: classes4.dex */
public final class u extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f417471d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f417472e;

    /* renamed from: f, reason: collision with root package name */
    public int f417473f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f417474g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f417475h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ tc4.a0 f417476i;

    /* renamed from: m, reason: collision with root package name */
    public int f417477m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(tc4.a0 a0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f417476i = a0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$onBindViewHolder$1");
        this.f417475h = obj;
        this.f417477m |= Integer.MIN_VALUE;
        java.lang.Object h17 = this.f417476i.h(null, null, 0, false, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$onBindViewHolder$1");
        return h17;
    }
}
