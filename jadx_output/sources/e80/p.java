package e80;

/* loaded from: classes12.dex */
public final class p extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f250056d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f250057e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f250058f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f250059g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f250060h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f250061i;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f250062m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ e80.r f250063n;

    /* renamed from: o, reason: collision with root package name */
    public int f250064o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(e80.r rVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f250063n = rVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f250062m = obj;
        this.f250064o |= Integer.MIN_VALUE;
        return this.f250063n.b7(null, null, this);
    }
}
