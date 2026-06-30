package g4;

/* loaded from: classes5.dex */
public final class g0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f268297d;

    /* renamed from: e, reason: collision with root package name */
    public int f268298e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g4.i0 f268299f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f268300g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f268301h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f268302i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Object f268303m;

    /* renamed from: n, reason: collision with root package name */
    public int f268304n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(g4.i0 i0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f268299f = i0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f268297d = obj;
        this.f268298e |= Integer.MIN_VALUE;
        return this.f268299f.a(this);
    }
}
