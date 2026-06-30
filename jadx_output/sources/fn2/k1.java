package fn2;

/* loaded from: classes10.dex */
public final class k1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f264299d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f264300e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f264301f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ fn2.q1 f264302g;

    /* renamed from: h, reason: collision with root package name */
    public int f264303h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(fn2.q1 q1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f264302g = q1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f264301f = obj;
        this.f264303h |= Integer.MIN_VALUE;
        return this.f264302g.c(null, false, null, this);
    }
}
