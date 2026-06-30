package gc0;

/* loaded from: classes5.dex */
public final class t2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f270284d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f270285e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f270286f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f270287g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f270288h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f270289i;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f270290m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ gc0.d3 f270291n;

    /* renamed from: o, reason: collision with root package name */
    public int f270292o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(gc0.d3 d3Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f270291n = d3Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f270290m = obj;
        this.f270292o |= Integer.MIN_VALUE;
        return this.f270291n.c(null, null, 0, this);
    }
}
