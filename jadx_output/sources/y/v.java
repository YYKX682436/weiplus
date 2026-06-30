package y;

/* loaded from: classes14.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final y.v f458459d = new y.v();

    public v() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        long j17 = ((e1.y) obj).f246322a;
        long a17 = e1.y.a(j17, f1.h.f258493r);
        float h17 = e1.y.h(a17);
        float g17 = e1.y.g(a17);
        float e17 = e1.y.e(a17);
        float[] fArr = y.x.f458467a;
        double d17 = 0.33333334f;
        return new z.v(e1.y.d(j17), (float) java.lang.Math.pow(y.x.a(0, h17, g17, e17, fArr), d17), (float) java.lang.Math.pow(y.x.a(1, h17, g17, e17, fArr), d17), (float) java.lang.Math.pow(y.x.a(2, h17, g17, e17, fArr), d17));
    }
}
