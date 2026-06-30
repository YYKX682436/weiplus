package tc4;

/* loaded from: classes4.dex */
public final class o3 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f417424d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f417425e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f417426f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ tc4.q3 f417427g;

    /* renamed from: h, reason: collision with root package name */
    public int f417428h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3(tc4.q3 q3Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f417427g = q3Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.SinglePhotoImproveTimelineItem$onBindViewHolder$1");
        this.f417426f = obj;
        this.f417428h |= Integer.MIN_VALUE;
        java.lang.Object h17 = this.f417427g.h(null, null, 0, false, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.SinglePhotoImproveTimelineItem$onBindViewHolder$1");
        return h17;
    }
}
