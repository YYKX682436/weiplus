package mz0;

/* loaded from: classes5.dex */
public final class g extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f332952d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f332953e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f332954f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f332955g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f332956h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f332957i;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f332958m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ mz0.b2 f332959n;

    /* renamed from: o, reason: collision with root package name */
    public int f332960o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(mz0.b2 b2Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f332959n = b2Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f332958m = obj;
        this.f332960o |= Integer.MIN_VALUE;
        return mz0.b2.V6(this.f332959n, this);
    }
}
