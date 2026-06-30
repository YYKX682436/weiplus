package mx0;

/* loaded from: classes5.dex */
public final class r extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f332270d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f332271e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f332272f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ mx0.s f332273g;

    /* renamed from: h, reason: collision with root package name */
    public int f332274h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(mx0.s sVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f332273g = sVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f332272f = obj;
        this.f332274h |= Integer.MIN_VALUE;
        return this.f332273g.f(null, this);
    }
}
