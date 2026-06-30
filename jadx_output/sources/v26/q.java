package v26;

/* loaded from: classes14.dex */
public final class q extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f433042d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f433043e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f433044f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f433045g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ v26.r f433046h;

    /* renamed from: i, reason: collision with root package name */
    public int f433047i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(v26.r rVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f433046h = rVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f433045g = obj;
        this.f433047i |= Integer.MIN_VALUE;
        return this.f433046h.emit(null, this);
    }
}
