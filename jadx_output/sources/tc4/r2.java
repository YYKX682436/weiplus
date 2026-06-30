package tc4;

/* loaded from: classes4.dex */
public final class r2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f417448d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f417449e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ tc4.s2 f417450f;

    /* renamed from: g, reason: collision with root package name */
    public int f417451g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(tc4.s2 s2Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f417450f = s2Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.MultiPhotoImproveTimelineItem$onViewRecycled$1");
        this.f417449e = obj;
        this.f417451g |= Integer.MIN_VALUE;
        java.lang.Object g17 = this.f417450f.g(this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.MultiPhotoImproveTimelineItem$onViewRecycled$1");
        return g17;
    }
}
