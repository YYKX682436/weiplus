package rv0;

/* loaded from: classes5.dex */
public final class v implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f400282d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rv0.j f400283e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f400284f;

    public v(rv0.n1 n1Var, rv0.j jVar, ex0.a0 a0Var) {
        this.f400282d = n1Var;
        this.f400283e = jVar;
        this.f400284f = a0Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        com.tencent.maas.moviecomposing.Timeline timeline;
        com.tencent.maas.moviecomposing.AspectRatio k17;
        com.tencent.maas.base.MJID mjid;
        cx0.f fVar = (cx0.f) obj;
        if (fVar == null) {
            return;
        }
        rv0.n1 n1Var = this.f400282d;
        int width = n1Var.r7().getWidth();
        rv0.j jVar = this.f400283e;
        ex0.a0 a0Var = this.f400284f;
        if (width > 0) {
            n1Var.p7().n7();
            n1Var.r7().a();
            com.tencent.mm.mj_publisher.finder.widgets.timelineview.BaseTimelineView.l(n1Var.r7(), fVar.f224520c, false, 2, null);
            n1Var.x7();
            jVar.J(a0Var.y());
            jVar.F();
        }
        com.tencent.maas.moviecomposing.segments.MusicSegment m17 = a0Var.f257092b.f48414a.m();
        if (m17 != null) {
            m17.N1();
        }
        com.tencent.maas.moviecomposing.segments.MusicSegment m18 = a0Var.f257092b.f48414a.m();
        if (m18 != null && (mjid = m18.f48532a) != null) {
            ((gx0.p9) ((jz5.n) n1Var.f400128p).getValue()).k7(mjid);
        }
        ex0.a0 s76 = n1Var.s7();
        if (s76 == null || (timeline = s76.f257092b) == null || (k17 = timeline.k()) == null) {
            return;
        }
        com.tencent.maas.moviecomposing.c cVar = k17.f48362a;
        kotlin.jvm.internal.o.f(cVar, "getAspectRatioType(...)");
        yw0.p pVar = (yw0.p) n1Var.o7().f2().b(yw0.q.f466585h);
        pVar.f466580c = yw0.o.f466577e;
        ((yw0.l) pVar.f466587a).a();
        yw0.n f27 = n1Var.o7().f2();
        rv0.u uVar = new rv0.u(n1Var, k17, jVar, cVar);
        f27.getClass();
        f27.f466571a.post(new yw0.m(uVar));
    }
}
