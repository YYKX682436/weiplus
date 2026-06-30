package yn1;

/* loaded from: classes11.dex */
public final class o0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f463774d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f463775e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yn1.z0 f463776f;

    /* renamed from: g, reason: collision with root package name */
    public int f463777g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(yn1.z0 z0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f463776f = z0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f463775e = obj;
        this.f463777g |= Integer.MIN_VALUE;
        return this.f463776f.d(this);
    }
}
