package l44;

/* loaded from: classes4.dex */
public final class f2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f316132d;

    /* renamed from: e, reason: collision with root package name */
    public int f316133e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l44.g2 f316134f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(l44.g2 g2Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f316134f = g2Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper$getInteractFlow$$inlined$map$5$2$1");
        this.f316132d = obj;
        this.f316133e |= Integer.MIN_VALUE;
        java.lang.Object emit = this.f316134f.emit(null, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper$getInteractFlow$$inlined$map$5$2$1");
        return emit;
    }
}
