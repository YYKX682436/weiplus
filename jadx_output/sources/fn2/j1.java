package fn2;

/* loaded from: classes10.dex */
public final class j1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f264289d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f264290e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f264291f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ fn2.q1 f264292g;

    /* renamed from: h, reason: collision with root package name */
    public int f264293h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(fn2.q1 q1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f264292g = q1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f264291f = obj;
        this.f264293h |= Integer.MIN_VALUE;
        return this.f264292g.a(null, false, null, this);
    }
}
