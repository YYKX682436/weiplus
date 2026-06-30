package yn1;

/* loaded from: classes11.dex */
public final class n0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f463760d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f463761e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f463762f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f463763g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yn1.z0 f463764h;

    /* renamed from: i, reason: collision with root package name */
    public int f463765i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(yn1.z0 z0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f463764h = z0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f463763g = obj;
        this.f463765i |= Integer.MIN_VALUE;
        return this.f463764h.c(null, null, this);
    }
}
