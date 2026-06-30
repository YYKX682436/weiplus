package pi0;

/* loaded from: classes11.dex */
public final class g1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f354579d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f354580e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f354581f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ pi0.l1 f354582g;

    /* renamed from: h, reason: collision with root package name */
    public int f354583h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(pi0.l1 l1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f354582g = l1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f354581f = obj;
        this.f354583h |= Integer.MIN_VALUE;
        return this.f354582g.u(null, null, null, null, null, this);
    }
}
