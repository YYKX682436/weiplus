package rv0;

/* loaded from: classes5.dex */
public final class u1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xv0.g f400268d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f400269e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.moviecomposing.segments.ClipSegment f400270f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(xv0.g gVar, rv0.n1 n1Var, com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment) {
        super(1);
        this.f400268d = gVar;
        this.f400269e = n1Var;
        this.f400270f = clipSegment;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View view = (android.view.View) obj;
        kotlin.jvm.internal.o.g(view, "view");
        xv0.g gVar = this.f400268d;
        boolean userActed$plugin_mj_template_release = gVar.getUserActed$plugin_mj_template_release();
        rv0.n1 n1Var = this.f400269e;
        if (userActed$plugin_mj_template_release) {
            gx0.kh q76 = n1Var.q7();
            java.lang.String string = gVar.getContext().getString(com.tencent.mm.R.string.f492508lm2);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            q76.r7(string, null);
        }
        gVar.D = false;
        du0.v0 R6 = n1Var.R6();
        com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment = this.f400270f;
        R6.T6(clipSegment.p1(), clipSegment.r1(), clipSegment.t1(), clipSegment.w1(), clipSegment.y1(), clipSegment.u1());
        return java.lang.Boolean.TRUE;
    }
}
