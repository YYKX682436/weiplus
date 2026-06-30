package su0;

/* loaded from: classes5.dex */
public final class y extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f412715d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f412716e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f412717f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ su0.a0 f412718g;

    /* renamed from: h, reason: collision with root package name */
    public int f412719h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(su0.a0 a0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f412718g = a0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f412717f = obj;
        this.f412719h |= Integer.MIN_VALUE;
        return this.f412718g.a(null, this);
    }
}
