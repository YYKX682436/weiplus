package go2;

/* loaded from: classes8.dex */
public final class k0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f273990d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f273991e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f273992f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f273993g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f273994h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f273995i;

    /* renamed from: m, reason: collision with root package name */
    public int f273996m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f273997n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ go2.a1 f273998o;

    /* renamed from: p, reason: collision with root package name */
    public int f273999p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(go2.a1 a1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f273998o = a1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f273997n = obj;
        this.f273999p |= Integer.MIN_VALUE;
        return this.f273998o.Q6(null, null, 0, null, false, 0, this);
    }
}
