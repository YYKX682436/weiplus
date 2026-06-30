package l44;

/* loaded from: classes4.dex */
public final class s1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f316337d;

    /* renamed from: e, reason: collision with root package name */
    public int f316338e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l44.t1 f316339f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(l44.t1 t1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f316339f = t1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper$getInteractFlow$$inlined$map$10$2$1");
        this.f316337d = obj;
        this.f316338e |= Integer.MIN_VALUE;
        java.lang.Object emit = this.f316339f.emit(null, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper$getInteractFlow$$inlined$map$10$2$1");
        return emit;
    }
}
