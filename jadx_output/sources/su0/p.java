package su0;

/* loaded from: classes5.dex */
public final class p extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f412680d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f412681e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f412682f;

    /* renamed from: g, reason: collision with root package name */
    public long f412683g;

    /* renamed from: h, reason: collision with root package name */
    public float f412684h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f412685i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ su0.r f412686m;

    /* renamed from: n, reason: collision with root package name */
    public int f412687n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(su0.r rVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f412686m = rVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f412685i = obj;
        this.f412687n |= Integer.MIN_VALUE;
        return this.f412686m.e(null, null, 0, 0L, 0.0f, this);
    }
}
