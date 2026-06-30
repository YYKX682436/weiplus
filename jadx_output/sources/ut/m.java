package ut;

/* loaded from: classes12.dex */
public final class m extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f430667d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f430668e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ut.q0 f430669f;

    /* renamed from: g, reason: collision with root package name */
    public int f430670g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(ut.q0 q0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f430669f = q0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f430668e = obj;
        this.f430670g |= Integer.MIN_VALUE;
        return this.f430669f.T(null, this);
    }
}
