package g2;

/* loaded from: classes14.dex */
public final class o0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f267726d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f267727e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f267728f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g2.p0 f267729g;

    /* renamed from: h, reason: collision with root package name */
    public int f267730h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(g2.p0 p0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f267729g = p0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f267728f = obj;
        this.f267730h |= Integer.MIN_VALUE;
        return this.f267729g.b(this);
    }
}
