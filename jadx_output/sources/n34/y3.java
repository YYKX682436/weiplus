package n34;

/* loaded from: classes4.dex */
public final class y3 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f334789d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f334790e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f334791f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.SnsStarListDataUIC f334792g;

    /* renamed from: h, reason: collision with root package name */
    public int f334793h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3(com.tencent.mm.plugin.sns.SnsStarListDataUIC snsStarListDataUIC, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f334792g = snsStarListDataUIC;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.SnsStarListDataUIC$getDataFromLocal$1");
        this.f334791f = obj;
        this.f334793h |= Integer.MIN_VALUE;
        java.lang.Object P6 = com.tencent.mm.plugin.sns.SnsStarListDataUIC.P6(this.f334792g, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.SnsStarListDataUIC$getDataFromLocal$1");
        return P6;
    }
}
