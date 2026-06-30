package pi0;

/* loaded from: classes11.dex */
public final class b1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f354523d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f354524e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f354525f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f354526g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ pi0.l1 f354527h;

    /* renamed from: i, reason: collision with root package name */
    public int f354528i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(pi0.l1 l1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f354527h = l1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f354526g = obj;
        this.f354528i |= Integer.MIN_VALUE;
        return this.f354527h.f(null, null, this);
    }
}
