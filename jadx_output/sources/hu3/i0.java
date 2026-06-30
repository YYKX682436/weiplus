package hu3;

/* loaded from: classes5.dex */
public final class i0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f285136d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f285137e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hu3.n0 f285138f;

    /* renamed from: g, reason: collision with root package name */
    public int f285139g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(hu3.n0 n0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f285138f = n0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f285137e = obj;
        this.f285139g |= Integer.MIN_VALUE;
        return this.f285138f.k(null, this);
    }
}
