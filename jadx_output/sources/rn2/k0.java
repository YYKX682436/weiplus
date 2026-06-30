package rn2;

/* loaded from: classes.dex */
public final class k0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f397778d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f397779e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f397780f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f397781g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ rn2.l0 f397782h;

    /* renamed from: i, reason: collision with root package name */
    public int f397783i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(rn2.l0 l0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f397782h = l0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f397781g = obj;
        this.f397783i |= Integer.MIN_VALUE;
        return this.f397782h.e(null, null, this);
    }
}
