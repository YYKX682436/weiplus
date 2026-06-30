package l44;

/* loaded from: classes4.dex */
public final class q1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f316309d;

    /* renamed from: e, reason: collision with root package name */
    public int f316310e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l44.r1 f316311f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(l44.r1 r1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f316311f = r1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper$getInteractFlow$$inlined$map$1$2$1");
        this.f316309d = obj;
        this.f316310e |= Integer.MIN_VALUE;
        java.lang.Object emit = this.f316311f.emit(null, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper$getInteractFlow$$inlined$map$1$2$1");
        return emit;
    }
}
