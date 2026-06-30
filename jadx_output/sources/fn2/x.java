package fn2;

/* loaded from: classes5.dex */
public final class x extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f264434d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f264435e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fn2.b0 f264436f;

    /* renamed from: g, reason: collision with root package name */
    public int f264437g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(fn2.b0 b0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f264436f = b0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f264435e = obj;
        this.f264437g |= Integer.MIN_VALUE;
        return this.f264436f.a(this);
    }
}
