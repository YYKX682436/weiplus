package pn4;

/* loaded from: classes14.dex */
public final class r0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f357204d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f357205e;

    /* renamed from: f, reason: collision with root package name */
    public int f357206f;

    /* renamed from: g, reason: collision with root package name */
    public int f357207g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f357208h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f357209i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ pn4.t0 f357210m;

    /* renamed from: n, reason: collision with root package name */
    public int f357211n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(pn4.t0 t0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f357210m = t0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f357209i = obj;
        this.f357211n |= Integer.MIN_VALUE;
        return this.f357210m.a(null, 0, 0, false, this);
    }
}
