package yn1;

/* loaded from: classes11.dex */
public final class u0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f463853d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f463854e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f463855f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yn1.z0 f463856g;

    /* renamed from: h, reason: collision with root package name */
    public int f463857h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(yn1.z0 z0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f463856g = z0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f463855f = obj;
        this.f463857h |= Integer.MIN_VALUE;
        return this.f463856g.s(null, null, this);
    }
}
