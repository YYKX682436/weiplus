package i64;

/* loaded from: classes4.dex */
public final class n extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f289241d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f289242e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i64.o f289243f;

    /* renamed from: g, reason: collision with root package name */
    public int f289244g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(i64.o oVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f289243f = oVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.model.AdContinuousCountModelManager$requestNumberTitle$1");
        this.f289242e = obj;
        this.f289244g |= Integer.MIN_VALUE;
        i64.o oVar = this.f289243f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$requestNumberTitle", "com.tencent.mm.plugin.sns.ad.model.AdContinuousCountModelManager");
        java.lang.Object i17 = oVar.i(null, null, null, 0, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$requestNumberTitle", "com.tencent.mm.plugin.sns.ad.model.AdContinuousCountModelManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.model.AdContinuousCountModelManager$requestNumberTitle$1");
        return i17;
    }
}
