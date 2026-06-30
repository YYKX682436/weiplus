package pn4;

/* loaded from: classes14.dex */
public final class p0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f357166d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f357167e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pn4.q0 f357168f;

    /* renamed from: g, reason: collision with root package name */
    public int f357169g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(pn4.q0 q0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f357168f = q0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f357167e = obj;
        this.f357169g |= Integer.MIN_VALUE;
        return pn4.q0.d(this.f357168f, null, null, this);
    }
}
