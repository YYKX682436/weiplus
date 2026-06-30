package rf2;

/* loaded from: classes10.dex */
public final class k1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f394788d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f394789e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f394790f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f394791g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ rf2.o1 f394792h;

    /* renamed from: i, reason: collision with root package name */
    public int f394793i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(rf2.o1 o1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f394792h = o1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f394791g = obj;
        this.f394793i |= Integer.MIN_VALUE;
        return this.f394792h.c(null, this);
    }
}
