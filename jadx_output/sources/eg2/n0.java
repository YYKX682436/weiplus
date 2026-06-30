package eg2;

/* loaded from: classes3.dex */
public final class n0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f252599d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f252600e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f252601f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ eg2.o0 f252602g;

    /* renamed from: h, reason: collision with root package name */
    public int f252603h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(eg2.o0 o0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f252602g = o0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f252601f = obj;
        this.f252603h |= Integer.MIN_VALUE;
        return this.f252602g.a(null, null, null, 0, 0, this);
    }
}
