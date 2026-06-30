package eg2;

/* loaded from: classes3.dex */
public final class h0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f252571d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f252572e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ eg2.i0 f252573f;

    /* renamed from: g, reason: collision with root package name */
    public int f252574g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(eg2.i0 i0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f252573f = i0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f252572e = obj;
        this.f252574g |= Integer.MIN_VALUE;
        return this.f252573f.e(null, this);
    }
}
