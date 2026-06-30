package eg2;

/* loaded from: classes3.dex */
public final class y0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f252647d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f252648e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ eg2.b1 f252649f;

    /* renamed from: g, reason: collision with root package name */
    public int f252650g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(eg2.b1 b1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f252649f = b1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f252648e = obj;
        this.f252650g |= Integer.MIN_VALUE;
        return eg2.b1.f(this.f252649f, this);
    }
}
