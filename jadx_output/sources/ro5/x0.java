package ro5;

/* loaded from: classes14.dex */
public final class x0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f398304d;

    /* renamed from: e, reason: collision with root package name */
    public int f398305e;

    /* renamed from: f, reason: collision with root package name */
    public int f398306f;

    /* renamed from: g, reason: collision with root package name */
    public int f398307g;

    /* renamed from: h, reason: collision with root package name */
    public int f398308h;

    /* renamed from: i, reason: collision with root package name */
    public int f398309i;

    /* renamed from: m, reason: collision with root package name */
    public int f398310m;

    /* renamed from: n, reason: collision with root package name */
    public int f398311n;

    /* renamed from: o, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f398312o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ ro5.m1 f398313p;

    /* renamed from: q, reason: collision with root package name */
    public int f398314q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(ro5.m1 m1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f398313p = m1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f398312o = obj;
        this.f398314q |= Integer.MIN_VALUE;
        return this.f398313p.d(0, 0, 0, 0, false, null, false, this);
    }
}
