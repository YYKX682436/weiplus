package yx0;

/* loaded from: classes5.dex */
public final class a2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f467111d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f467112e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f467113f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f467114g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f467115h;

    /* renamed from: i, reason: collision with root package name */
    public long f467116i;

    /* renamed from: m, reason: collision with root package name */
    public int f467117m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f467118n;

    /* renamed from: o, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f467119o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f467120p;

    /* renamed from: q, reason: collision with root package name */
    public int f467121q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(yx0.b8 b8Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f467120p = b8Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f467119o = obj;
        this.f467121q |= Integer.MIN_VALUE;
        return yx0.b8.e(this.f467120p, null, null, 0L, 0, 0L, null, 0, null, false, false, null, this);
    }
}
