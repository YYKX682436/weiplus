package rk4;

/* loaded from: classes11.dex */
public final class y6 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f397100d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f397101e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f397102f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f397103g;

    /* renamed from: h, reason: collision with root package name */
    public long f397104h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f397105i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ rk4.k8 f397106m;

    /* renamed from: n, reason: collision with root package name */
    public int f397107n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y6(rk4.k8 k8Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f397106m = k8Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f397105i = obj;
        this.f397107n |= Integer.MIN_VALUE;
        return this.f397106m.l(false, false, this);
    }
}
