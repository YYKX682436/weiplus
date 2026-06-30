package l44;

/* loaded from: classes4.dex */
public final class l1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f316226d;

    /* renamed from: e, reason: collision with root package name */
    public int f316227e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l44.m1 f316228f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(l44.m1 m1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f316228f = m1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper$getAdUnlikeFlow$$inlined$filter$1$2$1");
        this.f316226d = obj;
        this.f316227e |= Integer.MIN_VALUE;
        java.lang.Object emit = this.f316228f.emit(null, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper$getAdUnlikeFlow$$inlined$filter$1$2$1");
        return emit;
    }
}
