package l44;

/* loaded from: classes4.dex */
public final class f0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f316126d;

    /* renamed from: e, reason: collision with root package name */
    public int f316127e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l44.g0 f316128f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(l44.g0 g0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f316128f = g0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper$getAdBreakFramePAGPlayEndFlow$$inlined$map$1$2$1");
        this.f316126d = obj;
        this.f316127e |= Integer.MIN_VALUE;
        java.lang.Object emit = this.f316128f.emit(null, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper$getAdBreakFramePAGPlayEndFlow$$inlined$map$1$2$1");
        return emit;
    }
}
