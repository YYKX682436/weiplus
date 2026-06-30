package gk5;

/* loaded from: classes9.dex */
public final class h0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f272660d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f272661e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gk5.r0 f272662f;

    /* renamed from: g, reason: collision with root package name */
    public int f272663g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(gk5.r0 r0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f272662f = r0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f272661e = obj;
        this.f272663g |= Integer.MIN_VALUE;
        return this.f272662f.T6(null, this);
    }
}
