package com.tencent.tencentmap.mapsdk.vector.compat.utils.a;

/* loaded from: classes13.dex */
public class b implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.tencentmap.mapsdk.vector.compat.utils.a.h f215382a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.tencentmap.mapsdk.vector.compat.utils.a.h f215383b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f215384c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ double f215385d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f215386e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.tencentmap.mapsdk.vector.compat.utils.animation.MarkerTranslateAnimator f215387f;

    public b(com.tencent.tencentmap.mapsdk.vector.compat.utils.animation.MarkerTranslateAnimator markerTranslateAnimator, com.tencent.tencentmap.mapsdk.vector.compat.utils.a.h hVar, com.tencent.tencentmap.mapsdk.vector.compat.utils.a.h hVar2, int i17, double d17, float f17) {
        this.f215387f = markerTranslateAnimator;
        this.f215382a = hVar;
        this.f215383b = hVar2;
        this.f215384c = i17;
        this.f215385d = d17;
        this.f215386e = f17;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        double[] dArr;
        com.tencent.tencentmap.mapsdk.vector.compat.utils.a.i iVar;
        double[] dArr2;
        com.tencent.tencentmap.mapsdk.vector.compat.utils.a.i iVar2;
        com.tencent.mapsdk.raster.model.LatLng latLng;
        com.tencent.mapsdk.raster.model.LatLng latLng2;
        com.tencent.mapsdk.raster.model.LatLng latLng3;
        com.tencent.tencentmap.mapsdk.vector.compat.utils.animation.MarkerTranslateAnimator.MarkerTranslateStatusListener markerTranslateStatusListener;
        double d17;
        double d18;
        com.tencent.tencentmap.mapsdk.vector.compat.utils.animation.MarkerTranslateAnimator.MarkerTranslateStatusListener markerTranslateStatusListener2;
        com.tencent.mapsdk.raster.model.LatLng latLng4;
        int i17;
        com.tencent.mapsdk.raster.model.LatLng latLng5;
        if (this.f215382a.equals(this.f215383b)) {
            return;
        }
        dArr = this.f215387f.f215409e;
        if (dArr[this.f215384c] == 0.0d) {
            return;
        }
        double parseDouble = java.lang.Double.parseDouble(java.lang.String.valueOf(valueAnimator.getAnimatedValue()));
        com.tencent.tencentmap.mapsdk.vector.compat.utils.a.h hVar = this.f215382a;
        double d19 = hVar.f215397a;
        com.tencent.tencentmap.mapsdk.vector.compat.utils.a.h hVar2 = this.f215383b;
        double d27 = (hVar2.f215397a - d19) * parseDouble;
        double d28 = this.f215385d;
        double d29 = d19 + (d27 / d28);
        double d37 = hVar.f215398b;
        double d38 = d37 + (((hVar2.f215398b - d37) * parseDouble) / d28);
        if (this.f215387f.getObject() == null) {
            return;
        }
        com.tencent.tencentmap.mapsdk.vector.compat.utils.animation.MarkerTranslateAnimator markerTranslateAnimator = this.f215387f;
        iVar = markerTranslateAnimator.f215420p;
        markerTranslateAnimator.f215412h = iVar.a(new com.tencent.tencentmap.mapsdk.vector.compat.utils.a.h(d29, d38));
        this.f215387f.f215413i = this.f215384c;
        com.tencent.tencentmap.mapsdk.vector.compat.utils.animation.MarkerTranslateAnimator markerTranslateAnimator2 = this.f215387f;
        double d39 = this.f215386e;
        dArr2 = markerTranslateAnimator2.f215409e;
        markerTranslateAnimator2.f215414j = d39 + (parseDouble / dArr2[this.f215384c]);
        com.tencent.tencentmap.mapsdk.vector.compat.utils.animation.MarkerTranslateAnimator markerTranslateAnimator3 = this.f215387f;
        iVar2 = markerTranslateAnimator3.f215420p;
        latLng = this.f215387f.f215415k;
        latLng2 = this.f215387f.f215412h;
        markerTranslateAnimator3.f215416l = iVar2.a(latLng, latLng2);
        com.tencent.mapsdk.raster.model.Marker marker = (com.tencent.mapsdk.raster.model.Marker) this.f215387f.getObject();
        latLng3 = this.f215387f.f215412h;
        marker.setPosition(latLng3);
        markerTranslateStatusListener = this.f215387f.f215422r;
        if (markerTranslateStatusListener != null) {
            d17 = this.f215387f.f215416l;
            d18 = this.f215387f.f215417m;
            if (d17 >= d18) {
                markerTranslateStatusListener2 = this.f215387f.f215422r;
                latLng4 = this.f215387f.f215412h;
                i17 = this.f215387f.f215413i;
                markerTranslateStatusListener2.onInterpolatePoint(latLng4, i17, com.tencent.tencentmap.mapsdk.vector.compat.utils.animation.MarkerTranslateAnimator.MarkerTranslateStatusListener.AnimationStatus.AnimationInterpolating);
                this.f215387f.f215416l = 0.0d;
                com.tencent.tencentmap.mapsdk.vector.compat.utils.animation.MarkerTranslateAnimator markerTranslateAnimator4 = this.f215387f;
                latLng5 = markerTranslateAnimator4.f215412h;
                markerTranslateAnimator4.f215415k = latLng5;
            }
        }
    }
}
