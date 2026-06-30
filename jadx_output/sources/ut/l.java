package ut;

/* loaded from: classes12.dex */
public final class l extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f430654d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f430655e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f430656f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f430657g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f430658h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ut.q0 f430659i;

    /* renamed from: m, reason: collision with root package name */
    public int f430660m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(ut.q0 q0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f430659i = q0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f430658h = obj;
        this.f430660m |= Integer.MIN_VALUE;
        return ut.q0.M(this.f430659i, null, null, false, null, 0L, null, false, this);
    }
}
