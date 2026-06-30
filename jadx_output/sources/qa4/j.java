package qa4;

/* loaded from: classes3.dex */
public final class j extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f361092d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qa4.k f361093e;

    /* renamed from: f, reason: collision with root package name */
    public int f361094f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(qa4.k kVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f361093e = kVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp$snsWithTaOpRequest$1");
        this.f361092d = obj;
        this.f361094f |= Integer.MIN_VALUE;
        java.lang.Object t17 = this.f361093e.t(null, 0, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeOp$snsWithTaOpRequest$1");
        return t17;
    }
}
