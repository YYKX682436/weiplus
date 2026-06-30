package hu3;

/* loaded from: classes5.dex */
public final class e extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f285112d;

    /* renamed from: e, reason: collision with root package name */
    public int f285113e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f285114f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ hu3.n0 f285115g;

    /* renamed from: h, reason: collision with root package name */
    public int f285116h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(hu3.n0 n0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f285115g = n0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f285114f = obj;
        this.f285116h |= Integer.MIN_VALUE;
        return hu3.n0.a(this.f285115g, this);
    }
}
