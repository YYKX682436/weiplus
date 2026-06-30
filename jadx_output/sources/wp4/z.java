package wp4;

/* loaded from: classes10.dex */
public final class z extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f448457d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f448458e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f448459f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f448460g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ wp4.b0 f448461h;

    /* renamed from: i, reason: collision with root package name */
    public int f448462i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(wp4.b0 b0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f448461h = b0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f448460g = obj;
        this.f448462i |= Integer.MIN_VALUE;
        return this.f448461h.Bi(null, null, null, null, this);
    }
}
