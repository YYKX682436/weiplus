package tc4;

/* loaded from: classes4.dex */
public final class a extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f417266d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f417267e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ tc4.c f417268f;

    /* renamed from: g, reason: collision with root package name */
    public int f417269g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(tc4.c cVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f417268f = cVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.BizCardImproveTimelineItem$onBindViewHolder$1");
        this.f417267e = obj;
        this.f417269g |= Integer.MIN_VALUE;
        java.lang.Object h17 = this.f417268f.h(null, null, 0, false, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.BizCardImproveTimelineItem$onBindViewHolder$1");
        return h17;
    }
}
