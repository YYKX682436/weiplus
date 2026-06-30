package df2;

/* loaded from: classes10.dex */
public final class sy extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f231383d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f231384e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f231385f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f231386g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f231387h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f231388i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ df2.wy f231389m;

    /* renamed from: n, reason: collision with root package name */
    public int f231390n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sy(df2.wy wyVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f231389m = wyVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f231388i = obj;
        this.f231390n |= Integer.MIN_VALUE;
        return this.f231389m.k7(null, this);
    }
}
