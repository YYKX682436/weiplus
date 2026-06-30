package z;

/* loaded from: classes13.dex */
public final class n1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ double f468749d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ double f468750e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ double f468751f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ double f468752g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(double d17, double d18, double d19, double d27) {
        super(1);
        this.f468749d = d17;
        this.f468750e = d18;
        this.f468751f = d19;
        this.f468752g = d27;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        double doubleValue = ((java.lang.Number) obj).doubleValue();
        double d17 = this.f468749d;
        double d18 = this.f468750e;
        double exp = d17 * d18 * java.lang.Math.exp(d18 * doubleValue);
        double d19 = this.f468751f;
        double d27 = this.f468752g;
        return java.lang.Double.valueOf(exp + (d19 * d27 * java.lang.Math.exp(d27 * doubleValue)));
    }
}
