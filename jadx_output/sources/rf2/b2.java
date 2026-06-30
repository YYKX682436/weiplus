package rf2;

/* loaded from: classes10.dex */
public final class b2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f394664d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f394665e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f394666f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f394667g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f394668h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f394669i;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f394670m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ rf2.c2 f394671n;

    /* renamed from: o, reason: collision with root package name */
    public int f394672o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(rf2.c2 c2Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f394671n = c2Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f394670m = obj;
        this.f394672o |= Integer.MIN_VALUE;
        return rf2.c2.a(this.f394671n, null, null, null, null, null, this);
    }
}
