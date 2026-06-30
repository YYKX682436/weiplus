package i64;

/* loaded from: classes4.dex */
public final class s extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f289306d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f289307e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f289308f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ i64.t f289309g;

    /* renamed from: h, reason: collision with root package name */
    public int f289310h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(i64.t tVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f289309g = tVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.model.AdDownloadModelManager$fetchWithInstalledStateAndApply$1");
        this.f289308f = obj;
        this.f289310h |= Integer.MIN_VALUE;
        java.lang.Object g17 = this.f289309g.g(null, null, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.model.AdDownloadModelManager$fetchWithInstalledStateAndApply$1");
        return g17;
    }
}
