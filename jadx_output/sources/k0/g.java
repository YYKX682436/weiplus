package k0;

/* loaded from: classes14.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f302907d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f302908e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l2.e f302909f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f302910g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(long j17, boolean z17, l2.e eVar, boolean z18) {
        super(1);
        this.f302907d = j17;
        this.f302908e = z17;
        this.f302909f = eVar;
        this.f302910g = z18;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        b1.c drawWithCache = (b1.c) obj;
        kotlin.jvm.internal.o.g(drawWithCache, "$this$drawWithCache");
        e1.g0 d17 = k0.i.d(drawWithCache, d1.k.d(drawWithCache.a()) / 2.0f);
        int i17 = android.os.Build.VERSION.SDK_INT;
        long j17 = this.f302907d;
        return drawWithCache.b(new k0.f(this.f302908e, this.f302909f, this.f302910g, d17, new e1.z(i17 >= 29 ? e1.n.f246281a.a(j17, 5) : new android.graphics.PorterDuffColorFilter(e1.a0.h(j17), e1.a.b(5)))));
    }
}
