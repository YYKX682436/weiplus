package rv0;

/* loaded from: classes5.dex */
public final class q1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f400194d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.moviecomposing.segments.ClipSegment f400195e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xv0.g f400196f;

    public q1(rv0.n1 n1Var, com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment, xv0.g gVar) {
        this.f400194d = n1Var;
        this.f400195e = clipSegment;
        this.f400196f = gVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        ex0.v vVar;
        java.util.List list;
        rv0.n1 n1Var = this.f400194d;
        ex0.a0 s76 = n1Var.s7();
        com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment = this.f400195e;
        if (s76 != null && (vVar = s76.f257097g) != null && (list = vVar.f257177e) != null) {
            java.util.Iterator it = ((java.util.ArrayList) list).iterator();
            int i18 = 0;
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                int i19 = i18 + 1;
                if (i18 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                com.tencent.maas.moviecomposing.segments.Segment segment = ((ex0.r) next).f257167a;
                com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment2 = segment instanceof com.tencent.maas.moviecomposing.segments.ClipSegment ? (com.tencent.maas.moviecomposing.segments.ClipSegment) segment : null;
                if (clipSegment2 != null) {
                    float p17 = clipSegment.p1();
                    com.tencent.maas.moviecomposing.Timeline D = clipSegment2.D();
                    if (D != null) {
                        com.tencent.maas.moviecomposing.segments.ClipSegment.O0(clipSegment2, p17, D);
                    }
                    float r17 = clipSegment.r1();
                    com.tencent.maas.moviecomposing.Timeline D2 = clipSegment2.D();
                    if (D2 != null) {
                        com.tencent.maas.moviecomposing.segments.ClipSegment.R0(clipSegment2, r17, D2);
                    }
                    float t17 = clipSegment.t1();
                    com.tencent.maas.moviecomposing.Timeline D3 = clipSegment2.D();
                    if (D3 != null) {
                        com.tencent.maas.moviecomposing.segments.ClipSegment.S0(clipSegment2, t17, D3);
                    }
                    float w17 = clipSegment.w1();
                    com.tencent.maas.moviecomposing.Timeline D4 = clipSegment2.D();
                    if (D4 != null) {
                        com.tencent.maas.moviecomposing.segments.ClipSegment.j1(clipSegment2, w17, D4);
                    }
                    float y17 = clipSegment.y1();
                    com.tencent.maas.moviecomposing.Timeline D5 = clipSegment2.D();
                    if (D5 != null) {
                        com.tencent.maas.moviecomposing.segments.ClipSegment.l1(clipSegment2, y17, D5);
                    }
                    float u17 = clipSegment.u1();
                    com.tencent.maas.moviecomposing.Timeline D6 = clipSegment2.D();
                    if (D6 != null) {
                        com.tencent.maas.moviecomposing.segments.ClipSegment.N0(clipSegment2, u17, D6);
                    }
                }
                i18 = i19;
            }
        }
        n1Var.p7().c7();
        n1Var.R6().T6(clipSegment.p1(), clipSegment.r1(), clipSegment.t1(), clipSegment.w1(), clipSegment.y1(), clipSegment.u1());
        gx0.kh q76 = n1Var.q7();
        xv0.g gVar = this.f400196f;
        java.lang.String string = gVar.getContext().getString(com.tencent.mm.R.string.m1q);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        q76.r7(string, null);
        gVar.D = false;
        gVar.e(true, true);
    }
}
