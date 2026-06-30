package g4;

/* loaded from: classes5.dex */
public final class g2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f268305d;

    /* renamed from: e, reason: collision with root package name */
    public int f268306e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g4.y2 f268307f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f268308g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f268309h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f268310i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Object f268311m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Object f268312n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.Object f268313o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.Object f268314p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.Object f268315q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.Object f268316r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.Object f268317s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.Object f268318t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(g4.y2 y2Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f268307f = y2Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f268305d = obj;
        this.f268306e |= Integer.MIN_VALUE;
        return this.f268307f.e(null, null, this);
    }
}
