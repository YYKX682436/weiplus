package yf0;

/* loaded from: classes12.dex */
public final class b extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f461495d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f461496e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f461497f;

    /* renamed from: g, reason: collision with root package name */
    public long f461498g;

    /* renamed from: h, reason: collision with root package name */
    public long f461499h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f461500i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yf0.f f461501m;

    /* renamed from: n, reason: collision with root package name */
    public int f461502n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(yf0.f fVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f461501m = fVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f461500i = obj;
        this.f461502n |= Integer.MIN_VALUE;
        return this.f461501m.b(false, false, null, null, null, this);
    }
}
