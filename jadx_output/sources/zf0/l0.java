package zf0;

/* loaded from: classes12.dex */
public final class l0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f472466d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f472467e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f472468f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f472469g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f472470h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f472471i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ zf0.v0 f472472m;

    /* renamed from: n, reason: collision with root package name */
    public int f472473n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(zf0.v0 v0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f472472m = v0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f472471i = obj;
        this.f472473n |= Integer.MIN_VALUE;
        return zf0.v0.I(this.f472472m, null, null, null, this);
    }
}
