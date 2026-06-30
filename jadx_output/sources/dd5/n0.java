package dd5;

/* loaded from: classes9.dex */
public final class n0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f229226d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f229227e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f229228f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dd5.p0 f229229g;

    /* renamed from: h, reason: collision with root package name */
    public int f229230h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(dd5.p0 p0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f229229g = p0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f229228f = obj;
        this.f229230h |= Integer.MIN_VALUE;
        return this.f229229g.w(null, null, this);
    }
}
