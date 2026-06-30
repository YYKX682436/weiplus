package nj3;

/* loaded from: classes14.dex */
public final class h extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f337909d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f337910e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f337911f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f337912g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ nj3.j f337913h;

    /* renamed from: i, reason: collision with root package name */
    public int f337914i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(nj3.j jVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f337913h = jVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f337912g = obj;
        this.f337914i |= Integer.MIN_VALUE;
        return this.f337913h.b(null, false, this);
    }
}
