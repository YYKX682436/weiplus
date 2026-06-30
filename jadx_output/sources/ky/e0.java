package ky;

/* loaded from: classes14.dex */
public final class e0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f313343d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f313344e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f313345f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f313346g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(float f17, n0.e5 e5Var, int i17, long j17) {
        super(1);
        this.f313343d = f17;
        this.f313344e = e5Var;
        this.f313345f = i17;
        this.f313346g = j17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        g1.i Canvas = (g1.i) obj;
        kotlin.jvm.internal.o.g(Canvas, "$this$Canvas");
        float min = java.lang.Math.min(d1.k.d(Canvas.a()), d1.k.b(Canvas.a()));
        float f17 = 2;
        float f18 = (min - this.f313343d) / f17;
        float f19 = min / 2.0f;
        long a17 = d1.f.a(f19, f19);
        float floatValue = ((java.lang.Number) this.f313344e.getValue()).floatValue();
        long j17 = this.f313346g;
        float f27 = this.f313343d;
        g1.b bVar = (g1.b) Canvas.p();
        long b17 = bVar.b();
        bVar.a().c();
        ((g1.d) bVar.f267504a).c(floatValue, a17);
        int i17 = 0;
        while (true) {
            int i18 = this.f313345f;
            if (i17 >= i18) {
                g1.b bVar2 = bVar;
                bVar2.a().b();
                bVar2.c(b17);
                return jz5.f0.f302826a;
            }
            float f28 = i18;
            float f29 = i17 / f28;
            float f37 = (f29 * 360.0f) - 90.0f;
            float f38 = ((f29 + (1.0f / f28)) * 360.0f) - 90.0f;
            long j18 = b17;
            g1.b bVar3 = bVar;
            float f39 = f27;
            float f47 = f18 * f17;
            g1.h.a(Canvas, e1.y.b(j17, f29, 0.0f, 0.0f, 0.0f, 14, null), f37, f38 - f37, false, d1.f.a(d1.e.c(a17) - f18, d1.e.d(a17) - f18), d1.l.a(f47, f47), 0.0f, new g1.n(f39, 0.0f, (i17 == 0 || i17 == i18 + (-1)) ? 1 : 0, 0, null, 26, null), null, 0, 832, null);
            i17++;
            bVar = bVar3;
            f27 = f39;
            j17 = j17;
            a17 = a17;
            f17 = f17;
            Canvas = Canvas;
            b17 = j18;
        }
    }
}
