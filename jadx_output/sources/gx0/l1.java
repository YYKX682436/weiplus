package gx0;

/* loaded from: classes5.dex */
public final class l1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f276650d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f276651e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gx0.r1 f276652f;

    /* renamed from: g, reason: collision with root package name */
    public int f276653g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(gx0.r1 r1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f276652f = r1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f276651e = obj;
        this.f276653g |= Integer.MIN_VALUE;
        return this.f276652f.n7(null, null, null, this);
    }
}
