package tr0;

/* loaded from: classes14.dex */
public final class j extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f421310d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f421311e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f421312f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ tr0.t f421313g;

    /* renamed from: h, reason: collision with root package name */
    public int f421314h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(tr0.t tVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f421313g = tVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f421312f = obj;
        this.f421314h |= Integer.MIN_VALUE;
        return this.f421313g.s(null, null, null, null, this);
    }
}
