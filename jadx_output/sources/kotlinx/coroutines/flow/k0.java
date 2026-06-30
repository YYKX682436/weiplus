package kotlinx.coroutines.flow;

/* loaded from: classes14.dex */
public final class k0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f310300d;

    /* renamed from: e, reason: collision with root package name */
    public int f310301e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.l0 f310302f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f310303g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f310304h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(kotlinx.coroutines.flow.l0 l0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f310302f = l0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f310300d = obj;
        this.f310301e |= Integer.MIN_VALUE;
        return this.f310302f.a(null, this);
    }
}
