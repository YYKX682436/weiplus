package gx0;

/* loaded from: classes5.dex */
public final class x1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f277148d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f277149e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f277150f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f277151g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ gx0.u2 f277152h;

    /* renamed from: i, reason: collision with root package name */
    public int f277153i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(gx0.u2 u2Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f277152h = u2Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f277151g = obj;
        this.f277153i |= Integer.MIN_VALUE;
        return gx0.u2.Q7(this.f277152h, this);
    }
}
