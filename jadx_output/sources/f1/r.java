package f1;

/* loaded from: classes14.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f1.z f258516d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(f1.z zVar) {
        super(1);
        this.f258516d = zVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        double d17;
        double doubleValue = ((java.lang.Number) obj).doubleValue();
        f1.z zVar = this.f258516d;
        double d18 = zVar.f258536b;
        if (doubleValue >= zVar.f258539e) {
            d17 = java.lang.Math.pow((d18 * doubleValue) + zVar.f258537c, zVar.f258535a) + zVar.f258540f;
        } else {
            d17 = zVar.f258541g + (zVar.f258538d * doubleValue);
        }
        return java.lang.Double.valueOf(d17);
    }
}
