package n74;

/* loaded from: classes4.dex */
public final class q extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f335413d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f335414e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f335415f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n74.r f335416g;

    /* renamed from: h, reason: collision with root package name */
    public int f335417h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(n74.r rVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f335416g = rVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdDownloadResourceHelper$setImageBitmap$1");
        this.f335415f = obj;
        this.f335417h |= Integer.MIN_VALUE;
        java.lang.Object e17 = this.f335416g.e(null, null, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdDownloadResourceHelper$setImageBitmap$1");
        return e17;
    }
}
