package iu;

/* loaded from: classes12.dex */
public final class k extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f294697d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f294698e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f294699f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f294700g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f294701h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f294702i;

    /* renamed from: m, reason: collision with root package name */
    public int f294703m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f294704n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ iu.n f294705o;

    /* renamed from: p, reason: collision with root package name */
    public int f294706p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(iu.n nVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f294705o = nVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f294704n = obj;
        this.f294706p |= Integer.MIN_VALUE;
        return this.f294705o.b(null, this);
    }
}
