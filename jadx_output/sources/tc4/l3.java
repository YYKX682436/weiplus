package tc4;

/* loaded from: classes4.dex */
public final class l3 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f417401d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f417402e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ tc4.q3 f417403f;

    /* renamed from: g, reason: collision with root package name */
    public int f417404g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(tc4.q3 q3Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f417403f = q3Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.SinglePhotoImproveTimelineItem$loadCustomInMainThread$1");
        this.f417402e = obj;
        this.f417404g |= Integer.MIN_VALUE;
        java.lang.Object D = this.f417403f.D(this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.SinglePhotoImproveTimelineItem$loadCustomInMainThread$1");
        return D;
    }
}
