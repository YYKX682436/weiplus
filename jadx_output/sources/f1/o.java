package f1;

/* loaded from: classes14.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f1.z f258513d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(f1.z zVar) {
        super(1);
        this.f258513d = zVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        double doubleValue = ((java.lang.Number) obj).doubleValue();
        f1.z zVar = this.f258513d;
        double d17 = zVar.f258536b;
        double d18 = zVar.f258539e;
        double d19 = zVar.f258538d;
        return java.lang.Double.valueOf(doubleValue >= d18 * d19 ? (java.lang.Math.pow(doubleValue, 1.0d / zVar.f258535a) - zVar.f258537c) / d17 : doubleValue / d19);
    }
}
