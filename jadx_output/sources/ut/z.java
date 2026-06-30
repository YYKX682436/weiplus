package ut;

/* loaded from: classes12.dex */
public final class z extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f430787d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f430788e;

    /* renamed from: f, reason: collision with root package name */
    public long f430789f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f430790g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ut.q0 f430791h;

    /* renamed from: i, reason: collision with root package name */
    public int f430792i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(ut.q0 q0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f430791h = q0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f430790g = obj;
        this.f430792i |= Integer.MIN_VALUE;
        return this.f430791h.D(null, this);
    }
}
