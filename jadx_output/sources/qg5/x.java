package qg5;

/* loaded from: classes12.dex */
public final class x extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f363250d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qg5.l0 f363251e;

    /* renamed from: f, reason: collision with root package name */
    public int f363252f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(qg5.l0 l0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f363251e = l0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f363250d = obj;
        this.f363252f |= Integer.MIN_VALUE;
        return this.f363251e.bj(null, this);
    }
}
