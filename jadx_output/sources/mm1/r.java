package mm1;

/* loaded from: classes11.dex */
public final class r extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f328688d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f328689e;

    /* renamed from: f, reason: collision with root package name */
    public long f328690f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f328691g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ mm1.b0 f328692h;

    /* renamed from: i, reason: collision with root package name */
    public int f328693i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(mm1.b0 b0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f328692h = b0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f328691g = obj;
        this.f328693i |= Integer.MIN_VALUE;
        return this.f328692h.b(false, this);
    }
}
