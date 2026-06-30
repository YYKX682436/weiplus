package tc4;

/* loaded from: classes4.dex */
public final class p3 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f417432d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f417433e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ tc4.q3 f417434f;

    /* renamed from: g, reason: collision with root package name */
    public int f417435g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3(tc4.q3 q3Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f417434f = q3Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.SinglePhotoImproveTimelineItem$onViewRecycled$1");
        this.f417433e = obj;
        this.f417435g |= Integer.MIN_VALUE;
        java.lang.Object g17 = this.f417434f.g(this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.SinglePhotoImproveTimelineItem$onViewRecycled$1");
        return g17;
    }
}
