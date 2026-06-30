package l44;

/* loaded from: classes4.dex */
public final class q0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f316306d;

    /* renamed from: e, reason: collision with root package name */
    public int f316307e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l44.r0 f316308f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(l44.r0 r0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f316308f = r0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper$getAdLikeResponseFlow$$inlined$filter$1$2$1");
        this.f316306d = obj;
        this.f316307e |= Integer.MIN_VALUE;
        java.lang.Object emit = this.f316308f.emit(null, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper$getAdLikeResponseFlow$$inlined$filter$1$2$1");
        return emit;
    }
}
