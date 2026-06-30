package rk4;

/* loaded from: classes11.dex */
public final class f8 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f396655d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f396656e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f396657f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f396658g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f396659h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f396660i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Object f396661m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Object f396662n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.Object f396663o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f396664p;

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f396665q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ rk4.k8 f396666r;

    /* renamed from: s, reason: collision with root package name */
    public int f396667s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f8(rk4.k8 k8Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f396666r = k8Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f396665q = obj;
        this.f396667s |= Integer.MIN_VALUE;
        return this.f396666r.I(null, null, false, null, null, null, this);
    }
}
