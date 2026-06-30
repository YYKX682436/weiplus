package kp;

/* loaded from: classes13.dex */
public final class z extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f310871d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f310872e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f310873f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f310874g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kp.i1 f310875h;

    /* renamed from: i, reason: collision with root package name */
    public int f310876i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(kp.i1 i1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f310875h = i1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f310874g = obj;
        this.f310876i |= Integer.MIN_VALUE;
        return this.f310875h.Bi(null, null, this);
    }
}
