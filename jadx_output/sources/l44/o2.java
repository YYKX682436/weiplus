package l44;

/* loaded from: classes4.dex */
public final class o2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f316287d;

    /* renamed from: e, reason: collision with root package name */
    public int f316288e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l44.p2 f316289f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(l44.p2 p2Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f316289f = p2Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper$getInteractFlow$$inlined$map$8$2$1");
        this.f316287d = obj;
        this.f316288e |= Integer.MIN_VALUE;
        java.lang.Object emit = this.f316289f.emit(null, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper$getInteractFlow$$inlined$map$8$2$1");
        return emit;
    }
}
