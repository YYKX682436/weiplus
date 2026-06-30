package nu0;

/* loaded from: classes5.dex */
public final class t1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f340096d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f340097e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nu0.b4 f340098f;

    /* renamed from: g, reason: collision with root package name */
    public int f340099g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(nu0.b4 b4Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f340098f = b4Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f340097e = obj;
        this.f340099g |= Integer.MIN_VALUE;
        return nu0.b4.Z6(this.f340098f, null, this);
    }
}
