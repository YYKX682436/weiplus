package s72;

/* loaded from: classes12.dex */
public final class l extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f404078d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f404079e;

    /* renamed from: f, reason: collision with root package name */
    public long f404080f;

    /* renamed from: g, reason: collision with root package name */
    public int f404081g;

    /* renamed from: h, reason: collision with root package name */
    public int f404082h;

    /* renamed from: i, reason: collision with root package name */
    public int f404083i;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f404084m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ s72.j0 f404085n;

    /* renamed from: o, reason: collision with root package name */
    public int f404086o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(s72.j0 j0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f404085n = j0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f404084m = obj;
        this.f404086o |= Integer.MIN_VALUE;
        return this.f404085n.W6(this);
    }
}
