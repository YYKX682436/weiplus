package nu0;

/* loaded from: classes5.dex */
public final class h1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f339948d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f339949e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f339950f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ nu0.b4 f339951g;

    /* renamed from: h, reason: collision with root package name */
    public int f339952h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(nu0.b4 b4Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f339951g = b4Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f339950f = obj;
        this.f339952h |= Integer.MIN_VALUE;
        return nu0.b4.X6(this.f339951g, null, null, this);
    }
}
