package mx3;

/* loaded from: classes10.dex */
public final class p extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f332604d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f332605e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f332606f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f332607g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f332608h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f332609i;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f332610m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ mx3.s f332611n;

    /* renamed from: o, reason: collision with root package name */
    public int f332612o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(mx3.s sVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f332611n = sVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f332610m = obj;
        this.f332612o |= Integer.MIN_VALUE;
        return this.f332611n.e(null, null, false, null, this);
    }
}
