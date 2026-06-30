package rv0;

/* loaded from: classes5.dex */
public final class l2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rv0.j7 f400099d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ex0.r f400100e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(rv0.j7 j7Var, ex0.r rVar) {
        super(0);
        this.f400099d = j7Var;
        this.f400100e = rVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        double d17;
        com.tencent.maas.moviecomposing.segments.Segment segment = this.f400100e.f257167a;
        com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment = segment instanceof com.tencent.maas.moviecomposing.segments.ClipSegment ? (com.tencent.maas.moviecomposing.segments.ClipSegment) segment : null;
        if (clipSegment != null) {
            java.lang.Double valueOf = java.lang.Double.valueOf(clipSegment.v1());
            java.lang.Double d18 = java.lang.Double.isNaN(valueOf.doubleValue()) ^ true ? valueOf : null;
            if (d18 != null) {
                d17 = d18.doubleValue();
                this.f400099d.setSpeed(d17);
                return jz5.f0.f302826a;
            }
        }
        d17 = 1.0d;
        this.f400099d.setSpeed(d17);
        return jz5.f0.f302826a;
    }
}
