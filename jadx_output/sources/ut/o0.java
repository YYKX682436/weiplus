package ut;

/* loaded from: classes12.dex */
public final class o0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f430696d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f430697e;

    /* renamed from: f, reason: collision with root package name */
    public long f430698f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f430699g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ut.q0 f430700h;

    /* renamed from: i, reason: collision with root package name */
    public int f430701i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(ut.q0 q0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f430700h = q0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f430699g = obj;
        this.f430701i |= Integer.MIN_VALUE;
        return this.f430700h.g0(this);
    }
}
