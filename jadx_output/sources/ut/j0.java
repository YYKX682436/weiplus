package ut;

/* loaded from: classes12.dex */
public final class j0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f430648d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f430649e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ut.q0 f430650f;

    /* renamed from: g, reason: collision with root package name */
    public int f430651g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(ut.q0 q0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f430650f = q0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f430649e = obj;
        this.f430651g |= Integer.MIN_VALUE;
        return this.f430650f.B(this);
    }
}
