package nj3;

/* loaded from: classes14.dex */
public final class i extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f337915d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f337916e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f337917f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f337918g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f337919h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f337920i;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f337921m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ nj3.j f337922n;

    /* renamed from: o, reason: collision with root package name */
    public int f337923o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(nj3.j jVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f337922n = jVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f337921m = obj;
        this.f337923o |= Integer.MIN_VALUE;
        return this.f337922n.c(null, this);
    }
}
