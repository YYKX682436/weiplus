package uv0;

/* loaded from: classes5.dex */
public final class w implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final uv0.u f431355d;

    /* renamed from: e, reason: collision with root package name */
    public final rv0.n1 f431356e;

    public w(uv0.u filterPanel, rv0.n1 clipPanelUIC) {
        kotlin.jvm.internal.o.g(filterPanel, "filterPanel");
        kotlin.jvm.internal.o.g(clipPanelUIC, "clipPanelUIC");
        this.f431355d = filterPanel;
        this.f431356e = clipPanelUIC;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        rv0.n1 n1Var;
        ex0.r n76;
        ex0.r K;
        vv0.c cVar = (vv0.c) obj;
        if (cVar == null || (n76 = (n1Var = this.f431356e).n7()) == null) {
            return;
        }
        vv0.i iVar = cVar.f440375c;
        boolean z17 = iVar instanceof vv0.g;
        java.lang.String str = null;
        uv0.u uVar = this.f431355d;
        com.tencent.maas.moviecomposing.segments.Segment segment = n76.f257167a;
        if (z17) {
            com.tencent.maas.material.MJMaterialPack mJMaterialPack = cVar.f440373a;
            java.util.List a17 = mJMaterialPack != null ? mJMaterialPack.a() : null;
            if (a17 == null) {
                return;
            }
            com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment = segment instanceof com.tencent.maas.moviecomposing.segments.ClipSegment ? (com.tencent.maas.moviecomposing.segments.ClipSegment) segment : null;
            if (clipSegment != null) {
                com.tencent.maas.moviecomposing.Timeline D = clipSegment.D();
                str = D != null ? com.tencent.maas.moviecomposing.segments.ClipSegment.v0(clipSegment, D) : "";
            }
            uVar.Q(a17, str);
            return;
        }
        if (iVar instanceof vv0.e) {
            vv0.e eVar = (vv0.e) iVar;
            gx0.bf p76 = n1Var.p7();
            uVar.R(eVar.f440377a, true);
            vv0.a aVar = eVar.f440377a;
            if (aVar.f440370b == zu0.i.f475676f) {
                com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment2 = segment instanceof com.tencent.maas.moviecomposing.segments.ClipSegment ? (com.tencent.maas.moviecomposing.segments.ClipSegment) segment : null;
                if (clipSegment2 != null) {
                    java.lang.String str2 = aVar.f440369a.f48224b;
                    com.tencent.maas.moviecomposing.Timeline D2 = clipSegment2.D();
                    if (D2 != null) {
                        com.tencent.maas.moviecomposing.segments.ClipSegment.k1(clipSegment2, str2, D2);
                    }
                }
                p76.c7();
                return;
            }
            return;
        }
        if (kotlin.jvm.internal.o.b(iVar, vv0.d.f440376a)) {
            return;
        }
        if (iVar instanceof vv0.h) {
            vv0.h hVar = (vv0.h) iVar;
            gx0.bf p77 = n1Var.p7();
            uVar.R(hVar.f440380a, true);
            com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment3 = segment instanceof com.tencent.maas.moviecomposing.segments.ClipSegment ? (com.tencent.maas.moviecomposing.segments.ClipSegment) segment : null;
            if (clipSegment3 != null) {
                java.lang.String str3 = hVar.f440380a.f440369a.f48224b;
                com.tencent.maas.moviecomposing.Timeline D3 = clipSegment3.D();
                if (D3 != null) {
                    com.tencent.maas.moviecomposing.segments.ClipSegment.k1(clipSegment3, str3, D3);
                }
            }
            p77.c7();
            return;
        }
        if (iVar instanceof vv0.f) {
            for (java.util.Map.Entry entry : ((vv0.f) iVar).f440378a.entrySet()) {
                com.tencent.maas.base.MJID mjid = (com.tencent.maas.base.MJID) entry.getKey();
                vv0.m mVar = (vv0.m) entry.getValue();
                ex0.a0 a0Var = n1Var.q7().f276642r;
                com.tencent.maas.moviecomposing.segments.Segment segment2 = (a0Var == null || (K = a0Var.K(mjid)) == null) ? null : K.f257167a;
                com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment4 = segment2 instanceof com.tencent.maas.moviecomposing.segments.ClipSegment ? (com.tencent.maas.moviecomposing.segments.ClipSegment) segment2 : null;
                if (clipSegment4 != null) {
                    java.lang.String str4 = mVar.f440396a;
                    com.tencent.maas.moviecomposing.Timeline D4 = clipSegment4.D();
                    if (D4 != null) {
                        com.tencent.maas.moviecomposing.segments.ClipSegment.k1(clipSegment4, str4, D4);
                    }
                }
                if (clipSegment4 != null) {
                    float f17 = mVar.f440397b;
                    com.tencent.maas.moviecomposing.Timeline D5 = clipSegment4.D();
                    if (D5 != null) {
                        com.tencent.maas.moviecomposing.segments.ClipSegment.G0(clipSegment4, f17, D5);
                    }
                }
            }
            kotlinx.coroutines.l.d(n1Var.getMainScope(), null, null, new uv0.v(this, null), 3, null);
        }
    }
}
