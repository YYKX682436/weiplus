package ut;

/* loaded from: classes12.dex */
public final class l0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f430661d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f430662e;

    /* renamed from: f, reason: collision with root package name */
    public long f430663f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f430664g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ut.q0 f430665h;

    /* renamed from: i, reason: collision with root package name */
    public int f430666i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(ut.q0 q0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f430665h = q0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f430664g = obj;
        this.f430666i |= Integer.MIN_VALUE;
        return this.f430665h.y(this);
    }
}
