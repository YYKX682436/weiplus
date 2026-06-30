package pi0;

/* loaded from: classes11.dex */
public final class i1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f354608d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f354609e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f354610f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f354611g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f354612h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f354613i;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f354614m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ pi0.l1 f354615n;

    /* renamed from: o, reason: collision with root package name */
    public int f354616o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(pi0.l1 l1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f354615n = l1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f354614m = obj;
        this.f354616o |= Integer.MIN_VALUE;
        return this.f354615n.x(null, null, null, null, this);
    }
}
