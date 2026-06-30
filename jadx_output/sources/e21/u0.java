package e21;

/* loaded from: classes11.dex */
public final class u0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f246587d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f246588e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f246589f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e21.z0 f246590g;

    /* renamed from: h, reason: collision with root package name */
    public int f246591h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(e21.z0 z0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f246590g = z0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f246589f = obj;
        this.f246591h |= Integer.MIN_VALUE;
        return this.f246590g.m(null, this);
    }
}
