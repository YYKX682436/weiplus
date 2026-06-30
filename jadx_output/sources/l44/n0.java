package l44;

/* loaded from: classes4.dex */
public final class n0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f316269d;

    /* renamed from: e, reason: collision with root package name */
    public int f316270e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l44.o0 f316271f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(l44.o0 o0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f316271f = o0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper$getAdLikeFlow$$inlined$filter$1$2$1");
        this.f316269d = obj;
        this.f316270e |= Integer.MIN_VALUE;
        java.lang.Object emit = this.f316271f.emit(null, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper$getAdLikeFlow$$inlined$filter$1$2$1");
        return emit;
    }
}
