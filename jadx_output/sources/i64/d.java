package i64;

/* loaded from: classes4.dex */
public final class d extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f289126d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f289127e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f289128f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f289129g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f289130h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i64.i f289131i;

    /* renamed from: m, reason: collision with root package name */
    public int f289132m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(i64.i iVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f289131i = iVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.model.AdComplianceModelManager$fetchModelBySnsInfo$1");
        this.f289130h = obj;
        this.f289132m |= Integer.MIN_VALUE;
        java.lang.Object h17 = this.f289131i.h(null, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.model.AdComplianceModelManager$fetchModelBySnsInfo$1");
        return h17;
    }
}
