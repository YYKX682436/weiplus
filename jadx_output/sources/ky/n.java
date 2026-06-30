package ky;

/* loaded from: classes14.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z.e f313396d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f313397e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f313398f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f313399g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f313400h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f313401i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ z.e f313402m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f313403n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(z.e eVar, float f17, long j17, boolean z17, float f18, float f19, z.e eVar2, n0.v2 v2Var) {
        super(1);
        this.f313396d = eVar;
        this.f313397e = f17;
        this.f313398f = j17;
        this.f313399g = z17;
        this.f313400h = f18;
        this.f313401i = f19;
        this.f313402m = eVar2;
        this.f313403n = v2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        float f17;
        g1.f drawWithContent = (g1.f) obj;
        kotlin.jvm.internal.o.g(drawWithContent, "$this$drawWithContent");
        ((u1.o0) drawWithContent).b();
        d1.g a17 = d1.h.a(d1.e.f225623b, ((d1.k) this.f313403n.getValue()).f225644a);
        z.e eVar = this.f313396d;
        float floatValue = ((java.lang.Number) eVar.d()).floatValue();
        long j17 = this.f313398f;
        float f18 = this.f313397e;
        if (floatValue <= 0.0f || !eVar.e()) {
            f17 = f18;
        } else {
            f17 = f18;
            ky.p.b(drawWithContent, this.f313399g, this.f313398f, a17, floatValue * f18, (1 - floatValue) * e1.y.d(j17), this.f313400h, this.f313401i);
        }
        z.e eVar2 = this.f313402m;
        float floatValue2 = ((java.lang.Number) eVar2.d()).floatValue();
        if (floatValue2 > 0.0f && eVar2.e()) {
            ky.p.b(drawWithContent, this.f313399g, this.f313398f, a17, floatValue2 * f17, (1 - floatValue2) * e1.y.d(j17), this.f313400h, this.f313401i);
        }
        return jz5.f0.f302826a;
    }
}
