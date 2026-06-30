package t03;

/* loaded from: classes15.dex */
public final class n0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f414489d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f414490e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ t03.r0 f414491f;

    /* renamed from: g, reason: collision with root package name */
    public int f414492g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(t03.r0 r0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f414491f = r0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f414490e = obj;
        this.f414492g |= Integer.MIN_VALUE;
        return t03.r0.T(this.f414491f, this);
    }
}
