package yl2;

/* loaded from: classes3.dex */
public final class i0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f463025d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f463026e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f463027f;

    /* renamed from: g, reason: collision with root package name */
    public int f463028g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f463029h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f463030i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yl2.g1 f463031m;

    /* renamed from: n, reason: collision with root package name */
    public int f463032n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(yl2.g1 g1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f463031m = g1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f463030i = obj;
        this.f463032n |= Integer.MIN_VALUE;
        return this.f463031m.g(null, 0, false, this);
    }
}
