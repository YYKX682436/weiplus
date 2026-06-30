package l44;

/* loaded from: classes4.dex */
public final class o1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f316284d;

    /* renamed from: e, reason: collision with root package name */
    public int f316285e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l44.p1 f316286f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(l44.p1 p1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f316286f = p1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper$getBreakFramePAGPlayEndFlow$$inlined$filter$1$2$1");
        this.f316284d = obj;
        this.f316285e |= Integer.MIN_VALUE;
        java.lang.Object emit = this.f316286f.emit(null, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper$getBreakFramePAGPlayEndFlow$$inlined$filter$1$2$1");
        return emit;
    }
}
