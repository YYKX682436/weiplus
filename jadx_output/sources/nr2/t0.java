package nr2;

/* loaded from: classes8.dex */
public final class t0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f339306d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f339307e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f339308f;

    /* renamed from: g, reason: collision with root package name */
    public int f339309g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f339310h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ nr2.u0 f339311i;

    /* renamed from: m, reason: collision with root package name */
    public int f339312m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(nr2.u0 u0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f339311i = u0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f339310h = obj;
        this.f339312m |= Integer.MIN_VALUE;
        return this.f339311i.R6(null, 0, 0L, null, null, null, this);
    }
}
