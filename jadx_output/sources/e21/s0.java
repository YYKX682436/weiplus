package e21;

/* loaded from: classes11.dex */
public final class s0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f246577d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f246578e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f246579f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e21.z0 f246580g;

    /* renamed from: h, reason: collision with root package name */
    public int f246581h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(e21.z0 z0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f246580g = z0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f246579f = obj;
        this.f246581h |= Integer.MIN_VALUE;
        return this.f246580g.k(null, this);
    }
}
