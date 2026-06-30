package dd4;

/* loaded from: classes4.dex */
public final class w extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f229062d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f229063e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f229064f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dd4.y f229065g;

    /* renamed from: h, reason: collision with root package name */
    public int f229066h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(dd4.y yVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f229065g = yVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleResourceHelper$waitForComplete$1");
        this.f229064f = obj;
        this.f229066h |= Integer.MIN_VALUE;
        java.lang.Object f17 = this.f229065g.f(0, null, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleResourceHelper$waitForComplete$1");
        return f17;
    }
}
