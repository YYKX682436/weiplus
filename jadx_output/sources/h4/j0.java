package h4;

/* loaded from: classes14.dex */
public final class j0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f278672d;

    /* renamed from: e, reason: collision with root package name */
    public int f278673e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h4.k0 f278674f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f278675g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(h4.k0 k0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f278674f = k0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f278672d = obj;
        this.f278673e |= Integer.MIN_VALUE;
        return this.f278674f.b(this);
    }
}
