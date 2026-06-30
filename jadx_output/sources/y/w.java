package y;

/* loaded from: classes14.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f1.d f458464d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(f1.d dVar) {
        super(1);
        this.f458464d = dVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        z.v it = (z.v) obj;
        kotlin.jvm.internal.o.g(it, "it");
        double d17 = 3.0f;
        float pow = (float) java.lang.Math.pow(it.f468850b, d17);
        float pow2 = (float) java.lang.Math.pow(it.f468851c, d17);
        float pow3 = (float) java.lang.Math.pow(it.f468852d, d17);
        float[] fArr = y.x.f458468b;
        return new e1.y(e1.y.a(e1.a0.a(e06.p.e(y.x.a(0, pow, pow2, pow3, fArr), -2.0f, 2.0f), e06.p.e(y.x.a(1, pow, pow2, pow3, fArr), -2.0f, 2.0f), e06.p.e(y.x.a(2, pow, pow2, pow3, fArr), -2.0f, 2.0f), e06.p.e(it.f468849a, 0.0f, 1.0f), f1.h.f258493r), this.f458464d));
    }
}
