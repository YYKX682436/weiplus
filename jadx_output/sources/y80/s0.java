package y80;

/* loaded from: classes12.dex */
public final class s0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f459930d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f459931e;

    /* renamed from: f, reason: collision with root package name */
    public long f459932f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f459933g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ y80.t0 f459934h;

    /* renamed from: i, reason: collision with root package name */
    public int f459935i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(y80.t0 t0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f459934h = t0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f459933g = obj;
        this.f459935i |= Integer.MIN_VALUE;
        return this.f459934h.m(this);
    }
}
