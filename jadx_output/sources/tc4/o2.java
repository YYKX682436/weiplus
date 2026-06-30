package tc4;

/* loaded from: classes4.dex */
public final class o2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f417420d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f417421e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ tc4.s2 f417422f;

    /* renamed from: g, reason: collision with root package name */
    public int f417423g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(tc4.s2 s2Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f417422f = s2Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.MultiPhotoImproveTimelineItem$loadCustomInMainThread$1");
        this.f417421e = obj;
        this.f417423g |= Integer.MIN_VALUE;
        java.lang.Object D = this.f417422f.D(this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.MultiPhotoImproveTimelineItem$loadCustomInMainThread$1");
        return D;
    }
}
