package com.tencent.tencentmap.mapsdk.vector.compat.utils.animation;

/* loaded from: classes13.dex */
public class MarkerTranslateAnimator extends com.tencent.tencentmap.mapsdk.vector.compat.utils.animation.OverlayAnimator {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mapsdk.raster.model.LatLng[] f215408d;

    /* renamed from: e, reason: collision with root package name */
    public double[] f215409e;

    /* renamed from: f, reason: collision with root package name */
    public double f215410f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f215411g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mapsdk.raster.model.LatLng f215412h;

    /* renamed from: i, reason: collision with root package name */
    public int f215413i;

    /* renamed from: j, reason: collision with root package name */
    public double f215414j;

    /* renamed from: k, reason: collision with root package name */
    public com.tencent.mapsdk.raster.model.LatLng f215415k;

    /* renamed from: l, reason: collision with root package name */
    public double f215416l;

    /* renamed from: m, reason: collision with root package name */
    public double f215417m;

    /* renamed from: n, reason: collision with root package name */
    public float f215418n;

    /* renamed from: o, reason: collision with root package name */
    public android.animation.AnimatorSet f215419o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.tencentmap.mapsdk.vector.compat.utils.a.i f215420p;

    /* renamed from: q, reason: collision with root package name */
    public volatile boolean f215421q;

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.tencentmap.mapsdk.vector.compat.utils.animation.MarkerTranslateAnimator.MarkerTranslateStatusListener f215422r;

    /* loaded from: classes13.dex */
    public interface MarkerTranslateStatusListener {

        /* loaded from: classes6.dex */
        public enum AnimationStatus {
            AnimationInterpolating,
            AnimationComplete
        }

        void onInterpolatePoint(com.tencent.mapsdk.raster.model.LatLng latLng, int i17, com.tencent.tencentmap.mapsdk.vector.compat.utils.animation.MarkerTranslateAnimator.MarkerTranslateStatusListener.AnimationStatus animationStatus);

        void onInterpolateRotation(float f17, com.tencent.tencentmap.mapsdk.vector.compat.utils.animation.MarkerTranslateAnimator.MarkerTranslateStatusListener.AnimationStatus animationStatus);
    }

    public MarkerTranslateAnimator(com.tencent.mapsdk.raster.model.Marker marker, long j17, com.tencent.mapsdk.raster.model.LatLng[] latLngArr) {
        this(marker, j17, latLngArr, false);
    }

    @Override // com.tencent.tencentmap.mapsdk.vector.compat.utils.animation.OverlayAnimator
    public void cancelAnimation() {
        android.animation.AnimatorSet animatorSet;
        super.cancelAnimation();
        synchronized (this) {
            if (this.f215411g && (animatorSet = this.f215419o) != null) {
                animatorSet.cancel();
            }
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.vector.compat.utils.animation.OverlayAnimator
    public android.animation.ValueAnimator createSegmentAnimator(int i17) {
        return createSegmentAnimator(i17, 0.0f);
    }

    @Override // com.tencent.tencentmap.mapsdk.vector.compat.utils.animation.OverlayAnimator
    public void endAnimation() {
        android.animation.AnimatorSet animatorSet;
        super.endAnimation();
        synchronized (this) {
            if (this.f215411g && (animatorSet = this.f215419o) != null) {
                animatorSet.end();
            }
        }
    }

    public void setAnimatorLeftTime(long j17) {
        if (j17 < 0) {
            return;
        }
        cancelAnimation();
        double[] dArr = this.f215409e;
        int i17 = this.f215413i;
        this.f215410f = dArr[i17] * (1.0d - this.f215414j);
        while (true) {
            i17++;
            if (i17 >= this.f215408d.length - 1) {
                setDuration(j17);
                a(this.f215413i, (float) this.f215414j);
                startAnimation();
                return;
            }
            this.f215410f += this.f215409e[i17];
        }
    }

    public void setAnimatorPosition(int i17, float f17) {
        if (i17 < 0 || i17 >= this.f215409e.length) {
            return;
        }
        cancelAnimation();
        a(i17, h3.a.a(f17, 0.0f, 1.0f));
        startAnimation();
    }

    public void setPrecision(double d17) {
        if (d17 < 0.0d) {
            d17 = 0.0d;
        }
        this.f215417m = d17;
    }

    @Override // com.tencent.tencentmap.mapsdk.vector.compat.utils.animation.OverlayAnimator
    public void startAnimation() {
        super.startAnimation();
        synchronized (this) {
            if (this.f215411g && this.f215419o != null && !this.f215421q) {
                this.f215421q = true;
                this.f215419o.start();
            }
        }
    }

    public MarkerTranslateAnimator(com.tencent.mapsdk.raster.model.Marker marker, long j17, com.tencent.mapsdk.raster.model.LatLng[] latLngArr, boolean z17, com.tencent.tencentmap.mapsdk.vector.compat.utils.animation.MarkerTranslateAnimator.MarkerTranslateStatusListener markerTranslateStatusListener) {
        super(marker, j17);
        this.f215416l = 0.0d;
        this.f215417m = 0.0d;
        this.f215421q = false;
        this.f215422r = markerTranslateStatusListener;
        if (latLngArr == null) {
            return;
        }
        this.f215408d = latLngArr;
        this.f215409e = new double[latLngArr.length - 1];
        this.f215420p = new com.tencent.tencentmap.mapsdk.vector.compat.utils.a.i();
        int i17 = 0;
        while (i17 < latLngArr.length - 1) {
            int i18 = i17 + 1;
            this.f215409e[i17] = this.f215420p.a(latLngArr[i17], latLngArr[i18]);
            this.f215410f += this.f215409e[i17];
            i17 = i18;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i19 = 0; i19 < latLngArr.length - 1; i19++) {
            arrayList.add(createSegmentAnimator(i19));
        }
        getAnimatorSet().playSequentially(arrayList);
        this.f215411g = z17;
        if (z17) {
            a(0);
        }
    }

    public android.animation.ValueAnimator createSegmentAnimator(int i17, float f17) {
        com.tencent.tencentmap.mapsdk.vector.compat.utils.a.h a17 = this.f215420p.a(this.f215408d[i17]);
        com.tencent.tencentmap.mapsdk.vector.compat.utils.a.h a18 = this.f215420p.a(this.f215408d[i17 + 1]);
        com.tencent.tencentmap.mapsdk.vector.compat.utils.a.h hVar = new com.tencent.tencentmap.mapsdk.vector.compat.utils.a.h(a18.f215397a, a18.f215398b);
        double d17 = 1.0f - f17;
        double d18 = f17;
        com.tencent.tencentmap.mapsdk.vector.compat.utils.a.h hVar2 = new com.tencent.tencentmap.mapsdk.vector.compat.utils.a.h((a17.f215397a * d17) + (a18.f215397a * d18), (d17 * a17.f215398b) + (d18 * a18.f215398b));
        com.tencent.tencentmap.mapsdk.vector.compat.utils.a.i iVar = this.f215420p;
        double a19 = iVar.a(iVar.a(hVar2), this.f215420p.a(hVar));
        this.f215416l = 0.0d;
        this.f215415k = this.f215420p.a(hVar2);
        android.animation.ValueAnimator valueAnimator = new android.animation.ValueAnimator();
        valueAnimator.setDuration((long) ((getDuration() * a19) / this.f215410f));
        valueAnimator.setInterpolator(new android.view.animation.LinearInterpolator());
        valueAnimator.setFloatValues((float) a19);
        valueAnimator.addListener(new com.tencent.tencentmap.mapsdk.vector.compat.utils.a.a(this));
        valueAnimator.addUpdateListener(new com.tencent.tencentmap.mapsdk.vector.compat.utils.a.b(this, hVar2, hVar, i17, a19, f17));
        return valueAnimator;
    }

    public final void a(int i17, float f17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(createSegmentAnimator(i17, f17));
        for (int i18 = i17 + 1; i18 < this.f215408d.length - 1; i18++) {
            arrayList.add(createSegmentAnimator(i18));
        }
        setAnimatorSet(new android.animation.AnimatorSet());
        getAnimatorSet().playSequentially(arrayList);
        if (this.f215411g) {
            a(i17);
        }
    }

    public final void a(int i17) {
        int i18;
        long j17;
        float f17;
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        this.f215419o = animatorSet;
        animatorSet.addListener(new com.tencent.tencentmap.mapsdk.vector.compat.utils.a.c(this));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i19 = i17;
        int i27 = this.f215413i;
        int i28 = i17 + 1;
        float f18 = 0.0f;
        long j18 = 0;
        while (true) {
            java.lang.Object[] objArr = this.f215408d;
            if (i28 < objArr.length) {
                if (!objArr[i19].equals(objArr[i28])) {
                    com.tencent.tencentmap.mapsdk.vector.compat.utils.a.h a17 = this.f215420p.a(this.f215408d[i27]);
                    com.tencent.tencentmap.mapsdk.vector.compat.utils.a.h a18 = this.f215420p.a(this.f215408d[i19]);
                    com.tencent.tencentmap.mapsdk.vector.compat.utils.a.h a19 = this.f215420p.a(this.f215408d[i28]);
                    double d17 = a18.f215397a;
                    double d18 = d17 - a17.f215397a;
                    double d19 = a17.f215398b;
                    double d27 = a18.f215398b;
                    int i29 = i19;
                    int i37 = i27;
                    float a27 = (float) a(d18, d19 - d27, a19.f215397a - d17, d27 - a19.f215398b);
                    if (arrayList.size() == 0) {
                        if (getObject() == null) {
                            return;
                        }
                        float rotation = ((com.tencent.mapsdk.raster.model.Marker) getObject()).getRotation();
                        a27 = ((float) a(0.0d, 1.0d, a19.f215397a - a18.f215397a, a18.f215398b - a19.f215398b)) - rotation;
                        i18 = i29;
                        f17 = rotation;
                        j17 = 0;
                    } else {
                        long duration = (long) ((getDuration() * (((java.lang.Math.abs(a27) * 3.141592653589793d) * 6.0d) / 180.0d)) / this.f215410f);
                        i18 = i29;
                        j18 = a(i37, i18) - (duration / 2);
                        j17 = duration;
                        f17 = f18;
                    }
                    float f19 = f17 + a27;
                    arrayList.add(a(f17, f19, j17, j18));
                    i27 = i18;
                    f18 = f19;
                    i19 = i28;
                }
                i28++;
            } else {
                this.f215419o.playSequentially(arrayList);
                return;
            }
        }
    }

    public MarkerTranslateAnimator(com.tencent.mapsdk.raster.model.Marker marker, long j17, com.tencent.mapsdk.raster.model.LatLng[] latLngArr, boolean z17) {
        this(marker, j17, latLngArr, z17, null);
    }

    public final double a(double d17, double d18, double d19, double d27) {
        double sqrt = ((d17 * d19) + (d18 * d27)) / (java.lang.Math.sqrt((d17 * d17) + (d18 * d18)) * java.lang.Math.sqrt((d19 * d19) + (d27 * d27)));
        if (java.lang.Double.isNaN(sqrt)) {
            return 0.0d;
        }
        if (sqrt < -1.0d) {
            sqrt = -1.0d;
        }
        if (sqrt > 1.0d) {
            sqrt = 1.0d;
        }
        double acos = (java.lang.Math.acos(sqrt) * 180.0d) / 3.141592653589793d;
        if ((d17 * d27) - (d18 * d19) > 0.0d) {
            acos = -acos;
        }
        return (float) acos;
    }

    public final long a(int i17, int i18) {
        double d17 = 0.0d;
        while (i17 < i18) {
            d17 += this.f215409e[i17];
            i17++;
        }
        return (long) ((getDuration() * d17) / this.f215410f);
    }

    public final android.animation.ValueAnimator a(float f17, float f18, long j17, long j18) {
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(f17, f18);
        ofFloat.setDuration(j17);
        ofFloat.setStartDelay(j18);
        ofFloat.setInterpolator(new android.view.animation.LinearInterpolator());
        ofFloat.addListener(new com.tencent.tencentmap.mapsdk.vector.compat.utils.a.d(this));
        ofFloat.addUpdateListener(new com.tencent.tencentmap.mapsdk.vector.compat.utils.a.e(this));
        return ofFloat;
    }
}
