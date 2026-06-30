package vn2;

/* loaded from: classes2.dex */
public final class t0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f438380d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f438381e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f438382f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ vn2.u0 f438383g;

    /* renamed from: h, reason: collision with root package name */
    public int f438384h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(vn2.u0 u0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f438383g = u0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f438382f = obj;
        this.f438384h |= Integer.MIN_VALUE;
        return this.f438383g.o(null, 0L, null, false, null, null, null, this);
    }
}
