package yf0;

/* loaded from: classes12.dex */
public final class u extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f461602d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f461603e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f461604f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yf0.k0 f461605g;

    /* renamed from: h, reason: collision with root package name */
    public int f461606h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(yf0.k0 k0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f461605g = k0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f461604f = obj;
        this.f461606h |= Integer.MIN_VALUE;
        return yf0.k0.T6(this.f461605g, null, 0, 0, null, this);
    }
}
