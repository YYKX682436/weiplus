package dd4;

/* loaded from: classes4.dex */
public final class z extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f229078d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dd4.e0 f229079e;

    /* renamed from: f, reason: collision with root package name */
    public int f229080f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(dd4.e0 e0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f229079e = e0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleShareHelper$handleResourceDownload$2");
        this.f229078d = obj;
        this.f229080f |= Integer.MIN_VALUE;
        java.lang.Object c17 = this.f229079e.c(0, null, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleShareHelper$handleResourceDownload$2");
        return c17;
    }
}
