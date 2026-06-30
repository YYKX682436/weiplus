package f1;

/* loaded from: classes14.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f1.z f258515d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(f1.z zVar) {
        super(1);
        this.f258515d = zVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        double doubleValue = ((java.lang.Number) obj).doubleValue();
        f1.z zVar = this.f258515d;
        return java.lang.Double.valueOf(doubleValue >= zVar.f258539e ? java.lang.Math.pow((zVar.f258536b * doubleValue) + zVar.f258537c, zVar.f258535a) : doubleValue * zVar.f258538d);
    }
}
