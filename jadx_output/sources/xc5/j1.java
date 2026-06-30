package xc5;

/* loaded from: classes12.dex */
public final class j1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f453494d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f453495e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f453496f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f453497g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f453498h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f453499i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Object f453500m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Object f453501n;

    /* renamed from: o, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f453502o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ xc5.k1 f453503p;

    /* renamed from: q, reason: collision with root package name */
    public int f453504q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(xc5.k1 k1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f453503p = k1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f453502o = obj;
        this.f453504q |= Integer.MIN_VALUE;
        return xc5.k1.b7(this.f453503p, null, null, null, null, null, null, null, this);
    }
}
