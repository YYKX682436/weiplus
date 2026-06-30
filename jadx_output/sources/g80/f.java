package g80;

/* loaded from: classes12.dex */
public final class f extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f269435d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f269436e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f269437f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f269438g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f269439h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f269440i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Object f269441m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Object f269442n;

    /* renamed from: o, reason: collision with root package name */
    public long f269443o;

    /* renamed from: p, reason: collision with root package name */
    public int f269444p;

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f269445q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g80.o f269446r;

    /* renamed from: s, reason: collision with root package name */
    public int f269447s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g80.o oVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f269446r = oVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f269445q = obj;
        this.f269447s |= Integer.MIN_VALUE;
        return this.f269446r.Y6(null, null, null, null, null, this);
    }
}
