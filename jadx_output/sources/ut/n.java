package ut;

/* loaded from: classes12.dex */
public final class n extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f430681d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f430682e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f430683f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f430684g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f430685h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ut.q0 f430686i;

    /* renamed from: m, reason: collision with root package name */
    public int f430687m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(ut.q0 q0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f430686i = q0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f430685h = obj;
        this.f430687m |= Integer.MIN_VALUE;
        return ut.q0.N(this.f430686i, null, null, false, 0L, null, this);
    }
}
