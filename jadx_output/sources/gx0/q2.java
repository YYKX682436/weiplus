package gx0;

/* loaded from: classes5.dex */
public final class q2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f276862d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx0.r2 f276863e;

    /* renamed from: f, reason: collision with root package name */
    public int f276864f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(gx0.r2 r2Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f276863e = r2Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f276862d = obj;
        this.f276864f |= Integer.MIN_VALUE;
        return this.f276863e.c(false, null, this);
    }
}
