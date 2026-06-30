package lc4;

/* loaded from: classes4.dex */
public final class p extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f317977d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f317978e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC f317979f;

    /* renamed from: g, reason: collision with root package name */
    public int f317980g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC improveDataUIC, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f317979f = improveDataUIC;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$loadMore$1");
        this.f317978e = obj;
        this.f317980g |= Integer.MIN_VALUE;
        java.lang.Object X6 = this.f317979f.X6(this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$loadMore$1");
        return X6;
    }
}
