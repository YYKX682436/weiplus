package f1;

/* loaded from: classes2.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ double f258518d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(double d17) {
        super(1);
        this.f258518d = d17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        double doubleValue = ((java.lang.Number) obj).doubleValue();
        if (doubleValue < 0.0d) {
            doubleValue = 0.0d;
        }
        return java.lang.Double.valueOf(java.lang.Math.pow(doubleValue, this.f258518d));
    }
}
