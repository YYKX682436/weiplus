package nu0;

/* loaded from: classes5.dex */
public final class p1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f340062d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f340063e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f340064f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ nu0.b4 f340065g;

    /* renamed from: h, reason: collision with root package name */
    public int f340066h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(nu0.b4 b4Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f340065g = b4Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f340064f = obj;
        this.f340066h |= Integer.MIN_VALUE;
        return this.f340065g.g7(this);
    }
}
