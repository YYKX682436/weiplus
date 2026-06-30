package f1;

/* loaded from: classes13.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final f1.f f258474d = new f1.f();

    public f() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        double d17;
        double doubleValue = ((java.lang.Number) obj).doubleValue();
        double d18 = doubleValue < 0.0d ? -doubleValue : doubleValue;
        if (d18 >= 0.0031308049535603718d) {
            d18 = java.lang.Math.pow(d18, 0.4166666666666667d) - 0.05213270142180095d;
            d17 = 0.9478672985781991d;
        } else {
            d17 = 0.07739938080495357d;
        }
        return java.lang.Double.valueOf(java.lang.Math.copySign(d18 / d17, doubleValue));
    }
}
