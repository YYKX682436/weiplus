package l44;

/* loaded from: classes4.dex */
public final class w1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f316406d;

    /* renamed from: e, reason: collision with root package name */
    public int f316407e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l44.x1 f316408f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(l44.x1 x1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f316408f = x1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper$getInteractFlow$$inlined$map$2$2$1");
        this.f316406d = obj;
        this.f316407e |= Integer.MIN_VALUE;
        java.lang.Object emit = this.f316408f.emit(null, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper$getInteractFlow$$inlined$map$2$2$1");
        return emit;
    }
}
