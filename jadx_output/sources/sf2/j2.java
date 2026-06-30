package sf2;

/* loaded from: classes10.dex */
public final class j2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f407177d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f407178e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f407179f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ sf2.d3 f407180g;

    /* renamed from: h, reason: collision with root package name */
    public int f407181h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(sf2.d3 d3Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f407180g = d3Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f407179f = obj;
        this.f407181h |= Integer.MIN_VALUE;
        return this.f407180g.h7(null, false, null, null, this);
    }
}
