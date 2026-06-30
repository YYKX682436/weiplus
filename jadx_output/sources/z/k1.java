package z;

/* loaded from: classes13.dex */
public final class k1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ double f468710d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ double f468711e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ double f468712f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ double f468713g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(double d17, double d18, double d19, double d27) {
        super(1);
        this.f468710d = d17;
        this.f468711e = d18;
        this.f468712f = d19;
        this.f468713g = d27;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        double doubleValue = ((java.lang.Number) obj).doubleValue();
        return java.lang.Double.valueOf(((this.f468710d + (this.f468711e * doubleValue)) * java.lang.Math.exp(this.f468712f * doubleValue)) + this.f468713g);
    }
}
