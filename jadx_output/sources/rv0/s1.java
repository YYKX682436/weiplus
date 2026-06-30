package rv0;

/* loaded from: classes5.dex */
public final class s1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f400229d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xv0.g f400230e;

    public s1(rv0.n1 n1Var, xv0.g gVar) {
        this.f400229d = n1Var;
        this.f400230e = gVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        ex0.v vVar;
        java.util.List list;
        rv0.n1 n1Var = this.f400229d;
        ex0.a0 s76 = n1Var.s7();
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
                com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment = segment instanceof com.tencent.maas.moviecomposing.segments.ClipSegment ? (com.tencent.maas.moviecomposing.segments.ClipSegment) segment : null;
                if (clipSegment != null) {
                    com.tencent.maas.moviecomposing.Timeline D = clipSegment.D();
                    if (D != null) {
                        com.tencent.maas.moviecomposing.segments.ClipSegment.O0(clipSegment, 0.0f, D);
                    }
                    com.tencent.maas.moviecomposing.Timeline D2 = clipSegment.D();
                    if (D2 != null) {
                        com.tencent.maas.moviecomposing.segments.ClipSegment.R0(clipSegment, 0.0f, D2);
                    }
                    com.tencent.maas.moviecomposing.Timeline D3 = clipSegment.D();
                    if (D3 != null) {
                        com.tencent.maas.moviecomposing.segments.ClipSegment.S0(clipSegment, 0.0f, D3);
                    }
                    com.tencent.maas.moviecomposing.Timeline D4 = clipSegment.D();
                    if (D4 != null) {
                        com.tencent.maas.moviecomposing.segments.ClipSegment.j1(clipSegment, 0.0f, D4);
                    }
                    com.tencent.maas.moviecomposing.Timeline D5 = clipSegment.D();
                    if (D5 != null) {
                        com.tencent.maas.moviecomposing.segments.ClipSegment.l1(clipSegment, 0.0f, D5);
                    }
                    com.tencent.maas.moviecomposing.Timeline D6 = clipSegment.D();
                    if (D6 != null) {
                        com.tencent.maas.moviecomposing.segments.ClipSegment.N0(clipSegment, 0.0f, D6);
                    }
                }
                i18 = i19;
            }
        }
        n1Var.p7().c7();
        xv0.g gVar = this.f400230e;
        java.util.List list2 = gVar.U;
        if (list2 == null) {
            kotlin.jvm.internal.o.o("colorAdjItems");
            throw null;
        }
        java.util.Iterator it6 = ((java.util.ArrayList) list2).iterator();
        while (it6.hasNext()) {
            ((xv0.a) it6.next()).a(0.0f);
        }
        com.tencent.mm.mj_publisher.finder.movie_composing.widgets.AdjustSeekBar adjustSeekBar = gVar.N;
        if (adjustSeekBar == null) {
            kotlin.jvm.internal.o.o("seekbar");
            throw null;
        }
        adjustSeekBar.setProgress(0.0f);
        gVar.L(0.0f);
    }
}
