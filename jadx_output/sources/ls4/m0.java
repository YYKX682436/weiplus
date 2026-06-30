package ls4;

/* loaded from: classes8.dex */
public final class m0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f321082d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f321083e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ls4.n0 f321084f;

    /* renamed from: g, reason: collision with root package name */
    public int f321085g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(ls4.n0 n0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f321084f = n0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f321083e = obj;
        this.f321085g |= Integer.MIN_VALUE;
        return this.f321084f.e(this);
    }
}
