package xy0;

/* loaded from: classes5.dex */
public final class i extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f458147d;

    /* renamed from: e, reason: collision with root package name */
    public int f458148e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f458149f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ xy0.j f458150g;

    /* renamed from: h, reason: collision with root package name */
    public int f458151h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(xy0.j jVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f458150g = jVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f458149f = obj;
        this.f458151h |= Integer.MIN_VALUE;
        return this.f458150g.b(null, this);
    }
}
