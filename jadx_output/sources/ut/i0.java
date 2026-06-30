package ut;

/* loaded from: classes12.dex */
public final class i0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f430639d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f430640e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f430641f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f430642g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ut.q0 f430643h;

    /* renamed from: i, reason: collision with root package name */
    public int f430644i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(ut.q0 q0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f430643h = q0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f430642g = obj;
        this.f430644i |= Integer.MIN_VALUE;
        return this.f430643h.b0(null, null, null, false, this);
    }
}
