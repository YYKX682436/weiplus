package fn2;

/* loaded from: classes10.dex */
public final class l1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f264307d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f264308e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f264309f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ fn2.q1 f264310g;

    /* renamed from: h, reason: collision with root package name */
    public int f264311h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(fn2.q1 q1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f264310g = q1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f264309f = obj;
        this.f264311h |= Integer.MIN_VALUE;
        return this.f264310g.e(false, this);
    }
}
