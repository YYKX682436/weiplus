package rv0;

/* loaded from: classes5.dex */
public final class w1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xv0.g f400302d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.ConcurrentHashMap f400303e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f400304f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(xv0.g gVar, java.util.concurrent.ConcurrentHashMap concurrentHashMap, rv0.n1 n1Var) {
        super(1);
        this.f400302d = gVar;
        this.f400303e = concurrentHashMap;
        this.f400304f = n1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ex0.r K;
        android.view.View view = (android.view.View) obj;
        kotlin.jvm.internal.o.g(view, "view");
        xv0.g gVar = this.f400302d;
        boolean userActed$plugin_mj_template_release = gVar.getUserActed$plugin_mj_template_release();
        rv0.n1 n1Var = this.f400304f;
        if (userActed$plugin_mj_template_release) {
            for (java.util.Map.Entry entry : this.f400303e.entrySet()) {
                com.tencent.maas.base.MJID mjid = (com.tencent.maas.base.MJID) entry.getKey();
                vv0.l lVar = (vv0.l) entry.getValue();
                ex0.a0 s76 = n1Var.s7();
                com.tencent.maas.moviecomposing.segments.Segment segment = (s76 == null || (K = s76.K(mjid)) == null) ? null : K.f257167a;
                com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment = segment instanceof com.tencent.maas.moviecomposing.segments.ClipSegment ? (com.tencent.maas.moviecomposing.segments.ClipSegment) segment : null;
                if (clipSegment != null) {
                    float f17 = lVar.f440390a;
                    com.tencent.maas.moviecomposing.Timeline D = clipSegment.D();
                    if (D != null) {
                        com.tencent.maas.moviecomposing.segments.ClipSegment.O0(clipSegment, f17, D);
                    }
                    com.tencent.maas.moviecomposing.Timeline D2 = clipSegment.D();
                    if (D2 != null) {
                        com.tencent.maas.moviecomposing.segments.ClipSegment.R0(clipSegment, lVar.f440391b, D2);
                    }
                    com.tencent.maas.moviecomposing.Timeline D3 = clipSegment.D();
                    if (D3 != null) {
                        com.tencent.maas.moviecomposing.segments.ClipSegment.S0(clipSegment, lVar.f440392c, D3);
                    }
                    com.tencent.maas.moviecomposing.Timeline D4 = clipSegment.D();
                    if (D4 != null) {
                        com.tencent.maas.moviecomposing.segments.ClipSegment.j1(clipSegment, lVar.f440393d, D4);
                    }
                    com.tencent.maas.moviecomposing.Timeline D5 = clipSegment.D();
                    if (D5 != null) {
                        com.tencent.maas.moviecomposing.segments.ClipSegment.l1(clipSegment, lVar.f440394e, D5);
                    }
                    com.tencent.maas.moviecomposing.Timeline D6 = clipSegment.D();
                    if (D6 != null) {
                        com.tencent.maas.moviecomposing.segments.ClipSegment.N0(clipSegment, lVar.f440395f, D6);
                    }
                }
            }
        }
        gVar.H();
        kotlinx.coroutines.l.d(n1Var.getMainScope(), null, null, new rv0.v1(n1Var, null), 3, null);
        return java.lang.Boolean.TRUE;
    }
}
