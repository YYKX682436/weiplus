package n12;

/* loaded from: classes10.dex */
public final class b extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f334058d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f334059e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f334060f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f334061g;

    /* renamed from: h, reason: collision with root package name */
    public long f334062h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f334063i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ n12.e f334064m;

    /* renamed from: n, reason: collision with root package name */
    public int f334065n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(n12.e eVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f334064m = eVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f334063i = obj;
        this.f334065n |= Integer.MIN_VALUE;
        return this.f334064m.a(0L, null, this);
    }
}
