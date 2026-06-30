package hu3;

/* loaded from: classes5.dex */
public final class c extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f285092d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f285093e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hu3.n0 f285094f;

    /* renamed from: g, reason: collision with root package name */
    public int f285095g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(hu3.n0 n0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f285094f = n0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f285093e = obj;
        this.f285095g |= Integer.MIN_VALUE;
        return this.f285094f.d(this);
    }
}
