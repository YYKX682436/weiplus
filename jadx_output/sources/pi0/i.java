package pi0;

/* loaded from: classes11.dex */
public final class i extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f354596d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f354597e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f354598f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f354599g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f354600h;

    /* renamed from: i, reason: collision with root package name */
    public long f354601i;

    /* renamed from: m, reason: collision with root package name */
    public long f354602m;

    /* renamed from: n, reason: collision with root package name */
    public long f354603n;

    /* renamed from: o, reason: collision with root package name */
    public long f354604o;

    /* renamed from: p, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f354605p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ pi0.q f354606q;

    /* renamed from: r, reason: collision with root package name */
    public int f354607r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(pi0.q qVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f354606q = qVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f354605p = obj;
        this.f354607r |= Integer.MIN_VALUE;
        return this.f354606q.g(null, false, false, false, null, this);
    }
}
