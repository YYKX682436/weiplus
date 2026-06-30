package o1;

/* loaded from: classes14.dex */
public final class i extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f342027d;

    /* renamed from: e, reason: collision with root package name */
    public long f342028e;

    /* renamed from: f, reason: collision with root package name */
    public long f342029f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f342030g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ o1.k f342031h;

    /* renamed from: i, reason: collision with root package name */
    public int f342032i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(o1.k kVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f342031h = kVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f342030g = obj;
        this.f342032i |= Integer.MIN_VALUE;
        return this.f342031h.a(0L, 0L, this);
    }
}
