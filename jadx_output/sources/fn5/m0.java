package fn5;

/* loaded from: classes14.dex */
public final class m0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f264712d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f264713e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fn5.n0 f264714f;

    /* renamed from: g, reason: collision with root package name */
    public int f264715g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(fn5.n0 n0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f264714f = n0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f264713e = obj;
        this.f264715g |= Integer.MIN_VALUE;
        return fn5.n0.N6(this.f264714f, null, this);
    }
}
