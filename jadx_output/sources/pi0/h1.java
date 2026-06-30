package pi0;

/* loaded from: classes11.dex */
public final class h1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f354590d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f354591e;

    /* renamed from: f, reason: collision with root package name */
    public int f354592f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f354593g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ pi0.l1 f354594h;

    /* renamed from: i, reason: collision with root package name */
    public int f354595i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(pi0.l1 l1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f354594h = l1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f354593g = obj;
        this.f354595i |= Integer.MIN_VALUE;
        return this.f354594h.w(null, null, null, null, null, 0, this);
    }
}
