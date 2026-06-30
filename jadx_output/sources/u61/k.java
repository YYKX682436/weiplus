package u61;

/* loaded from: classes4.dex */
public final class k extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f424897d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f424898e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f424899f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f424900g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f424901h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f424902i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Object f424903m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Object f424904n;

    /* renamed from: o, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f424905o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ u61.o f424906p;

    /* renamed from: q, reason: collision with root package name */
    public int f424907q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(u61.o oVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f424906p = oVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f424905o = obj;
        this.f424907q |= Integer.MIN_VALUE;
        return this.f424906p.b(null, null, null, this);
    }
}
