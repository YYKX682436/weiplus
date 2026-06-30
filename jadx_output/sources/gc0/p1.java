package gc0;

/* loaded from: classes5.dex */
public final class p1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f270237d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f270238e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f270239f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gc0.p2 f270240g;

    /* renamed from: h, reason: collision with root package name */
    public int f270241h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(gc0.p2 p2Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f270240g = p2Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f270239f = obj;
        this.f270241h |= Integer.MIN_VALUE;
        return this.f270240g.Q6(null, null, this);
    }
}
