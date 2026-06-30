package rf2;

/* loaded from: classes10.dex */
public final class x extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f394950d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f394951e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f394952f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rf2.v0 f394953g;

    /* renamed from: h, reason: collision with root package name */
    public int f394954h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(rf2.v0 v0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f394953g = v0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f394952f = obj;
        this.f394954h |= Integer.MIN_VALUE;
        return rf2.v0.b(this.f394953g, null, this);
    }
}
