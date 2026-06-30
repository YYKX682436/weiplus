package iv0;

/* loaded from: classes5.dex */
public final class i implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ iv0.w f295070d;

    public i(iv0.w wVar) {
        this.f295070d = wVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        ou0.g gVar = (ou0.g) obj;
        iv0.w wVar = this.f295070d;
        com.tencent.maas.moviecomposing.segments.ClipSegment k76 = iv0.w.k7(wVar);
        if (k76 != null) {
            yw0.g gVar2 = wVar.f295102z;
            if (gVar2 != null) {
                android.graphics.PointF o07 = k76.o0();
                kotlin.jvm.internal.o.f(o07, "getLayerScale(...)");
                gVar2.f(o07);
            }
            yw0.g gVar3 = wVar.f295102z;
            if (gVar3 != null) {
                android.graphics.PointF l07 = k76.l0();
                kotlin.jvm.internal.o.f(l07, "getLayerNormalizedPosition(...)");
                gVar3.e(l07);
            }
            yw0.g gVar4 = wVar.f295102z;
            if (gVar4 != null) {
                com.tencent.maas.moviecomposing.AspectRatio o17 = k76.o1();
                gVar4.f466543d = java.lang.Float.valueOf(o17 != null ? (float) o17.f48363b : 0.5625f);
                ((yw0.l) gVar4.f466587a).a();
            }
        }
        rv0.n1 n1Var = (rv0.n1) ((jz5.n) wVar.f295097u).getValue();
        kotlin.jvm.internal.o.d(gVar);
        n1Var.v7(gVar);
    }
}
