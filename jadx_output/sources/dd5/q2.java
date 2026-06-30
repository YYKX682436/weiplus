package dd5;

/* loaded from: classes9.dex */
public final class q2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f229258d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f229259e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f229260f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f229261g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f229262h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f229263i;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f229264m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ dd5.t2 f229265n;

    /* renamed from: o, reason: collision with root package name */
    public int f229266o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(dd5.t2 t2Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f229265n = t2Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f229264m = obj;
        this.f229266o |= Integer.MIN_VALUE;
        return this.f229265n.w(null, null, this);
    }
}
