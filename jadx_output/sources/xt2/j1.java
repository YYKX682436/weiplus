package xt2;

/* loaded from: classes3.dex */
public final class j1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f456813d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f456814e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f456815f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f456816g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f456817h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f456818i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Object f456819m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Object f456820n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f456821o;

    /* renamed from: p, reason: collision with root package name */
    public int f456822p;

    /* renamed from: q, reason: collision with root package name */
    public int f456823q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f456824r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ xt2.k1 f456825s;

    /* renamed from: t, reason: collision with root package name */
    public int f456826t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(xt2.k1 k1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f456825s = k1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f456824r = obj;
        this.f456826t |= Integer.MIN_VALUE;
        return this.f456825s.c(null, null, false, null, 0, null, this);
    }
}
