package tr0;

/* loaded from: classes14.dex */
public final class k extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f421315d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f421316e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f421317f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ tr0.t f421318g;

    /* renamed from: h, reason: collision with root package name */
    public int f421319h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(tr0.t tVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f421318g = tVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f421317f = obj;
        this.f421319h |= Integer.MIN_VALUE;
        return this.f421318g.n(null, this);
    }
}
