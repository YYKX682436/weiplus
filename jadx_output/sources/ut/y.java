package ut;

/* loaded from: classes12.dex */
public final class y extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f430782d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f430783e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f430784f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ut.q0 f430785g;

    /* renamed from: h, reason: collision with root package name */
    public int f430786h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(ut.q0 q0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f430785g = q0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f430784f = obj;
        this.f430786h |= Integer.MIN_VALUE;
        return this.f430785g.Y(null, null, false, null, 0L, null, this);
    }
}
