package sf2;

/* loaded from: classes10.dex */
public final class u1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f407298d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f407299e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f407300f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ sf2.w1 f407301g;

    /* renamed from: h, reason: collision with root package name */
    public int f407302h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(sf2.w1 w1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f407301g = w1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f407300f = obj;
        this.f407302h |= Integer.MIN_VALUE;
        return sf2.w1.Z6(this.f407301g, null, this);
    }
}
