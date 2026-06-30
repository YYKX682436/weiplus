package rv0;

/* loaded from: classes5.dex */
public final class p5 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f400181d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f400182e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f400183f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f400184g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ rv0.z6 f400185h;

    /* renamed from: i, reason: collision with root package name */
    public int f400186i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p5(rv0.z6 z6Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f400185h = z6Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f400184g = obj;
        this.f400186i |= Integer.MIN_VALUE;
        return rv0.z6.l7(this.f400185h, null, null, this);
    }
}
