package sp2;

/* loaded from: classes3.dex */
public final class x2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f411267d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f411268e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f411269f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f411270g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ sp2.d3 f411271h;

    /* renamed from: i, reason: collision with root package name */
    public int f411272i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(sp2.d3 d3Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f411271h = d3Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f411270g = obj;
        this.f411272i |= Integer.MIN_VALUE;
        return sp2.d3.a(this.f411271h, null, null, this);
    }
}
