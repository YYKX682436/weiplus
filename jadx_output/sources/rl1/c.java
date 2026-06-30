package rl1;

/* loaded from: classes13.dex */
public class c implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rl1.g f397158d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rl1.g f397159e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ double[] f397160f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rl1.e f397161g;

    public c(rl1.e eVar, rl1.g gVar, rl1.g gVar2, double[] dArr) {
        this.f397161g = eVar;
        this.f397158d = gVar;
        this.f397159e = gVar2;
        this.f397160f = dArr;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        rl1.g gVar = this.f397158d;
        rl1.g gVar2 = this.f397159e;
        if (gVar.equals(gVar2)) {
            return;
        }
        double parseDouble = java.lang.Double.parseDouble(java.lang.String.valueOf(valueAnimator.getAnimatedValue()));
        double d17 = gVar.f397178a;
        double d18 = (gVar2.f397178a - d17) * parseDouble;
        double d19 = this.f397160f[0];
        double d27 = d17 + (d18 / d19);
        double d28 = gVar.f397179b;
        double d29 = d28 + (((gVar2.f397179b - d28) * parseDouble) / d19);
        rl1.e eVar = this.f397161g;
        com.tencent.mapsdk.raster.model.Marker marker = eVar.f397163a;
        eVar.f397166d.getClass();
        marker.setPosition(new com.tencent.mapsdk.raster.model.LatLng(90.0d - java.lang.Math.toDegrees(java.lang.Math.atan(java.lang.Math.exp(((-(0.5d - (d29 / 4.007501668557849E7d))) * 2.0d) * 3.141592653589793d)) * 2.0d), ((d27 / 4.007501668557849E7d) - 0.5d) * 360.0d));
    }
}
