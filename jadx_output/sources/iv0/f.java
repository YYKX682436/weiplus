package iv0;

/* loaded from: classes5.dex */
public final class f extends tv0.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Rect f295065a = new android.graphics.Rect();

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.maas.base.Rect2 f295066b = new com.tencent.maas.base.Rect2(new com.tencent.maas.base.Vec2(0.0f, 0.0f), new com.tencent.maas.base.Vec2(0.0f, 0.0f));

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ iv0.w f295067c;

    public f(iv0.w wVar) {
        this.f295067c = wVar;
    }

    @Override // bv0.a
    public void a(float f17, float f18) {
        com.tencent.maas.moviecomposing.segments.ClipSegment k76;
        java.lang.String str;
        android.graphics.PointF pointF;
        if (d()) {
            iv0.w wVar = this.f295067c;
            com.tencent.maas.moviecomposing.PlaybackSession k77 = wVar.n7().k7();
            if (k77 == null || (k76 = iv0.w.k7(wVar)) == null) {
                return;
            }
            android.graphics.PointF calcPoint = k77.calcPoint(k76.m0());
            kotlin.jvm.internal.o.f(calcPoint, "calcPoint(...)");
            jz5.g gVar = wVar.f295101y;
            float scaleX = (-f17) / ((android.widget.FrameLayout) ((jz5.n) gVar).getValue()).getScaleX();
            float scaleY = (-f18) / ((android.widget.FrameLayout) ((jz5.n) gVar).getValue()).getScaleY();
            iv0.w.l7(wVar).getHitRect(this.f295065a);
            com.tencent.maas.base.Rect2 rect2 = this.f295066b;
            rect2.getSize().set(r7.width(), r7.height());
            yw0.g gVar2 = wVar.f295102z;
            if (gVar2 != null) {
                android.graphics.PointF l07 = k76.l0();
                kotlin.jvm.internal.o.f(l07, "getLayerNormalizedPosition(...)");
                float f19 = rect2.getSize().f47799x * 0.5f;
                float f27 = rect2.getSize().f47800y * 0.5f;
                float f28 = l07.x * rect2.getSize().f47799x;
                float f29 = rect2.getSize().f47800y * l07.y;
                float a17 = ou0.c0.a(f28, f19, scaleX, 30.0f, gVar2.f466552m, new yw0.e(gVar2));
                str = "getLayerNormalizedPosition(...)";
                float a18 = ou0.c0.a(f29, f27, scaleY, 30.0f, gVar2.f466553n, new yw0.f(gVar2));
                pointF = gVar2.f466551l;
                pointF.set(calcPoint.x + a17, calcPoint.y + a18);
                ((yw0.l) gVar2.f466587a).a();
            } else {
                str = "getLayerNormalizedPosition(...)";
                pointF = new android.graphics.PointF();
            }
            android.graphics.PointF calcRenderCoord = k77.calcRenderCoord(pointF);
            kotlin.jvm.internal.o.f(calcRenderCoord, "calcRenderCoord(...)");
            com.tencent.maas.moviecomposing.Timeline D = k76.D();
            if (D != null) {
                com.tencent.maas.moviecomposing.segments.ElementSegment.Z(k76, calcRenderCoord, D);
            }
            java.util.Objects.toString(k76.m0());
            java.util.Objects.toString(k76.l0());
            wVar.n7().c7();
            yw0.g gVar3 = wVar.f295102z;
            if (gVar3 != null) {
                android.graphics.PointF l08 = k76.l0();
                kotlin.jvm.internal.o.f(l08, str);
                gVar3.e(l08);
            }
            wVar.f295092p = true;
        }
    }

    @Override // bv0.a
    public void b() {
        if (d()) {
            iv0.w wVar = this.f295067c;
            yw0.g gVar = wVar.f295102z;
            if (gVar != null) {
                gVar.f466555p = yw0.c.f466536e;
                ((yw0.l) gVar.f466587a).a();
            }
            yw0.g gVar2 = wVar.f295102z;
            if (gVar2 != null) {
                gVar2.f466554o.d();
                gVar2.f466553n.d();
                gVar2.f466552m.d();
                ((yw0.l) gVar2.f466587a).a();
            }
        }
    }

    @Override // bv0.a
    public void c(float f17, float f18, boolean z17) {
        iv0.w wVar;
        com.tencent.maas.moviecomposing.segments.ClipSegment k76;
        float f19;
        if (d() && (k76 = iv0.w.k7((wVar = this.f295067c))) != null) {
            float f27 = k76.o0().x;
            yw0.g gVar = wVar.f295102z;
            if (gVar != null) {
                float f28 = k76.o0().x * f17;
                ((yw0.l) gVar.f466587a).a();
                f19 = ou0.c0.a(f28, 1.0f, f17, 0.1f, gVar.f466554o, new yw0.d(gVar));
            } else {
                f19 = 1.0f;
            }
            float f29 = f27 * f19;
            k76.t0(new android.graphics.PointF(f29, f29));
            wVar.n7().c7();
            yw0.g gVar2 = wVar.f295102z;
            if (gVar2 != null) {
                android.graphics.PointF o07 = k76.o0();
                kotlin.jvm.internal.o.f(o07, "getLayerScale(...)");
                gVar2.f(o07);
            }
            wVar.f295092p = true;
        }
    }

    public final boolean d() {
        iv0.w wVar = this.f295067c;
        return wVar.n7().m7() && wVar.X6();
    }

    @Override // bv0.a
    public boolean onDown(float f17, float f18) {
        yw0.g gVar;
        boolean d17 = d();
        if (d17 && (gVar = this.f295067c.f295102z) != null) {
            gVar.f466555p = yw0.c.f466535d;
            ((yw0.l) gVar.f466587a).a();
        }
        return d17;
    }
}
