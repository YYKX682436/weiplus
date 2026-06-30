package rf2;

/* loaded from: classes10.dex */
public final class o extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f394829d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f394830e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f394831f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rf2.q f394832g;

    /* renamed from: h, reason: collision with root package name */
    public int f394833h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(rf2.q qVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f394832g = qVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f394831f = obj;
        this.f394833h |= Integer.MIN_VALUE;
        return rf2.q.a(this.f394832g, null, this);
    }
}
