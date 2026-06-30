package gc0;

/* loaded from: classes5.dex */
public final class q1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f270251d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f270252e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f270253f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f270254g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ gc0.p2 f270255h;

    /* renamed from: i, reason: collision with root package name */
    public int f270256i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(gc0.p2 p2Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f270255h = p2Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f270254g = obj;
        this.f270256i |= Integer.MIN_VALUE;
        return this.f270255h.R6(null, null, this);
    }
}
