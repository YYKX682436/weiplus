package rf2;

/* loaded from: classes10.dex */
public final class m0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f394806d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f394807e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f394808f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f394809g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f394810h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f394811i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Object f394812m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Object f394813n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f394814o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f394815p;

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f394816q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ rf2.v0 f394817r;

    /* renamed from: s, reason: collision with root package name */
    public int f394818s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(rf2.v0 v0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f394817r = v0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f394816q = obj;
        this.f394818s |= Integer.MIN_VALUE;
        return this.f394817r.i(null, false, false, this);
    }
}
