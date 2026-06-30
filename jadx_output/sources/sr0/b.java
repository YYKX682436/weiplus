package sr0;

/* loaded from: classes14.dex */
public final class b extends qz5.d {
    public int L;
    public boolean M;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f411408d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f411409e;

    /* renamed from: f, reason: collision with root package name */
    public int f411410f;

    /* renamed from: g, reason: collision with root package name */
    public int f411411g;

    /* renamed from: h, reason: collision with root package name */
    public int f411412h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f411413i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ sr0.f f411414m;

    /* renamed from: n, reason: collision with root package name */
    public int f411415n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(sr0.f fVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f411414m = fVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f411413i = obj;
        this.f411415n |= Integer.MIN_VALUE;
        return sr0.f.E(this.f411414m, 0, 0, 0, false, this);
    }
}
