package wi3;

/* loaded from: classes14.dex */
public final class i extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f446212d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f446213e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f446214f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f446215g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f446216h;

    /* renamed from: i, reason: collision with root package name */
    public long f446217i;

    /* renamed from: m, reason: collision with root package name */
    public int f446218m;

    /* renamed from: n, reason: collision with root package name */
    public int f446219n;

    /* renamed from: o, reason: collision with root package name */
    public int f446220o;

    /* renamed from: p, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f446221p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ wi3.l f446222q;

    /* renamed from: r, reason: collision with root package name */
    public int f446223r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(wi3.l lVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f446222q = lVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f446221p = obj;
        this.f446223r |= Integer.MIN_VALUE;
        return wi3.l.b(this.f446222q, null, null, this);
    }
}
