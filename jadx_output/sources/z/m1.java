package z;

/* loaded from: classes13.dex */
public final class m1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ double f468737d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ double f468738e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ double f468739f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ double f468740g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ double f468741h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(double d17, double d18, double d19, double d27, double d28) {
        super(1);
        this.f468737d = d17;
        this.f468738e = d18;
        this.f468739f = d19;
        this.f468740g = d27;
        this.f468741h = d28;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        double doubleValue = ((java.lang.Number) obj).doubleValue();
        return java.lang.Double.valueOf((this.f468737d * java.lang.Math.exp(this.f468738e * doubleValue)) + (this.f468739f * java.lang.Math.exp(this.f468740g * doubleValue)) + this.f468741h);
    }
}
