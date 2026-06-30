package rv0;

/* loaded from: classes5.dex */
public final class j2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rv0.j7 f400056d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.ConcurrentHashMap f400057e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f400058f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f400059g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(rv0.j7 j7Var, java.util.concurrent.ConcurrentHashMap concurrentHashMap, rv0.n1 n1Var, ex0.a0 a0Var) {
        super(1);
        this.f400056d = j7Var;
        this.f400057e = concurrentHashMap;
        this.f400058f = n1Var;
        this.f400059g = a0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        rv0.j7 j7Var = this.f400056d;
        if (j7Var.getUserActed$plugin_mj_template_release()) {
            for (java.util.Map.Entry entry : this.f400057e.entrySet()) {
                com.tencent.maas.base.MJID mjid = (com.tencent.maas.base.MJID) entry.getKey();
                double doubleValue = ((java.lang.Number) entry.getValue()).doubleValue();
                ex0.r K = this.f400059g.K(mjid);
                com.tencent.maas.moviecomposing.segments.Segment segment = K != null ? K.f257167a : null;
                com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment = segment instanceof com.tencent.maas.moviecomposing.segments.ClipSegment ? (com.tencent.maas.moviecomposing.segments.ClipSegment) segment : null;
                if (clipSegment != null) {
                    java.lang.Boolean bool = java.lang.Boolean.FALSE;
                    com.tencent.maas.moviecomposing.Timeline D = clipSegment.D();
                    if (D != null) {
                        bool = com.tencent.maas.moviecomposing.segments.ClipSegment.D0(clipSegment, doubleValue, D);
                    }
                    bool.booleanValue();
                }
            }
        }
        j7Var.H();
        rv0.n1 n1Var = this.f400058f;
        kotlinx.coroutines.l.d(n1Var.getMainScope(), null, null, new rv0.i2(n1Var, null), 3, null);
        return java.lang.Boolean.TRUE;
    }
}
