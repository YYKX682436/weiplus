package qf2;

/* loaded from: classes3.dex */
public final class u0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f362595d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f362596e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f362597f;

    /* renamed from: g, reason: collision with root package name */
    public long f362598g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f362599h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ qf2.v0 f362600i;

    /* renamed from: m, reason: collision with root package name */
    public int f362601m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(qf2.v0 v0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f362600i = v0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f362599h = obj;
        this.f362601m |= Integer.MIN_VALUE;
        return qf2.v0.a7(this.f362600i, 0L, null, this);
    }
}
