package uv0;

/* loaded from: classes5.dex */
public final class g implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uv0.u f431330d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uv0.h f431331e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vv0.k f431332f;

    public g(uv0.u uVar, uv0.h hVar, vv0.k kVar) {
        this.f431330d = uVar;
        this.f431331e = hVar;
        this.f431332f = kVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        ex0.v vVar;
        java.util.List list;
        uv0.u uVar = this.f431330d;
        uVar.J();
        uv0.h hVar = this.f431331e;
        ex0.a0 s76 = hVar.f431334b.s7();
        if (s76 != null && (vVar = s76.f257097g) != null && (list = vVar.f257177e) != null) {
            java.util.Iterator it = ((java.util.ArrayList) list).iterator();
            while (it.hasNext()) {
                ex0.r rVar = (ex0.r) it.next();
                com.tencent.maas.moviecomposing.segments.Segment segment = rVar.f257167a;
                com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment = segment instanceof com.tencent.maas.moviecomposing.segments.ClipSegment ? (com.tencent.maas.moviecomposing.segments.ClipSegment) segment : null;
                if (clipSegment != null) {
                    java.lang.String str = this.f431332f.f440385a;
                    com.tencent.maas.moviecomposing.Timeline D = clipSegment.D();
                    if (D != null) {
                        com.tencent.maas.moviecomposing.segments.ClipSegment.k1(clipSegment, str, D);
                    }
                }
                com.tencent.maas.moviecomposing.segments.Segment segment2 = rVar.f257167a;
                com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment2 = segment2 instanceof com.tencent.maas.moviecomposing.segments.ClipSegment ? (com.tencent.maas.moviecomposing.segments.ClipSegment) segment2 : null;
                if (clipSegment2 != null) {
                    float filterIntensity = uVar.getFilterIntensity();
                    com.tencent.maas.moviecomposing.Timeline D2 = clipSegment2.D();
                    if (D2 != null) {
                        com.tencent.maas.moviecomposing.segments.ClipSegment.G0(clipSegment2, filterIntensity, D2);
                    }
                }
            }
        }
        rv0.n1 n1Var = hVar.f431334b;
        n1Var.p7().c7();
        gx0.kh q76 = n1Var.q7();
        java.lang.String string = hVar.f431333a.getString(com.tencent.mm.R.string.m1r);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        q76.r7(string, null);
        uVar.D = false;
        uVar.e(true, true);
    }
}
