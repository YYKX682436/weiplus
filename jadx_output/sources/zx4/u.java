package zx4;

/* loaded from: classes8.dex */
public final class u extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f477189d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f477190e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f477191f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f477192g;

    /* renamed from: h, reason: collision with root package name */
    public int f477193h;

    /* renamed from: i, reason: collision with root package name */
    public int f477194i;

    /* renamed from: m, reason: collision with root package name */
    public int f477195m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f477196n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ zx4.l0 f477197o;

    /* renamed from: p, reason: collision with root package name */
    public int f477198p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(zx4.l0 l0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f477197o = l0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f477196n = obj;
        this.f477198p |= Integer.MIN_VALUE;
        return zx4.l0.b(this.f477197o, null, false, this);
    }
}
