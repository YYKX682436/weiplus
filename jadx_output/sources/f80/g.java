package f80;

/* loaded from: classes12.dex */
public final class g extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f260089d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f260090e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f260091f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f260092g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f260093h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f260094i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Object f260095m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Object f260096n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.Object f260097o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.Object f260098p;

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f260099q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ f80.j f260100r;

    /* renamed from: s, reason: collision with root package name */
    public int f260101s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(f80.j jVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f260100r = jVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f260099q = obj;
        this.f260101s |= Integer.MIN_VALUE;
        return f80.j.n(this.f260100r, null, null, null, null, null, null, this);
    }
}
