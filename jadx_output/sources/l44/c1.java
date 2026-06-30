package l44;

/* loaded from: classes4.dex */
public final class c1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f316064d;

    /* renamed from: e, reason: collision with root package name */
    public int f316065e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l44.d1 f316066f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(l44.d1 d1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f316066f = d1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper$getAdNotifyPlayOrPauseFlow$$inlined$filter$1$2$1");
        this.f316064d = obj;
        this.f316065e |= Integer.MIN_VALUE;
        java.lang.Object emit = this.f316066f.emit(null, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper$getAdNotifyPlayOrPauseFlow$$inlined$filter$1$2$1");
        return emit;
    }
}
