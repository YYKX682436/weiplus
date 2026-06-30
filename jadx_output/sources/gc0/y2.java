package gc0;

/* loaded from: classes5.dex */
public final class y2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f270381d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gc0.d3 f270382e;

    /* renamed from: f, reason: collision with root package name */
    public int f270383f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(gc0.d3 d3Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f270382e = d3Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f270381d = obj;
        this.f270383f |= Integer.MIN_VALUE;
        return this.f270382e.g(this);
    }
}
