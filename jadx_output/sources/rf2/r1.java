package rf2;

/* loaded from: classes10.dex */
public final class r1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f394877d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f394878e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f394879f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f394880g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ rf2.c2 f394881h;

    /* renamed from: i, reason: collision with root package name */
    public int f394882i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(rf2.c2 c2Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f394881h = c2Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f394880g = obj;
        this.f394882i |= Integer.MIN_VALUE;
        return this.f394881h.c(null, false, this);
    }
}
