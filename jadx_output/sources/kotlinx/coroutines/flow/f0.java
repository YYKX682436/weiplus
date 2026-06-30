package kotlinx.coroutines.flow;

/* loaded from: classes14.dex */
public final class f0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f310246d;

    /* renamed from: e, reason: collision with root package name */
    public int f310247e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.g0 f310248f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f310249g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f310250h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(kotlinx.coroutines.flow.g0 g0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f310248f = g0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f310246d = obj;
        this.f310247e |= Integer.MIN_VALUE;
        return this.f310248f.a(null, this);
    }
}
