package sf2;

/* loaded from: classes10.dex */
public final class u2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f407303d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f407304e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f407305f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f407306g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f407307h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f407308i;

    /* renamed from: m, reason: collision with root package name */
    public int f407309m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f407310n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ sf2.d3 f407311o;

    /* renamed from: p, reason: collision with root package name */
    public int f407312p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(sf2.d3 d3Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f407311o = d3Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f407310n = obj;
        this.f407312p |= Integer.MIN_VALUE;
        return this.f407311o.n7(0, null, null, null, false, null, null, this);
    }
}
