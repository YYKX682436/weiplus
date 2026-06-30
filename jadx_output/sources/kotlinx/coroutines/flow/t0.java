package kotlinx.coroutines.flow;

/* loaded from: classes10.dex */
public final class t0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f310404d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f310405e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f310406f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.u0 f310407g;

    /* renamed from: h, reason: collision with root package name */
    public int f310408h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(kotlinx.coroutines.flow.u0 u0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f310407g = u0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f310406f = obj;
        this.f310408h |= Integer.MIN_VALUE;
        return this.f310407g.emit(null, this);
    }
}
