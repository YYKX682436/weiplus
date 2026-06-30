package ut;

/* loaded from: classes12.dex */
public final class d0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f430603d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f430604e;

    /* renamed from: f, reason: collision with root package name */
    public long f430605f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f430606g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ut.q0 f430607h;

    /* renamed from: i, reason: collision with root package name */
    public int f430608i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(ut.q0 q0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f430607h = q0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f430606g = obj;
        this.f430608i |= Integer.MIN_VALUE;
        return this.f430607h.a0(this);
    }
}
