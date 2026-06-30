package mx0;

/* loaded from: classes5.dex */
public final class q extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f332223d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f332224e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f332225f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ mx0.s f332226g;

    /* renamed from: h, reason: collision with root package name */
    public int f332227h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(mx0.s sVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f332226g = sVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f332225f = obj;
        this.f332227h |= Integer.MIN_VALUE;
        return this.f332226g.d(null, this);
    }
}
