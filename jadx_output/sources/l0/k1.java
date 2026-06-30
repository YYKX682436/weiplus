package l0;

/* loaded from: classes14.dex */
public final class k1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f314316d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f314317e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g1.n f314318f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f314319g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f314320h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f314321i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f314322m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(float f17, long j17, g1.n nVar, n0.e5 e5Var, n0.e5 e5Var2, n0.e5 e5Var3, n0.e5 e5Var4) {
        super(1);
        this.f314316d = f17;
        this.f314317e = j17;
        this.f314318f = nVar;
        this.f314319g = e5Var;
        this.f314320h = e5Var2;
        this.f314321i = e5Var3;
        this.f314322m = e5Var4;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        g1.i Canvas = (g1.i) obj;
        kotlin.jvm.internal.o.g(Canvas, "$this$Canvas");
        float floatValue = ((java.lang.Number) this.f314320h.getValue()).floatValue();
        n0.e5 e5Var = this.f314321i;
        float abs = java.lang.Math.abs(floatValue - ((java.lang.Number) e5Var.getValue()).floatValue());
        float floatValue2 = ((java.lang.Number) e5Var.getValue()).floatValue() + (((((java.lang.Number) this.f314319g.getValue()).intValue() * 216.0f) % 360.0f) - 90.0f) + ((java.lang.Number) this.f314322m.getValue()).floatValue();
        long j17 = this.f314317e;
        float f17 = 2;
        float f18 = floatValue2 + (((this.f314316d / (l0.o1.f314402a / f17)) * 57.29578f) / 2.0f);
        float max = java.lang.Math.max(abs, 0.1f);
        g1.n nVar = this.f314318f;
        float f19 = nVar.f267513a / f17;
        float d17 = d1.k.d(Canvas.a()) - (f17 * f19);
        g1.h.a(Canvas, j17, f18, max, false, d1.f.a(f19, f19), d1.l.a(d17, d17), 0.0f, nVar, null, 0, 832, null);
        return jz5.f0.f302826a;
    }
}
