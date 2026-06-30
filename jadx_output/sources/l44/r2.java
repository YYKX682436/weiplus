package l44;

/* loaded from: classes4.dex */
public final class r2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f316323d;

    /* renamed from: e, reason: collision with root package name */
    public int f316324e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l44.s2 f316325f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(l44.s2 s2Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f316325f = s2Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper$getInteractFlow$$inlined$map$9$2$1");
        this.f316323d = obj;
        this.f316324e |= Integer.MIN_VALUE;
        java.lang.Object emit = this.f316325f.emit(null, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper$getInteractFlow$$inlined$map$9$2$1");
        return emit;
    }
}
