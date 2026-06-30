package g4;

/* loaded from: classes14.dex */
public final class q4 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f268522d;

    /* renamed from: e, reason: collision with root package name */
    public int f268523e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g4.r4 f268524f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f268525g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f268526h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f268527i;

    /* renamed from: m, reason: collision with root package name */
    public int f268528m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q4(g4.r4 r4Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f268524f = r4Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f268522d = obj;
        this.f268523e |= Integer.MIN_VALUE;
        return this.f268524f.b(0, null, this);
    }
}
