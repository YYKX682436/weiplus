package l0;

/* loaded from: classes14.dex */
public final class r2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l0.a3 f314495d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(l0.a3 a3Var) {
        super(1);
        this.f314495d = a3Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        float floatValue = ((java.lang.Number) obj).floatValue();
        l0.a3 a3Var = this.f314495d;
        float floatValue2 = ((java.lang.Number) ((n0.q4) a3Var.f314034g).getValue()).floatValue() + floatValue;
        float e17 = e06.p.e(floatValue2, a3Var.f314038k, a3Var.f314039l);
        float f17 = floatValue2 - e17;
        l0.p1 p1Var = (l0.p1) ((n0.q4) a3Var.f314042o).getValue();
        float f18 = 0.0f;
        if (p1Var != null) {
            float f19 = f17 < 0.0f ? p1Var.f314421b : p1Var.f314422c;
            if (!(f19 == 0.0f)) {
                f18 = ((float) java.lang.Math.sin((e06.p.e(f17 / r3, -1.0f, 1.0f) * 3.1415927f) / 2)) * (p1Var.f314420a / f19);
            }
        }
        ((n0.q4) a3Var.f314032e).setValue(java.lang.Float.valueOf(e17 + f18));
        ((n0.q4) a3Var.f314033f).setValue(java.lang.Float.valueOf(f17));
        ((n0.q4) a3Var.f314034g).setValue(java.lang.Float.valueOf(floatValue2));
        return jz5.f0.f302826a;
    }
}
