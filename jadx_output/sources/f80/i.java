package f80;

/* loaded from: classes12.dex */
public final class i extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f260107d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f260108e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f260109f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f260110g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ f80.j f260111h;

    /* renamed from: i, reason: collision with root package name */
    public int f260112i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(f80.j jVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f260111h = jVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f260110g = obj;
        this.f260112i |= Integer.MIN_VALUE;
        return f80.j.p(this.f260111h, this);
    }
}
