package xt2;

/* loaded from: classes14.dex */
public final class y extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f457103d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f457104e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f457105f;

    /* renamed from: g, reason: collision with root package name */
    public long f457106g;

    /* renamed from: h, reason: collision with root package name */
    public long f457107h;

    /* renamed from: i, reason: collision with root package name */
    public int f457108i;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f457109m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ xt2.a0 f457110n;

    /* renamed from: o, reason: collision with root package name */
    public int f457111o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(xt2.a0 a0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f457110n = a0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f457109m = obj;
        this.f457111o |= Integer.MIN_VALUE;
        return this.f457110n.f(null, null, this);
    }
}
