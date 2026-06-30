package rl1;

/* loaded from: classes13.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mapsdk.raster.model.Marker f397163a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.location_soso.api.SoSoMapView f397164b;

    /* renamed from: c, reason: collision with root package name */
    public android.animation.AnimatorSet f397165c = new android.animation.AnimatorSet();

    /* renamed from: d, reason: collision with root package name */
    public rl1.h f397166d = new rl1.h();

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0059, code lost:
    
        r7.add(a(r8));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e(java.util.LinkedList r6, com.tencent.mapsdk.raster.model.Marker r7, com.tencent.mm.plugin.location_soso.api.SoSoMapView r8) {
        /*
            r5 = this;
            r5.<init>()
            r5.f397163a = r7
            r5.f397164b = r8
            android.animation.AnimatorSet r7 = new android.animation.AnimatorSet
            r7.<init>()
            r5.f397165c = r7
            rl1.h r7 = new rl1.h
            r7.<init>()
            r5.f397166d = r7
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r6 = r6.iterator()
        L1e:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L69
            java.lang.Object r8 = r6.next()
            vc1.x1 r8 = (vc1.x1) r8
            float r0 = r8.f435210e
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L57
            double r1 = r8.f435209d
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L57
            double r1 = r8.f435208c
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L57
            android.animation.ValueAnimator r0 = r5.b(r8)
            android.animation.ValueAnimator r8 = r5.a(r8)
            android.animation.AnimatorSet r1 = new android.animation.AnimatorSet
            r1.<init>()
            android.animation.AnimatorSet$Builder r8 = r1.play(r8)
            r8.with(r0)
            r7.add(r1)
            goto L1e
        L57:
            if (r0 == 0) goto L61
            android.animation.ValueAnimator r8 = r5.a(r8)
            r7.add(r8)
            goto L1e
        L61:
            android.animation.ValueAnimator r8 = r5.b(r8)
            r7.add(r8)
            goto L1e
        L69:
            android.animation.AnimatorSet r6 = r5.f397165c
            r6.playSequentially(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rl1.e.<init>(java.util.LinkedList, com.tencent.mapsdk.raster.model.Marker, com.tencent.mm.plugin.location_soso.api.SoSoMapView):void");
    }

    public android.animation.ValueAnimator a(vc1.x1 x1Var) {
        com.tencent.mapsdk.raster.model.Marker marker = this.f397163a;
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(marker.getRotation(), marker.getRotation() + x1Var.f435210e);
        ofFloat.setDuration(x1Var.f435211f);
        ofFloat.setInterpolator(new android.view.animation.LinearInterpolator());
        ofFloat.addUpdateListener(new rl1.d(this));
        return ofFloat;
    }

    public android.animation.ValueAnimator b(vc1.x1 x1Var) {
        com.tencent.mapsdk.raster.model.LatLng[] latLngArr = {new com.tencent.mapsdk.raster.model.LatLng(x1Var.f435207b, x1Var.f435206a), new com.tencent.mapsdk.raster.model.LatLng(x1Var.f435209d, x1Var.f435208c)};
        rl1.g a17 = this.f397166d.a(latLngArr[0]);
        rl1.g a18 = this.f397166d.a(latLngArr[1]);
        double[] dArr = new double[1];
        com.tencent.tencentmap.mapsdk.map.Projection projection = this.f397164b.getProjection();
        double d17 = 0.0d;
        int i17 = 0;
        while (i17 < 1) {
            int i18 = i17 + 1;
            double distanceBetween = projection.distanceBetween(latLngArr[i17], latLngArr[i18]);
            dArr[i17] = distanceBetween;
            d17 += distanceBetween;
            i17 = i18;
        }
        android.animation.ValueAnimator valueAnimator = new android.animation.ValueAnimator();
        valueAnimator.setDuration((long) ((x1Var.f435211f * dArr[0]) / d17));
        valueAnimator.setInterpolator(new android.view.animation.LinearInterpolator());
        valueAnimator.setFloatValues((float) dArr[0]);
        valueAnimator.addUpdateListener(new rl1.c(this, a17, a18, dArr));
        return valueAnimator;
    }
}
