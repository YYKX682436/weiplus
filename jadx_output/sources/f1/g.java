package f1;

/* loaded from: classes13.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final f1.g f258475d = new f1.g();

    public g() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        double doubleValue = ((java.lang.Number) obj).doubleValue();
        double d17 = doubleValue < 0.0d ? -doubleValue : doubleValue;
        return java.lang.Double.valueOf(java.lang.Math.copySign(d17 >= 0.04045d ? java.lang.Math.pow((0.9478672985781991d * d17) + 0.05213270142180095d, 2.4d) : d17 * 0.07739938080495357d, doubleValue));
    }
}
