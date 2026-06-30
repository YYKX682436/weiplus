package rk4;

/* loaded from: classes11.dex */
public final class x6 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f397073d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f397074e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f397075f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f397076g;

    /* renamed from: h, reason: collision with root package name */
    public long f397077h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f397078i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ rk4.k8 f397079m;

    /* renamed from: n, reason: collision with root package name */
    public int f397080n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x6(rk4.k8 k8Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f397079m = k8Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f397078i = obj;
        this.f397080n |= Integer.MIN_VALUE;
        return rk4.k8.f(this.f397079m, null, null, this);
    }
}
