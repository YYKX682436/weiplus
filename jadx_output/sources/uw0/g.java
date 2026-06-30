package uw0;

/* loaded from: classes5.dex */
public final class g implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uw0.a f431559d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uw0.o f431560e;

    public g(uw0.a aVar, uw0.o oVar) {
        this.f431559d = aVar;
        this.f431560e = oVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        com.tencent.maas.moviecomposing.segments.ContentDescSegment h07;
        sw0.e eVar = (sw0.e) obj;
        kotlin.jvm.internal.o.d(eVar);
        this.f431559d.setTextStyleState$plugin_mj_template_release(eVar);
        sw0.m mVar = eVar.f413428c;
        boolean z17 = mVar instanceof sw0.h;
        sw0.b bVar = null;
        uw0.o oVar = this.f431560e;
        if (z17) {
            kotlinx.coroutines.l.d(oVar.getMainScope(), null, null, new uw0.f(oVar, null), 3, null);
            return;
        }
        if (mVar instanceof sw0.i) {
            if (oVar.A.isShowing()) {
                oVar.A.dismiss();
                return;
            }
            return;
        }
        if (mVar instanceof sw0.j) {
            return;
        }
        if (mVar instanceof sw0.k ? true : mVar instanceof sw0.l) {
            com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment = oVar.f431589y;
            com.tencent.maas.base.MJID mjid = (clipSegment == null || (h07 = clipSegment.h0()) == null) ? null : h07.f48532a;
            sw0.g gVar = eVar.f413427b;
            java.util.List list = eVar.f413426a;
            if (mjid == null) {
                sw0.d dVar = (sw0.d) kz5.n0.a0(list, gVar.f413435b);
                if (zu0.i.f475676f == (dVar != null ? dVar.f413423b : null)) {
                    oVar.x7(dVar);
                    sw0.e eVar2 = (sw0.e) oVar.u7().f457654r.getValue();
                    if (eVar2 != null) {
                        oVar.S7(eVar2);
                    }
                    sw0.e eVar3 = (sw0.e) oVar.u7().f457652p.getValue();
                    if (eVar3 != null) {
                        oVar.U7(eVar3);
                        return;
                    }
                    return;
                }
                return;
            }
            sw0.d dVar2 = (sw0.d) kz5.n0.a0(list, gVar.f413435b);
            if (zu0.i.f475676f == (dVar2 != null ? dVar2.f413423b : null)) {
                java.lang.String str = dVar2.f413422a.f48224b;
                java.util.Iterator it = oVar.A7().iterator();
                while (it.hasNext()) {
                    com.tencent.maas.base.MJID mjid2 = ((com.tencent.maas.moviecomposing.segments.ContentDescSegment) it.next()).f48532a;
                    kotlin.jvm.internal.o.f(mjid2, "getSegmentID(...)");
                    ex0.d C7 = oVar.C7(mjid2);
                    if (C7 != null) {
                        kotlin.jvm.internal.o.d(str);
                        com.tencent.maas.moviecomposing.segments.ContentDescSegment contentDescSegment = C7.f257121p;
                        contentDescSegment.getClass();
                        com.tencent.maas.moviecomposing.Timeline D = contentDescSegment.D();
                        java.lang.String F0 = D != null ? com.tencent.maas.moviecomposing.segments.ContentDescSegment.F0(contentDescSegment, D) : "";
                        com.tencent.maas.moviecomposing.Timeline D2 = contentDescSegment.D();
                        java.lang.String z07 = D2 != null ? com.tencent.maas.moviecomposing.segments.ContentDescSegment.z0(contentDescSegment, D2) : "";
                        java.lang.Boolean bool = java.lang.Boolean.FALSE;
                        com.tencent.maas.moviecomposing.Timeline D3 = contentDescSegment.D();
                        (D3 != null ? com.tencent.maas.moviecomposing.segments.ContentDescSegment.N0(contentDescSegment, str, D3) : bool).booleanValue();
                        contentDescSegment.getClass();
                        com.tencent.maas.moviecomposing.Timeline D4 = contentDescSegment.D();
                        (D4 != null ? com.tencent.maas.moviecomposing.segments.ContentDescSegment.B0(contentDescSegment, F0, D4) : bool).booleanValue();
                        contentDescSegment.getClass();
                        com.tencent.maas.moviecomposing.Timeline D5 = contentDescSegment.D();
                        if (D5 != null) {
                            bool = com.tencent.maas.moviecomposing.segments.ContentDescSegment.O0(contentDescSegment, z07, D5);
                        }
                        bool.booleanValue();
                        du0.v0 R6 = oVar.R6();
                        R6.getClass();
                        yy0.m7 m7Var = (yy0.m7) R6.O6();
                        m7Var.getClass();
                        kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.b4(m7Var, str, null), 3, null);
                    }
                }
                sw0.b bVar2 = oVar.f349118q;
                if (bVar2 != null) {
                    kotlin.jvm.internal.o.d(str);
                    bVar = sw0.b.a(bVar2, null, str, null, null, null, 29, null);
                }
                oVar.f349118q = bVar;
                oVar.P7();
            }
        }
    }
}
