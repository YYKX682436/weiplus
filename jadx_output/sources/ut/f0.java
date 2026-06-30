package ut;

/* loaded from: classes12.dex */
public final class f0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f430620d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f430621e;

    /* renamed from: f, reason: collision with root package name */
    public long f430622f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f430623g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ut.q0 f430624h;

    /* renamed from: i, reason: collision with root package name */
    public int f430625i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(ut.q0 q0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f430624h = q0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f430623g = obj;
        this.f430625i |= Integer.MIN_VALUE;
        return this.f430624h.m(this);
    }
}
