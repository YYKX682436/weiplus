package pi0;

/* loaded from: classes11.dex */
public final class z0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f354749d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f354750e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f354751f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f354752g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ pi0.l1 f354753h;

    /* renamed from: i, reason: collision with root package name */
    public int f354754i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(pi0.l1 l1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f354753h = l1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f354752g = obj;
        this.f354754i |= Integer.MIN_VALUE;
        return this.f354753h.e(null, null, this);
    }
}
