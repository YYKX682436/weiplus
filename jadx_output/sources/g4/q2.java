package g4;

/* loaded from: classes5.dex */
public final class q2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f268508d;

    /* renamed from: e, reason: collision with root package name */
    public int f268509e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g4.y2 f268510f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(g4.y2 y2Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f268510f = y2Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f268508d = obj;
        this.f268509e |= Integer.MIN_VALUE;
        return this.f268510f.i(null, null, this);
    }
}
