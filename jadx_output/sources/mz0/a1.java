package mz0;

/* loaded from: classes5.dex */
public final class a1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f332873d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f332874e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mz0.b2 f332875f;

    /* renamed from: g, reason: collision with root package name */
    public int f332876g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(mz0.b2 b2Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f332875f = b2Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f332874e = obj;
        this.f332876g |= Integer.MIN_VALUE;
        return mz0.b2.P6(this.f332875f, null, this);
    }
}
