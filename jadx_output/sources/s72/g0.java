package s72;

/* loaded from: classes12.dex */
public final class g0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public long f404031d;

    /* renamed from: e, reason: collision with root package name */
    public int f404032e;

    /* renamed from: f, reason: collision with root package name */
    public int f404033f;

    /* renamed from: g, reason: collision with root package name */
    public int f404034g;

    /* renamed from: h, reason: collision with root package name */
    public int f404035h;

    /* renamed from: i, reason: collision with root package name */
    public int f404036i;

    /* renamed from: m, reason: collision with root package name */
    public int f404037m;

    /* renamed from: n, reason: collision with root package name */
    public int f404038n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.Object f404039o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.Object f404040p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.Object f404041q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.Object f404042r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f404043s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ s72.j0 f404044t;

    /* renamed from: u, reason: collision with root package name */
    public int f404045u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(s72.j0 j0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f404044t = j0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f404043s = obj;
        this.f404045u |= Integer.MIN_VALUE;
        return this.f404044t.e7(this);
    }
}
