package iv0;

/* loaded from: classes5.dex */
public final class k implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ iv0.w f295072d;

    public k(iv0.w wVar) {
        this.f295072d = wVar;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        ex0.v vVar;
        java.util.List list;
        ex0.a0 a0Var;
        ex0.v vVar2;
        java.util.List list2;
        int itemId = menuItem.getItemId();
        com.tencent.maas.moviecomposing.d dVar = com.tencent.maas.moviecomposing.d.AspectFit;
        iv0.w wVar = this.f295072d;
        if (itemId == 1) {
            ex0.a0 a0Var2 = wVar.p7().f276642r;
            if (a0Var2 == null || (vVar = a0Var2.f257097g) == null || (list = vVar.f257177e) == null) {
                return;
            }
            java.util.Iterator it = ((java.util.ArrayList) list).iterator();
            while (it.hasNext()) {
                ex0.r rVar = (ex0.r) it.next();
                if (rVar.o()) {
                    com.tencent.maas.moviecomposing.segments.Segment segment = rVar.f257167a;
                    com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment = segment instanceof com.tencent.maas.moviecomposing.segments.ClipSegment ? (com.tencent.maas.moviecomposing.segments.ClipSegment) segment : null;
                    if (clipSegment != null) {
                        com.tencent.maas.moviecomposing.Timeline D = clipSegment.D();
                        if (D != null) {
                            com.tencent.maas.moviecomposing.segments.ClipSegment.h1(clipSegment, dVar, D);
                        }
                        android.graphics.PointF pointF = new android.graphics.PointF(0.0f, 0.0f);
                        com.tencent.maas.moviecomposing.Timeline D2 = clipSegment.D();
                        if (D2 != null) {
                            com.tencent.maas.moviecomposing.segments.ElementSegment.Z(clipSegment, pointF, D2);
                        }
                        clipSegment.t0(new android.graphics.PointF(1.0f, 1.0f));
                        yw0.g gVar = wVar.f295102z;
                        if (gVar != null) {
                            android.graphics.PointF l07 = clipSegment.l0();
                            kotlin.jvm.internal.o.f(l07, "getLayerNormalizedPosition(...)");
                            gVar.e(l07);
                        }
                        yw0.g gVar2 = wVar.f295102z;
                        if (gVar2 != null) {
                            android.graphics.PointF o07 = clipSegment.o0();
                            kotlin.jvm.internal.o.f(o07, "getLayerScale(...)");
                            gVar2.f(o07);
                        }
                    }
                }
            }
            wVar.n7().c7();
            return;
        }
        if (itemId != 2 || (a0Var = wVar.p7().f276642r) == null || (vVar2 = a0Var.f257097g) == null || (list2 = vVar2.f257177e) == null) {
            return;
        }
        java.util.Iterator it6 = ((java.util.ArrayList) list2).iterator();
        while (it6.hasNext()) {
            ex0.r rVar2 = (ex0.r) it6.next();
            if (rVar2.o()) {
                com.tencent.maas.moviecomposing.segments.Segment segment2 = rVar2.f257167a;
                com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment2 = segment2 instanceof com.tencent.maas.moviecomposing.segments.ClipSegment ? (com.tencent.maas.moviecomposing.segments.ClipSegment) segment2 : null;
                if (clipSegment2 != null) {
                    com.tencent.maas.moviecomposing.AspectRatio o17 = clipSegment2.o1();
                    float f17 = o17 != null ? (float) o17.f48363b : 0.5625f;
                    com.tencent.maas.moviecomposing.Timeline o76 = wVar.p7().o7();
                    float q17 = o76 != null ? (float) o76.q() : 0.5625f;
                    float max = java.lang.Math.max(f17, q17) / java.lang.Math.min(f17, q17);
                    com.tencent.maas.moviecomposing.Timeline D3 = clipSegment2.D();
                    if (D3 != null) {
                        com.tencent.maas.moviecomposing.segments.ClipSegment.h1(clipSegment2, dVar, D3);
                    }
                    android.graphics.PointF pointF2 = new android.graphics.PointF(0.0f, 0.0f);
                    com.tencent.maas.moviecomposing.Timeline D4 = clipSegment2.D();
                    if (D4 != null) {
                        com.tencent.maas.moviecomposing.segments.ElementSegment.Z(clipSegment2, pointF2, D4);
                    }
                    clipSegment2.t0(new android.graphics.PointF(max, max));
                    yw0.g gVar3 = wVar.f295102z;
                    if (gVar3 != null) {
                        android.graphics.PointF l08 = clipSegment2.l0();
                        kotlin.jvm.internal.o.f(l08, "getLayerNormalizedPosition(...)");
                        gVar3.e(l08);
                    }
                    yw0.g gVar4 = wVar.f295102z;
                    if (gVar4 != null) {
                        android.graphics.PointF o08 = clipSegment2.o0();
                        kotlin.jvm.internal.o.f(o08, "getLayerScale(...)");
                        gVar4.f(o08);
                    }
                }
            }
        }
        wVar.n7().c7();
    }
}
