package qg5;

/* loaded from: classes12.dex */
public final class y extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f363259d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f363260e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f363261f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qg5.l0 f363262g;

    /* renamed from: h, reason: collision with root package name */
    public int f363263h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(qg5.l0 l0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f363262g = l0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f363261f = obj;
        this.f363263h |= Integer.MIN_VALUE;
        return this.f363262g.cj(null, false, this);
    }
}
