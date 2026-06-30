package gc0;

/* loaded from: classes5.dex */
public final class j0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f270193d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f270194e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f270195f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gc0.y0 f270196g;

    /* renamed from: h, reason: collision with root package name */
    public int f270197h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(gc0.y0 y0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f270196g = y0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f270195f = obj;
        this.f270197h |= Integer.MIN_VALUE;
        return this.f270196g.a(null, 0, this);
    }
}
