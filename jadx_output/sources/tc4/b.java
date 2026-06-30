package tc4;

/* loaded from: classes4.dex */
public final class b extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f417285d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f417286e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ tc4.c f417287f;

    /* renamed from: g, reason: collision with root package name */
    public int f417288g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(tc4.c cVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f417287f = cVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.BizCardImproveTimelineItem$onViewRecycled$1");
        this.f417286e = obj;
        this.f417288g |= Integer.MIN_VALUE;
        java.lang.Object g17 = this.f417287f.g(this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.BizCardImproveTimelineItem$onViewRecycled$1");
        return g17;
    }
}
