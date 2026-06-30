package ut;

/* loaded from: classes12.dex */
public final class b0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f430593d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f430594e;

    /* renamed from: f, reason: collision with root package name */
    public long f430595f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f430596g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ut.q0 f430597h;

    /* renamed from: i, reason: collision with root package name */
    public int f430598i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(ut.q0 q0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f430597h = q0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f430596g = obj;
        this.f430598i |= Integer.MIN_VALUE;
        return this.f430597h.k(this);
    }
}
