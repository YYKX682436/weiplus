package l44;

/* loaded from: classes4.dex */
public final class z0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f316429d;

    /* renamed from: e, reason: collision with root package name */
    public int f316430e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l44.a1 f316431f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(l44.a1 a1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f316431f = a1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper$getAdNotifyPlayFlow$$inlined$filter$1$2$1");
        this.f316429d = obj;
        this.f316430e |= Integer.MIN_VALUE;
        java.lang.Object emit = this.f316431f.emit(null, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper$getAdNotifyPlayFlow$$inlined$filter$1$2$1");
        return emit;
    }
}
