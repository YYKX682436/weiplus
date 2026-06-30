package mx3;

/* loaded from: classes10.dex */
public final class g0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f332559d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f332560e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f332561f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f332562g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f332563h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f332564i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ mx3.i0 f332565m;

    /* renamed from: n, reason: collision with root package name */
    public int f332566n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(mx3.i0 i0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f332565m = i0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f332564i = obj;
        this.f332566n |= Integer.MIN_VALUE;
        return this.f332565m.a(null, null, false, this);
    }
}
