package l44;

/* loaded from: classes4.dex */
public final class i2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f316177d;

    /* renamed from: e, reason: collision with root package name */
    public int f316178e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l44.j2 f316179f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(l44.j2 j2Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f316179f = j2Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper$getInteractFlow$$inlined$map$6$2$1");
        this.f316177d = obj;
        this.f316178e |= Integer.MIN_VALUE;
        java.lang.Object emit = this.f316179f.emit(null, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper$getInteractFlow$$inlined$map$6$2$1");
        return emit;
    }
}
