package n0;

/* loaded from: classes14.dex */
public final class a3 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f333428d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f333429e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f333430f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n0.b3 f333431g;

    /* renamed from: h, reason: collision with root package name */
    public int f333432h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(n0.b3 b3Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f333431g = b3Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f333430f = obj;
        this.f333432h |= Integer.MIN_VALUE;
        return this.f333431g.l(null, this);
    }
}
