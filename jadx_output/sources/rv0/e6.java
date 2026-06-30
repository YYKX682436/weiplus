package rv0;

/* loaded from: classes5.dex */
public final class e6 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rv0.z6 f399987d;

    public e6(rv0.z6 z6Var) {
        this.f399987d = z6Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        com.tencent.maas.model.time.MJTime startTime;
        double d17;
        com.tencent.maas.model.time.MJTime mJTime = (com.tencent.maas.model.time.MJTime) obj;
        rv0.z6 z6Var = this.f399987d;
        if (z6Var.t7().f276255v.getValue() != gx0.fd.f276432h) {
            return;
        }
        kotlin.jvm.internal.o.d(mJTime);
        ex0.a0 v76 = z6Var.v7();
        if (v76 == null) {
            return;
        }
        ex0.r n17 = v76.n();
        ex0.c cVar = n17 instanceof ex0.c ? (ex0.c) n17 : null;
        if (cVar == null || (startTime = cVar.B().getStartTime()) == null) {
            return;
        }
        com.tencent.maas.moviecomposing.segments.Segment segment = cVar.f257167a;
        com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment = segment instanceof com.tencent.maas.moviecomposing.segments.ClipSegment ? (com.tencent.maas.moviecomposing.segments.ClipSegment) segment : null;
        if (clipSegment != null) {
            java.lang.Double valueOf = java.lang.Double.valueOf(clipSegment.v1());
            double doubleValue = valueOf.doubleValue();
            java.lang.Double d18 = !java.lang.Double.isInfinite(doubleValue) && !java.lang.Double.isNaN(doubleValue) ? valueOf : null;
            if (d18 != null) {
                d17 = d18.doubleValue();
                z6Var.o7().setCursorOffset((float) (v76.s(z6Var.u7().getTimelineLayoutType()) * (mJTime.toSeconds() - startTime.toSeconds()) * d17));
            }
        }
        d17 = 1.0d;
        z6Var.o7().setCursorOffset((float) (v76.s(z6Var.u7().getTimelineLayoutType()) * (mJTime.toSeconds() - startTime.toSeconds()) * d17));
    }
}
