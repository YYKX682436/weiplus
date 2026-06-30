package n74;

/* loaded from: classes4.dex */
public final class c0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f335311d;

    /* renamed from: e, reason: collision with root package name */
    public int f335312e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n74.d0 f335313f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(n74.d0 d0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f335313f = d0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$getSightDownloadFlow$3$invokeSuspend$$inlined$map$1$2$1");
        this.f335311d = obj;
        this.f335312e |= Integer.MIN_VALUE;
        java.lang.Object emit = this.f335313f.emit(null, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$getSightDownloadFlow$3$invokeSuspend$$inlined$map$1$2$1");
        return emit;
    }
}
