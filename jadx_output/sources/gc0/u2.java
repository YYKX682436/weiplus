package gc0;

/* loaded from: classes5.dex */
public final class u2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f270301d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f270302e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f270303f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f270304g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f270305h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f270306i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Object f270307m;

    /* renamed from: n, reason: collision with root package name */
    public int f270308n;

    /* renamed from: o, reason: collision with root package name */
    public long f270309o;

    /* renamed from: p, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f270310p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ gc0.d3 f270311q;

    /* renamed from: r, reason: collision with root package name */
    public int f270312r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(gc0.d3 d3Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f270311q = d3Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f270310p = obj;
        this.f270312r |= Integer.MIN_VALUE;
        return this.f270311q.d(null, null, 0, this);
    }
}
