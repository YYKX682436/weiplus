package l44;

/* loaded from: classes4.dex */
public final class t0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f316357d;

    /* renamed from: e, reason: collision with root package name */
    public int f316358e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l44.u0 f316359f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(l44.u0 u0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f316359f = u0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper$getAdLikedStateDoubleTapFlow$$inlined$filter$1$2$1");
        this.f316357d = obj;
        this.f316358e |= Integer.MIN_VALUE;
        java.lang.Object emit = this.f316359f.emit(null, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper$getAdLikedStateDoubleTapFlow$$inlined$filter$1$2$1");
        return emit;
    }
}
