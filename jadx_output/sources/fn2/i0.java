package fn2;

/* loaded from: classes10.dex */
public final class i0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f264280d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f264281e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fn2.m0 f264282f;

    /* renamed from: g, reason: collision with root package name */
    public int f264283g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(fn2.m0 m0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f264282f = m0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f264281e = obj;
        this.f264283g |= Integer.MIN_VALUE;
        return this.f264282f.a(this);
    }
}
