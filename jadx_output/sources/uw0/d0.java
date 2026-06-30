package uw0;

/* loaded from: classes5.dex */
public final class d0 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uw0.x f431542d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uw0.t0 f431543e;

    public d0(uw0.x xVar, uw0.t0 t0Var) {
        this.f431542d = xVar;
        this.f431543e = t0Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.lang.String str;
        com.tencent.maas.moviecomposing.segments.MovieTitleSegment J7;
        sw0.b bVar;
        java.lang.String P0;
        sw0.e eVar = (sw0.e) obj;
        kotlin.jvm.internal.o.d(eVar);
        this.f431542d.setTextStyleState$plugin_mj_template_release(eVar);
        sw0.m mVar = eVar.f413428c;
        boolean z17 = mVar instanceof sw0.h;
        str = "";
        uw0.t0 t0Var = this.f431543e;
        if (z17) {
            com.tencent.mm.ui.widget.dialog.u3 u3Var = t0Var.D;
            if (!u3Var.isShowing() && !t0Var.u7().f457641e) {
                xw0.r u76 = t0Var.u7();
                java.lang.String str2 = u76.f457643g.f48224b;
                kotlin.jvm.internal.o.f(str2, "getMaterialID(...)");
                if (!u76.f457637a.Q6(str2)) {
                    u3Var.show();
                }
            }
            com.tencent.maas.moviecomposing.segments.MovieTitleSegment J72 = t0Var.J7();
            kotlinx.coroutines.l.d(t0Var.getMainScope(), null, null, new uw0.z(t0Var, J72, null), 3, null);
            if (J72 != null && (P0 = J72.P0()) != null) {
                str = P0;
            }
            t0Var.q7(str);
            t0Var.R7(J72);
            t0Var.B = true;
            return;
        }
        if (mVar instanceof sw0.i) {
            if (t0Var.D.isShowing()) {
                t0Var.D.dismiss();
                return;
            }
            return;
        }
        if (((mVar instanceof sw0.l) || (mVar instanceof sw0.k)) && (J7 = t0Var.J7()) != null) {
            com.tencent.maas.base.MJID mjid = J7.f48532a;
            kotlin.jvm.internal.o.f(mjid, "getSegmentID(...)");
            ex0.l K7 = t0Var.K7(mjid);
            if (K7 == null) {
                return;
            }
            sw0.d dVar = (sw0.d) kz5.n0.a0(eVar.f413426a, eVar.f413427b.f413435b);
            if (zu0.i.f475676f == (dVar != null ? dVar.f413423b : null)) {
                java.lang.String str3 = dVar.f413422a.f48224b;
                sw0.b bVar2 = t0Var.f349118q;
                if (bVar2 != null) {
                    kotlin.jvm.internal.o.d(str3);
                    bVar = sw0.b.a(bVar2, null, str3, null, null, null, 29, null);
                } else {
                    bVar = null;
                }
                t0Var.f349118q = bVar;
                kotlin.jvm.internal.o.d(str3);
                com.tencent.maas.moviecomposing.segments.MovieTitleSegment movieTitleSegment = K7.f257146p;
                movieTitleSegment.getClass();
                com.tencent.maas.moviecomposing.Timeline D = movieTitleSegment.D();
                java.lang.String w07 = D != null ? com.tencent.maas.moviecomposing.segments.MovieTitleSegment.w0(movieTitleSegment, D) : "";
                com.tencent.maas.moviecomposing.Timeline D2 = movieTitleSegment.D();
                str = D2 != null ? com.tencent.maas.moviecomposing.segments.MovieTitleSegment.M0(movieTitleSegment, D2) : "";
                java.lang.Boolean bool = java.lang.Boolean.FALSE;
                com.tencent.maas.moviecomposing.Timeline D3 = movieTitleSegment.D();
                (D3 != null ? com.tencent.maas.moviecomposing.segments.MovieTitleSegment.O0(movieTitleSegment, str3, D3) : bool).booleanValue();
                K7.A(w07);
                movieTitleSegment.getClass();
                com.tencent.maas.moviecomposing.Timeline D4 = movieTitleSegment.D();
                if (D4 != null) {
                    bool = com.tencent.maas.moviecomposing.segments.MovieTitleSegment.B0(movieTitleSegment, str, D4);
                }
                bool.booleanValue();
                gx0.hf.V6(t0Var.G7(), mjid, null, 2, null);
                du0.v0 R6 = t0Var.R6();
                R6.getClass();
                yy0.m7 m7Var = (yy0.m7) R6.O6();
                m7Var.getClass();
                kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.f4(m7Var, str3, null), 3, null);
            }
        }
    }
}
