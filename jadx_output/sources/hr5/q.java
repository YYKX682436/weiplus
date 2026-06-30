package hr5;

/* loaded from: classes15.dex */
public final class q extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f284450d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f284451e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f284452f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f284453g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ hr5.a1 f284454h;

    /* renamed from: i, reason: collision with root package name */
    public int f284455i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(hr5.a1 a1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f284454h = a1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f284453g = obj;
        this.f284455i |= Integer.MIN_VALUE;
        return hr5.a1.a(this.f284454h, null, null, null, null, this);
    }
}
