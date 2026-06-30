package i64;

/* loaded from: classes4.dex */
public final class j extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f289202d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f289203e;

    /* renamed from: f, reason: collision with root package name */
    public int f289204f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f289205g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i64.o f289206h;

    /* renamed from: i, reason: collision with root package name */
    public int f289207i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(i64.o oVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f289206h = oVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.model.AdContinuousCountModelManager$fetchAndApplyModelBySnsInfo$1");
        this.f289205g = obj;
        this.f289207i |= Integer.MIN_VALUE;
        java.lang.Object g17 = this.f289206h.g(null, 0, false, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.model.AdContinuousCountModelManager$fetchAndApplyModelBySnsInfo$1");
        return g17;
    }
}
