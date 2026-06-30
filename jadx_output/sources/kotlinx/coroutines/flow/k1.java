package kotlinx.coroutines.flow;

/* loaded from: classes14.dex */
public final class k1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f310305d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f310306e;

    /* renamed from: f, reason: collision with root package name */
    public int f310307f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.l1 f310308g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f310309h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(kotlinx.coroutines.flow.l1 l1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f310308g = l1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f310306e = obj;
        this.f310307f |= Integer.MIN_VALUE;
        return this.f310308g.emit(null, this);
    }
}
