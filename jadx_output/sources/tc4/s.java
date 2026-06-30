package tc4;

/* loaded from: classes4.dex */
public final class s extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f417453d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f417454e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f417455f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f417456g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ tc4.a0 f417457h;

    /* renamed from: i, reason: collision with root package name */
    public int f417458i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(tc4.a0 a0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f417457h = a0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$loadCustomItemInfo$1");
        this.f417456g = obj;
        this.f417458i |= Integer.MIN_VALUE;
        java.lang.Object E = this.f417457h.E(this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$loadCustomItemInfo$1");
        return E;
    }
}
