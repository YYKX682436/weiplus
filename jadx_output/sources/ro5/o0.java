package ro5;

/* loaded from: classes14.dex */
public final class o0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f398268d;

    /* renamed from: e, reason: collision with root package name */
    public int f398269e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f398270f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ro5.m1 f398271g;

    /* renamed from: h, reason: collision with root package name */
    public int f398272h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(ro5.m1 m1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f398271g = m1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f398270f = obj;
        this.f398272h |= Integer.MIN_VALUE;
        return this.f398271g.c(0, null, null, this);
    }
}
