package g4;

/* loaded from: classes5.dex */
public final class h1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f268333d;

    /* renamed from: e, reason: collision with root package name */
    public int f268334e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g4.i1 f268335f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f268336g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f268337h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f268338i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Object f268339m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Object f268340n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.Object f268341o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.Object f268342p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.Object f268343q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.Object f268344r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.Object f268345s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.Object f268346t;

    /* renamed from: u, reason: collision with root package name */
    public int f268347u;

    /* renamed from: v, reason: collision with root package name */
    public int f268348v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(g4.i1 i1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f268335f = i1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f268333d = obj;
        this.f268334e |= Integer.MIN_VALUE;
        return this.f268335f.a(null, this);
    }
}
