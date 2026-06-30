package rv0;

/* loaded from: classes5.dex */
public final class g3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rv0.o7 f400015d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.ConcurrentHashMap f400016e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f400017f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f400018g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(rv0.o7 o7Var, java.util.concurrent.ConcurrentHashMap concurrentHashMap, rv0.n1 n1Var, ex0.a0 a0Var) {
        super(1);
        this.f400015d = o7Var;
        this.f400016e = concurrentHashMap;
        this.f400017f = n1Var;
        this.f400018g = a0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        rv0.o7 o7Var = this.f400015d;
        boolean userActed$plugin_mj_template_release = o7Var.getUserActed$plugin_mj_template_release();
        rv0.n1 n1Var = this.f400017f;
        if (userActed$plugin_mj_template_release) {
            for (java.util.Map.Entry entry : this.f400016e.entrySet()) {
                com.tencent.maas.base.MJID mjid = (com.tencent.maas.base.MJID) entry.getKey();
                jz5.l lVar = (jz5.l) entry.getValue();
                boolean booleanValue = ((java.lang.Boolean) lVar.f302833d).booleanValue();
                float floatValue = ((java.lang.Number) lVar.f302834e).floatValue();
                ex0.c f76 = n1Var.q7().f7(mjid);
                if (f76 != null) {
                    com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment = f76.f257119p;
                    clipSegment.getClass();
                    com.tencent.maas.moviecomposing.Timeline D = clipSegment.D();
                    if (D != null) {
                        com.tencent.maas.moviecomposing.segments.ClipSegment.I0(clipSegment, booleanValue, D);
                    }
                    f76.E(floatValue);
                }
            }
        }
        rv0.a4.a(this.f400018g, n1Var);
        o7Var.H();
        kotlinx.coroutines.l.d(n1Var.getMainScope(), null, null, new rv0.f3(n1Var, null), 3, null);
        return java.lang.Boolean.TRUE;
    }
}
