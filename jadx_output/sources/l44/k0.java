package l44;

/* loaded from: classes4.dex */
public final class k0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f316212d;

    /* renamed from: e, reason: collision with root package name */
    public int f316213e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l44.l0 f316214f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(l44.l0 l0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f316214f = l0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper$getAdLikeAnimEndFlow$$inlined$filter$1$2$1");
        this.f316212d = obj;
        this.f316213e |= Integer.MIN_VALUE;
        java.lang.Object emit = this.f316214f.emit(null, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper$getAdLikeAnimEndFlow$$inlined$filter$1$2$1");
        return emit;
    }
}
