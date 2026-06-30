package sf2;

/* loaded from: classes10.dex */
public final class p2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f407237d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f407238e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f407239f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ sf2.d3 f407240g;

    /* renamed from: h, reason: collision with root package name */
    public int f407241h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(sf2.d3 d3Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f407240g = d3Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f407239f = obj;
        this.f407241h |= Integer.MIN_VALUE;
        return this.f407240g.m7(null, null, null, this);
    }
}
