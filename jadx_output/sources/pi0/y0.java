package pi0;

/* loaded from: classes11.dex */
public final class y0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f354742d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f354743e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f354744f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f354745g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ pi0.l1 f354746h;

    /* renamed from: i, reason: collision with root package name */
    public int f354747i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(pi0.l1 l1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f354746h = l1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f354745g = obj;
        this.f354747i |= Integer.MIN_VALUE;
        return this.f354746h.d(null, null, null, null, null, this);
    }
}
