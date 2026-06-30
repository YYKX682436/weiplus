package pn4;

/* loaded from: classes14.dex */
public final class v0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f357235d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f357236e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pn4.e1 f357237f;

    /* renamed from: g, reason: collision with root package name */
    public int f357238g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(pn4.e1 e1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f357237f = e1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f357236e = obj;
        this.f357238g |= Integer.MIN_VALUE;
        return this.f357237f.b(null, 0, this);
    }
}
