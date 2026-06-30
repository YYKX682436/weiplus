package yf0;

/* loaded from: classes12.dex */
public final class k extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f461568d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f461569e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f461570f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f461571g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f461572h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f461573i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yf0.m f461574m;

    /* renamed from: n, reason: collision with root package name */
    public int f461575n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(yf0.m mVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f461574m = mVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f461573i = obj;
        this.f461575n |= Integer.MIN_VALUE;
        return this.f461574m.b(false, false, null, null, null, this);
    }
}
