package z;

/* loaded from: classes13.dex */
public final class l1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ double f468718d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ double f468719e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ double f468720f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(double d17, double d18, double d19) {
        super(1);
        this.f468718d = d17;
        this.f468719e = d18;
        this.f468720f = d19;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        double doubleValue = ((java.lang.Number) obj).doubleValue();
        double d17 = this.f468719e;
        double d18 = doubleValue * d17;
        return java.lang.Double.valueOf(((this.f468718d * (1 + d18)) + (this.f468720f * d17)) * java.lang.Math.exp(d18));
    }
}
