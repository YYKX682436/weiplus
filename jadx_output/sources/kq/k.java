package kq;

/* loaded from: classes12.dex */
public final class k extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f311195d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f311196e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f311197f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f311198g;

    /* renamed from: h, reason: collision with root package name */
    public int f311199h;

    /* renamed from: i, reason: collision with root package name */
    public int f311200i;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f311201m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ kq.n f311202n;

    /* renamed from: o, reason: collision with root package name */
    public int f311203o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(kq.n nVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f311202n = nVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f311201m = obj;
        this.f311203o |= Integer.MIN_VALUE;
        return this.f311202n.c(this);
    }
}
