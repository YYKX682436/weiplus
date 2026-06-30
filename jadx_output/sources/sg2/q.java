package sg2;

/* loaded from: classes13.dex */
public final class q extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f407925d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f407926e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f407927f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f407928g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ sg2.x f407929h;

    /* renamed from: i, reason: collision with root package name */
    public int f407930i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(sg2.x xVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f407929h = xVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f407928g = obj;
        this.f407930i |= Integer.MIN_VALUE;
        return this.f407929h.i(null, false, this);
    }
}
