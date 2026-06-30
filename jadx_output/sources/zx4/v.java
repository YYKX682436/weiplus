package zx4;

/* loaded from: classes8.dex */
public final class v extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f477199d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f477200e;

    /* renamed from: f, reason: collision with root package name */
    public int f477201f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f477202g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ zx4.x f477203h;

    /* renamed from: i, reason: collision with root package name */
    public int f477204i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(zx4.x xVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f477203h = xVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f477202g = obj;
        this.f477204i |= Integer.MIN_VALUE;
        return this.f477203h.d(null, this);
    }
}
