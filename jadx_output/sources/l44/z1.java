package l44;

/* loaded from: classes4.dex */
public final class z1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f316432d;

    /* renamed from: e, reason: collision with root package name */
    public int f316433e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l44.a2 f316434f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(l44.a2 a2Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f316434f = a2Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper$getInteractFlow$$inlined$map$3$2$1");
        this.f316432d = obj;
        this.f316433e |= Integer.MIN_VALUE;
        java.lang.Object emit = this.f316434f.emit(null, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper$getInteractFlow$$inlined$map$3$2$1");
        return emit;
    }
}
