package g80;

/* loaded from: classes12.dex */
public final class g extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f269448d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f269449e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f269450f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f269451g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f269452h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f269453i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Object f269454m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Object f269455n;

    /* renamed from: o, reason: collision with root package name */
    public long f269456o;

    /* renamed from: p, reason: collision with root package name */
    public int f269457p;

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f269458q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g80.o f269459r;

    /* renamed from: s, reason: collision with root package name */
    public int f269460s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(g80.o oVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f269459r = oVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f269458q = obj;
        this.f269460s |= Integer.MIN_VALUE;
        return this.f269459r.Z6(null, null, null, null, null, this);
    }
}
