package d82;

/* loaded from: classes11.dex */
public final class i extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f226936d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f226937e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f226938f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f226939g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f226940h;

    /* renamed from: i, reason: collision with root package name */
    public long f226941i;

    /* renamed from: m, reason: collision with root package name */
    public long f226942m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f226943n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ d82.j f226944o;

    /* renamed from: p, reason: collision with root package name */
    public int f226945p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(d82.j jVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f226944o = jVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f226943n = obj;
        this.f226945p |= Integer.MIN_VALUE;
        return d82.j.a(this.f226944o, null, this);
    }
}
