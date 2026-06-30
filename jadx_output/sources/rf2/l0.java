package rf2;

/* loaded from: classes10.dex */
public final class l0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f394798d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f394799e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f394800f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rf2.v0 f394801g;

    /* renamed from: h, reason: collision with root package name */
    public int f394802h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(rf2.v0 v0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f394801g = v0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f394800f = obj;
        this.f394802h |= Integer.MIN_VALUE;
        return rf2.v0.e(this.f394801g, null, null, this);
    }
}
