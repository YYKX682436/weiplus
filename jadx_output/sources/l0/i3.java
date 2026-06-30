package l0;

/* loaded from: classes14.dex */
public final class i3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f314259d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(n0.e5 e5Var) {
        super(1);
        this.f314259d = e5Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        g1.i Canvas = (g1.i) obj;
        kotlin.jvm.internal.o.g(Canvas, "$this$Canvas");
        long j17 = ((e1.y) this.f314259d.getValue()).f246322a;
        float R = Canvas.R(l0.l3.f314363a);
        float R2 = Canvas.R(l0.l3.f314364b);
        float f17 = R2 / 2;
        long a17 = d1.f.a(f17, d1.e.d(Canvas.r()));
        long a18 = d1.f.a(R - f17, d1.e.d(Canvas.r()));
        int i17 = g1.i.J0;
        Canvas.F(j17, a17, a18, R2, 1, null, 1.0f, null, 3);
        return jz5.f0.f302826a;
    }
}
