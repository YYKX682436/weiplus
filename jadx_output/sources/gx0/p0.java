package gx0;

/* loaded from: classes5.dex */
public final class p0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f276809d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx0.q0 f276810e;

    /* renamed from: f, reason: collision with root package name */
    public int f276811f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(gx0.q0 q0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f276810e = q0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f276809d = obj;
        this.f276811f |= Integer.MIN_VALUE;
        return this.f276810e.c(false, null, this);
    }
}
