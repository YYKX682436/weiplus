package v20;

/* loaded from: classes9.dex */
public final class k extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f432773d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f432774e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f432775f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f432776g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f432777h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f432778i;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f432779m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v20.n f432780n;

    /* renamed from: o, reason: collision with root package name */
    public int f432781o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(v20.n nVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f432780n = nVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f432779m = obj;
        this.f432781o |= Integer.MIN_VALUE;
        return this.f432780n.a(null, null, null, null, false, this);
    }
}
